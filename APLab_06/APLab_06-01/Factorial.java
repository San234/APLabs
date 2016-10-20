import java.util.Scanner;

public class Factorial
{
	static int num1;
	static int i;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = up.nextInt();
		
		num1 = 1;
		
		for(int i = 1; i <= num; i++){
			num1 = i * num1; 
		}
		System.out.print(num1 + "\n");
	}
}