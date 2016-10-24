import java.util.Scanner;

public class TriangleR
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String word = up.nextLine();
		
		for(int i = word.length(); i > 0; i--){
			System.out.println(word.substring(i));
		}
	}
}