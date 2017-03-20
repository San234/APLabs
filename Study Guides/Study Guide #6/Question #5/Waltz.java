public class Waltz implements Dance
{
   private String music;
   public Waltz(String m)
   {
       music = m;
   }
   public void playMusic()
   {
       System.out.println("Play " + music);
   }
   public void danceBasic()
   {
       System.out.println("Forward-side-close, back-side-close");
   }
}