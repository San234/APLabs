import java.util.Scanner;
import java.util.Random;

public class ArcaneRiverRunner 
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		ArcaneRiver go = new ArcaneRiver();
		Random rand = new Random();
		
		System.out.print("Arcane River\n");
		System.out.print("[Play] [Direction]\n");
		String menu = up.nextLine();
		
		if(menu.equals("play")||menu.equals("Play")){
			go.start();
		}
		else if(menu.equals("direction")||menu.equals("Direction")){
			direction(args);
		}
		else{
			main(args);
		}
	}
	public static void direction(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("What is questionable?\n[Gameplay]\n[Abbreviation]\n[Plot]\n[nothing]\n");
		String askDirection = up.nextLine();
		
		if(askDirection.equals("Gameplay")||askDirection.equals("gameplay")){
			System.out.print("This is based on texts and you just type things that are available.\n");
			System.out.print("For example, there will be words in brackets and those are words that you can type in.\n");
			System.out.print("\"Hunt\" = Goes out to field and you will encounter monsters.\n");
			System.out.print("\"Shop\" = Goes to shop and you can buy potions.\n");
			System.out.print("\"Attack\" = Charges toward your enemy and damage equal to your attack - enemy's defense.\n");
			System.out.print("\"Flee\" = Run away from your enemy and return to town.\n");
		    System.out.print("\"Defend\" = guard enemy's attack, but still damaging you by its attack - your def and you will counter them.\n");
			System.out.print("\"Item\" = Choose which potion you would drink, but still enemy will attack you.\n");
			System.out.print("\"Spell\" = After level 8, you will learn spells. Spell penetrates enemy's defense, but consumes mp.\n\n");
			direction(args);
		}
		else if(askDirection.equals("abbreviation")||askDirection.equals("Abbreviation")){
			System.out.print("\"HP\" = Health Point, directly affects the game\n");
			System.out.print("\"MP\" = Magic Point, needs to use every spell\n");
			System.out.print("\"ATK\" = Attack, affects your physical attack\n");
			System.out.print("\"DEF\" = Defense, affects your defense ability\n");
			System.out.print("\"S_ATK\" = Special Attack, affects your spell damage\n");
			System.out.print("\"EXP\" = Experience Points, help you grow stronger\n\n");
			direction(args);
		}
		else if(askDirection.equals("plot")||askDirection.equals("Plot")){
			System.out.print("Did not think of any, yet\n\n");
			direction(args);
		}
		else if(askDirection.equals("nothing")||askDirection.equals("Nothing")){
			main(args);
		}
		else{
			System.out.println("Sorry?");
			direction(args);
		}
	}
}