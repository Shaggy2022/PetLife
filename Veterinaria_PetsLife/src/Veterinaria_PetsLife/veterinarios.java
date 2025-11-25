package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.*;

public class veterinarios extends javax.swing.JFrame {

    public veterinarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        link = new javax.swing.JLabel();
        label_na = new javax.swing.JLabel();
        label_na1 = new javax.swing.JLabel();
        telefono_d = new javax.swing.JTextField();
        nombre_d = new javax.swing.JTextField();
        nuevo_d = new javax.swing.JButton();
        subir_dueño = new javax.swing.JButton();
        cerrar_d = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        link.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        link.setText("Registro de veterinarios");
        link.setToolTipText("");

        label_na.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na.setText("Nombre:");

        label_na1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na1.setText("Teléfono:");

        telefono_d.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telefono_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_dActionPerformed(evt);
            }
        });

        nombre_d.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_dActionPerformed(evt);
            }
        });

        nuevo_d.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nuevo_d.setText("Limpiar");
        nuevo_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_dActionPerformed(evt);
            }
        });

        subir_dueño.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        subir_dueño.setText("Guardar");
        subir_dueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subir_dueñoActionPerformed(evt);
            }
        });

        cerrar_d.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cerrar_d.setText("Cerrar");
        cerrar_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_dActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(nuevo_d)
                .addGap(29, 29, 29)
                .addComponent(subir_dueño)
                .addGap(30, 30, 30)
                .addComponent(cerrar_d)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(link)
                .addGap(87, 87, 87))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(label_na1)
                            .addGap(52, 52, 52))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label_na)
                            .addGap(37, 37, 37)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombre_d)
                        .addComponent(telefono_d, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(85, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(link)
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo_d)
                    .addComponent(subir_dueño)
                    .addComponent(cerrar_d))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombre_d, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_na))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefono_d, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_na1))
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean modoEditar = false;
    public JTextField id_v = new JTextField();
    
    private void telefono_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_dActionPerformed

    private void nombre_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_dActionPerformed

    private void subir_dueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_dueñoActionPerformed
        Statement st;
        conexion con = new conexion();
        Connection cn = con.conectar();
        String sql = "INSERT INTO veterinario(nombre_vet, telefono) values "
        + "('"+nombre_d.getText()+"','"+telefono_d.getText()+"')";
        try {
            st = cn.createStatement();
            st.executeUpdate(sql);
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Veterinario creado correctamente");
        principal os = new principal();
        os.mostrar("veterinarios");
    }//GEN-LAST:event_subir_dueñoActionPerformed

    private void cerrar_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_dActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_dActionPerformed

    private void nuevo_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_dActionPerformed
        // Limpiar campos de texto
        nombre_d.setText("");
        telefono_d.setText("");
    }//GEN-LAST:event_nuevo_dActionPerformed

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
            java.util.logging.Logger.getLogger(veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new veterinarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrar_d;
    private javax.swing.JLabel label_na;
    private javax.swing.JLabel label_na1;
    private javax.swing.JLabel link;
    public javax.swing.JTextField nombre_d;
    public javax.swing.JButton nuevo_d;
    public javax.swing.JButton subir_dueño;
    public javax.swing.JTextField telefono_d;
    // End of variables declaration//GEN-END:variables
}
