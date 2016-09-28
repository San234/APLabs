import java.util.Scanner;

public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Average mean = new Average();
		
		System.out.print("Enter the 1st number for average : ");
		num1 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the 2nd number for average : ");
		num2 = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the 3rd number for average : ");
		num3 = up.nextDouble();
		up.nextLine();
		
		double avg = mean.average(num1, num2, num3);
		
		System.out.printf("The average of " + "%.5f " + "%.5f " + "and "+ "%.5f " + "is " + "%.5f.", num1, num2, num3, avg);
		
	}
	public double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
}