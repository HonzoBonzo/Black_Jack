import java.util.Random;


public class Talia implements Container{
	
	int l=0;
	Card[] talia = new Card[Values.L_FIGUR.ordinal() * Colors.L_KOLOROW.ordinal()];
	CardFactory fabryka = new CardFactory();
	
	
	void wypelnianie()
	{
		for(int i = 0; i < Colors.L_KOLOROW.ordinal(); i++)
		for(int j = 0; j < Values.L_FIGUR.ordinal(); j++)
		{
			talia[l++] = fabryka.cardFactory(Colors.values()[i], Values.values()[j]);
		}
	}
	
	void wypisz()
	{
		//for(int i = 0; i < Values.L_FIGUR.ordinal() * Colors.L_KOLOROW.ordinal(); i++)
		//	System.out.println("Kolor: " + talia[i].kolor + " Figura: " + talia[i].name);
		Card tmp;
		for(Iterator iter = this.getIterator(); iter.hasNext(); ){
			tmp = (Card)iter.next();
			System.out.println(tmp);
		}
	}
	
	void tasuj()
	{
		Random rand = new Random();
		int n1, n2;
		Card tmp;
		for(int i =0; i< 200; i++)
		{
			n1 = rand.nextInt(52);	//losujê wartoœæ od 0 do 52
			n2 = rand.nextInt(52);
			
			tmp = talia[n2]; //przechowuje chwilowo kartê
			//tmp = talia[n2].clone();
			
			talia[n2] = talia[n1];	// i wykonuje zamiane kart
			talia[n1] = tmp;			
			
		}
		
	}
	
	//WZORZEC PROJEKTOWY ITERATOR
	@Override
	public Iterator getIterator(){
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
	
		int index;
	
	    @Override
	    public boolean hasNext() {
	    	if(index < talia.length){
	            return true;
	        }
	        return false;
	    }
	
	    @Override
	    public Object next() {
	    	if(this.hasNext()){
	    		return talia[index++];
	        }
	        return null;
	    }		
	}
	
	/*
	Card zwrocKarte()
	{
		if(index == 51) 
			index = 0;
		
		return talia[index++];
	}
	*/
	  
	  
}
