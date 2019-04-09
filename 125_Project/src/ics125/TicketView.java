/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics125;

import java.time.LocalDateTime;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author C0422594
 */
public class TicketView extends javax.swing.JDialog{
    String rating;
    /**
     * Creates new form TicketView
     */
   

    TicketView(MovieView theView, boolean b, Movie theMovie) {
       super(theView,b);
      
       rating =theMovie.getRating();
        initComponents();
       
        System.out.print(LocalDateTime.now().getHour());
        

        // if local time is between 1pm and 4pm 
        if(LocalDateTime.now().getHour() >=13 && LocalDateTime.now().getHour() <=16 ){ 
            this.seniorPriceLabel.setText("$11.50");
            this.childPriceLabel.setText("$10.99");
            this.adultPriceLabel.setText("$14.25");
        //local time must be tuesday to get these prices below
        }else if(LocalDateTime.now().getDayOfWeek().toString().equals("TUESDAY")){
            this.seniorPriceLabel.setText("$6.75");
            this.childPriceLabel.setText("$6.75");
            this.adultPriceLabel.setText("$6.75");
        }else{
            //Normal prices
            this.seniorPriceLabel.setText("$8.50");
            this.childPriceLabel.setText("$7.99");
            this.adultPriceLabel.setText("$10.99");
        }
        
        
        Integer startValue =0;
        Integer minValue = 0;
        Integer maxValue = 10;
        Integer stepValue = 1;
        SpinnerModel numModel = new SpinnerNumberModel(startValue, minValue,maxValue,stepValue);
        SpinnerModel numModel2 = new SpinnerNumberModel(startValue, minValue,maxValue,stepValue);
        SpinnerModel numModel3 = new SpinnerNumberModel(startValue, minValue,maxValue,stepValue);
        seniorAmount.setModel(numModel);
        adultAmount.setModel(numModel2);
        childAmount.setModel(numModel3);  
    }

    int getSeniorTickets(){
       return (Integer) seniorAmount.getValue();
    }
    int getAdultTickets(){
       return (Integer) adultAmount.getValue();
    }
    int getChildTickets(){
       return (Integer) childAmount.getValue();
    }
  

   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        childLabel = new javax.swing.JLabel();
        adultLabel = new javax.swing.JLabel();
        seniorLabel = new javax.swing.JLabel();
        childAmount = new javax.swing.JSpinner();
        adultAmount = new javax.swing.JSpinner();
        seniorAmount = new javax.swing.JSpinner();
        seniorPriceLabel = new javax.swing.JLabel();
        adultPriceLabel = new javax.swing.JLabel();
        childPriceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Tickets");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(425, 320));
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        childLabel.setText("Children (ages 3-13)");

        adultLabel.setText("Adults (ages 14 & up)");

        seniorLabel.setText("Seniors (ages 65+)");

        seniorPriceLabel.setText("jLabel1");

        adultPriceLabel.setText("jLabel2");

        childPriceLabel.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Select your tickets");

        jRadioButton2.setBackground(new java.awt.Color(204, 0, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Debit");

        jRadioButton1.setBackground(new java.awt.Color(204, 0, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Credit");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Purchase Tickets");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adultPriceLabel)
                            .addComponent(childPriceLabel)
                            .addComponent(seniorPriceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(childAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adultAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seniorAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seniorLabel)
                            .addComponent(adultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addGap(16, 16, 16)
                        .addComponent(jRadioButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seniorLabel)
                            .addComponent(seniorPriceLabel))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(seniorAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adultPriceLabel)
                    .addComponent(adultAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childLabel)
                    .addComponent(childPriceLabel)
                    .addComponent(childAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           System.out.print(getSeniorTickets());
           System.out.print(getAdultTickets());
           System.out.print(getChildTickets());
           if(getChildTickets()>=1 && rating.equals("NC17")){
              JOptionPane.showMessageDialog(null, "Children are not permitted in this film", "alert", 2);
                    return;
           }else if(getSeniorTickets() ==0 && getChildTickets() ==0 && getAdultTickets() ==0 ){
                JOptionPane.showMessageDialog(null, "Must have a ticket picked to pay", "alert", 2);
                return;
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner adultAmount;
    private javax.swing.JLabel adultLabel;
    private javax.swing.JLabel adultPriceLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSpinner childAmount;
    private javax.swing.JLabel childLabel;
    private javax.swing.JLabel childPriceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner seniorAmount;
    private javax.swing.JLabel seniorLabel;
    private javax.swing.JLabel seniorPriceLabel;
    // End of variables declaration//GEN-END:variables
}