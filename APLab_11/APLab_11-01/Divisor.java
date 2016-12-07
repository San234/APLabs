import java.util.Scanner;
import java.util.Random;

public class Divisor
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		Random rand = new Random();
		
		int[][]nums = new int[4][4];

		for(int i=0; i < nums.length; i++){
			for(int j=0;j < nums[i].length;j++){
				nums[i][j] = rand.nextInt(100) + 1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("Enter a number: ");
		int divisor = up.nextInt();
		up.nextLine();
		
		int count = 0;
		for(int i=0; i < nums.length; i++){
			for(int j=0;j < nums[i].length;j++){
				if(nums[i][j] % divisor == 0){
					count += 1;
				}
			}
		}
		System.out.print("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}