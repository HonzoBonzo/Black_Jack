
public class Card implements ConstValuesOfCards{
	private String name; //2,3,4,5,6,7,8,9,10,J,Q,K,A
	private int value; //2,3,4,5,6,7,8,9,10,11
	private int color; // pik 1, kier 2, karo 3, trefl 4,

	
	public Card(){
		name = "0";
		value = 0;
		color = 0;
	}
	
	public Card(Card ob)
	{
		name = ob.name;
		value = ob.value;
		color = ob.color;
	}
	
	public Card(String nam, int col){
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
		System.out.print("Karta: " + name + ", kolor ");
		switch(color){
		case PIK:
			System.out.print("PIK");
			break;
		case KIER:
			System.out.print("KIER");
			break;
		case KARO:
			System.out.print("KARO");
			break;
		case TREFL:
			System.out.print("TREFL");
			break;
		default:
			break;
		}
		System.out.println(", wartosc: " + value);
	}

	

	
}
