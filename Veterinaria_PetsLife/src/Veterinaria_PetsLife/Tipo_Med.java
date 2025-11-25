package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Tipo_Med extends javax.swing.JFrame {

    public Tipo_Med() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        link = new javax.swing.JLabel();
        label_na = new javax.swing.JLabel();
        nombre_d = new javax.swing.JTextField();
        nuevo_d = new javax.swing.JButton();
        subir_dueño = new javax.swing.JButton();
        cerrar_d = new javax.swing.JButton();
        label_na1 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        link.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        link.setText("Registro de tipos de medicamentos");
        link.setToolTipText("");

        label_na.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na.setText("Nombre:");

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

        label_na1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na1.setText("Precio:");

        precio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(link)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_na1)
                            .addComponent(label_na))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(nuevo_d)
                .addGap(29, 29, 29)
                .addComponent(subir_dueño)
                .addGap(37, 37, 37)
                .addComponent(cerrar_d)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(link)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_na)
                    .addComponent(nombre_d, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_na1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subir_dueño)
                    .addComponent(cerrar_d)
                    .addComponent(nuevo_d))
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_dActionPerformed

    private void subir_dueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_dueñoActionPerformed
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        String sql = "insert into tipo(nombre_tipo,precio) values "
        + "('"+nombre_d.getText()+"','"+precio.getText()+"')";
        System.out.println(sql);
        try{
            st = conexion.createStatement();
            st.executeUpdate(sql);

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        JOptionPane.showMessageDialog(null, "Tipo de Medicamento y/o Servicio creado correctamente");
        principal os = new principal();
        os.mostrar("Tipo_Med");
    }//GEN-LAST:event_subir_dueñoActionPerformed

    private void cerrar_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_dActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_dActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void nuevo_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_dActionPerformed
        // Limpiar campos de texto
        nombre_d.setText("");
        precio.setText("");
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
            java.util.logging.Logger.getLogger(Tipo_Med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tipo_Med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tipo_Med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipo_Med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tipo_Med().setVisible(true);
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
    public javax.swing.JTextField precio;
    public javax.swing.JButton subir_dueño;
    // End of variables declaration//GEN-END:variables
}
