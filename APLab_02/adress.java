import java.util.Scanner;

public class adress
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		String Full_name;
		System.out.print("Enter the full name: ");
		Full_name = user_input.nextLine();
		
		String Your_address;
		System.out.print("Enter your adress: ");
		Your_address = user_input.nextLine();
		
		String City_name;
		System.out.print("Enter the name of city |including the initial of state|: ");
		City_name = user_input.nextLine();
		
		String Zip_code;
		System.out.print("Enter the zip code: ");
		Zip_code = user_input.nextLine();
		
		String full_address;
		full_address = Your_address + ", " + City_name + ", " + Zip_code;
		
		System.out.println(Full_name + " lives on " + full_address);
	}
}