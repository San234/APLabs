import java.util.Arrays;
import java.util.Scanner;

public class GameGun
{
	static int bulletCount;
	static int ClipSize = 16;
	static int shotCount;
	static String[] clip;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		
		bulletCount = 96;
		shotCount = 0;
		clip = new String[ClipSize];
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0){
			System.out.print("Action: ");
			String user_command = up.nextLine(); 
			
			if(user_command.equals("R")||user_command.equals("r")){
				reload();
			}
			else if(user_command.equals("S")||user_command.equals("s")){
				System.out.println(shoot());
			}
			System.out.println(printClip() + Arrays.toString(clip));
		}
		System.out.println("Out of Bullets!!!");
	}
	public static String resetClip()
	{
		for(int i = 0; i < clip.length; i++){
			clip[i] += new String[]{" [] "};
		}
		return "";
	}
	public static String shoot()
	{
		if(shotCount > 0){
			clip[shotCount-1] = " []";
			shotCount -= 1;
			return "Boom!!!\n";
		}
		else{
			return "reload!!!\n";
		}
	}
	public static String reload()
	{
		if(bulletCount >= ClipSize){
			bulletCount -= ClipSize;
			shotCount = ClipSize;
		}
		else{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetClip();
	
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
		return "";
	}
	public static String printClip()
	{
		String output = "";
		output += "Bullets:\t" + bulletCount +"\nClip:\t";
		for(int i = 0; 0 > ClipSize; i++){
			clip[i] += output;
		}
		return output;
	}
}