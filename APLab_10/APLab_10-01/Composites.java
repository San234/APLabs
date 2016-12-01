import java.util.ArrayList;
import java.util.Arrays;

public class Composites
{
	
	public static void main(String[]args)
	{
		Composites var = new Composites();
		
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 77, 78, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		var.removeComposites(nums);
	}
	public static int gFactor(int n)
	{
		for(int i = 2;i < n;i++){
			if(n % i == 0){
				return 1;
			}
			else{
				return 0;
			}
		}
		return 0;
	}
	public static void removeComposites(ArrayList<Integer> nums)
	{
		for(int i = 0; i < nums.size();i++){
			if(gFactor(nums.get(i)) == 0){
				nums.remove(i);
			}
		}
		System.out.println(nums);
	}
}