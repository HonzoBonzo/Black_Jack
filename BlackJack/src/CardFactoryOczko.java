


public class CardFactoryOczko implements Factory {

	@Override
	public Card cardFactory(Colors c, Values v) {
		Card card = null;
		int wart = v.ordinal() + 3; 
		switch(c)
		{
			case PIK:
			{
				if(v.ordinal() + 2  == 14)	//as
					card =  new Pik(v.name(), c.name(), 11, c.ordinal());
				
				else if(v.ordinal() + 2 > 10)
					card =  new Pik(v.name(), c.name(), wart - 10, c.ordinal());
				else
					card =  new Pik(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
			case TREFL:
			{
				if(v.ordinal() + 2  == 14)	//as
					card =  new Trefl(v.name(), c.name(), 11, c.ordinal());
				else if(v.ordinal() + 2 > 10)
					card =  new Trefl(v.name(), c.name(), wart - 10, c.ordinal());
				else
					card =  new Trefl(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
			case KARO:
			{
				if(v.ordinal() + 2  == 14)	//as
					card =  new Karo(v.name(), c.name(), 11, c.ordinal());
				else if(v.ordinal() + 2 > 10)
					card =  new Karo(v.name(), c.name(), wart - 10,c.ordinal());
				else
					card =  new Karo(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
			case KIER:
			{
				if(v.ordinal() + 2  == 14)	//as
					card =  new Kier(v.name(), c.name(), 11, c.ordinal());
				else if(v.ordinal() + 1 > 10)
					card =  new Kier(v.name(), c.name(), wart - 10,c.ordinal());
				else
					card =  new Kier(v.name(), c.name(), v.ordinal() + 2, c.ordinal());
				break;
			}
		}
		
		
	return card;
	}
}
	


