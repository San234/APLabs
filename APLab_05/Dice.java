import java.util.Scanner;
import java.util.Random;

public class Dice
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		Dice var = new Dice();
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter you name : ");
		String user_name = up.nextLine();
	
		int plyChoice = rand.nextInt(6) + 1;
		int cmpChoice = rand.nextInt(6) + 1;
		
		String winner = var.rollDice(plyChoice, cmpChoice, user_name);
		
		System.out.println("You rolled a " + plyChoice);
		System.out.println("Computer rolled a " + cmpChoice);
		System.out.println("The winner is " + winner);
	}
	public String rollDice(int plyChoice, int cmpChoice, String user_name)
	{
		String winner = "";
		if(plyChoice > cmpChoice)
		{
			winner = user_name;
		}
		if(cmpChoice > plyChoice)
		{
			winner = "Computer";
		}
		else if(plyChoice == cmpChoice)
		{
			winner = "none";
		}
		return winner;
	}
}