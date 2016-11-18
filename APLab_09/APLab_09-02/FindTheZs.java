import java.util.Scanner;

public class FindTheZs
{
	static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		
		fillArray();
		printArray();
		hasZs();
	}
	public static void fillArray()
	{
		Scanner up = new Scanner(System.in);

		System.out.print("Enter the word : ");
		for(int i = 0; i < words.length; i++){
			words[i] = up.next();
		}
	}
	public static void printArray()
	{
		System.out.print("For the words...");
		for(String word : words){
			System.out.print(word + " ");
		}
	}
	public static void hasZs()
	{
		String zs = " ";
		for(String word : words){
			if(word.indexOf("z") > -1||word.indexOf("Z") > -1){
				zs += word + " ";
			}
		}
		System.out.print("\nOnly" + zs + "contain(s) the letter z.");
	}
}