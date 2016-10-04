
import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		String name;
		System.out.print("Hi, I am RudeAI\n" + "I'd like to ask you few questions\n" + "What is your name? ");
		name = user_input.nextLine();
		System.out.println(name + "?!?!" + " Why would you keep that name?\n");
		
		String ages;
		System.out.print("Then how old are you? ");
		ages = user_input.nextLine();
		System.out.println(ages + "?!?!" + " You are too old!\n");
		
		String music;
		System.out.print("What kind of music are you listening to? ");
		music = user_input.nextLine();
		System.out.println(music + "... Well, I have got no word for you to listen to that.\n");
		
		String interests;

		System.out.print("So what are you intesting in");
		interests = user_input.nextLine();
		System.out.println(interests + ", hmm... interesting, but I think " + interests + " will dislike you.");

		System.out.print("So what do you do for fun?");
		interests = user_input.nextLine();
		System.out.println(interests + ", hmm... interesting, but I think " + interests + " will dislike you.\n");

		
		String siblings;
		System.out.print("And how many siblings do you have? ");
		siblings = user_input.nextLine();

		System.out.println(siblings + "? Not bad, are they respect you or not, I hope they do not? But if you have none, well good for you...");
		

		System.out.println(siblings + "? Not bad, are they respect you or not, I hope they do not? But if you have none, well good for you...\n");
		
		String dream;
		System.out.print("Lastly, What do you want to be when you grow up? ");
		dream = user_input.nextLine();
		System.out.println("Your dream of being " + dream + " will be hard for you to achieve, old man...\n");
	}


}