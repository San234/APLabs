import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	private String var;
	private ArrayList<String> toyList = new ArrayList<String>();
	public ToyStore()
	{	
	
	}
	public ToyStore(String n)
	{
		toyList.add(n);
		this.var = n;
		loadToys(n);
	}
	public void loadToys(String ts)
	{
		String[] toys = ts.split(", ");
		int count = 0;
		
		for(int i = 0; i < toys.length;i++)
		{
			int j = 0;
			String name = toys[j];
			String type = toys[j+1];
			String info = getThatToy(name); 
			if(info == null){
				if(type.equals("Car")){
					toyList.add(type);
				}
				else if(type.equals("AF")){
					toyList.add(type);
				}
			}
			else{
				count += 1;
			}
		}
	}
	public String getThatToy(String nm)
	{
		for(String x : toyList){
			if(x.equals(nm)){
				return x;
			}
			else{
				return null;
			}
		}
		return "";
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int count = 1;
		int max = Integer.MIN_VALUE;
		for(String x : toyList){
			if(max < count){
				max = count;
				name = x;
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(String x : toyList){
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
		else if(figures == cars){
			return "Equal amounts of action figures and cars!";
		}
		return "";
	}
	public String print()
	{
		System.out.println(toyList);
		return "";
	}
}