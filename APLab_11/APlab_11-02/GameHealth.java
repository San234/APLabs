import java.util.Scanner;
import java.util.Random;

public class GameHealth
{
	static String[] health;
	static int HealthLoad = 6;
	static int healthCount; 	
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Random rand = new Random();
		
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HealthLoad];
		
		while(!turn.equals("Q")&&healthCount > 0){
			System.out.print("Prompt: ");
			String user_command = up.nextLine();
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = up.nextLine();
			damage = rand.nextInt(2) + 1;
			amount = rand.nextInt(6) + 1;
			System.out.print(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!!");
	}
	public static String takeDamage(int a, int b)
	{
		if(a == 1){
			healthCount -= b;
			return "Taking " + b + " damage!";
		}
		else{
			if(healthCount + a < HealthLoad){
				healthCount += b;
			}
			else{
				HealthLoad = healthCount;
			}
			return "Power up " + b + "!\n";
		}
	}
	public static void printClip()
	{
		String output = "Health:\t";
		for(int i = 0; i < HealthLoad; i++){
			if(i < healthCount){
				health[i] = " @ ";
			}
			else{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}