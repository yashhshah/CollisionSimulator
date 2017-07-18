/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicscollision;

/**
 *
 * @author youtube
 */
//Import necessary packages
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author youtube
 */
public class Collision extends JFrame {
    
    //variable declaration
    double massA;
    double massB; 
    String inA;
    String inB;
    String finA;
    String finB;
    String choice;
    double vA, vB;
    String dirA, dirB;    
    physicscollision.Object o1, o2;    
    Collision c;
    
    //FIELDS
    int width = 800; //width of the window in pixels
    int height = 800; //height of the window in pixels
    
    
   
    //collision constructor
    public Collision(double mA, double mB, String initialA, String initialB, String finalA, String finalB, String option, int check){
        
        //sets properties of the object
        massA = mA;
        massB = mB; 
        inA = initialA;
        inB = initialB;
        finA = finalA;
        finB = finalB;
        choice = option;
        
        //seperates the direction and the number part for each velocity
        String[] iA = inA.split(" ");
        vA = Double.parseDouble(iA[0]);
        dirA = iA[1];
        
        //vel B
        String[] iB = inB.split(" ");
        vB = Double.parseDouble(iB[0]);
        dirB = iB[1];
        
        //change velocities to positive
         if (vA < 0) {
                vA *= -1;
                if(dirA.equals("N")) {
                    dirA = "S";
                }else if(dirA.equals("S")) {
                    dirA = "N";
                } else if(dirA.equals("E")) {
                    dirA = "W";
                } else if(dirA.equals("W")) {
                    dirA = "E";
                }
            }
            
            if (vB < 0) {
                vB *= -1;
                if(dirB.equals("N")) {
                    dirB = "S";
                }else if(dirB.equals("S")) {
                    dirB = "N";
                } else if(dirB.equals("E")) {
                    dirB = "W";
                } else if(dirB.equals("W")) {
                    dirB = "E";
                }
            }
            
       //Create two circular objects with specified location and radius
       if(dirA.equals("E") && dirB.equals("W") || 
          dirA.equals("W") && dirB.equals("E")){
            o1 = new physicscollision.Object(180, 300, massA);
            o2 = new physicscollision.Object(400, 300, massB);    
       }
       //if it is not an east west collision
       else{
        o1 = new physicscollision.Object(350, 200, massA);
        o2 = new physicscollision.Object(350, 350, massB);
       }
    }
    
    //overrided calculate method
    public void calculate() {


    }
}   


    
