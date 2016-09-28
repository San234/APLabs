import java.util.Scanner;

public class Cube
{
	static double side;
	static double SA;
	static double a;
	
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Cube sa = new Cube();
		
		System.out.print("Enter the number of sides : ");
		side = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the area of one side : ");
		a = up.nextDouble();
		up.nextLine();
		
		SA = sa.SACalc(side, a);
		
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f", SA);
	}
	public double SACalc(double side, double a)
	{
		return side * a;
	}
}