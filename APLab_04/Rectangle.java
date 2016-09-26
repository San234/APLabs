import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		Rectangle A = new Rectangle();
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the length of Rectangle : ");
		Double l = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the width of Rectangle : ");
		Double w = up.nextDouble();
		up.nextLine();
		
		double area = A.PerimCalc(l, w);
		
		System.out.printf("Your rectangle is " + "%.5f" + "sq ft around", area);
	}
	
	public double PerimCalc(Double l, Double w)
	{
		return 2*l + 2*w;
	}
}