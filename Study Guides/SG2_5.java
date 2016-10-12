import java.util.Scanner;

public class SG2_5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		SG2_5 var = new SG2_5();
		
		System.out.println("Please enter item1 : ");
		String i1 = kb.nextLine();
		System.out.println("Now enter the price : ");
		double p1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2 : ");
		String i2 = kb.nextLine();
		System.out.println("Now enter the price : ");
		System.out.println("Now enter the price : ");
		double p2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2 : ");
		String i3 = kb.nextLine();
		System.out.println("Now enter the price : ");
		System.out.println("Now enter the price : ");
		double p3 = kb.nextDouble();
		
		double subtotal = p1+p2+p3;
		double tax = subtotal * 0.08;
		double total = subtotal + tax;
		
		System.out.println("_________________________");
		var.format(i1,p1);
		var.format(i2,p2);
		var.format(i3,p3);
		var.format("Subtotal : ",subtotal);
		var.format("Tax : ",tax);
		var.format("Total: ", total);
		
	}
	public void format(String one, double two)
	{
		System.out.printf("* %15s........%15.2f\n",one,two);	
	}
}