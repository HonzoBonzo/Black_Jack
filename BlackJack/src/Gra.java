
public class Gra {

	Player gracz;
	croupier croupier;
	public Talia tal = new Talia();
	Boolean graszDalej;
	Messages msg = new Messages();
	
	void start(){
		
		graszDalej = true;
		tal.wypelnianie();
		tal.tasuj();
		gracz = new Player(tal);
		croupier = new croupier(tal);
		
		
		
		while(graszDalej)
		{
		
			if(msg.CzyGraszDalej()) //zwraca true gdy gra dalej
			{
				gracz.dobierzKarte();
				if(gracz.CheckHandOverHigh())
				{
					this.End();
					graszDalej = false;
				}
				
				croupier.bot();
				
				  if(croupier.CheckHandOverHigh())
				  {
					  this.End();
					  graszDalej = false;
				  }
				 
			}
			else
			{
				graszDalej = false;
				
			}
			
		}
		
		
		//gracz.dobierzKarte();
		//gracz.dobierzDwieKarty();
		gracz.pokazReke();
		//krupier.pokazReke();
		
	}
	
	void End()
	{
		//krupier automat do konca
		
		if(gracz.getSumaKart() > croupier.getSumaKart())
		{
			msg.WygralPlayer("Player_name_default");
		}
		else
		{
			msg.WygralKrupier();
		}
		
	}
}
