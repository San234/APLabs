import java.util.Scanner;

public class CarRunner
{
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		System.out.print("Color of Car: ");
		String paint = up.nextLine();
		
		System.out.print("Interior of Car: ");
		String interior = up.nextLine();
		
		System.out.print("Engine of Car: ");
		String engine = up.nextLine();
		
		System.out.print("Tires of Car: ");
		String tire = up.nextLine();
		
		Car factory = new Car(paint, interior, engine, tire);
		
		System.out.print("\nYour vehicle is ready...\n");
		System.out.println("Paint: " + factory.getPaint());
		System.out.println("Interior: " + factory.getInterior());
		System.out.println("Engine: " + factory.getEngine());
		System.out.println("Tire: " + factory.getTire());
	}
}