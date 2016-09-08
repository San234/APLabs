import java.util.Scanner;

public class APLab_02
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		float First_number;
		System.out.print("Enter the first number to multiply: ");
		First_number = user_input.nextFloat();
		
		float Second_number;
		System.out.print("Enter the last number to multiply: ");
		Second_number = user_input.nextFloat();
		
		float output;
		output = First_number * Second_number;
		
		System.out.println("The product of " + First_number + " and " + Second_number + " is " + output);
	}
}