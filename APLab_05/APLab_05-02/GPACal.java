import java.util.Scanner;

public class GPACal
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.println("*Please input one of A B C D E F*");
		System.out.print("Enter the grade for English : ");
		String eng = up.nextLine();
		
		System.out.print("Enter the grade for Math : ");
		String mat = up.nextLine();
		
		System.out.print("Enter the grade for History : ");
		String his = up.nextLine();
		
		System.out.print("Enter the grade for Science : ");
		String sci = up.nextLine();
		
		System.out.print("Enter the grade for Computer Science : ");
		String com = up.nextLine();
		
		System.out.print("Enter the grade for Language : ");
		String lan = up.nextLine();
		
		System.out.print("Enter the grade for Art : ");
		String art = up.nextLine();
		
		double GPAsum = calcGPA(eng) + calcGPA(mat) + calcGPA(his) + calcGPA(sci) + calcGPA(com) + calcGPA(lan) + calcGPA(art);
		double totalGPA = GPAsum/7;
		System.out.printf("Your GPA is %.2f", totalGPA);
	}
	public static double calcGPA(String grades)
	{
		if (grades.equals("A")||grades.equals("a"))
		{
			return 4.0;
		}
		if (grades.equals("B")||grades.equals("b"))
		{
			return 3.0;
		}
		if (grades.equals("C")||grades.equals("c"))
		{
			return 2.0;
		}
		if (grades.equals("D")||grades.equals("d"))
		{
			return 1.0;
		}
		if (grades.equals("F")||grades.equals("f"))
		{
			return 0.0;
		}
		return 0.0;
	}
}