public class Song
{
	static int i;
	static int j;
	public static void main(String[]args)
	{	
		for(j = 0; j < 4; j++){
			sing();
		}
	}
	public static void sing()
	{
		for(i = 0; i<2;i++){
			for(i = 0; i < 4; i++){
				System.out.printf("%3s", "Na");
			}
			System.out.print("\n");
			for(i = 0; i < 4; i++){
				System.out.printf("%3s", "Na");
			}
			System.out.print("\n");
		}
		for(i = 0;i < 3; i++){
			System.out.printf("%4s", "Hey");
		}
		System.out.printf("\n%9s\n", "Goodbye!");
	}
}