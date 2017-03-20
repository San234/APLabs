public class DanceRunner
{
	public static void main(String[]args)
	{
		Waltz waltz = new Waltz("Moon River");
		Chacha chacha = new Chacha();
		Tango tango = new Tango();
		waltz.playMusic();
		chacha.danceBasic();
		tango.makeRoutine();
	}
}