/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicscollision;


//imports
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Yash Shah, Michael Zhou
 */

//initial screen class
public class initialScreen extends javax.swing.JFrame {
    
    //set variables
    public static String  inVA = "", inVB = "", finalVA = "", finalVB = "", value = "";
    public static double massA = 0, massB =0;
    Collision c;
    int clickCount;
    public JFrame j = new JFrame();
   
    //FIELDS
    int width = 800; //width of the window in pixels
    int height = 800; //height of the window in pixels
    
    /**
     * Creates new form initialScreen
     */
    public initialScreen() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iVelA = new javax.swing.JComboBox<>();
        iVelB = new javax.swing.JComboBox<>();
        fVelB = new javax.swing.JComboBox<>();
        fVelA = new javax.swing.JComboBox<>();
        tField1 = new javax.swing.JFormattedTextField();
        tField2 = new javax.swing.JFormattedTextField();
        tField3 = new javax.swing.JFormattedTextField();
        tField4 = new javax.swing.JFormattedTextField();
        tField5 = new javax.swing.JFormattedTextField();
        tField6 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setTitle("Physics Collision Simulator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("j"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("mass of A");

        jLabel2.setText("mass of B");

        jLabel3.setText("initialV of A");

        jLabel4.setText("initialV of B");

        jLabel5.setText("finalV of A");

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Inelastic", "Completely Inelastic", "Elastic" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        jLabel6.setText("type");

        jLabel7.setText("finalV of B");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        iVelA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "S", "E", "W" }));
        iVelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iVelAActionPerformed(evt);
            }
        });

        iVelB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "S", "E", "W" }));
        iVelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iVelBActionPerformed(evt);
            }
        });

        fVelB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "S", "E", "W" }));
        fVelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fVelBActionPerformed(evt);
            }
        });

        fVelA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "S", "E", "W" }));
        fVelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fVelAActionPerformed(evt);
            }
        });

        NumberFormatter nf = new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.#"));
        nf.setMinimum(new Integer(0));
        tField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(nf));
        tField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField1ActionPerformed(evt);
            }
        });
        tField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tField1KeyPressed(evt);
            }
        });

        tField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(nf));
        tField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField2ActionPerformed(evt);
            }
        });

        tField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.#"))));
        tField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField3ActionPerformed(evt);
            }
        });

        tField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.#"))));
        tField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField4ActionPerformed(evt);
            }
        });

        tField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.#"))));
        tField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField5ActionPerformed(evt);
            }
        });

        tField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.#"))));
        tField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Kg");

        jLabel11.setText("Kg");

        jLabel12.setText("m/s");

        jLabel13.setText("m/s");

        jLabel14.setText("m/s");

        jLabel15.setText("m/s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                            .addComponent(tField4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tField3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tField6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(iVelA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(iVelB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fVelB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fVelA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(tField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(iVelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(iVelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fVelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fVelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        getAccessibleContext().setAccessibleName("j");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //greys out text fields based on type of collision chosen
    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        clickCount ++;
        
        //always sets all text fields enabled at first
        if (clickCount > 1) {
            tField3.setEnabled(true);
            tField3.setBackground(Color.white);
            tField4.setEnabled(true);
            tField4.setBackground(Color.white);
            tField5.setEnabled(true);
            tField5.setBackground(Color.white);
            tField6.setEnabled(true);
            tField6.setBackground(Color.white);
        }
        
        //if elastic or completely inelastic is chosen
        if (!combobox.getSelectedItem().toString().equals("Select") && !combobox.getSelectedItem().toString().equals("Inelastic")) {
            tField5.setEnabled(false);
            tField5.setBackground(Color.gray);
            tField6.setEnabled(false);
            tField6.setBackground(Color.gray);
       
        //if the select option is chosen
        } else {
            if (combobox.getSelectedItem().toString().equals("Select")) {
                
            //checks for inelastic and removes options accordingly
            } else {
                if (!tField3.getText().equals("") && !tField4.getText().equals("") && !tField5.getText().equals("")) {
                    tField6.setEnabled(false);
                    tField6.setBackground(Color.gray);
                } else if (!tField3.getText().equals("") && !tField4.getText().equals("") && !tField6.getText().equals("")) {
                    tField5.setEnabled(false);
                    tField5.setBackground(Color.gray);
                } else if (!tField3.getText().equals("") && !tField5.getText().equals("") && !tField6.getText().equals("")) {
                    tField4.setEnabled(false);
                    tField4.setBackground(Color.gray);
                } else if (!tField4.getText().equals("") && !tField5.getText().equals("") && !tField6.getText().equals("")) {
                    tField3.setEnabled(false);
                    tField3.setBackground(Color.gray);
                }
            }
        }
     
    }//GEN-LAST:event_comboboxActionPerformed
    //if the submit button is clicked, used this method for error messages
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //box counter is used to check how many text fields have content in them
        int boxCounter=0;
        boolean goAhead = true;
        
        
        //increments box counter by checking each text field
        if(tField3.getText().isEmpty()==false){
            boxCounter++;
        }

        if(tField4.getText().isEmpty()==false){
            boxCounter++;
        }

        if(tField5.getText().isEmpty()==false){
            boxCounter++;
        }

        if(tField6.getText().isEmpty()==false){
            boxCounter++;
        }
        
        
        //if masses are empty
        if(tField1.getText().isEmpty() || tField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(j, "You need to enter masses!");
            goAhead=false;        
        }
        
        //if elastic collision or inelastic collision is selected and user has 1 vel
        if((combobox.getSelectedItem().toString().equals("Elastic") || combobox.getSelectedItem().toString().equals("Completely Inelastic")) && boxCounter<2){
            JOptionPane.showMessageDialog(j, "Enter a velocity!"); 
            goAhead=false;
        }
        
        //if initial velocities are empty
        if((tField3.getText().isEmpty() || tField4.getText().isEmpty())){
            
            JOptionPane.showMessageDialog(j, "Enter the initial velocity!");             
            goAhead=false;
        }
        
        //if inelastic collision is chosen and 2 or 1 or 0 things are entered
        else if(combobox.getSelectedItem().toString().equals("Inelastic") && boxCounter<3){
             JOptionPane.showMessageDialog(j, "Enter a velocity!");             
            goAhead=false;
        
        }
        
        //if everying is entered correctly
        if(goAhead){      
            //get content from each text field
            massA = Double.parseDouble(tField1.getText());
            massB = Double.parseDouble(tField2.getText()); 
            inVA =  tField3.getText() + " " + iVelA.getSelectedItem().toString();
            inVB =  tField4.getText() + " " + iVelB.getSelectedItem().toString() ;             
            finalVA = tField5.getText() + " " + fVelA.getSelectedItem().toString();
            finalVB = tField6.getText() + " " + fVelB.getSelectedItem().toString();
            value = combobox.getSelectedItem().toString();
            
            //if elastic is chosen
            if(value.equals("Elastic")){
                c = new Elastic(massA, massB, inVA, inVB, finalVA, finalVB);        
            }
            
            //if inelastic is chosen
            else if(value.equals("Inelastic")){
                c = new Inelastic(massA, massB, inVA, inVB, finalVA, finalVB); 
             }
            
            //if completely inelastic is chosen
            else {     
                c = new CInelastic(massA, massB, inVA, inVB, finalVA, finalVB);
            }
            
            //get directions for the two objects to be displayed
            c.o1.getDirection(c.dirA);
            c.o2.getDirection(c.dirB);

            //check if objects are within the jpanel       
            while ((c.o1.xCentre + c.o1.radius >= 0 && c.o1.xCentre - c.o1.radius <= width
                    && c.o1.yCentre + c.o1.radius >= 0 && c.o1.yCentre - c.o1.radius <= height)
                    || (c.o2.xCentre + c.o2.radius >= 0 && c.o2.xCentre - c.o2.radius <= width
                    && c.o2.yCentre + c.o2.radius >= 0 && c.o2.yCentre - c.o2.radius <= height )) {
                //Repaint the screen
                paint();
                sleep(36);

                //Move the object in the direction specified by the user
                c.o1.moveObject(c.vA, c.dirA);
                c.o2.moveObject(c.vB, c.dirB);
                c.o1.collideCheck(c.o2, value, c);
            }//closes the while loop



            setVisible(false);//stops showing the screen
            System.exit(0);//exits from the screen
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //paint method
    public void paint() {
        Image image = getImage();
        Graphics G = jPanel1.getGraphics();
        G.drawImage(image, 0, 0, rootPane); 
    }
    
    //get image gets the properties of the two circles being drawn
    public Image getImage() {
        //Use buffer image to make the animation smoooth
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) bi.getGraphics();
        
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);
        
        //Allow decimal locations
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.black);
        
        //Draw the objects
        Ellipse2D.Double shape1 = new Ellipse2D.Double(c.o1.xCentre - (c.o1.radius), c.o1.yCentre - (c.o1.radius), c.o1.radius * 2, c.o1.radius * 2);
        Ellipse2D.Double shape2 = new Ellipse2D.Double(c.o2.xCentre - (c.o2.radius), c.o2.yCentre - (c.o2.radius), c.o2.radius * 2, c.o2.radius * 2);
        g.fill(shape1);
        g.fill(shape2);
        
        if (c.o1.radius > 0) {   
            g.drawString(c.vA + "m/s " + c.dirA, (float) (c.o1.xCentre + c.o1.radius), (float) (c.o1.yCentre - c.o1.radius)); 
        }
        if (c.o2.radius > 0) {
            g.drawString(c.vB + "m/s " + c.dirB, (float) (c.o2.xCentre + c.o2.radius), (float) (c.o2.yCentre - c.o2.radius));    
        }
        
        return bi;
    }
    
    //Sleep time between each frame
    public static void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } 
        catch (Exception e) {}
    }
    //THESE INBUILT METHODS ARE NOT NEEDED, BUT DO NOT NEED TO BE REPLACED
    private void iVelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iVelAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iVelAActionPerformed

    private void iVelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iVelBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iVelBActionPerformed

    private void fVelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fVelBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fVelBActionPerformed

    private void fVelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fVelAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fVelAActionPerformed

    private void tField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tField2ActionPerformed
  
    private void tField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField3ActionPerformed
        //check if other 3 are full
        
        
       
                
            
            
                
            
            
        
        
        
    }//GEN-LAST:event_tField3ActionPerformed

    private void tField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tField4ActionPerformed

    private void tField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tField5ActionPerformed

    private void tField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tField6ActionPerformed

    private void tField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField1ActionPerformed
      
       
    }//GEN-LAST:event_tField1ActionPerformed

    private void tField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tField1KeyPressed
          
            
    }//GEN-LAST:event_tField1KeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

   
    
    //MAIN CLASS
    public static void main(String args[]) {        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new initialScreen().setVisible(true);
                
                
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> fVelA;
    private javax.swing.JComboBox<String> fVelB;
    private javax.swing.JComboBox<String> iVelA;
    private javax.swing.JComboBox<String> iVelB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField tField1;
    private javax.swing.JFormattedTextField tField2;
    private javax.swing.JFormattedTextField tField3;
    private javax.swing.JFormattedTextField tField4;
    private javax.swing.JFormattedTextField tField5;
    private javax.swing.JFormattedTextField tField6;
    // End of variables declaration//GEN-END:variables
}
