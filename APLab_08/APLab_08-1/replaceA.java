import java.util.Scanner;

public class replaceA
{
	public static void main(String[]main)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String sent = up.nextLine();
		
		System.out.println(replaceA(sent));
	}
	public static String replaceA(String a)
	{
		if(a.indexOf("a") <= 0){
			return a;
		}
		else{
			a = a.substring(0,a.indexOf("a")) + "@" + a.substring(a.indexOf("a")+1);
			return replaceA(a);
		}
	}
}