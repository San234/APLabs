import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the starting number: ");
		int start = up.nextInt();
		up.nextLine();
		
		System.out.print("Enter the length of sequence: ");
		int length = up.nextInt();
		up.nextLine();
		
		int[] seq = new int[length];
		
		for(int i=0; i < seq.length; i++){
			if(i == 0 || i == 1){
				seq[i] = start;
			}
			else{
				seq[i] =  seq[i-2] + seq[i-1];
			}
			System.out.print(seq[i] + " ");
		}
		
	}
}