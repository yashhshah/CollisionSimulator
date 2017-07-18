/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physicscollision;

/**
 *
 * @author AK
 */
public class Object {
    public double xCentre;
    public double yCentre;
    //Assuming the object is a circle
    public double radius;
    double velocity;
    int collideCount = 0;
    
    String d1 = "", d2 = "";

    //Create a variable to represent the angle where 0 <= angle <= 360 and
    //is measured from east going counterclockwise
    double angle = 0;

    //Slope of the line created by the angle
    double slope;
    
    double difference;
    
    public Object(double x, double y, double r) {
        this.xCentre = x;
        this.yCentre = y;
        this.radius = r;
        
        difference = this.radius;
    }
    
    public void getDirection(String direction) {
        //If the user enters N/S/E/W
        //The reference direction is the string entered
        //d2 can be either adjacent direction
        if (direction.length() == 1) {
            d1 = direction;
            if (direction.equalsIgnoreCase("n")) {
                d2 = "e";
                angle = 90;
            } else if (direction.equalsIgnoreCase("s")) {
                d2 = "e";
                angle = 270;
            } else if (direction.equalsIgnoreCase("e")) {
                d2 = "n";
                angle = 0;
            } else if (direction.equalsIgnoreCase("w")) {
                d2 = "n";
                angle = 180;
            }

        //If the user enters NE/NW/SE/SW    
        } else if (direction.length() == 2) {
            //The reference direction is the first letter
            //d2 is the second letter
            d1 = direction.substring(0, 1);
            d2 = direction.substring(1);
            //Set angle accordingly
            if (direction.equalsIgnoreCase("ne")) {
                angle = 45;
            } else if (direction.equalsIgnoreCase("nw")) {
                angle = 135;
            } else if (direction.equalsIgnoreCase("se")) {
                angle = 315;
            } else if (direction.equalsIgnoreCase("sw")){
                angle = 225;
            }
        
        //If the user enters string such as N30E, S45W
        } else {
            //Take the first and last character of the string direction since
            //they always specify N, S, E, or W
            d1 = direction.substring(0, 1);
            d2 = direction.substring(direction.length() - 1);
            //The substring that is in between specifies the angle
            double degree = Double.parseDouble(direction.substring(1,direction.length() - 1 ));

            if (d1.equalsIgnoreCase("n")) {
                //N is the reference
                if (d2.equalsIgnoreCase("e")) {
                    angle = 90 - degree;
                } else {
                    angle = 90 + degree;
                }
            } else if (d1.equalsIgnoreCase("s")) {
                //S is the reference
                if (d2.equalsIgnoreCase("e")) {
                    angle = 270 + degree;
                } else {
                    angle = 270 - degree;
                }
            } else if (d1.equalsIgnoreCase("e")) {
                //E is the reference
                if (d2.equalsIgnoreCase("n")) {
                    angle = degree;
                } else {
                    angle = 360 - degree;
                }
            } else {
                //W is the reference
                if (d2.equalsIgnoreCase("n")) {
                    angle = 180 - degree;
                } else {
                    angle = 180 + degree;
                }
            }      
        }
        //Calculate the slope of the line that the angle creates
        slope = Math.tan(angle * Math.PI/ (double) 180); //Degrees to radians
    }
    
    //Method to move the object in the direction that the user entered
    public void moveObject(double velocity, String direction) {
        //The number of pixels that the object moves across each frame, with 10m/s
        //being the object moving across one pixel each frame
        double movePixel = velocity / 2;
        this.getDirection(direction);
        
        //If the object is within the boundaries, update its position
  //      if (xCentre - radius >= 0 && xCentre + radius <= 800 && yCentre - radius >= 0 && yCentre + radius <= 800) {
        //Special cases for moving N and S
        if (angle == 90) {
            yCentre -= movePixel;
        } else if (angle == 270) {   
            yCentre += movePixel;
        } else {
            //For yCentre the +/- sign is reversed since the y-axis 
            //of the java screen is reversed
            if (d1.equalsIgnoreCase("e")) {
                xCentre += movePixel;
                yCentre -= slope * movePixel;
            } else if (d1.equalsIgnoreCase("w")) {
                xCentre -= movePixel;
                yCentre += slope * movePixel;
            } else {
                if (d2.equalsIgnoreCase("e")) {
                    xCentre += movePixel;
                    yCentre -= slope * movePixel;
                } else {
                    xCentre -= movePixel;
                    yCentre += slope * movePixel;
                }
            }
  //      }    
        }        
    }
    
    public void collideCheck(physicscollision.Object other, String s, physicscollision.Collision c) {
        //Calculate the distance between the two circular objects
        double distancesqrd = Math.pow(this.xCentre - other.xCentre, 2) + Math.pow(this.yCentre - other.yCentre, 2);
        double distance = Math.sqrt(distancesqrd);
        
        if(distance <= (this.radius + other.difference)) {
            
            collideCount++;
            
            if ((!s.equals("Inelastic") && !s.equals("Elastic"))) {
                if (collideCount > 0 && collideCount <= 6) {
                    this.radius *= 1.06;
                }
                other.radius = 0; 
            }
            
            if (collideCount == 1) {
                c.calculate();
            }
        }                
    }  
}
