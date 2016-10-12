import java.util.Scanner;

public class SG2_4
{
	static int num1;
	static int num2;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		System.out.print("What is your first number? ");
		int num1 = up.nextInt();
		System.out.print("What is your second number? ");
		int num2 = up.nextInt();
		sumPrint(num1,num2);
	}
	public static double calcSum(int one, int two)
	{
		return one + two;
	}
	public static void sumPrint(int one, int two)
	{
		System.out.printf("The sum of " + one + " and " + two + " is %.2f",calcSum(one, two));
	}
}
