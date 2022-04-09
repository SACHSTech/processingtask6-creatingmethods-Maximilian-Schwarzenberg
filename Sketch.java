import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);

     // Return statment
    System.out.println("Center of the house 1 (x): " + returnOutput(25, 50, 400));
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
     // Rectangle for grass
    fill(86, 125, 70); // Green
    rect(0, 300, 400, 100);

     // sun method
    sun(75, 75, 400, 255, 233, 0);

     // house method 1
    house(25, 50, 400);

     // house method 2
    house(returnOutput(25, 50, 400)+150, 200, 200);
    
  }

  
  
  // defining methods.

  /**
  * Depiction of a house at the coordinates and custom scaled
  *
  * @param housex  The x coordinate of the house (default: 100)
  * @param housey  The y coordinate of the house (default: 50)
  * @param scale  The scale of the house (default: 400)
  *
  */
  private void house(int housex, int housey, int scale) 
  {
     // Base square for house
    fill(255, 248, 220); // White
    rect(housex, housey+(scale/8), (scale/2), (scale/2));

     // Triangle for roof
    fill(170, 1, 20); // Red
    triangle(housex, housey+(scale/8), housex+(scale/4), housey, housex+(scale/2), housey+(scale/8));

     // Rectangle for door
    fill(196, 164, 132); // Light brown
    rect(housex+(scale/4), housey+((scale/4)+(scale/8)), (scale/8), (scale/4));
  }

  
  /**
  * Depiction of the sun at the coordinates and custom scaled and custom colour
  *
  * @param sunx  The x coordinate of the ssun (default: 100)
  * @param suny  The y coordinate of the sun (default: 50)
  * @param scale  The scale of the sun (default: 400)
  * @param sunRed  The red value for the colour of the sun (default: 255)
  * @param sunGreen  The green value for the colour of the sun (default: 233)
  * @param sunBlue  The blue value for the colour of the sun (default: 0)
  *
  */
  private void sun(int sunx, int suny, int scale, int sunRed, int sunGreen, int sunBlue) 
  {
     // Circle to repersent the sun
    fill(sunRed, sunGreen, sunBlue); // Yellow
    ellipse(sunx, suny, (scale/4), (scale/4));
  }


  /**
  * Return function for the x coordinate of the center of the house
  *
  * @param housex  The x coordinate of the house (same as house() method)
  * @param housey  The y coordinate of the house (same as house() method)
  * @param scale  The scale of the house (same as house() method)
  * @return Returns the center point of the house
  *
  */
  private int returnOutput(int housex, int housey, int scale) 
  {
    return housex+(scale/4);
  }
  
  
}