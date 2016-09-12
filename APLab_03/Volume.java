import java.util.Scanner;

public class Volume
{
	public static void main(String[]args)
	{
		System.out.println("***Welcome to Volume Calculator for Square***");
		
		Scanner user_input = new Scanner(System.in);
		
		Double W;
		System.out.print("Enter the Width: ");
		W = user_input.nextDouble();
		
		Double L;
		System.out.print("Enter the Length: ");
		L = user_input.nextDouble();
		
		Double H;
		System.out.print("Enter the Height: ");
		H = user_input.nextDouble();
		
		Double Output;
		Output = W * L * H;
		
		System.out.println("The volume is " + Output);
		
	}
}