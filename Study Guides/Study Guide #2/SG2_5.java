import java.util.Scanner;

public class SG2_5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		double num1 = kb.nextDouble();
		System.out.println("Please enter your first number: ");
		double num2 = kb.nextDouble();
		System.out.println("Please enter your first number: ");
		double num3 = kb.nextDouble();
		
		double average = calcAvg(num1,num2,num3);
		
		System.out.printf("The average of your 3 numbers is %.3f", average);
	}
	public static double calcAvg(double one, double two, double three)
	{
		return (one + two + three)/3;	
	}
}