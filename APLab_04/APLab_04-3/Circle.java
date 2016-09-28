import java.util.Scanner;

public class Circle
{
	static double r;
	static double A;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Circle a = new Circle();
		
		System.out.print("Enter the radius : ");
		r = up.nextDouble();
		up.nextLine();
		
		double A = a.CircCalc(r);
		
		System.out.printf("The area of circle with a radius of " + r + " is " + "%.5f", A);
	}
	public double CircCalc(Double r)
	{
		return Math.pow(r, 2) * Math.PI; 
	}
}