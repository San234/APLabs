import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Cube sa = new Cube();
		
		System.out.print("Enter the number of sides : ");
		float side = up.nextFloat();
		up.nextLine();
		
		System.out.print("Enter the area of one side : ");
		double a = up.nextDouble();
		up.nextLine();
		
		double sjfqdl = sa.SACalc(side, a);
		
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f", sjfqdl);
	}
	public double SACalc(float side, Double a)
	{
		return side * a;
	}
}