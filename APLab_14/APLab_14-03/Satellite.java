import java.util.ArrayList;
import java.util.Random;
public class Satellite
{
	static double one;
	static double two;
	public static void main(String[]args)
	{
		ArrayList<NavigationSystem> locate = new ArrayList<>();
		Random rand = new Random();
		double[] honLoc = {5, 6};
		locate.add(new Honda(honLoc));
		locate.add(new Toyota("8,9"));
		locate.add(new GMC(3, 8));
		
		double[] home = {0, 0};
		
		System.out.println("\n\n==========================\nStarting locations...");
		
		for(NavigationSystem l : locate){
			System.out.println("\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")");
		}
		
		System.out.println("\n\n==========================\nDistance from home...");
		
		for(NavigationSystem l : locate){
			System.out.printf("\nLocation for " + l.getID() + ": (%5.2f)\n", getDistance(l.getLoc(), home));
		}
			
		System.out.println("\n\n==========================\n");	
		for(NavigationSystem x : locate){
			one = (rand.nextInt(30000)+1)/100.0;
			two = (rand.nextInt(30000)+1)/100.0;
			x.move(one, two);
			System.out.println("After " + x.getID() + " Moved (" + one + ", " + two + ")");
			System.out.println("New Location: (" + getNewLocation(one, two, x.getLoc()) + ")\n");
		}
		
		System.out.println("\n\n==========================\nDistance from home...\n");		
		
		for(NavigationSystem x : locate){
			System.out.printf("Distance for " + x.getID() + ": (%.2f)\n\n", getDistance(getNewNumberLocation(one, two, x.getLoc()), home));
		}
	}
	public static double getDistance(double[] car, double[] home)
	{
		return Math.sqrt(Math.pow(car[0]-home[0], 2) + Math.pow(car[1]-home[1], 2));
	}
	public static String getLocation(double[] loc)
	{
		return loc[0] + ", " + loc [1];
	}
	public static String getNewLocation(double x, double y, double[] loc)
	{
		return (x + loc[0]) + ", " + (y + loc[1]);
	}
	public static double[] getNewNumberLocation(double x, double y, double[] loc)
	{
		double[] newLoc = new double[2];
		newLoc[0] = x + loc[0];
		newLoc[1] = y + loc[1];
		return newLoc;
	}
}