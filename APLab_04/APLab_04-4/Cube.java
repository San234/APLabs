import java.util.Scanner;

public class Cube
{	
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		double side = 6;
		
		System.out.print("Enter the area of one side : ");
		double a = up.nextDouble();
		up.nextLine();
		
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f", SACalc(side, a));
	}
	public static double SACalc(double side, double a)
	{
		return side * a;
	}
}