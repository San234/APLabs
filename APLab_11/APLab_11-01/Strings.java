import java.util.Scanner;

public class Strings
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		String[][]words = new String[4][4];
		
		for(int i =0; i < words.length; i++){
			for(int j = 0; j < words[i].length; j++){
				System.out.print("Enter the Word : ");
				String word = up.nextLine();
				words[i][j] = word;
			}
		}
		for(int i =0; i < words.length; i++){
			for(int j = 0; j < words[i].length; j++){
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}