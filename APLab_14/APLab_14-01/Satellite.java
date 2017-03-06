import java.util.ArrayList;
public class Satellite
{
	public static void main(String[]args)
	{
		ArrayList<NavigationSystem> locate = new ArrayList<>();
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
	}
	public static double getDistance(double[] car, double[] home)
	{
		return Math.sqrt(Math.pow(car[0]-home[0], 2) + Math.pow(car[1]-home[1], 2));
	}
	public static String getLocation(double[] loc)
	{
		return loc[0] + ", " + loc [1];
	}
}