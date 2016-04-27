
public class Gra {

	Player gracz;
	private boolean exit = false;
	Croupier croupier;
	public Talia tal = new Talia();
	Boolean koniec = false;
	Messages msg = new Messages();
	
	void start(){
		
		tal.wypelnianie();
		
		gracz = new Player(tal);
		croupier = new Croupier(tal);
		while(exit == false)
		{
			
			tal.tasuj();
			gracz.postawZaklad();
			gracz.setNickName();
			
			this.rozdaniePoczatkowe();	//rozdajemy dwie karty na zmianê graczowi i krupierowi
	
			croupier.pokazJedna(); 		//zgodnie z zasadami gracz widzi jedn¹ karte krupiera
			gracz.pokazReke();
	
				
			
				
				//pêtla gracza
			while(msg.CzyGraszDalej(gracz))
			{
				
				gracz.dobierzKarte();
				if(gracz.CheckHandOverHigh())
				{
					koniec = true;
					break;	
				}
					
				
				gracz.pokazReke();			//gracz pokazuje swoje karty
							
			}
			
			//jesli jest tutaj, to gracz postanowi³ sprawdziæ
			//i dopiero teraz w³¹cza siê do gry krupier
			
			if(koniec == false)
			{
				//pêtla krupiera
				while(croupier.Bot())
				{
					croupier.dobierzKarte();
					if(croupier.CheckHandOverHigh())
						break;
					
				}
			}
			
			
			
			this.End();
			gracz.zeruj();
			croupier.zeruj();
			if(gracz.getPieniadze() <= 0)
			{
				msg.lose();
				break;
			}else
			this.koniec();
		}
		
		if(exit == true)
		{
			System.out.println("Zakonczyles gre!");
			System.out.println("Stan twojego konta: " + gracz.getPieniadze());
		}
	}
	
	
	
	void End()
	{
		//krupier automat do konca
		System.out.println("Karty gracza i krupiera: ");
		gracz.pokazReke();
		croupier.pokazReke();
		System.out.println("\n");
		
		if(gracz.getSumaKart() > 21)
		{
			System.out.println("Przekroczona suma 21 u gracza");
			gracz.przegralZaklad();
			msg.WygralKrupier();
		}
		
		else if(croupier.getSumaKart() > 21)
		{
			System.out.println("Przekroczona suma 21 u krupiera");
			gracz.wygralZaklad();
			msg.WygralPlayer("Player_name_default");
		}
		
		else if(gracz.getSumaKart() > croupier.getSumaKart())
		{
			System.out.println("Gracz jest bli¿ej 'oczka'");
			gracz.wygralZaklad();
			msg.WygralPlayer("Player_name_default");
		}
		
		else if(gracz.getSumaKart() < croupier.getSumaKart())
		{
			System.out.println("Krupier jest bli¿ej 'oczka'");
			gracz.przegralZaklad();
			msg.WygralKrupier();
		}
		
		else if(gracz.getSumaKart() == croupier.getSumaKart())
		{
			System.out.println("Remis");
			//remis
		}
		
		
		
	}
	
	void rozdaniePoczatkowe(){
		
		//rozdanie dwóch kart na zmianê
		gracz.dobierzKarte();
		croupier.dobierzKarte();
		gracz.dobierzKarte();
		croupier.dobierzKarte();
	}
	
	void koniec()
	{
		exit = Messages.koniec();
	}
}
