import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		
		Float Width;
		System.out.print("Enter the width of cube: ");
		Width = user_input.nextFloat();
		
		Float Length;
		System.out.print("Enter he length of cube: ");
		Length = user_input.nextFloat();
		
		Float Height;
		System.out.print("Enter the height of cube: ");
		Height = user_input.nextFloat();
		
		Float Surface_Area;
		Surface_Area = 2 * ((Width * Length) + (Height * Length) + (Height * Width));
		
		System.out.println("The surface area of your rectangle is " + Surface_Area);
		
	}
}