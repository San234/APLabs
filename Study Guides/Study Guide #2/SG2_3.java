import java.util.Scanner;

public class SG2_3
{
	public static void main(String[]args)
	{
		SG2_3 var = new SG2_3();
		Scanner up = new Scanner(System.in);
		System.out.print("What is the length of one side of the cube in inches? ");
		int side = up.nextInt();
		
		surfPrint(side);
	}
	public static double calcsurf(int side)
	{
		return 6 * (Math.pow(side, 2));
	}
	public static void surfPrint(int side)
	{
		System.out.printf("The surface area of your cube is %.5f",calcsurf(side));
	}
}