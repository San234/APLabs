public class Biggest
{
	static int[] nums;
	public static void main(String[]args)
	{
		nums = new int[10];
		
		fillArray();
		printArray();
		getBiggest();
	}
	public static void fillArray()
	{
		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		System.out.print("For the following numbers...");
		for(int num:nums){
			System.out.print(num + " ");
		}
	}
	public static void getBiggest()
	{
		int max = 0;
		for(int num : nums){
			if(num > max){
				max = num;
			}
		}
		System.out.print("\nThere biggest number is " + max);
	}
}