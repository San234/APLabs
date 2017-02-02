public class Car extends Toy
{
	private String Car;
	private String name;
	private int count;
	public Toy()
	{
		super();
		this.Car = "";
	}
	public Toy(String n, String b)
	{
		super(n);
		this.Car = b;
	}
	public String getType()
	{
		return Car;
	}
	public String toString()
	{
		return super.toString();
	}
}