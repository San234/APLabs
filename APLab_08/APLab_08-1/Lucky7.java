import java.util.Scanner;

public class Lucky7
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = up.nextInt();
		
		System.out.print(luck(num));
	}
	public static int luck(int a)
	{
		if(a > 0){
			if(a % 10 == 7){
				return 1 + luck(a/10);
			}
			else{
				return 0 + luck(a/10);
			}
		}
		else{
			return 0;
		}
	}
}