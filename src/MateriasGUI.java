
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class MateriasGUI extends javax.swing.JFrame {

    /**
     * Creates new form MateriasGUI
     */
    public MateriasGUI() {
        initComponents();
        this.setResizable(false);
         //Codigo para poner imagen de fondo
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/FondoMaterias.png"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupS1 = new javax.swing.ButtonGroup();
        buttonGroupS2 = new javax.swing.ButtonGroup();
        buttonGroupS3 = new javax.swing.ButtonGroup();
        Button_CD = new javax.swing.JButton();
        Button_FdP = new javax.swing.JButton();
        Button_TdE = new javax.swing.JButton();
        Button_MD = new javax.swing.JButton();
        Button_TdA = new javax.swing.JButton();
        Button_AL = new javax.swing.JButton();
        Button_Q = new javax.swing.JButton();
        Button_CF = new javax.swing.JButton();
        Button_POaO = new javax.swing.JButton();
        Button_CI = new javax.swing.JButton();
        Button_SO = new javax.swing.JButton();
        Button_IdO = new javax.swing.JButton();
        Button_CE = new javax.swing.JButton();
        Button_EdD = new javax.swing.JButton();
        Button_CV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Label_Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Label_Semestre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Label_Promedio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Button_CD.setText("CALCULO DIFERENCIAL");
        buttonGroupS1.add(Button_CD);

        Button_FdP.setText("FUNDAMENTOS DE PROGRAMACION");
        buttonGroupS1.add(Button_FdP);
        Button_FdP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FdPActionPerformed(evt);
            }
        });

        Button_TdE.setText("TALLER DE ETICA");
        buttonGroupS1.add(Button_TdE);
        Button_TdE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TdEActionPerformed(evt);
            }
        });

        Button_MD.setText("MATEMATICAS DISCRETAS");
        buttonGroupS1.add(Button_MD);
        Button_MD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MDActionPerformed(evt);
            }
        });

        Button_TdA.setText("TALLER DE ADMINISTRACION");
        buttonGroupS1.add(Button_TdA);
        Button_TdA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TdAActionPerformed(evt);
            }
        });

        Button_AL.setText("ALGEBRA LINEAL");
        buttonGroupS2.add(Button_AL);
        Button_AL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ALActionPerformed(evt);
            }
        });

        Button_Q.setText("QUIMICA");
        buttonGroupS2.add(Button_Q);
        Button_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_QActionPerformed(evt);
            }
        });

        Button_CF.setText("CONTABILIDAD FINANCIERA");
        buttonGroupS2.add(Button_CF);
        Button_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CFActionPerformed(evt);
            }
        });

        Button_POaO.setText("PROGRAMACION ORIENTADA A OBJETOS");
        buttonGroupS2.add(Button_POaO);
        Button_POaO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_POaOActionPerformed(evt);
            }
        });

        Button_CI.setText("CALCULO INTEGRAL");
        buttonGroupS2.add(Button_CI);

        Button_SO.setText("SISTEMAS OPERATIVOS");
        buttonGroupS3.add(Button_SO);
        Button_SO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SOActionPerformed(evt);
            }
        });

        Button_IdO.setText("INVESTIGACION DE OPERACIONES");
        buttonGroupS3.add(Button_IdO);
        Button_IdO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_IdOActionPerformed(evt);
            }
        });

        Button_CE.setText("CULTURA EMPRESARIAL");
        buttonGroupS3.add(Button_CE);
        Button_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CEActionPerformed(evt);
            }
        });

        Button_EdD.setText("ESTRUCTURA DE DATOS");
        buttonGroupS3.add(Button_EdD);
        Button_EdD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EdDActionPerformed(evt);
            }
        });

        Button_CV.setText("CALCULO VECTORIAL");
        buttonGroupS3.add(Button_CV);

        jLabel1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        Label_Nombre.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        Label_Nombre.setText("Nombre:");
        Label_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel3.setText("Periodo");

        Label_Semestre.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        Label_Semestre.setText("Periodo");
        Label_Semestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel5.setText("Promedio");

        Label_Promedio.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        Label_Promedio.setText("Promedio");
        Label_Promedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(Label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Label_Semestre)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Label_Promedio)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_CD, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_FdP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_TdE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_MD, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_TdA, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_CI, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_POaO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_AL, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_CV, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_EdD, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_IdO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_SO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Label_Nombre)
                    .addComponent(jLabel3)
                    .addComponent(Label_Semestre)
                    .addComponent(jLabel5)
                    .addComponent(Label_Promedio))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_CD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_FdP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_POaO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EdD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_TdE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_MD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_IdO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_TdA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_AL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_SO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_FdPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FdPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_FdPActionPerformed

    private void Button_TdEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TdEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_TdEActionPerformed

    private void Button_MDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_MDActionPerformed

    private void Button_TdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TdAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_TdAActionPerformed

    private void Button_ALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ALActionPerformed

    private void Button_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_QActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_QActionPerformed

    private void Button_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_CFActionPerformed

    private void Button_POaOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_POaOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_POaOActionPerformed

    private void Button_SOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SOActionPerformed

    private void Button_IdOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_IdOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_IdOActionPerformed

    private void Button_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_CEActionPerformed

    private void Button_EdDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EdDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_EdDActionPerformed

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
            java.util.logging.Logger.getLogger(MateriasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MateriasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MateriasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MateriasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MateriasGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_AL;
    private javax.swing.JButton Button_CD;
    private javax.swing.JButton Button_CE;
    private javax.swing.JButton Button_CF;
    private javax.swing.JButton Button_CI;
    private javax.swing.JButton Button_CV;
    private javax.swing.JButton Button_EdD;
    private javax.swing.JButton Button_FdP;
    private javax.swing.JButton Button_IdO;
    private javax.swing.JButton Button_MD;
    private javax.swing.JButton Button_POaO;
    private javax.swing.JButton Button_Q;
    private javax.swing.JButton Button_SO;
    private javax.swing.JButton Button_TdA;
    private javax.swing.JButton Button_TdE;
    public static javax.swing.JLabel Label_Nombre;
    public static javax.swing.JLabel Label_Promedio;
    public static javax.swing.JLabel Label_Semestre;
    private javax.swing.ButtonGroup buttonGroupS1;
    private javax.swing.ButtonGroup buttonGroupS2;
    private javax.swing.ButtonGroup buttonGroupS3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
