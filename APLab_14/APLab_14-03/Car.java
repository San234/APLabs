import java.util.Random;

public class Car implements NavigationSystem
{
	Random rand = new Random();
	private double[] location = new double[2];
	private int ID = rand.nextInt(899999) + 100000;	
	
	public Car()
	{
		
	}
	public double[] getLoc()
	{
		return location;
	}
	public int getID()
	{
		return ID;
	}
	public void move(double x, double y)
	{
		x = x;
		y = y;
	}
}