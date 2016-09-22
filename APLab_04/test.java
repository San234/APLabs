import java.util.Scanner;

public class test
{
	public static void main(String[]args)
	{
		test Receipt = new test();
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Please Enter Item #1: ");
		String item1 = user_input.nextLine();
		System.out.print("Please Enter Price of Item #1: ");
		Double price1 = user_input.nextDouble();
		user_input.nextLine();
		
		System.out.print("Please Enter Item #2: ");
		String item2 = user_input.nextLine();
		System.out.print("Please Enter Price of Item #2: ");
		Double price2 = user_input.nextDouble();
		user_input.nextLine();
		
		System.out.print("Please Enter Item #3: ");
		String item3 = user_input.nextLine();
		System.out.print("Please Enter Price of Item #3: ");
		Double price3 = user_input.nextDouble();
		
		String sb = "subtotal";
		double subtotal = price1 + price2 + price3;
		String tx = "tax";
		double tax = (subtotal * 0.075);
		String tt = "total";
		double total = tax + subtotal;
		
		System.out.println("<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.println("                                           ");
		
		Receipt.format(item1, price1);
		Receipt.format(item2, price2);
		Receipt.format(item3, price3);
		System.out.println("                    ");
		Receipt.format(sb, subtotal);
		Receipt.format(tx, tax);
		Receipt.format(tt, total);
		
		System.out.println("-------------------------------------------");
		System.out.println("\t   Thank your for your support   \t");
		
	}
	public void format(String item, Double price)
	{
		System.out.printf("*" + "%15S" + " ........\t" + "%12.2f" + "\n", item, price);
	
	}
}