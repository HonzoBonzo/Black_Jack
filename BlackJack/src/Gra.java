
public class Gra {

	Player gracz;
//	Krupier krupier;
	public Talia tal = new Talia();
	Boolean graszDalej;
	Messages msg = new Messages();
	
	void start(){
		
		graszDalej = true;
		tal.wypelnianie();
		tal.tasuj();
		gracz = new Player(tal);	
		gracz.dobierzDwieKarty();
		//krupier = new Krupier(tal);	
		//krupier.dobierzDwieKarty();
		
		
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
				
				//krupier.automat();
				/*
				 *  if(krupier.CheckHandOverHigh())
					{
						this.End();
						graszDalej = false;
					}
				 */
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
		
		/*if(gracz.getSumaKart() > krupier.getSumaKart())
		{
			msg.WygralPlayer("Player_name_default");
		}
		else
		{
			msg.WygralKrupier();
		}
		*/
	}
}
