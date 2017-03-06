import java.util.Random;

public abstract class Car implements NavigationSystem
{
	Random rand = new Random();
	private int ID = rand.nextInt(899999) + 100000;	
	public Car()
	{
		
	}
	public abstract int getID();
	public void move(double x, double y)
	{
		x = x;
		y = y;
	}
}