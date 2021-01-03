/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaJFrame;

import Patient.Fecha;
import Patient.Patient;
import Patient.SharedInfo;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import teleasthmaclient.TeleAsthmaClient;

/**
 *
 * @author Sofia
 */
public class Register extends javax.swing.JFrame {

    String gender;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        Color backColor = new Color(143, 217, 223);
        Color titleColor = new Color(13, 124, 144);
        Color buttonColor = new Color(7, 100, 117);
        this.getContentPane().setBackground(white);
        javax.swing.border.Border line = BorderFactory.createLineBorder(backColor, 3);
        ((JComponent) getContentPane()).setBorder(line);
        Font font = new Font("Helvetica", Font.BOLD, 15);
        Font font2 = new Font("HelveticaBold", Font.ITALIC, 30);
        this.jLabel1.setFont(font);
        this.jLabel2.setFont(font);
        this.jLabel3.setFont(font);
        this.jLabel4.setFont(font);
        this.jLabel5.setFont(font);
        this.jLabel6.setFont(font);
        this.jLabel7.setFont(font);
        this.jLabel8.setFont(font);
        this.jLabel9.setFont(font);
        this.jLabel10.setFont(font2);
        this.jLabel11.setFont(font);
        this.jLabel12.setFont(font);
        this.jLabel13.setFont(font);
        this.jLabel1.setForeground(backColor);
        this.jLabel2.setForeground(backColor);
        this.jLabel3.setForeground(backColor);
        this.jLabel4.setForeground(backColor);
        this.jLabel5.setForeground(backColor);
        this.jLabel6.setForeground(backColor);
        this.jLabel7.setForeground(backColor);
        this.jLabel8.setForeground(backColor);
        this.jLabel9.setForeground(backColor);
        this.jLabel10.setForeground(titleColor);
        this.jLabel11.setForeground(titleColor);
        this.jLabel12.setForeground(backColor);
        this.jLabel13.setForeground(titleColor);
        jButton1.setBackground(buttonColor);
        jButton1.setForeground(Color.white);
        jButton1.setFont(font);
        jButton2.setBackground(Color.lightGray);
        jButton2.setForeground(titleColor);
        jButton2.setFont(font);
        combo.setBackground(buttonColor);
        combo.setForeground(Color.white);
        combo.setFont(font);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        genderText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctorText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        heightText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        weightText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        asthmaText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DNItext = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        dobDay = new javax.swing.JTextField();
        dobMonth = new javax.swing.JTextField();
        dobYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Surname");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Date of Birth");

        jLabel4.setText("Doctor");

        doctorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Height");

        heightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextActionPerformed(evt);
            }
        });

        jLabel6.setText("Weight");

        jLabel7.setText("Asthma Type");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("DNI/NIF");

        jLabel9.setText("Password");

        DNItext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNItextActionPerformed(evt);
            }
        });

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        jLabel12.setText("Gender");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose an option","male", "female", "other" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        dobDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobDayActionPerformed(evt);
            }
        });

        dobYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobYearActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaJFrame/icon.png"))); // NOI18N
        jLabel10.setText("Create Profile");

        jLabel11.setText("/");

        jLabel13.setText("/");

        jButton2.setText("Back");
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
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dobDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobYear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(surnameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(DNItext, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asthmaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DNItext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(asthmaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dobDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void windowRegister(int i) throws IOException {
        switch (i) {
            case 4: {
                Object[] options = {"Exit", "Cancel"};
                int eleccion = JOptionPane.showOptionDialog(rootPane, "User already exists, login or try again", "Mensaje de Confirmacion",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, "Exit");
                if (eleccion == JOptionPane.YES_OPTION) {
                    Login log = new Login();
                    log.setVisible(true);
                }
                break;
            }
            case 5: {
                Object[] options = {"OK"};
                int eleccion2 = JOptionPane.showOptionDialog(rootPane, "User registered", "Mensaje de Confirmacion",
                        JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "OK");
                if (eleccion2 == JOptionPane.OK_OPTION) {
                    MainPage main = new MainPage();
                    main.setVisible(true);

                }
                break;
            }
            case 6: {
                Object[] options = {"OK"};
                int eleccion2 = JOptionPane.showOptionDialog(rootPane, "Login correct", "Mensaje de Confirmacion",
                        JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "OK");
                if (eleccion2 == JOptionPane.OK_OPTION) {
                    MainPage main = new MainPage();
                    main.setVisible(true);

                }
                break;
            }
            case 7: {
                Object[] options = {"OK"};
                int eleccion = JOptionPane.showOptionDialog(rootPane, "Login incorrect. Username or Password incorrect. Try again ", "Mensaje de Confirmacion",
                        JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "OK");
                if (eleccion == JOptionPane.OK_OPTION) {
                    Login log = new Login();
                    log.setVisible(true);
                }
                break;
            }
            default:
                break;
        }
    }
    private void heightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void DNItextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNItextActionPerformed

    }//GEN-LAST:event_DNItextActionPerformed
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Float.parseFloat(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static boolean isInt(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static int comprobarDia(String mes) {

        int resultado = 0;

        try {

            if (Integer.parseInt(mes) == 2) {
                resultado = 28;
            }
            if (Integer.parseInt(mes) == 9 || Integer.parseInt(mes) == 11 || Integer.parseInt(mes) == 6 || Integer.parseInt(mes) == 4) {
                resultado = 30;
            }
            if (Integer.parseInt(mes) == 1 || Integer.parseInt(mes) == 3 || Integer.parseInt(mes) == 5 || Integer.parseInt(mes) == 7 || Integer.parseInt(mes) == 8 || Integer.parseInt(mes) == 10 || Integer.parseInt(mes) == 12) {
                resultado = 31;
            }

        } catch (NumberFormatException excepcion) {
            resultado = -1;
        }

        return resultado;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String id = "";
        String pw = "";
        String weight = "";
        String height = "";
        String doctor = "";
        String asthmaT = "";
        String day = "";
        String month = "";
        String year = "";
        String gender = "";
        Boolean correct = true;

        if (DNItext.getText().length() != 8) {
            id = "Invalid ID: 8 characters | ";
            correct = false;
        }
        if (passwordText.getText().length() <= 8) {
            pw = "Insecure password: Minimum 8 characters | ";
            correct = false;
        }
        if (!isNumeric(weightText.getText())) {
            weight = "Invalid weight | ";
            correct = false;
        }
        if (isNumeric(doctorText.getText())) {
            doctor = "Invalid Doctor | ";
            correct = false;
        }
        if (!isNumeric(heightText.getText())) {
            height = "Invalid Height | ";
            correct = false;
        }
        if (isNumeric(asthmaText.getText())) {
            asthmaT = "Invalid Asthma Type | ";
            correct = false;
        }
        if (!isInt(dobDay.getText()) || Integer.parseInt(dobDay.getText()) > comprobarDia(dobMonth.getText()) || Integer.parseInt(dobDay.getText()) <= 0) {
            day = "Invalid Day | ";
            correct = false;
        }
        if (!isInt(dobMonth.getText()) || Integer.parseInt(dobMonth.getText()) > 12 || Integer.parseInt(dobMonth.getText()) < 1) {
            month = "Invalid Month | ";
            correct = false;
        }
        if (!isInt(dobYear.getText()) || Integer.parseInt(dobYear.getText()) < 1900) {
            year = "Invalid Year | ";
            correct = false;
        }

        if (genderText.getText().endsWith("on")) {
            gender = "Choose a gender option | ";
            correct = false;
        }
        jLabel14.setText("<html><center>" + id + pw + weight + height + asthmaT + doctor + day + month + year + gender + "</center></html>");

        Fecha f = new Fecha(dobDay.getText(), dobMonth.getText(), dobYear.getText());
        if (correct) {

            try {

                Patient p = Patient.createPatient(DNItext.getText(), passwordText.getText(), nameText.getText(), surnameText.getText(), f, Float.parseFloat(weightText.getText()), Float.parseFloat(heightText.getText()), asthmaText.getText(), doctorText.getText(), genderText.getText());
                SharedInfo.getInstance().setPatient(p);
                Socket socket = new Socket("localhost", 9000);
                SharedInfo.getInstance().setSocket(socket);
                SharedInfo.getInstance().setOos(new ObjectOutputStream(socket.getOutputStream()));
                SharedInfo.getInstance().setOis(new ObjectInputStream(socket.getInputStream()));
                SharedInfo.getInstance().setIs(socket.getInputStream());
                this.setVisible(false);
                TeleAsthmaClient.socketClient(p);

            } catch (IllegalArgumentException e) {
                jLabel15.setText("<html><center> !!!Choose a gender option </center></html>");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Register.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        genderText.setText(combo.getSelectedItem().toString());
    }//GEN-LAST:event_comboActionPerformed

    private void dobDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobDayActionPerformed

    private void doctorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorTextActionPerformed

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void dobYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobYearActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register register = new Register();
                register.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNItext;
    private javax.swing.JTextField asthmaText;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField dobDay;
    private javax.swing.JTextField dobMonth;
    private javax.swing.JTextField dobYear;
    private javax.swing.JTextField doctorText;
    private javax.swing.JTextField genderText;
    private javax.swing.JTextField heightText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField surnameText;
    private javax.swing.JTextField weightText;
    // End of variables declaration//GEN-END:variables
}
