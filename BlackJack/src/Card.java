
public class Card implements ConstValuesOfCards{
	private String name; //2,3,4,5,6,7,8,9,10,J,Q,K,A
	private int value; //2,3,4,5,6,7,8,9,10,11
	private String color; // kier, pik, trefl, karo
	
	public Card(){
		name = "0";
		value = 0;
		color = "none";
	}
	
	public Card(String nam, String col){
		name = nam;
		SetValue(nam);
		color = col;
	}
	
	public void SetValue(String nam){
		if(nam == "TWO")
			value = TWO;
		else if(nam == "THREE")
			value = THREE;
		else if(nam == "FOUR")
			value = FOUR;
		else if(nam == "FIVE")
			value = FIVE;
		else if(nam == "SIX")
			value = SIX;
		else if(nam == "SEVEN")
			value = SEVEN;
		else if(nam == "EIGHT")
			value = EIGHT;
		else if(nam == "NINE")
			value = NINE;
		else if(nam == "TEN")
			value = TEN;
		else if(nam == "JUPEK")
			value = JUPEK;
		else if(nam == "QUEEN")
			value = QUEEN;
		else if(nam == "KING")
			value = KING;
		else if(nam == "ACE")
			value = ACE;
		else
			value = -1;
		
	};
	
	public void ShowCard(){
		System.out.println("Karta " + name + " kolor " + color + ", wartosc: " + value);
	}
	
}
