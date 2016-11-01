import java.util.Scanner;

public class DigitAdder
{
	static int sum;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		sum = 0;
		System.out.print("Enter the number: ");
		int num = up.nextInt();
		up.nextLine();
		
		addDigit(num);
		
		System.out.print("\nThe sum of the digits in " + num + " is " + sum);
	}
	public static int addDigit(int num)
	{
		while(0 < num){
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}