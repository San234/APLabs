public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		
	}
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return "Serial #" + super.getSerialNo() + "\nPrice: $" + getPrice() + "\n(STUDENT ID REQUIRED)"; 
	}
}