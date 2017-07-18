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
/**
 *
 * @author youtube
 */
public class Elastic extends Collision {
    
    //variable declaration
    String y;
    double volB = 0, constant;
    
    //elastic constructor
    public Elastic(double mA, double mB, String initialA, String initialB, String finalA, String finalB){
        //inherit properties from collision
        super(mA, mB, initialA, initialB, finalA, finalB, "Elastic", 1);
        
        //direction changes
        if (((dirA.equals("N") && dirB.equals("S")) || 
                (dirA.equals("S") && dirB.equals("N")) || 
                (dirA.equals("E") && dirB.equals("W")) || 
                (dirA.equals("W") && dirB.equals("E"))) && vB > 0) {
            volB = vB * -1;
        }
        
      	
            //get x in terms of y for an equation
            y = String.valueOf((massA * vA + massB * volB) / massB) +"-" + String.valueOf(massA / massB) + "x";
        
        //get the constant needed- more physics stuff
        constant = massA * Math.pow(vA, 2) + massB * Math.pow(volB , 2);   
    }
           
    
    //the calculate method gets the required velocities based on the ones we have
    public void calculate() {
            
            //checks for the + or - in the equation
            String checker;
            double coefficientXforB;
            if(y.contains("-")){
                checker = "-"; 
            }
            else{
                checker= "+";
            }
            
            //sets variables to expand the binomial equation
            double number = Double.parseDouble(y.substring(0, y.indexOf(checker, 1)));             
            double coefficientX = Double.parseDouble(y.substring(y.indexOf(checker, 1), y.indexOf("x")));
            
            //if it has a negative
            if(checker.equals("-")){
                coefficientXforB = coefficientX*-1;
            }
            
            //if it has a positive
            else{
                coefficientXforB = coefficientX;
            } 
            
            //a, b and c values for the quadratic formula
            double c = (Math.pow(number, 2) * massB) - constant; 
            double b = 2 * coefficientXforB * number * massB; 
            double a = Math.pow(coefficientX, 2) * massB + massA; 

            //gets the 2 answers for the quadratic formula
            double xAns1 = ((-1*b)+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
            double xAns2 = ((-1*b)-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
            String aInVel[] = new String[2];
            
            //checks which one is the initial velocity and which one was the right ans
            aInVel = inA.split(" ");             
            double answerA;
            
            //returns answers accordingly
            if(xAns1 == Integer.parseInt(aInVel[0])){
                answerA = xAns2;
            }
            else{
                answerA = xAns1;
            }
            
            //gets the other answer
            double answerB = (massA * vA + massB * volB) / massB + answerA * massA / massB;
            
            //if masses and velocities are equal
            if(massA==massB && vA==vB){
                 vA = answerA;
                vB = answerB;           
            }
            
            //if they are not
            else{
                 vA = answerA * -1;
                vB = answerB * -1;            
            }
           
            //change directions
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
    }
}
    

