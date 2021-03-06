package parking.management.system;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radhika
 */
public class Exit_page extends javax.swing.JFrame {

    /**
     * Creates new form Exit_page
     */
    public Exit_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit_title = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        systime_label = new javax.swing.JLabel();
        sysdate_label = new javax.swing.JLabel();
        occupied_label = new javax.swing.JLabel();
        count_label = new javax.swing.JLabel();
        back_Button = new javax.swing.JButton();
        next_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();
        token_label = new javax.swing.JLabel();
        token_TextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        veh_no_Label = new javax.swing.JLabel();
        name_Label = new javax.swing.JLabel();
        in_Label = new javax.swing.JLabel();
        out_Label = new javax.swing.JLabel();
        duration_Label = new javax.swing.JLabel();
        amount_Label = new javax.swing.JLabel();
        proceed_Button = new javax.swing.JButton();
        getVehcle = new javax.swing.JLabel();
        getName = new javax.swing.JLabel();
        getIn = new javax.swing.JLabel();
        getOut = new javax.swing.JLabel();
        getDuration = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exit Page");

        exit_title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exit_title.setText("EXIT PAGE");

        date_label.setText("Date: ");

        time_label.setText("Time:");

        Date now=new Date();
        //Thread th=new Thread();
        //do{
            /*DateFormat t= new SimpleDateFormat("hh:mm:ss");
            String strTime=t.format(now);
            systime_label.setText(strTime);*/
            //}
        //while(th.isAlive());
        systime_label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                systime_labelMouseMoved(evt);
            }
        });
        systime_label.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                systime_labelFocusGained(evt);
            }
        });

        Date today=new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.getDefault());
        String strDate = df.format(today);
        sysdate_label.setText(strDate);

        occupied_label.setText("Spaces Occupied:");

        count_label.setText("count");

        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });

        next_Button.setText("Next");
        next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_ButtonActionPerformed(evt);
            }
        });

        cancel_Button.setText("Cancel");

        token_label.setText("Enter Token number:");

        token_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                token_TextFieldActionPerformed(evt);
            }
        });

        veh_no_Label.setText("Vehicle no:");

        name_Label.setText("Owner's name:");

        in_Label.setText("In time:");

        out_Label.setText("Out time:");

        duration_Label.setText("Duration:");

        amount_Label.setText("Amount:");

        proceed_Button.setText("Proceed");
        proceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_ButtonActionPerformed(evt);
            }
        });

        getVehcle.setText("no");

        getName.setText("name");

        getIn.setText("in time");

        getOut.setText("out time");

        getDuration.setText("get Duration");

        jLabel6.setText("get amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(back_Button)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(cancel_Button))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(next_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(exit_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(sysdate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(occupied_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(systime_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(450, 450, 450)
                                .addComponent(proceed_Button))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(token_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(token_label))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name_Label)
                                    .addComponent(veh_no_Label)
                                    .addComponent(in_Label)
                                    .addComponent(out_Label)
                                    .addComponent(amount_Label)
                                    .addComponent(duration_Label))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getIn, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getName, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getOut, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getVehcle, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 830, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(exit_title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sysdate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(occupied_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(systime_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proceed_Button)
                            .addComponent(token_label)
                            .addComponent(token_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veh_no_Label)
                    .addComponent(getVehcle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Label)
                    .addComponent(getName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_Label)
                    .addComponent(getIn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(out_Label)
                    .addComponent(getOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration_Label)
                    .addComponent(getDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount_Label)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_Button)
                    .addComponent(cancel_Button)
                    .addComponent(next_Button))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next_ButtonActionPerformed

    private void token_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_token_TextFieldActionPerformed
        // TODO add your handling code here:
        String enterTocken= getName();
    }//GEN-LAST:event_token_TextFieldActionPerformed

    private void proceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_ButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_proceed_ButtonActionPerformed

    private void systime_labelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_systime_labelFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_systime_labelFocusGained

    private void systime_labelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systime_labelMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_systime_labelMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exit_page().setVisible(true);
                
            }
        });
    }

 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount_Label;
    private javax.swing.JButton back_Button;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLabel count_label;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel duration_Label;
    private javax.swing.JLabel exit_title;
    private javax.swing.JLabel getDuration;
    private javax.swing.JLabel getIn;
    private javax.swing.JLabel getName;
    private javax.swing.JLabel getOut;
    private javax.swing.JLabel getVehcle;
    private javax.swing.JLabel in_Label;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel name_Label;
    private javax.swing.JButton next_Button;
    private javax.swing.JLabel occupied_label;
    private javax.swing.JLabel out_Label;
    private javax.swing.JButton proceed_Button;
    private javax.swing.JLabel sysdate_label;
    private javax.swing.JLabel systime_label;
    private javax.swing.JLabel time_label;
    private javax.swing.JTextField token_TextField;
    private javax.swing.JLabel token_label;
    private javax.swing.JLabel veh_no_Label;
    // End of variables declaration//GEN-END:variables
}
