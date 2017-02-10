import java.util.ArrayList;

public class ToyRunner
{
	public static void main(String[]args)
	{		
		AFigure AF = new AFigure("Star Wars, Car");
		Car car = new Car("Hotwheels, Car");
				
		ToyStore var = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");		

		System.out.println(var.getMostFrequentToy());
		System.out.println(var.getMostFrequentType());
	}
}