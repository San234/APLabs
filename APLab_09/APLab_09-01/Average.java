import java.util.Scanner;

public class Average
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("Numbers...");
		for(int num : numbers){
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.println("The average of the above numbers is..." + average(numbers));
	}
	public static int average(int[] a)
	{
		int sum = 0;
		for(int nums : a){
			sum += nums;
		}
		return sum / a.length;
	}
}