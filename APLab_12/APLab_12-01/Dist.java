import java.lang.Math.*;

public class Dist
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Dist()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	public Dist(int a, int b, int c, int d)
	{
		xOne = a;
		yOne = b;
		xTwo = c;
		yTwo = d;
		distance = 0;
	}
	public void setCoor(int a, int b, int c, int d)
	{
		xOne = a;
		yOne = b;
		xTwo = c;
		yTwo = d;
	}
	public double calcDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}