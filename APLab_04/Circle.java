import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Circle A = new Circle();
		
		System.out.print("Enter the radius : ");
		double r = up.nextDouble();
		up.nextLine();
		
		double dnjs = A.CircCalc(r);
		
		System.out.printf("The area of circle with a radius of " + r + " is " + "%.5f", dnjs);
	}
	public double CircCalc(Double r)
	{
		return Math.pow(r, 2) * Math.PI; 
	}
}