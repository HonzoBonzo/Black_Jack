
public abstract class Card{
	 protected String name; //2,3,4,5,6,7,8,9,10,J,Q,K,A
	 protected int value; //2,3,4,5,6,7,8,9,10,11
	 protected int color; // pik 1, kier 2, karo 3, trefl 4,
	 protected String kolor;
	 
	 @Override
		public String toString(){
			return "Kolor: " + this.kolor + " Figura: " + this.name;
		}
	 
	 
	 
}

class Pik extends Card
{
	Pik(String name, String kolor, int value, int color)
	{
		this.name = name;
		this.value = value;
		this.color = color;
		this.kolor = kolor;
	}
		
	
}

class Trefl extends Card
{
	Trefl(String name, String kolor, int value, int color)
	{
		this.name = name;
		this.value = value;
		this.color = color;
		this.kolor = kolor;
	}
	
	
}

class Karo extends Card
{
	Karo(String name, String kolor, int value, int color)
	{
		this.name = name;
		this.value = value;
		this.color = color;
		this.kolor = kolor;
	}
	
}

class Kier extends Card
{
	Kier(String name, String kolor, int value, int color)
	{
		this.name = name;
		this.value = value;
		this.color = color;
		this.kolor = kolor;
	}
	
}

