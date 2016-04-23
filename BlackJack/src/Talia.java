
public class Talia {
	
	int l=0;
	Card[] talia = new Card[Values.L_FIGUR.ordinal() * Colors.L_KOLOROW.ordinal()];
	CardFactory fabryka = new CardFactory();
	
	void wypelnianie()
	{
	for(int i = 0; i < Colors.L_KOLOROW.ordinal(); i++)
		for(int j = 0;j < Values.L_FIGUR.ordinal(); j++)
		{
			talia[l++] = fabryka.cardFactory(Colors.values()[i], Values.values()[j]);
		}
	}
	
	void wypisz()
	{
		for(int i = 0; i < Values.L_FIGUR.ordinal() * Colors.L_KOLOROW.ordinal(); i++)
			System.out.println("Kolor: " + talia[i].kolor + " Figura: " + talia[i].name);

	}
	
}
