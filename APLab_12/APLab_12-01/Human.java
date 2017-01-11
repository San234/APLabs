public class Human
{
	private String hair;
	private String skin;
	private String eyes;
	public Human()
	{
		hair = "";
		skin = "";
		eyes = "";
	}
	public Human(String h, String s, String e)
	{
		hair = h;
		skin = s;
		eyes = e;
	}
	public void setHuman(String h, String s, String e)
	{
		hair = h;
		skin = s;
		eyes = e;
	}
	public String getHair()
	{
		return hair;
	}
	public String getSkin()
	{
		return skin;
	}
	public String getEyes()
	{
		return eyes;
	}
}