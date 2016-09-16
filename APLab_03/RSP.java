import java.util.Scanner;
import java.util.Random;

public class RSP
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		Random rnd = new Random();
		
		char compWeapon;
		
		choice = rnd.Random(1,3);
		
		String weapon;
		System.out.print("Choose your Weapon!\n");
		weapon = user_input.next();
	}
}