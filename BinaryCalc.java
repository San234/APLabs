import java.util.Scanner;

public class BinaryCalc
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = up.nextInt();
		up.nextLine();
		
		int binaryDigit = 0; 
		
		while(num > 1){
			binaryDigit = num % 2;
			if(binaryDigit == 1){
				System.out.println(binaryDigit);
				num /= 2;
			}
			else{
				System.out.println(binaryDigit);
				num /= 2;
			}
		}
		System.out.println(num);
		System.out.println("<<<Place number in reversed order>>>");
	}
}