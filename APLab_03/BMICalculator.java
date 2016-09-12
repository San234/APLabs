import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[]args)
	{
		System.out.println("****This BMI calculator is using USA units****\n");
		
		Scanner user_input = new Scanner(System.in);
		
		int Weight;
		System.out.print("Enter your weight in lb: ");
		Weight = user_input.nextInt();
		
		int Height;
		System.out.print("Enter your Height in inches: ");
		Height = user_input.nextInt();
		
		
		int Output;
		Output = ((Weight * 703) / (Height * Height));
		
		System.out.println("Your BMI is " + Output);
	}
}