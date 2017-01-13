import java.util.Scanner;

public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.println("Your Hair Color?");
		String hair = up.nextLine();
		
		System.out.println("Your Skin Color?");
		String skin = up.nextLine();
		
		System.out.println("Your Eye Color?");
		String eye = up.nextLine();
		
		Human engineer = new Human(hair, skin, eye);
		
		System.out.println("My info...");
		System.out.println("Hair : " + engineer.getHair());
		System.out.println("Skin : " + engineer.getSkin());
		System.out.println("Eyes : " + engineer.getEyes());
		
		Human engineer1 = new Human("black", "green", "tan");
		System.out.println("His info...");
		System.out.println("Hair : " + engineer1.getHair());
		System.out.println("Skin : " + engineer1.getSkin());
		System.out.println("Eyes : " + engineer1.getEyes());
	}
}