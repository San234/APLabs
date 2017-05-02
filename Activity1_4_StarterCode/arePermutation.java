import java.util.Random;
import java.util.Arrays;
public class arePermutation
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int[] one = new int[6];
		int[] two = new int[6];
		
		String[] bool = new String[6];
		
		for(int k = 0; k < one.length; k++){
			for(int i : one){
				i = rand.nextInt(3);	
				one[k] = i;
			}
			for(int j : two){
				j = rand.nextInt(3);
				two[k] = j;
			}
			if(one[k] == two[k]){
				bool[k] = "true";
			}
			else{
				bool[k] = "false";
			}
		}
		int count = 0;
		for(String h : bool){
			if(h.equals("true")){
				count += 1;
			}
			else{
				count += 0;
			}
		}
		if(count == 6){
			System.out.println(Arrays.toString(bool));
			System.out.println("true");
		}
		else{
			System.out.println(Arrays.toString(bool));
			System.out.println("false");
		}
	}
}