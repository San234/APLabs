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
		
		System.out.print("Are you teacher or student? ");
		String title = up.nextLine();
		if(title.equals("teacher")){
			title = "Teacher";
		}
		else if(title.equals("student")){
			title = "Student";
		}
		else{
			title = "Visitor";
		}
		
		String s_name;
		System.out.print("Enter the school site: ");
		s_name = up.nextLine();
		
		String y_name;
		System.out.print("Enter the school year: ");
		y_name = up.nextLine();
		
		String sub_name;
		System.out.print("Enter your subject: ");
		sub_name = up.nextLine();
		
		System.out.printf("******************************\n");
		format(s_name, y_name);
		format(f_name, l_name);
		format(title, sub_name);
		System.out.printf("******************************");
	}
	public static void format(String one, String two)
	{
		System.out.printf("*%15s%13s*\n", one, two);
	}
}