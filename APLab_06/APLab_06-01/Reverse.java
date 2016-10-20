import java.util.Scanner;

public class Reverse
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String word = up.nextLine();
		
		for(int i=word.length();i>0;i--){
			System.out.println(word.substring(0,i));
		}
	}
}