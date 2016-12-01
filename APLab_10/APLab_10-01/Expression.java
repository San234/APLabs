import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Expression
{
	public static void main(String[]args)
	{
		Expression var = new Expression();
		
		Scanner up = new Scanner(System.in);
		
		System.out.print("Enter the Equation: ");
		String expression = up.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		int i = 0;
		while(i < equation.size()){
			if(i < equation.size() && equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*")){
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
			}
			else{
				i++;
			}
			}
		
		while(i < equation.size()){
			if(i < equation.size() && equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+")){
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
			}
			else{
				i++;
			}
		}
			System.out.println(equation);
	}
		
}
