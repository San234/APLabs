import java.util.Scanner;

public class Circle
{
	static double r;
	static double A;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
		r = up.nextDouble();
		up.nextLine();
		
		System.out.printf("The area of circle with a radius of " + r + " is " + "%.5f", CircCalc());
	}
	public static double CircCalc()
	{
		return Math.pow(r, 2) * Math.PI; 
	}
}