public class Performer implements CircusShow
{
   public void entrance()
   {
       System.out.println("Performer enters arena in parade.");
   }
   public void act()
   {
       entrance();
       announcement();
       performance();
       exit();
   }
   public void performance()
   {
	   System.out.println("Runs in circles");
   }
   public void announcement()
   {
       System.out.println("Ringmaster announces performer entering arena.");
   }
   public void exit()
   {
       System.out.println("Performer receives flowers and leaves arena.");
   }
}