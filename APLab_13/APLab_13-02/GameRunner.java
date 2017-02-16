public class GameRunner
{
	public static void main (String[]args)
	{
		GameSystem game = new PC("VVVVVV");
		GameSystem game1 = new PS("Metal Slug 6");
		GameSystem game2 = new XBox("Minecraft");
		GameSystem game3 = new Nintendo("Pokemon");
		
		System.out.println(game);
		System.out.println(game1);
		System.out.println(game2);
		System.out.println(game3);
	}
}