import java.util.Scanner;

public class subWooferBoxes
{
	public static void main(String[]args)
	{
		subWooferBoxes volume = new subWooferBoxes();
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the height of the box in inches:\n");
		double h = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the length of the box in inches\n");
		double l = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the width of the box in inches:\n");
		double w = up.nextDouble();
		up.nextLine();
		
		double ti = h*l*w;
		
		double tf = volume.volumeCalc(ti);
		
		System.out.printf("The volume of Subwoofer Box is " + "%.2f" + " cubic feet", tf);
	}
	public double volumeCalc(Double ti)
	{
		return ti * 0.000578704;
	}
}