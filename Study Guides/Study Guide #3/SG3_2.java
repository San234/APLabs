public class SG3_2
{
	static int one;
	static int two;
	static int n;
	public static void main(String[]args)
	{
		System.out.println("D,D,A,D(C),D,B(A),B(C),D");
		
		int one = 20;
		int two = 1;
		int sum = 2;
		
		if(one > two){
			if(one - two >= 10){
				System.out.println("Bingo!");
			}
			else{
				System.out.println("Nope!");
			}	
		}
	
		if(two > one){
			if(two - one >= 10){
			System.out.println("Bingo!");
			}
		else{
			System.out.println("Nope!");
			}
		}
	}
}
