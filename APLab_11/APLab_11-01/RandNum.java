import java.util.Random;

public class RandNum
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		int[][] nums = new int [4][4];
		for(int i=0; i < nums.length; i++){
			for(int j=0;j < nums[i].length;j++){
				nums[i][j] = rand.nextInt(16) + 1;
			}
		}
		for(int i=0; i < nums.length; i++){
			for(int j=0;j < nums[i].length;j++){
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}