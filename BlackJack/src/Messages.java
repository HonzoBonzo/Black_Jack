import java.util.Scanner;

public class Messages {

	public void DobierzKarte()
	{
		System.out.println("Graczu, czy chcesz dobrac kolejna karte?");
	}
	
	public void PokazReke()
	{
		System.out.println("Graczu, czy chcesz zobaczyc swoja reke?");
	}
	
	public void WygralKrupier()
	{
		System.out.println("Wygral: Krupier");
		System.out.println("Zapraszamy ponownie...");
		System.out.println();
	}
	
	public void WygralPlayer(String s)
	{
		System.out.println("Wygral: " + s);
		System.out.println("Gratulujemy i zapraszamy ponownie...");
		System.out.println();
	}
	
	public Boolean CzyGraszDalej()
	{
		System.out.println("Graczu, czy chcesz grac dalej[t/n + enter]?");
		Scanner input = new Scanner(System.in);
		if(input.next().equals("t"))//wywali³em to lub bo przy odpowiedzi n trzeba bylo odpowiadaæ drugi raz
			return true;
		else
			return false;
	}
	
	public static int stawka(int max)
	{
		int zaklad = 0;
		System.out.println();
		System.out.println("Wplac stawke, za ktora chcesz wejsc do gry");
		Scanner input = new Scanner(System.in);
		zaklad=input.nextInt();
		while(zaklad <= 0 || zaklad > max)
		{
			System.out.println("Podales nieodpowiednia stawke. Sprobuj jeszcze raz");
			zaklad=input.nextInt();
		}
		return zaklad;
	}
	
	static public void przegrana(int zaklad, int pieniadze)
	{
		System.out.println("Przegrales zak³ad o stawce: " + zaklad);
		System.out.println("Aktualny stan twojego konta: " + pieniadze);
		System.out.println();
	}
	
	static public void wygrana(int zaklad, int pieniadze)
	{
		System.out.println("Wygrales zak³ad o stawce: " + zaklad);
		System.out.println("Aktualny stan twojego konta: " + pieniadze);
		System.out.println();
	}
	
	static public boolean koniec()
	{
		System.out.println("Graczu, czy chcesz zakonczyc gre[t/n + enter]?");
		Scanner input = new Scanner(System.in);
		if(input.next().equals("t")) 
			return true;
		else
			return false;
	}
	public void lose()
	{
		System.out.println("Skonczyly Ci sie srodki na koncie. Koniec gry!!!");
		System.out.println();
	}
	
}
