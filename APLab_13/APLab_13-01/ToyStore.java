import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	private ArrayList<Toy> inventory = new ArrayList<Toy>();
	private String toys;
	public ToyStore()
	{
		this.inventory = "";
	}
	public ToyStore(ArrayList<> a)
	{
		this.inventory = a;
	}
	public void loadToys(String ts)
	{
		toys = ts.split(", ");
		for(int i = 0; i < inventory.size();i++)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy info = new Toy(getThatToy(name)){}; 
			if(info == null){
				if(toys.equals("Car")||toys.equals("AF")){
					inventory.add(toys);
				}
				else{
					count += 1;
				}
			}
		}
	}
	public String getThatToy(String nm)
	{
		for(Toy x : inventory){
			if(x.equals(nm)){
				return x;
			}
			else{
				return null;
			}
		}
	}
	public void getMostFrequentToy()
	{
		String name = "";
		int max = 
	}
}