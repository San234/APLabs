import java.util.Scanner;

public class SG3_1
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first element in your compound: ");
		String element1 = kb.next();
		System.out.println("Now enter the electronegativity: ");
		double electro1 = kb.nextDouble();
		System.out.println("Please enter the second element in your compound: ");
		String element2 = kb.next();
		System.out.println("Now enter the electronegativity: ");
		double electro2 = kb.nextDouble();
		
		String bond = calcBond(electro1, electro2);
		System.out.println("The bond between " +element1+ " and " +element2+ " is " +bond);
	}	
	
	public static String calcBond(double one, double two)
	{
		String bondType = "";
		if(one > two){
			if(one - two > 1.6)
				bondType = "ionic";
			else{
				bondType = "Covalent";
			}
		}
		else if(two > one){
			if(two - one > 1.6)
				bondType = "ionic";
			else{
				bondType = "Covalent";
			}
		}
		return bondType;
	}
}


