import java.util.Scanner;

public class FirstProg
{
	public static void main(String[]args)
	{
		System.out.println("Hello World");
		
		Scanner user_input = new Scanner(System.in);
		
		String first_name;
		System.out.print("Enter your first name: ");
		first_name = user_input.next();
		
		String last_name;
		System.out.print("Enter your last name: ");
		last_name = user_input.next();
		
		String full_name;
		full_name = first_name + " " + last_name;
		
		System.out.println("You are " + full_name);
	}
}