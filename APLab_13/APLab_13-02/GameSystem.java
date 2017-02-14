import java.util.Random;

public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	private Random rand = new Random();
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	public GameSystem(String p)
	{
		platform = p;
		serialNo = rand.nextInt(8999999) + 1000000;
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
}