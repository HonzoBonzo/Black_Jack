
public class Player {

	private int sumaWartosciKart;
	private int ileKart;	//ile kart "na rêce"
	private Card[] reka;	//kart gracza "na rêce"
	
	public void pokazReke(){
		obliczSumeNaRece();
		obliczIleKart();
		
		System.out.println("Posiadasz " + ileKart + "kart o lacznej wartosci: " + sumaWartosciKart);
		
		for(Card karta : reka){ 
			System.out.println(karta);
		}
	}
	
	
	public void obliczSumeNaRece()
	{
		sumaWartosciKart = 0;
		for(Card karta : reka){ 
			sumaWartosciKart += karta.value;
		}
	}
	
	public void obliczIleKart()
	{
		ileKart = 0;
		for(Card karta : reka){ 
			ileKart++;
		}
	}
	
}
