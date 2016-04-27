
interface Factory
{
	Card cardFactory(Colors c, Values v);
}

public class CardFactory implements Factory {

	@Override
	public Card cardFactory(Colors c, Values v) {
		Card card = null;
		switch(c)
		{
			case PIK:
			{
				if(v.ordinal() + 2 > 10)
					card =  new Pik(v.name(), c.name(), 10, c.ordinal());
				else
					card =  new Pik(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
			case TREFL:
			{
				if(v.ordinal() + 2 > 10)
					card =  new Trefl(v.name(), c.name(), 10, c.ordinal());
				else
					card =  new Trefl(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
			case KARO:
			{
				if(v.ordinal() + 2 > 10)
					card =  new Karo(v.name(), c.name(), 10,c.ordinal());
				else
					card =  new Karo(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
			case KIER:
			{
				if(v.ordinal() + 1 > 10)
					card =  new Kier(v.name(), c.name(), 10,c.ordinal());
				else
					card =  new Kier(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
		}
		
		
	return card;
	}
}
	


