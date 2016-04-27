import java.util.Scanner;


public class Player {

	private int sumaKart;
	private int ileKart;	//ile kart "na rêce"
	private Card[] reka = new Card[10];	//kart gracza "na rêce"
	private int zaklad; 	//ile pieniedzy ma postawione w obecnym zakladzie
	private int pieniadze = 1000;	//ile pieniedzy ma w ogole
	private Talia talia;
	private String NickName = "Default";
	
	Player(Talia t){
		talia = t;
	}
	
	void pokazReke(){
		System.out.println("\nKarty gracza: ");
		System.out.println("Suma: " + sumaKart);
		for(int i=0; i< ileKart; i++)
			System.out.println(reka[i]);
		
		System.out.println();
		
	}
	
	void setNickName(){
		System.out.println("Podaj swój pseudonim.");
		Scanner input = new Scanner(System.in);
		NickName = input.next();
		System.out.println("Twój pseudonim to " + NickName);
	}
	
	String getNickName(){
		return NickName;
	}
	
	public void kodDoGry()
	{
		pieniadze +=6666;
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
	
	
	/*void dobierzDwieKarty(){

		if(talia.iterator.hasNext())
			reka[0] = (Card)talia.iterator.next();	//dobieram kolejn¹ kartê
		if(talia.iterator.hasNext())
			reka[1] = (Card)talia.iterator.next();
		
		System.out.println("Dobrano 2 karty poczatkowe: ");
		System.out.println(reka[0]);
		System.out.println(reka[1]);
		ileKart += 2;
		sumaKart += reka[0].value;
		sumaKart += reka[1].value;
	}*/
	
	void dobierzKarte(){
		if(talia.iterator.hasNext())
			reka[ileKart] = (Card)talia.iterator.next();	//dobieram kolejn¹ kartê
		
	//	System.out.println("Dobrana karta gracza: ");
	//	System.out.println(reka[ileKart]);
		sumaKart += reka[ileKart++].value;
	}
	
	void postawZaklad()
	{
		zaklad = Messages.stawka(pieniadze);		
	}
	
	void wygralZaklad()
	{
		this.pieniadze+=zaklad;
		Messages.wygrana(zaklad, this.pieniadze);
	}
	
	void przegralZaklad()
	{
		this.pieniadze-=zaklad;
		Messages.przegrana(zaklad, this.pieniadze);
	}
	
	int getPieniadze()
	{
		return pieniadze;
		
	}
	
	void zeruj()
	{
		this.reka = new Card[10];
		this.ileKart = 0;
		this.sumaKart = 0;
	}
	
}
