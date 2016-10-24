import java.util.Scanner;

public class TriangleL
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String word = up.nextLine();
		
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.substring(i, word.length()));
		}
	}
}