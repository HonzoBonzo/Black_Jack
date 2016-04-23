
public class Gra {

	Player gracz;
//	Krupier krupier;
	public Talia tal = new Talia();
	Boolean graszDalej;
	
	void start(){
		
		
		tal.wypelnianie();
		tal.tasuj();
		gracz = new Player(tal);	
		gracz.dobierzDwieKarty();
		
		while(graszDalej)
		{
			
		}
		
		
		//gracz.dobierzKarte();
		//gracz.dobierzDwieKarty();
		gracz.pokazReke();
		
	}
}
