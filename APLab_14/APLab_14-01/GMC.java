import java.util.Random;

public class GMC implements NavigationSystem extends Car
{
	private double x, y;
	Random rand = new Random(); 
	public GMC(double h, double v)
	{
		x = h;
		y = v;
	}
	public int getID()
	{
		return rand.nextInt(899999) + 100000;
	}
	public void move()
	{
		x = x;
		y = y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}