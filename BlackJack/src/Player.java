
public class Player {

	private int sumaKart;
	private int ileKart;	//ile kart "na rêce"
	private Card[] reka = new Card[10];;	//kart gracza "na rêce"
	private int zaklad; 	//ile pieniedzy ma postawione w obecnym zakladzie
	private int pieniadze;	//ile pieniedzy ma w ogole
	private Talia talia;
	
	Player(Talia t){
		talia = t;
	}
	
	void pokazReke(){
		System.out.println("\nKarty gracza: \n");
		for(int i=0; i< ileKart; i++)
			System.out.println(reka[i]);
	}
	
	
	
	void dobierzDwieKarty(){

		if(talia.iterator.hasNext())
			reka[0] = (Card)talia.iterator.next();	//dobieram kolejn¹ kartê
		if(talia.iterator.hasNext())
			reka[1] = (Card)talia.iterator.next();
		
		System.out.println("Dobrano 2 karty poczatkowe: ");
		System.out.println(reka[0]);
		System.out.println(reka[1]);
		ileKart += 2;
	}
	
	void dobierzKarte(){
		if(talia.iterator.hasNext())
			reka[ileKart] = (Card)talia.iterator.next();	//dobieram kolejn¹ kartê
		ileKart++;
	}
	
}
