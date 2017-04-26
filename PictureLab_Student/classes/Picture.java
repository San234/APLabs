import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
   public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(255);
		pixelObj.setRed(0);
		pixelObj.setGreen(0);
      }
    }
  }
    public void negateColor()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(pixelObj.getBlue()-255);
		pixelObj.setRed(pixelObj.getRed()-255);
		pixelObj.setGreen(pixelObj.getGreen()-255);
      }
    }
  }
      public void GrayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
		int averageRGB = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())/3;
        pixelObj.setBlue(averageRGB);
		pixelObj.setRed(averageRGB);
		pixelObj.setGreen(averageRGB);
      }
    }
  }
     public void underWater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
		int averageRGB = (pixelObj.getBlue() + pixelObj.getGreen())/5;
       // pixelObj.setBlue(averageRGB/2);
		pixelObj.setGreen(2*averageRGB);
		pixelObj.setRed(3);
		pixelObj.setAlpha(255);
      }
    }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
   public void mirrorVerticalRightToLeft()
  {
      Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
		leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
   public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[pixels.length - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        leftPixel = pixels[pixels.length - 1 - row][col];
        rightPixel = pixels[row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
		count += 1;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
	System.out.println(count);
  }
  public void mirrorArms()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    //int width = pixels[0].length;
    for (int row = 158; row < 191; row++)
    {
      for (int col = 104; col < 171; col++)
      {
		topPixel = pixels[row][col];
        botPixel = pixels[191 + (191-row)][col];
		botPixel.setColor(topPixel.getColor());
      }
    } 
	
	for (int row = 158; row < 191; row++)
    {
      for (int col = 236; col < 294; col++)
      {
		topPixel = pixels[row][col];
        botPixel = pixels[197 + (191-row)][col];
		botPixel.setColor(topPixel.getColor());
      }
    } 
  }
  public void mirrorGull()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int width = pixels[0].length;
    for (int row = 235; row < 321; row++)
    {
      for (int col = 235; col < 343; col++)
      {
        botPixel = pixels[row][col];
		topPixel = pixels[row+14][col + 110];
		topPixel.setColor(botPixel.getColor());
      }
    } 
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol,
				 int endRow, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startRow, toRow = endRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = startCol, toCol = endCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
	public void myCollage()
  {
	Picture seagull = new Picture("seagull.jpg");
    Picture beach = new Picture("beach.jpg");
	Picture seagullNegated = new Picture(seagull); 
	seagullNegated.GrayScale();
    this.copy(seagullNegated,0,150,640,150);
    this.copy(beach,0,0,0,0);
    this.copy(seagull,0,40,30,90);
    Picture beachNoBlue = new Picture(beach);
    beachNoBlue.zeroBlue();
    this.copy(beachNoBlue,0,0,0,0);
    this.copy(seagull,100,0,100,0);
    this.copy(beach,200,0,350,50);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("seagull.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    //this.copy(flower1,0,0);
    //this.copy(flower2,100,0);
    //this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    //this.copy(flowerNoBlue,300,0);
    //this.copy(flower1,400,0);
    //his.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void edgeDetection2(int edgeDist)
  {
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color botColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[row+1][col];
        botColor = botPixel.getColor();
        if (topPixel.colorDistance(botColor) > 
            edgeDist)
          topPixel.setColor(Color.BLACK);
        else
          topPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
	//DigitalPicture p = new DigitalPicture();
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
