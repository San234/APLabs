public class Car
{
	private String paint;
	private String interior;
	private String engine;
	private String tire;
	public Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tire = "";
	}
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tire = t;
	}
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tire = t;
	}
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTire()
	{
		return tire;
	}
}