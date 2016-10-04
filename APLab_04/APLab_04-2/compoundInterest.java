import java.util.Scanner;

public class compoundInterest
{
	public static void main(String[]args)
	{
		compoundInterest total = new compoundInterest();
		
		Scanner up = new Scanner(System.in);
		
		System.out.println("=====Welcome to the Compound Interest Calculator=====");
		
		System.out.print("Enter your Principal(the original amount you intend to borrow):\n");
		double P = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the interest rate: \n");
		double r = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the number of times the loan is coupounded (/year):\n");
		double n = up.nextDouble();	
		up.nextLine();
		
		System.out.print("Enter the number of years that you plan:\n");
		double t = up.nextDouble();
		up.nextLine();
		
		double iR = r/100;
		
		double tt = total.format(P, t, iR, n);
		double mt = total.monthly(tt, t, n, P);
		System.out.printf("Your total monthly payment is $" +"%.2f\n", tt);
		System.out.printf("Your yearly payment is $" + "%.2f", mt);
	}
	public double format(Double P, Double t, Double iR, Double n)
	{
		return P * Math.pow(1+iR/n, n*t);
	}
	public double monthly(Double tt, Double t, Double n, Double P)
	{
		return (tt - P)/t;
	}
}