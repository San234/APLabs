public abstract class Toy
{
	private String name;
	private int count;
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
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
	public abstract String getType();
	public String toString()
	{
		return name + count;
	}
}