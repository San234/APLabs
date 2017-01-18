import java.util.Scanner;

public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the Manufacturer: ");
		String Manu = up.nextLine();
		
		System.out.print("Enter the Category: ");
		String Cat = up.nextLine();
		
		System.out.print("Would you like to enter Name and Price? [Yes][No]\n");
		String user_command = up.nextLine();
		
		if(user_command.equals("n")||user_command.equals("no")){
			Inventory item = new Inventory(Manu, Cat);
			System.out.println(item);
		}
		else if(user_command.equals("y")||user_command.equals("yes")){
			System.out.print("Enter the Name: ");
			String i_name = up.nextLine();
			System.out.print("Enter the Price: ");
			String i_price = up.nextLine();
			Inventory item1 = new Inventory(i_name, i_price);
			System.out.println(item1);
		}
	}
}