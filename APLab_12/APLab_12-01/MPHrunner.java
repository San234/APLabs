import java.util.Scanner;
public class MPHrunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter Distance: ");
		int dist = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter hours: ");
		int hrs = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter minutes: ");
		int mins = up.nextInt();
		up.nextLine();
		
		MPH mph = new MPH(dist, hrs, mins);
		System.out.println(dist + " miles in " + hrs + " hours = " + mph.calcMPH() + " mph");
	}
}