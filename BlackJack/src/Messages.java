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
		System.out.println("Gratulujemy i zapraszamy ponownie...");
	}
	
	public void WygralPlayer(String s)
	{
		System.out.println("Wygral: " + s);
		System.out.println("Gratulujemy i zapraszamy ponownie...");
	}
	
	public Boolean CzyGraszDalej()
	{
		System.out.println("Graczu, czy chcesz grac dalej[t/n + enter]?");
		Scanner input = new Scanner(System.in);
		if(input.next().equals("t")  || input.next().equals("T"))
			return true;
		else
			return false;
	}
	
}
