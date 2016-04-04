
public class Card {
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
		//value = val;
		//SetValue(nam);
		color = col;
	}
	
	public void SetValue(String namee){
		
		
		
	};
	
	public void ShowCard(){
		System.out.println("Karta " + name + " kolor " + color + ", wartosc: " + value);
	}
	
}
