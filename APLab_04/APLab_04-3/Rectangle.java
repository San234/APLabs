import java.util.Scanner;

public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	public static void main(String[]args)
	{
		Rectangle A = new Rectangle();
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the length of Rectangle : ");
		l = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the width of Rectangle : ");
		w = up.nextDouble();
		up.nextLine();
		
		perimeter = A.PerimCalc(l, w);
		
		A.print(perimeter);
	}
	
	public double PerimCalc(Double l, Double w)
	{
		return 2*l + 2*w;
	}
	public static void print(Double perimeter)
	{
		System.out.printf("Your rectangle is " + "%.5f" + "sq ft around", perimeter);
	}
}