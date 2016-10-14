import java.util.Scanner;

public class password
{
	static String username;
	static String password;
	static Scanner up;
	public static void main(String[]args)
	{
		up = new Scanner(System.in);
		username = "tsumuri3";
		password = "allen123";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.print("Enter your username :\n");
		String id = up.nextLine();
		
		System.out.print("Enter your password :\n");
		String pw = up.nextLine();
		
		if(id.equals(username)&&pw.equals(password)){
			System.out.println("You are granted access!");
		}
		else{
			if(!id.equals(username)&&pw.equals(password)){
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else if(!pw.equals(password)&&id.equals(username)){
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else{
				System.out.println("Your usename and password are incorrect!");
				passCheck();
			}
		}
	}
}