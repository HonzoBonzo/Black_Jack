
public class Gra {

	Player gracz;
//	Krupier krupier;
	public Talia tal = new Talia();
	
	void start(){
		
		tal.wypelnianie();
		gracz = new Player(tal);	
		gracz.dobierzDwieKarty();
		
		
		
		//gracz.dobierzKarte();
		//gracz.dobierzDwieKarty();
		gracz.pokazReke();
		
	}
}
