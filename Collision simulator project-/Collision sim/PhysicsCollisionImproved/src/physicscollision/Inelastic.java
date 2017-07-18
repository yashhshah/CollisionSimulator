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
public class Inelastic extends Collision {
    double aInitial = 0, bInitial = 0, aFinal = 0, bFinal = 0, volB = 0;
    String[] aInVel, bInVel, aFinVel, bFinVel;
    
    public Inelastic(double mA, double mB, String initialA, String initialB, String finalA, String finalB){
         super(mA, mB, initialA, initialB, finalA, finalB, "Inelastic", 1);
         
        aInVel = inA.split(" ");

        bInVel = inB.split(" ");
        
        aFinVel = finA.split(" ");
        
        bFinVel = finB.split(" ");
        
        //if the initial velocity of first mass is blank
        if(aInVel[0].equals("")){
            bInitial = Double.parseDouble(bInVel[0]);
            aFinal = Double.parseDouble(aFinVel[0]);
            bFinal = Double.parseDouble(bFinVel[0]);
            
            //1D Collisions
            if((aFinVel[1].equals("N") && bFinVel[1].equals("S")) || 
                    (aFinVel[1].equals("S") && bFinVel[1].equals("N")) || 
                    (aFinVel[1].equals("W") && bFinVel[1].equals("E")) || 
                    (aFinVel[1].equals("E") && bFinVel[1].equals("W"))) {
                bFinal*=-1; 
                if(bInVel[1].equals(bFinVel[1])){
                    bInitial*=-1;         
                }
            }
            aInitial = ((aFinal*mA + bFinal*mB)-bInitial*mB)/mA;
            
            if (!aInVel[1].equals(aFinVel[1])) {
                if(aInVel[1].equals("N")) {
                    aInVel[1] = "N";
                }else if(aInVel[1].equals("S")) {
                    aInVel[1] = "S";
                } else if(aInVel[1].equals("E")) {
                    aInVel[1] = "E";
                } else if(aInVel[1].equals("W")) {
                    aInVel[1] = "W";
                }
            }
            
            if((aFinVel[1].equals("N") && bFinVel[1].equals("S")) || 
                    (aFinVel[1].equals("S") && bFinVel[1].equals("N")) || 
                    (aFinVel[1].equals("W") && bFinVel[1].equals("E")) || 
                    (aFinVel[1].equals("E") && bFinVel[1].equals("W"))) {
                bFinal*=-1; 
                if(bInVel[1].equals(bFinVel[1])){
                    bInitial*=-1;         
                }
            }            
        }
        
        //if initial velocity of second mass is blank
        
        else if(bInVel[0].equals("")){
            aInitial = Double.parseDouble(aInVel[0]);
            aFinal = Double.parseDouble(aFinVel[0]);
            bFinal = Double.parseDouble(bFinVel[0]);
            
            //1D Collisions
            if((aFinVel[1].equals("N") && bFinVel[1].equals("S")) || 
                    (aFinVel[1].equals("S") && bFinVel[1].equals("N")) || 
                    (aFinVel[1].equals("W") && bFinVel[1].equals("E")) || 
                    (aFinVel[1].equals("E") && bFinVel[1].equals("W"))){
                bFinal*=-1; 
                if(aInVel[1].equals(bFinVel[1])){
                    aInitial*=-1;         
                }       
            }
            bInitial = ((aFinal*mA + bFinal*mB)-aInitial*mA)/mB; 
            
            if (!bInVel[1].equals(aFinVel[1])) {
                if(bInVel[1].equals("N")) {
                    bInVel[1] = "N";
                }else if(bInVel[1].equals("S")) {
                    bInVel[1] = "S";
                } else if(bInVel[1].equals("E")) {
                    bInVel[1] = "E";
                } else if(bInVel[1].equals("W")) {
                    bInVel[1] = "W";
                }
            }
            
            if((aFinVel[1].equals("N") && bFinVel[1].equals("S")) || 
                    (aFinVel[1].equals("S") && bFinVel[1].equals("N")) || 
                    (aFinVel[1].equals("W") && bFinVel[1].equals("E")) || 
                    (aFinVel[1].equals("E") && bFinVel[1].equals("W"))){
                bFinal*=-1; 
                if(aInVel[1].equals(bFinVel[1])){
                    aInitial*=-1;         
                }       
            }
            
        }
        
        //if final velocity of first mass is blank
        else if(aFinVel[0].equals("")){
            aInitial = Double.parseDouble(aInVel[0]);
            bInitial = Double.parseDouble(bInVel[0]);
            bFinal = Double.parseDouble(bFinVel[0]);
            
            //1D Collisions
             if((aInVel[1].equals("N") && bInVel[1].equals("S")) || 
                    (aInVel[1].equals("S") && bInVel[1].equals("N")) || 
                    (aInVel[1].equals("W") && bInVel[1].equals("E")) || 
                    (aInVel[1].equals("E") && bInVel[1].equals("W"))){
                bInitial*=-1; 
                if(bFinVel[1].equals(bInVel[1])){
                    bFinal*=-1;         
                }
            }
            aFinal = ((aInitial*mA + bInitial*mB)-bFinal*mB)/mA;
            
            if (!aFinVel[1].equals(aInVel[1])) {
                if(aFinVel[1].equals("N")) {
                    aFinVel[1] = "N";
                }else if(aFinVel[1].equals("S")) {
                    aFinVel[1] = "S";
                } else if(aFinVel[1].equals("E")) {
                    aFinVel[1] = "E";
                } else if(aFinVel[1].equals("W")) {
                    aFinVel[1] = "W";
                }
            }
            
            if((aInVel[1].equals("N") && bInVel[1].equals("S")) || 
                    (aInVel[1].equals("S") && bInVel[1].equals("N")) || 
                    (aInVel[1].equals("W") && bInVel[1].equals("E")) || 
                    (aInVel[1].equals("E") && bInVel[1].equals("W"))){
                bInitial*=-1; 
                if(bFinVel[1].equals(bInVel[1])){
                    bFinal*=-1;         
                }
            }
        }
        
        //if the final velocity of the second mass is blank
        else {
            aInitial = Double.parseDouble(aInVel[0]);
            bInitial = Double.parseDouble(bInVel[0]);
            aFinal = Double.parseDouble(aFinVel[0]);
            
            //1D Collisions
             if((aInVel[1].equals("N") && bInVel[1].equals("S")) || 
                    (aInVel[1].equals("S") && bInVel[1].equals("N")) || 
                    (aInVel[1].equals("W") && bInVel[1].equals("E")) || 
                    (aInVel[1].equals("E") && bInVel[1].equals("W"))){
                bInitial*=-1; 
                if(aFinVel[1].equals(bInVel[1])){
                    aFinal*=-1;         
                }
            }
            bFinal = ((aInitial*mA + bInitial*mB)-aFinal*mA)/mB;   
           
            if (!bFinVel[1].equals(aInVel[1])) {
                if(aInVel[1].equals("N")) {
                    bFinVel[1] = "N";
                }else if(aInVel[1].equals("S")) {
                    bFinVel[1] = "S";
                } else if(aInVel[1].equals("E")) {
                    bFinVel[1] = "E";
                } else if(aInVel[1].equals("W")) {
                    bFinVel[1] = "W";
                }
            }
           
            if((aInVel[1].equals("N") && bInVel[1].equals("S")) || 
                    (aInVel[1].equals("S") && bInVel[1].equals("N")) || 
                    (aInVel[1].equals("W") && bInVel[1].equals("E")) || 
                    (aInVel[1].equals("E") && bInVel[1].equals("W"))){
                bInitial*=-1; 
                if(aFinVel[1].equals(bInVel[1])){
                    aFinal*=-1;         
                }
           }
        }
        
        
        //sets directions
        vA = aInitial;
        vB = bInitial;
        dirA = aInVel[1];
        dirB = bInVel[1];
        
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
    
    //calculate method
    public void calculate() {
        
        vA = aFinal;
        vB = bFinal;
        dirA = aFinVel[1];
        dirB = bFinVel[1];
        
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