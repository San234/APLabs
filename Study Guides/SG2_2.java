import java.util.Scanner;

public class SG2_2
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		SG2_2 var = new SG2_2();
		
		System.out.print("Enter the name of the first item: ");
		String item1 = up.nextLine();
		System.out.print("Enter the price of the first item: ");
		double cost1 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the name of the second item: ");
		String item2 = up.nextLine();
		System.out.print("Enter the price of the second item: ");
		double cost2 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the name of the third item: ");
		String item3 = up.nextLine();
		System.out.print("Enter the price of the third item: ");
		double cost3 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the name of the fourth item: ");
		String item4 = up.nextLine();
		System.out.print("Enter the price of the fourth item: ");
		double cost4 = up.nextDouble();
		up.nextLine();
		
		var.format(item1, cost1);
		var.format(item2, cost2);
		var.format(item3, cost3);
		var.format(item4, cost4);
		
	}
	public static void format(String items, double costs)
	{
		System.out.printf("*%2S .......... %2.2f*\n", items, costs);
	}
}