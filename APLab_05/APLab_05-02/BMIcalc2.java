import java.util.Scanner;

public class BMIcalc2
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		BMIcalc2 var = new BMIcalc2();
		
		System.out.print("Enter the weight (lb) : ");
		float lb = up.nextFloat();
		up.nextLine();
		
		System.out.print("Enter the height (in) : ");
		float height = up.nextFloat();
		
		String condition = "";
		
		var.calcBMI(lb, height, condition);
	}
	public static void calcBMI(float w, float h, String S)
	{
		float BMI = ((w * 703) / (h * h));
		if(BMI < 18.5){
			S = "Underweight";
		}
		else if(BMI >= 18.5 && BMI < 25){
			S = "Normal";
		}
		else if(BMI >= 25 && BMI < 30){
			S = "Overweight";
		}
		else if(BMI >= 30 && BMI < 35){
			S = "Obese";
		}
		else if(BMI >= 35 && BMI < 40){
			S = "Very Obese";
		}
		else{
			S = "Morbidly Obese";
		}
		System.out.printf("Your BMI is %.2f\n", BMI);
		System.out.println("You are " + S);
	}
}