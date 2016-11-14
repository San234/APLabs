import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.print("Enter the word : ");
		for(int i = 0; i < words.length; i++){
			words[i] = up.next();
		}
		System.out.println("In order...");
		for(String word : words){
			System.out.println(word);
		}
		System.out.println("___________________");
		Reverse(words);
	}
	public static void Reverse(String[] a)
	{
		for(int i = a.length-1; i >= 0; i--){
			System.out.println(a[i]);
		}
	}
}