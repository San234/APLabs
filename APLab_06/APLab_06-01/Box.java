import java.util.Scanner;

public class Box
{
	static int i;
	public static void main (String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String word = up.nextLine();
		
		for(i = 0; i <= word.length(); i++){
			System.out.println(word);
		}
	}
}