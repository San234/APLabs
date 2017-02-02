public class AFigure extends Toy
{
	private String AFigure;
	private String name;
	private int count;
	public Toy()
	{
		super();
		this.AFigure = "";
	}
	public Toy(String n, String b)
	{
		super(n);
		this.AFigure = b;
	}
	public String getType()
	{
		return AFigure;
	}
	public String toString()
	{
		return super.toString();
	}
}