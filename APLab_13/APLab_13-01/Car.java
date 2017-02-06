public class AFigure extends Toy;
{
	private String name;
	private int count;
	public Toy()
	{
		super();
	}
	public Toy(String n)
	{
		super(n);
	}
	public String getName()
	{
		return name;
	}
	public int getCount()
	{
		return count;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setCount()
	{
		this.count = 1;
	}
	public abstract String getType()
	{
		return "Car";
	}
	public String toString()
	{
		return name + count;
	}
}