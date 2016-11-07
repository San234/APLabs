import java.util.Scanner;

public class underscore
{
	static int b;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the sentence: ");
		String sent = up.nextLine();
		b = 0;
		System.out.print(replace(sent));
	}
	public static String replace(String a)
	{
		if(b >= a.indexOf(" ")){
			return a;
		}
		else{
			a = a.substring(0,a.indexOf(" ")) + "_" + a.substring(a.indexOf(" ")+1);
			return replace(a);
		}
	
	}
}