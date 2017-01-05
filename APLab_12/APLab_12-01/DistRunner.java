import java.util.Scanner;
public class DistRunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter x1: ");
		int x1 = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter y1: ");
		int y1 = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter x2: ");
		int x2 = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter y2: ");
		int y2 = up.nextInt();
		up.nextLine();
		
		Dist Distance = new Dist(x1, y1, x2, y2);
		
		System.out.println("Distance = " + Distance.calcDist());
	}
}