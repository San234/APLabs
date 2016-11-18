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
		
		CircCalc();
		print();
		
	}
	public static void CircCalc()
	{
		A = Math.pow(r, 2) * Math.PI; 
	}
	public static void print()
	{
		System.out.printf("The area of circle with a radius of " + r + " is " + "%.5f", A);
	}
}