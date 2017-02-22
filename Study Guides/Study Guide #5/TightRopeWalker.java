public class TightRopeWalker extends CircusPerformer
{
	public TightRopeWalker(String pN, String aN)
   {
       super(pN, aN);
   }
   public void entrance()
   {
       System.out.println("Starts from tight rope platform");
   }
   public void performance()
   {
       System.out.println("Walks and flips on the tightrope");
   }
   public void exit()
   {
       System.out.println("Exits from tight rope platform");
   }
}