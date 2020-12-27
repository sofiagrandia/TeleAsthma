/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaJFrame;

import Patient.Data;
import static Patient.Data.ACTIVITIES.AT_HOME;
import static Patient.Data.ACTIVITIES.EXERCISE;
import static Patient.Data.ACTIVITIES.SLEEPING;
import static Patient.Data.ACTIVITIES.WITH_ANIMAL;
import static Patient.Data.ACTIVITIES.WORKING;
import static Patient.Data.MEDICATION.ANTIHISTAMINES;
import static Patient.Data.MEDICATION.CONTROL_TREATMENT;
import static Patient.Data.MEDICATION.IBUPROPHEN;
import static Patient.Data.MEDICATION.NO_MEDICATION;
import static Patient.Data.MEDICATION.PARACETAMOL;
import static Patient.Data.MEDICATION.RESCUE_INHALER;
import static Patient.Data.SYMPTOMS.BREATHING_DIFFICULTY;
import static Patient.Data.SYMPTOMS.BREATHING_WHISTLING;
import static Patient.Data.SYMPTOMS.CHEST_PREASSURE;
import static Patient.Data.SYMPTOMS.HEADACHE;
import static Patient.Data.SYMPTOMS.INSOMNIA;
import static Patient.Data.SYMPTOMS.NO_SYMPTOMS;
import Patient.Patient;
import Patient.SharedInfo;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

/**
 *
 * @author Sofia
 */
public class Symptoms extends javax.swing.JFrame {

    /**
     * Creates new form Symptoms
     */
    public Symptoms() {
        initComponents();
        Color backColor = new Color(143, 217, 223);
        Color titleColor = new Color(13, 124, 144);
        Color buttonColor = new Color(52, 149, 206 );
        this.getContentPane().setBackground(white);
        javax.swing.border.Border line = BorderFactory.createLineBorder(backColor, 3);
        ((JComponent) getContentPane()).setBorder(line);
        Font font = new Font("Helvetica", Font.BOLD, 15);
        Font font2 = new Font("HelveticaBold", Font.ITALIC, 30);
        this.jLabel1.setFont(font);
        this.jLabel2.setFont(font);
        this.jLabel3.setFont(font);
        this.jLabel4.setFont(font2);
        this.jLabel1.setForeground(backColor);
        this.jLabel2.setForeground(backColor);
        this.jLabel3.setForeground(backColor);
        this.jLabel4.setForeground(titleColor);
        jButton1.setBackground(Color.lightGray);
        jButton1.setForeground(titleColor);
        jButton1.setFont(font);
        jButton2.setBackground(Color.lightGray);
        jButton2.setForeground(titleColor);
        jButton2.setFont(font);
        jToggleButton1.setBackground(buttonColor);
        jToggleButton1.setForeground(Color.white);
        jToggleButton1.setFont(font);
        jToggleButton2.setBackground(buttonColor);
        jToggleButton2.setForeground(Color.white);
        jToggleButton2.setFont(font);
        jToggleButton3.setBackground(buttonColor);
        jToggleButton3.setForeground(Color.white);
        jToggleButton3.setFont(font);
        jToggleButton4.setBackground(buttonColor);
        jToggleButton4.setForeground(Color.white);
        jToggleButton4.setFont(font);
        jToggleButton5.setBackground(buttonColor);
        jToggleButton5.setForeground(Color.white);
        jToggleButton5.setFont(font);
        jToggleButton6.setBackground(buttonColor);
        jToggleButton6.setForeground(Color.white);
        jToggleButton6.setFont(font);
        jToggleButton7.setBackground(buttonColor);
        jToggleButton7.setForeground(Color.white);
        jToggleButton7.setFont(font);
        jToggleButton8.setBackground(buttonColor);
        jToggleButton8.setForeground(Color.white);
        jToggleButton8.setFont(font);
        jToggleButton9.setBackground(buttonColor);
        jToggleButton9.setForeground(Color.white);
        jToggleButton9.setFont(font);
        jToggleButton10.setBackground(buttonColor);
        jToggleButton10.setForeground(Color.white);
        jToggleButton10.setFont(font);
        jToggleButton11.setBackground(buttonColor);
        jToggleButton11.setForeground(Color.white);
        jToggleButton11.setFont(font);
        jToggleButton13.setBackground(buttonColor);
        jToggleButton13.setForeground(Color.white);
        jToggleButton13.setFont(font);
        jToggleButton14.setBackground(buttonColor);
        jToggleButton14.setForeground(Color.white);
        jToggleButton14.setFont(font);
        jToggleButton15.setBackground(buttonColor);
        jToggleButton15.setForeground(Color.white);
        jToggleButton15.setFont(font);
        jToggleButton16.setBackground(buttonColor);
        jToggleButton16.setForeground(Color.white);
        jToggleButton16.setFont(font);
        jToggleButton17.setBackground(buttonColor);
        jToggleButton17.setForeground(Color.white);
        jToggleButton17.setFont(font);
        jToggleButton18.setBackground(buttonColor);
        jToggleButton18.setForeground(Color.white);
        jToggleButton18.setFont(font);
    }
    Data data = new Data();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel1.setText("Have you had any of these symptoms?");

        jToggleButton2.setText("No symptoms");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Breathing Difficulty");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Breathing Whistling");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Chest Preassure");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("Insomnia");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("Headache");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("What were you doing whilst you had any of these symptoms (if any)? ");

        jToggleButton7.setText("Exercise");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("With animal");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setText("At home");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setText("Sleeping");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setText("Working");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jLabel3.setText("Have you had your medication?");

        jToggleButton13.setText("No medication");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setText("Rescue Inhaler");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setText("Control Treatment");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setText("Antihistamines");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setText("Ibuprophen");
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setText("Paracetamol");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jLabel4.setText("Symptoms and Monitoring");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton6))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton14)
                                .addGap(10, 10, 10)
                                .addComponent(jToggleButton15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton18)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 46, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton6))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton11))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16)
                    .addComponent(jToggleButton17)
                    .addComponent(jToggleButton18))
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        if (jToggleButton8.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addActivity(WITH_ANIMAL);
            SharedInfo.getInstance().setData(d);
        }

    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addSymptom(BREATHING_DIFFICULTY);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MainPage main = new MainPage();
        main.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if (jToggleButton2.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addSymptom(NO_SYMPTOMS);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        if (jToggleButton3.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addSymptom(BREATHING_WHISTLING);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        if (jToggleButton4.isSelected()) {
            Data data = SharedInfo.getInstance().getData();
            data.addSymptom(CHEST_PREASSURE);
            SharedInfo.getInstance().setData(data);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        if (jToggleButton5.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addSymptom(INSOMNIA);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        if (jToggleButton6.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addSymptom(HEADACHE);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        if (jToggleButton7.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addActivity(EXERCISE);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        if (jToggleButton9.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addActivity(AT_HOME);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        if (jToggleButton10.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addActivity(SLEEPING);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        if (jToggleButton11.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addActivity(WORKING);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        if (jToggleButton13.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addMedication(NO_MEDICATION);
            SharedInfo.getInstance().setData(d);
        }
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        if (jToggleButton14.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addMedication(RESCUE_INHALER);
            SharedInfo.getInstance().setData(d);
        }    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        if (jToggleButton15.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addMedication(CONTROL_TREATMENT);
            SharedInfo.getInstance().setData(d);
        }    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        if (jToggleButton16.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addMedication(ANTIHISTAMINES);
            SharedInfo.getInstance().setData(d);
        }    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        if (jToggleButton17.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addMedication(IBUPROPHEN);
            SharedInfo.getInstance().setData(d);
        }    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        if (jToggleButton18.isSelected()) {
            Data d = SharedInfo.getInstance().getData();
            d.addMedication(PARACETAMOL);
            SharedInfo.getInstance().setData(d);
        }    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        MainPage main = new MainPage();
        main.setVisible(true);
                            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Symptoms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
