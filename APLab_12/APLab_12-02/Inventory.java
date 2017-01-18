import java.util.Random;

public class Inventory
{
	private String iManu;
	private String iName;
	private String iCat;
	private int UPC;
	private String iPrice;
	public Inventory(String a, String b)
	{
		iManu = a;
		iCat = b;
		iName = "Undefined";
		iPrice = "Undefined";
		UPC = (int)(Math.random() * 2147483640) + 1000000000;
		if(UPC < 0){
			UPC *= -1;
		}
	}
	public Inventory(String a, String b, String c, String d)
	{
		iManu = a;
		iCat = b;
		iName = c;
		iPrice = d;
		UPC = (int)(Math.random() * 2147483640) + 1000000000;
		if(UPC < 0){
			UPC *= -1;
		}
	}
	public String toString()
	{
		return "\nItem info...\nItem Manufacturer: " + iManu + "\nItem Name: " + iName + "\nItem Category: " + iCat + "\nItem Price: " + iPrice + "\n" + "UPC."+UPC; 
	}
}