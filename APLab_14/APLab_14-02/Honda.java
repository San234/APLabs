import java.util.Random;

public class Honda extends Car 
{
	private double[] location = new double[2];
	Random rand = new Random(); 
	public Honda(double[] l)
	{
		location = l;
	}
	public int getID()
	{
		return rand.nextInt(899999) + 100000;
	}
	public void move(double x, double y)
	{
		x=x;
		y=y;
	}
	public double[] getLoc()
	{
		return location;
	}
}