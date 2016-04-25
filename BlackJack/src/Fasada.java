
public class Fasada {
	
	private Gra gra;
	private Oczko oczko;
	
	Fasada()
	{
		gra = new Gra();
		oczko = new Oczko();
	}
	
	void action()
	{
		gra.start();
	}
	
	void oczko()
	{
		oczko.start();
	}

}
