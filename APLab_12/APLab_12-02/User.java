import java.util.Random;

public class User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	public User(String a, String b)
	{
		Random rand = new Random();
		firstName = a;
		lastName = b;
		avatar = "Undefined";
		userID = rand.nextInt(8999999) + 1000000;
	}
	public User(String a, String b, String c)
	{
		Random rand = new Random();
		firstName = a;
		lastName = b;
		avatar = c;
		userID = rand.nextInt(8999999) + 1000000;
	}
	public String toString()
	{
		return "\nCustomer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName
		+ "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
}