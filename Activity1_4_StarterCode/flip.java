import java.util.Random;

public class flip
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int probability = rand.nextInt(3);
		if(probability == 1||probability == 2){
			System.out.println("head");
		}
		else if(probability == 0){
			System.out.println("tail");
		}
	}
}