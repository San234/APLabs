import java.util.ArrayList;

public class CircusPlayer
{
	public static void main(String[]args)
	{
		CircusShow sue =  new Juggler();
		CircusShow tom = new Equestrian();
		CircusShow tarzan = new LionTamer();
		ArrayList<CircusShow> performers = new ArrayList<>();
		performers.add(sue);
		performers.add(tom);
		performers.add(tarzan);
		for(CircusShow performer: performers)
			performer.act();
	}
}