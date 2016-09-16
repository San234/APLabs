import java.util.Scanner;

public class IDCard
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		String f_name;
		System.out.print("Enter your first name: ");
		f_name = up.nextLine();
		
		String l_name;
		System.out.print("Enter your last name: ");
		l_name = up.nextLine();
		
		String title = "Teacher"; 
		
		String s_name;
		System.out.print("Enter the school site: ");
		s_name = up.nextLine();
		
		String y_name;
		System.out.print("Enter the school year: ");
		f_name = up.nextLine();
		
		String sub_name;
		System.out.print("Enter your subject: ");
		sub_name = up.nextLine();
		
		System.out.printf("******************************");
		System.out.printf("*" + "%2s", s_name + "%2s", y_name + "*");
		System.out.printf("*") + ("%2s", f_name) + ("%2s", l_name) + ("*");
		System.out.printf("*") + ("%2s", title) + ("%2s", sub_name) + ("*");
		System.out.printf("******************************");
	}
}