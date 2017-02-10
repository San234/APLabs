import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	private ArrayList<String> toyList = new ArrayList<String>();
	private int count;
	public ToyStore()
	{	
		this.count = 1;
	}
	public ToyStore(String n)
	{
		this.count = 1;
		toyList.add(n);
		loadToys(n);
	}
	public void loadToys(String ts)
	{
		String[] toys = ts.split(", ");
		
		for(int i = 0; i < toys.length;i+=2)
		{
			for(String x : toys){
				
			}
			int j = i;
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
			else if(info.equals(name)){
				toyList.add(name);
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
			return null;
		}
		return "";
	}
	public String getMostFrequentToy()
	{
		String name = "";
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