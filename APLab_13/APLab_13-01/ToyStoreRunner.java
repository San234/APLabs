import java.util.ArrayList;

public class ToyStoreRunner
{
	public static void main(String[]args)
	{		
		//Toy AF = new AFigure("Star Wars");
		//Toy car = new Car("Hotwheels");
				
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");		
		System.out.println("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store);
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}