import java.util.Random;

public class findOXs
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		String[][]xAndO = new String[4][4];
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				int pick = rand.nextInt(2) + 1;
				if(pick == 1){
					xAndO[i][j] = "X";
				}
				else if(pick == 2){
					xAndO[i][j] = "O";
				}
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}