import java.util.Scanner;

public class Center
{
	static int b;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		System.out.print("Enter the first word: ");
		String word1 = up.nextLine();
		System.out.print("Enter the second word: ");
		String word2 = up.nextLine();
		System.out.print("Enter the third word: ");
		String word3 = up.nextLine();
		
		center(word1);
		center(word2);
		center(word3);
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}
	public static String center(String a)
	{
		if(a.length() >= 20){
			return a;
		}
		else{
			System.out.println(" " + a.substring(0) + " ");
			return center(a);
		}
	}
}