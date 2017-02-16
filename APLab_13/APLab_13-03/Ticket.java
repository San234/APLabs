import java.util.Random;

public abstract class Ticket
{
	private int serialNo;
	private Random rand = new Random();
	public Ticket()
	{
		serialNo = rand.nextInt(8999999) + 1000000;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract int getPrice();
	public String toString()
	{
		return "Serial #" + getSerialNo() + "\nPrice" + getPrice();
	}
}