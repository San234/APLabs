import java.util.Scanner;

public class adress
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		adress formatting = new adress();
		
		String Full_name;
		System.out.print("Enter the full name: ");
		Full_name = user_input.nextLine();
		
		String Your_address;
		System.out.print("Enter your adress: ");
		Your_address = user_input.nextLine();
	
		System.out.print("Enter the name of city: ");
		String City_name = user_input.nextLine();
		
		System.out.print("Enter the name of State: ");
		String State_name = user_input.nextLine();

		
		String Zip_code;
		System.out.print("Enter the zip code: ");
		Zip_code = user_input.nextLine();

		
		String full_address = City_name + ", " + State_name + ", " + Zip_code;
		System.out.printf("------------------------------\n");
		formatting.format(Full_name);
		formatting.format(Your_address);
		formatting.format(full_address);
		System.out.printf("------------------------------\n");

		
		System.out.println(Full_name + " lives on " + full_address);
	}
	public void format(String item)
	{
		System.out.printf("|" + "%15S\n", item);
	}
}