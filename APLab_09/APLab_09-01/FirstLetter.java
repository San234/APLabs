import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.print("Enter the word : ");
		for(int i = 0; i < words.length; i++){
			words[i] = up.next();
		}
		
		first(words);
	}
	public static void first(String[] a)
	{
		for(String word : a){
			System.out.println(word.charAt(0));
		}
	}
}