/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.Control;
import control.IControl;

import javax.swing.JOptionPane;
/**
 * Frame de inicio del juego.
 * @author Equipo1
 */
public class FInicio extends javax.swing.JFrame {

    private IControl control;

    /**
     * Creates new form Inicio
     */
    public FInicio() {
        initComponents();
        this.control = Control.getControl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        JButtonCrear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(610, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(610, 400));
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        titulo.setText("          Patiolli");
        getContentPane().add(titulo);
        titulo.setBounds(30, -10, 500, 70);

        jButtonEntrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(20, 200, 100, 50);

        JButtonCrear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        JButtonCrear.setText("Crear");
        JButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonCrear);
        JButtonCrear.setBounds(450, 210, 100, 50);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 0, 310, 400);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCrearActionPerformed
        // TODO add your handling code here:
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FCrearPartida().setVisible(true);
            }
        });
    }//GEN-LAST:event_JButtonCrearActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        this.recuperarPartidas();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(FInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInicio().setVisible(true);
            }
        });
    }

    //Metodo que valida si una partida a sido establecida o creada.
    //Con el fin de realizar una adecuada simulacion
    public void recuperarPartidas() {
        if (this.control.validarCreacion()) {
            this.mostrarMensajeError("No hay partidas creadas por el momento");
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new FUnirse().setVisible(true);
                }
            });
        }

    }
//Metodo que muestra mensaje de error. 

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    //Metodo que muestra la pantalla de unirse.
    public void mostrarPantallaUnirse() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUnirse().setVisible(true);
            }
        });
        setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCrear;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
