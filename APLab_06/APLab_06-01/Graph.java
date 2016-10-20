import java.util.Scanner;

public class Graph
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		int num = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter the Size of the Table: ");
		int size = up.nextInt();
		System.out.println("|f(x)|  x |");
		for(int i = 1; i <= size; i++){
			num = num * i;
			System.out.printf("|%3s | %2s |\n", num, i);
		}
	}
}