import java.util.Random;

public class Toyota extends Car
{
	Random rand = new Random();
	private double x, y;
	private double[] location = new double[2];
	public Toyota(String z)
	{
		z.split(", ");
		x = Integer.parseInt(z.substring(0,1));
		y = Integer.parseInt(z.substring(2));
	}
	public int getID()
	{
		return rand.nextInt(899999) + 100000;
	}
	public void move(double x, double y)
	{
		x = x;
		y = y;
	}
	public double[] getLoc()
	{
		location[0] = x;
		location[1] = y;
		return location;
	}
}