public class Circus
{
	public static void main(String[]args)
	{
		Equestrian sue = new Equestrian("Sue", "Amazing Ponies");
		sue.act();
		
		System.out.println("");
		
		TightRopeWalker joe = new TightRopeWalker("Joe", "Feats of Daring");
		joe.act();
		
		System.out.println("");
		
		HighWireJuggler kathy = new HighWireJuggler("Kathy", "High Wire Juggling");
		kathy.act();
	}
}