public class Walkup extends Ticket
{
	public int getPrice()
	{
		int price = 50;
		return price;
	}
	public String toString()
	{
		return "Serial #" + super.getSerialNo() + "\nPrice: $" + getPrice() + "\n";
	}
}