import static java.lang.Math.*;
public class MPH
{
	private int distance;
	private int hours;
	private int minutes;
	private double mph;
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MPH(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	public void setMPH(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}
	public double calcMPH()
	{
		mph = Math.round(distance / (hours + minutes/60.0));
		return mph;
	}
	
}