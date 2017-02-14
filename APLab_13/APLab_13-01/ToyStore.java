import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{	
		toyList = new ArrayList<>();
	}
	public ToyStore(String n)
	{
		toyList = new ArrayList<>();
		loadToys(n); //runs loadToys automatically as an object gets created
	}
	public void loadToys(String ts)//modifier
	{
		String[] toys = ts.split(", ");
		
		for(int i = 0; i < toys.length; i += 2)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy t = getThatToy(name); //check to see if this toy  is on the list
			
			if(t == null){ // Toy t is not on the list
				if(type.equals("Car"))
					toyList.add(new Car(name));
				else
					toyList.add(new AFigure(name));
			}
			else
				t.setCount(t.getCount() + 1);
		}
	}
	public Toy getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
				return x;
		}
		return null;

	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy x : toyList){
			if(max < x.getCount()){
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy x : toyList){
			if(x.getType().equals("Car")){
				cars += 1;
			}
			if(x.getType().equals("Action Figure")){
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
	public String toString()
	{
		return toyList.toString();
	}
}