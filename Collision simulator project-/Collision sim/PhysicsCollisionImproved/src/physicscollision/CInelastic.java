/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicscollision;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author youtube
 */
public class CInelastic extends Collision {
    
    //sets the one velocity to 0
    double volB = 0;
    
    
    //completely inelastic constructor
    public CInelastic(double mA, double mB, String initialA, String initialB, String finalA, String finalB){
        
        //inheritance
        super(mA, mB, initialA, initialB, finalA, finalB, "Completely Inelastic", 1);
    }
    
    //calculate method to get the velocities
    public void calculate() {
        
        //direction changes
        if (((dirA.equals("N") && dirB.equals("S")) || 
                (dirA.equals("S") && dirB.equals("N")) || 
                (dirA.equals("E") && dirB.equals("W")) || 
                (dirA.equals("W") && dirB.equals("E"))) && vB > 0) {
            volB = vB * -1;
        }
        
        /*only creates one object and one invisible one, the invisible object has
        a velocity of 1000 to get off the screen quick and prevent it from
        causing any issues
        */
        vA = (massA * vA + massB * volB) / (massA + massB);
        vB = 1000;
        
        //direction changes
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
    } 
}