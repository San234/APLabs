public class CircusPerformer
{
   private String performerName;
   private String actName;


   public CircusPerformer(String pN, String aN)
   {
       performerName = pN;
       actName = aN;
   }
   public String getPerformer()
   {
       return performerName;
   }
   public String getAct()
   {
       return actName;
   }
   public void act()
   {
       entrance();
       performance();
       exit();
   }
   public void entrance()
   {
       System.out.println("Starts in ring center");
   }
   public void performance()
   {
       System.out.println("Runs in circles");
   }
   public void exit()
   {
       System.out.println("Exits from ring center");
   }
}