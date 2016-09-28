import java.util.Scanner;
import java.text.*;
import java.math.*;

public class KaguyaTable
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		KaguyaTable total = new KaguyaTable();
		
		System.out.print("Enter the exp for mastery : ");
		double exp = up.nextDouble();
		up.nextLine();
		
		System.out.print("Enter the levels that left : ");
		double level = up.nextDouble();
		up.nextLine();
		
		double output = total.expCalc(exp, level);
		double cusOutput = total.doit(output);
		
		System.out.printf("The needed exp is " + cusOutput);
	}
	public double expCalc(double exp, double level)
	{
		while (level > 0){
			exp = 2 * exp;
			level -= 1;
		}
		return exp;
	}
	public double doit(double output) {
		NumberFormat formatter = new DecimalFormat();
 
		double d = output;
 
		formatter = new DecimalFormat("0.###E0");
		return output;
	}
}