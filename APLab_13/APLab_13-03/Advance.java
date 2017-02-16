public class Advance extends Ticket
{
	private int daysLeft;
	private int price;
	public Advance()
	{
		daysLeft = 0;
		price = 0;
	}
	public Advance(int a)
	{
		daysLeft = a;
		price = 0;
	}
	public int getPrice()
	{
		if(daysLeft >= 10){
			price = 30;
		}
		else{
			price = 40;
		}
		return price;
	}
	public String toString()
	{
		return "Serial #" + super.getSerialNo() + "\nPrice: $" + getPrice() + "\n";
	}
}