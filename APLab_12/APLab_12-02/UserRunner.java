import java.util.Scanner;

public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		String fN = up.nextLine();
		
		System.out.print("Enter your Last Name: ");
		String lN = up.nextLine();
		
		System.out.print("Would you like to use a public avatar?\n[Yes][No]\n");
		String avatar = up.nextLine();
		if(avatar.equals("no")||avatar.equals("n")){
			User info = new User(fN, lN);
			System.out.println(info);
		}
		else if(avatar.equals("yes")||avatar.equals("y")){
			System.out.print("Enter you Avatar: ");
			String av = up.nextLine();
			User info1 = new User(fN, lN, av);
			System.out.println(info1);
		}
	}
}