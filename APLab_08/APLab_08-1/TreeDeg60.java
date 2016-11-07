import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String word = up.nextLine();
		
		int stop = word.length();
		int start = 0;
		tree(word, stop,start);
	}
	public static void tree(String a, int b, int c)
	{
		if(c <= b){
			System.out.println(a.substring(0,c));
			c += 1;
			tree(a,b,c);
		}
	}
}