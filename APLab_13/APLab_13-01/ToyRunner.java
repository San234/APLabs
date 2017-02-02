import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the name of the action figure: ");
		String AFigure = up.nextLine();
		
		System.out.print("Enter the name of the car: ");
		String Car = up.nextLine();
		
		Toy var = new Toy(AFigure);

	}
}