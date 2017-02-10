import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class SG4_1
{
	public static void main(String[]args)
	{
		int[][]nums = new int[2][2];
		SG4_1 var = new SG4_1();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		int[] arr = new int[100];
		Scanner up = new Scanner(System.in);
		
		System.out.println("\n\n\tE C E A C C A A B B E B C B D A E C\t\n");
		
		String ts = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		String[] toys = ts.split(", ");
		System.out.println(Arrays.toString(toys));
		
		int k = 9;
		 
		for(int i = 2; i <= k; i++){
			if(arr[i] < 100){
				System.out.println("SMALL");}
		}
		
		System.out.print("Enter: ");
		String var1 = up.nextLine();
		var.stringRecur(var1);
		
		int num = var.result(5);
		
		System.out.println(num);
	}
	public int result(int n)
	{
		if(n == 1){
			return 2;}
		else{
			System.out.println("1");
			return 2 * result(n - 1);}
	}
	public void stringRecur(String s)
{
   if(s.length() < 15)
       System.out.println(s);
   else
       stringRecur(s + "*");
}
}
