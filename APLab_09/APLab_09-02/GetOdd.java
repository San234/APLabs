import java.util.Scanner;

public class GetOdd
{
	static int[] nums;
	static String odds;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		nums = new int[10];
		
		fillArray();
		printArray();
		
		System.out.print("\nFor the following numbers...\nThey are odd numbers.");
		getOdds();
	}
	public static void fillArray()
	{
		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		for(int num : nums){
			System.out.print(num + " ");
		}
	}
	public static void getOdds()
	{
		for(int num : nums){
			if(num % 2 == 1){
				System.out.print(num + " ");
			}
		}
	}
}