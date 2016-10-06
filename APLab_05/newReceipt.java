import java.util.Scanner;
import java.util.Random;

public class newReceipt
{
	static double discount;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		newReceipt var = new newReceipt();
		
		System.out.print("Enter the item #1 :\n");
		String item1 = up.nextLine();
		
		System.out.print("Enter the item #2 :\n");
		String item2 = up.nextLine();
		
		System.out.print("Enter the item #3 :\n");
		String item3 = up.nextLine();
		
		System.out.print("Enter the item #4 :\n");
		String item4 = up.nextLine();
		
		System.out.print("Enter the price of item #1 :\n");
		double cost1 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the price of item #2 :\n");
		double cost2 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the price of item #3 :\n");
		double cost3 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the price of item #4 :\n");
		double cost4 = up.nextDouble();
		up.nextLine();
		
		double subtotal = cost1 + cost2 + cost3 + cost4;
		String st = "subtotal";
		
		double discount = var.discount(subtotal,cost1,cost2,cost3,cost4);
		String dc = "discount";
		
		double tax = (subtotal * 0.075);
		String tx = "tax";
		
		double total = subtotal - discount + tax;
		String tt = "total";
		
		System.out.println("<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		var.format(item1,cost1);
		var.format(item2,cost2);
		var.format(item3,cost3);
		var.format(item4,cost4);
		var.format(st,subtotal);
		var.format(dc,discount);
		var.format(tx,tax);
		var.format(tt,total);		
	}
	public double discount(double subtotal, double cost1, double cost2, double cost3, double cost4)
	{
		if(subtotal >= 2000){
			discount = subtotal * 0.15;
		}
		if(subtotal < 2000){
			discount = 0;
		}
		return discount;
	}
	public static void format(String items, double costs)
	{

		System.out.printf("*%15S ........\t %12.2f  *\n", items, costs);
	}
}