
public class Croupier {
	private int sumaKart;
	private int ileKart;	//ile kart "na rêce"
	private Card[] reka = new Card[10];	//kart gracza "na rêce"
	private Talia talia;
	
	Croupier(Talia t){
		talia = t;
	}
	
	void pokazReke(){
		System.out.println("\nKarty gracza: ");
		System.out.println("Suma: " + sumaKart);
		for(int i=0; i< ileKart; i++)
			System.out.println(reka[i]);
		
	}
	
	public Boolean CheckHandOverHigh()
	{
		if(sumaKart > 21)
			return true;
		else return false;
	}
	
	public int getSumaKart()
	{
		return sumaKart;
	}
	
	void dobierzKarte(){
		if(talia.iterator.hasNext())
			reka[ileKart] = (Card)talia.iterator.next();	//dobieram kolejn¹ kartê
		
		sumaKart += reka[ileKart++].value;
	}
	void Bot(){
		if(sumaKart <= 16){
			dobierzKarte();
		}
		else if(sumaKart >= 17){
			
		}
	}
}

