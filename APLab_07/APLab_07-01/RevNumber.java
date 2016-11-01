import java.util.Scanner;

public class RevNumber
{
	static int rev;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		rev = 0;
		System.out.print("Enter the number: ");
		int num = up.nextInt();
		up.nextLine();
		
		getReverse(num);
		
		System.out.print(num + " reversed is " + rev);
	}
	public static int getReverse(int num)
	{
		while(0 < num){
			rev = rev * 10;
			rev += num % 10;
			num /= 10;
		}
		return rev;
	}
}