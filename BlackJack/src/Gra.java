
public class Gra {

	Player gracz;
	Croupier croupier;
	public Talia tal = new Talia();
	Boolean graszDalej;
	Messages msg = new Messages();
	
	void start(){
		
		graszDalej = true;
		tal.wypelnianie();
		tal.tasuj();
		gracz = new Player(tal);
		croupier = new Croupier(tal);
		
		this.rozdaniePoczatkowe();	//rozdajemy dwie karty na zmian� graczowi i krupierowi

		croupier.pokazJedna(); 		//zgodnie z zasadami gracz widzi jedn� karte krupiera
		gracz.pokazReke();
		
		//p�tla gracza
		while(msg.CzyGraszDalej())
		{
			
			gracz.dobierzKarte();
			gracz.pokazReke();			//gracz pokazuje swoje karty
			if(gracz.CheckHandOverHigh())
			{
				this.End();
				break;	//koniec
			}
						
		}
		
		//jesli jest tutaj, to gracz postanowi� sprawdzi�
		//i dopiero teraz w��cza si� do gry krupier
		
		//p�tla krupiera
		while(croupier.Bot())
		{
			croupier.dobierzKarte();
			if(croupier.CheckHandOverHigh())
			{
				this.End();
				break;
			}
		}
		
		this.End();
		
		
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
			msg.WygralKrupier();
		}
		
		else if(croupier.getSumaKart() > 21)
		{
			System.out.println("Przekroczona suma 21 u krupiera");
			msg.WygralPlayer("Player_name_default");
		}
		
		else if(gracz.getSumaKart() > croupier.getSumaKart())
		{
			System.out.println("Gracz jest bli�ej 'oczka'");
			msg.WygralPlayer("Player_name_default");
		}
		
		else if(gracz.getSumaKart() < croupier.getSumaKart())
		{
			System.out.println("Krupier jest bli�ej 'oczka'");
			msg.WygralKrupier();
		}
		
		else if(gracz.getSumaKart() == croupier.getSumaKart())
		{
			System.out.println("Remis");
			//remis
		}
		
		
		
	}
	
	void rozdaniePoczatkowe(){
		
		//rozdanie dw�ch kart na zmian�
		gracz.dobierzKarte();
		croupier.dobierzKarte();
		gracz.dobierzKarte();
		croupier.dobierzKarte();
	}
}
