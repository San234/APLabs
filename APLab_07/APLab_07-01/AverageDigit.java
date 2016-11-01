import java.util.Scanner;

public class AverageDigit
{
	static int digit;
	static int output;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = up.nextInt();
		up.nextLine();
		
		average(num);
		
		System.out.print("The average of the number in " + num + " is " + output);
	}
	public static int average(int num)
	{
		while(0 < num){
			output += num % 10;
			num /= 10;
			digit++;
		}
		output = output/digit;
		return output;
	}
}