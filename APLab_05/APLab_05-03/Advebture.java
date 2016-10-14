import java.util.Scanner;

public class Advebture
{
	static Scanner up;
	public static void main(String[]args)
	{
		up = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		System.out.print("You wake up from the bed.\nWould you go out?\n");
		String choice1 = up.nextLine();
		if(choice1.equals("y")||choice1.equals("yes")){
			System.out.print("You go out to find food.\nAnd you found delicious-looking fruit tree.\nWould you eat it?\n");
			String choice1_2 = up.nextLine();
			if(choice1_2.equals("y")){
				System.out.print("Fortunately, it was edible. You are survived...\nfor few days");
				System.exit(0);
			}
			else{
				System.out.print("You ignored it and try to go beach and catch the fish.\nWould you go beach?");
				String choice1_3 = up.nextLine();
				if(choice1_3.equals("y")||choice1_3.equals("yes")){
					System.out.println("In the way of beach, suddenly a bear appears and one-hits you.\nYou died...");
					recursion();
				}
				else{
					System.out.print("You decide to stay in the forest and you saw a bear walking around.\nWould you run?");
					String choice1_4 = up.nextLine();
					if(choice1_4.equals("y")||choice1_4.equals("yes")){
						System.out.println("The bear suddenly turned toward you and ran.\nYour were eaten...");
					}
					else{
						System.out.println("You decide to climb up the tree.\nYou found that there is sharp stick on tree.\nWould you kill it?\n");
						String choice1_5 = up.nextLine();
						if(choice1_5.equals("y")||choice1_5.equals("yes")){
							System.out.println("You penetrate bear's head and it died.\nYou survived in the island...");
							System.exit(0);
						}
						else{
							System.out.println("The bear spotted you and waited over a week.\nYou died from hunger...");
							recursion();
						}
					}
				}
			}
		}
		else{
			System.out.println("You decide not to go out.\nYou starved to death...\n");
			recursion();
		}
	}
}