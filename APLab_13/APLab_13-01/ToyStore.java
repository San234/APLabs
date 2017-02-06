import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	public ToyStore()
	{
	}
	public ToyStore(ArrayList<Toy> ts)
	{
		toyList = ts;
	}
	public void loadToys(ArrayList<Toy> ts)
	{
		String toys = ts.split(", ");
		for(int i = 0; i < toys.length();i++)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy info = new Toy(getThatToy(name)){}; 
			if(info == null){
				if(type.equals("Car")||type.equals("AF")){
					toys.add(toys);
				}
				else{
					count += 1;
				}
			}
		}
	}
	public String getThatToy(String nm)
	{
		for(Toy x : toys){
			if(x.equals(nm)){
				return x;
			}
			else{
				return null;
			}
		}
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy x : toys){
			if(max < count){
				max = count;
				name = name;
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy x : toys){
			if(x.equals("Car")){
				cars += 1;
			}
			if(x.equals("AF")){
				figures += 1;
			}
		}
		if(cars > figures){
			return "Cars";
		}
		else if(figures > cars){
			return "Action Figures";
		}
		else{
			return "Equal amounts of action figures and cars!";
		}
	}
	public String toString()
	{
		return toys;
	}
}