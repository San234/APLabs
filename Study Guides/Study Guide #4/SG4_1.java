import java.util.ArrayList;

public class SG4_1
{
	public static void main(String[]args)
	{
		int[][]nums = new int[2][2];
		SG4_1 var = new SG4_1();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		int[] arr = new int[100];
		
		System.out.println("\n\n\tE C E A C C A A B B E B C\t\n");

		int k = 9;
		 
		for(int i = 2; i <= k; i++){
			if(arr[i] < 100){
				System.out.println("SMALL");}
		}
		
		
		
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
}
