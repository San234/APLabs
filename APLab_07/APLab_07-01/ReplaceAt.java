import java.util.Scanner;

public class ReplaceAt
{
	static String sent;
	static int count;
	static char spec;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		count = 0;
		System.out.print("Enter the sentence: ");
		sent = up.nextLine();
		
		replace();
		
		System.out.print(sent);
	}
	public static String replace()
	{
		while(count < sent.indexOf("a")){
			sent = sent.substring(0,sent.indexOf("a")) + "@" + sent.substring(sent.indexOf("a") + 1);
		}
		return sent;
	}
}