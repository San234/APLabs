public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket a = new Walkup();
		Ticket b = new Advance(5);//5 days left//
		Ticket b_1 = new Advance(25);//25 days left//
		Ticket c = new StudentAdvance();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b_1);
		System.out.println(c);
	}
}