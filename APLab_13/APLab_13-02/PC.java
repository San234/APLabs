public class PC extends GameSystem
{
	private String platform;
	private int serialNo;
	public PC()
	{
		super();
	}
	public PC(String p)
	{
		super(p);
	}
	public String getPlatform()
	{
		return "PC";
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: " + getPlatform() + "\n" 
		+ "Serial #: " + super.getSerialNo() + "\nController: " + systemInput();
	}
}