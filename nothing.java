import java.util.Scanner;
import java.util.Random;

public class nothing
{	
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		System.out.print("Enter your nickname :\n");
		String user_name = up.nextLine();
		
		int hp =  rand.nextInt(180) + 110;
		int atk = rand.nextInt(64) + 36;
		int def = rand.nextInt(48) + 32;
		int exp = 0;
		
		you.stat(user_name, hp, atk, def, exp);
	}
	public static void stat(String user_name, int hp, int atk, int def, int exp)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		System.out.printf("-----------------" + "%2S" + "-------------\n", user_name);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, hp, a, atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " : " + "%6s" + "|\n", c, def, d, exp);
				
		System.out.print("Would you go hunting?\n");
		String hunt_ask = up.nextLine();
		if(hunt_ask.equals("y") || hunt_ask.equals("yes"))
		{
			you.hunt(user_name, hp, atk, def, exp);
		}
		else
		{
			System.exit(0);
		}

	}
	public static void hunt(String user_name, int hp, int atk, int def, int exp)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		String mon_name = "Erhdas";
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		int mon_hp =  rand.nextInt(60) + 40;
		int mon_atk = rand.nextInt(24) + 12;
		int mon_def = rand.nextInt(30) + 15;
		
		System.out.println("!!Monster Appeared!!");
		System.out.printf("----------------" + "%2S" + "-------------\n", mon_name);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, mon_hp, a, mon_atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "                 |\n", c, mon_def);
		
		you.askHunt(a,b,c,d,atk,def,mon_atk,hp,user_name,exp,mon_def,mon_hp,mon_name);
	}
	public static void askHunt(String a, String b, String c, String d, int atk, int def, int mon_atk, int hp, String user_name, int exp, int mon_def, int mon_hp, String mon_name);
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		String mon_name = "Erhdas";
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		int mon_hp =  rand.nextInt(60) + 40;
		int mon_atk = rand.nextInt(24) + 12;
		int mon_def = rand.nextInt(30) + 15;
		System.out.print("What would you do? [Attack Flee Defend]\n");
		String user_command = up.nextLine();
		
		if(user_command.equals("attack")||user_command.equals("Attack"))
		{
			you.fight(a,b,c,d,atk,def,mon_atk,hp,user_name,exp,mon_def,mon_hp,mon_name);
		}
		else if(user_command.equals("Flee")||user_command.equals("flee"))
		{
			you.stat(user_name, hp, atk, def, exp);
		}
		else if(user_command.equals("defend")||user_command.equals("Defend"))
		{
			you.defense(a,b,c,atk,mon_def,mon_hp,mon_atk, mon_name, def, exp, user_name, hp);
		}
	}
	public static void fight(String a, String b, String c, String d, int atk, int def, int mon_atk, int hp, String user_name, int exp, int mon_def, int mon_hp, String mon_name)
	{
		nothing you = new nothing();
		Random rand = new Random();
		
		int actual_a = atk - mon_def;
		int d_mon_hp = mon_hp - actual_a;
		if(d_mon_hp <= 0){
			d_mon_hp = 0;
		}
		
		System.out.printf("----------------" + "%2S" + "-------------\n", mon_name);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, d_mon_hp, a, mon_atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "                 |\n", c, mon_def);
		System.out.println("\"Erhdas\" got damaged by " + actual_a);
		
		if(d_mon_hp <= 0){
			exp = rand.nextInt(100) + 75;
			System.out.println("!!" + mon_name + " died!!\nYou've earned " + exp + " points!!");
			you.stat(user_name, atk, def, exp, hp);
		}
		else if(d_mon_hp > 0){
			you.askHunt(a,b,c,atk,mon_def,mon_hp,mon_atk, mon_name, def, exp, user_name, hp);
		}
	}
	public static void defense(String a, String b, String c, int atk, int mon_def, int mon_atk, int mon_hp, String mon_name, int def, int exp, String user_name, int hp)
	{
		int actual_d = mon_atk - def;
		if(actual_d < 0){
			actual_d = 0;
		}
		int d_hp = hp - actual_d;
		
		System.out.printf("-----------------" + "%2S" + "-------------\n", user_name);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, d_hp, a, atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " : " + "%6s" + "|\n", c, def, d, exp);
		
		System.out.println(user_name + " got damaged by " + actual_d);
	}
}