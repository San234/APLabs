import java.util.Scanner;

public class Cube
{	
	static float output;
	static float side;
	static float a;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		side = 6;
		
		System.out.print("Enter the area of one side : ");
		a = up.nextFloat();
		up.nextLine();
		
		SACalc();
		print();
	}
	public static void SACalc()
	{
		output = side * a;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f", output);
	}
}