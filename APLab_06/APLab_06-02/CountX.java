import java.util.Scanner;

public class CountX
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the maximum number: ");
		int maxNum = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter the number of space: ");
		int num1 = up.nextInt();
		up.nextLine();
		
		for(int i = num1;i <= maxNum;i += num1 ){
			System.out.printf("%4s",i);
		}
	}
}