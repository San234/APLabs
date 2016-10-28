import java.util.Scanner;

public class SG2
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		SG2 var = new SG2();
		
		System.out.print("Enter the cost of the first item: ");
		double item1 = up.nextDouble();
		System.out.print("Enter the cost of the second item: ");
		double item2 = up.nextDouble();
		
		var.format(item1,item2);
	}
	public static void format(double one, double two)
	{
		double total = one + two;
		System.out.printf("The total cost of your order is $%.2f", total);
	}
}