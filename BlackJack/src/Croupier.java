
public class Croupier {
	private int sumaKart;
	private int ileKart;	//ile kart "na rêce"
	private Card[] reka = new Card[10];	//kart gracza "na rêce"
	private Talia talia;
	
	Croupier(Talia t){
		talia = t;
	}
	
	void pokazJedna(){
		System.out.println("Karta krupiera: ");
		System.out.println(reka[0]);
	}
	
	void pokazReke(){
		System.out.println("\nKarty krupiera: ");
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
	
	
	//sprawdza czy ma dobraæ, jak dobiera to zwraca true
	boolean Bot(){
		if(sumaKart <= 16)
			return true;
		
		
		else 
			return false;
	}
	
	void zeruj()
	{
		this.reka = new Card[10];
		this.ileKart = 0;
		this.sumaKart = 0;
	}
}

