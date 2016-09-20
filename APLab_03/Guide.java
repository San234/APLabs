//Scanner is imported...
import java.util.Scanner;
import java.util.Random;

public class Guide
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		float score;
		System.out.println("What is your grade? ");
		score = user_input.nextFloat();
		
		
		if(score > 100 || score < 0){
			System.out.println("DO NOT LIE!!");
			System.exit(0);
		}
		
		char grade;
		if(score >= 90){
			grade = 'A';
		}
		else if(score >= 80){
			grade = 'B';
		}
		else if(score >= 70){
			grade = 'C';
		}
		else if(score >= 60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		
		System.out.println("Your Grade is " + grade);
	}
}
