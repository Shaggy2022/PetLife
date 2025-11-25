package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dueños extends javax.swing.JFrame {

    public dueños() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_d = new javax.swing.JTextField();
        label_na = new javax.swing.JLabel();
        telefono_d = new javax.swing.JTextField();
        label_na1 = new javax.swing.JLabel();
        label_na2 = new javax.swing.JLabel();
        direccion_d = new javax.swing.JTextField();
        link = new javax.swing.JLabel();
        subir_dueño = new javax.swing.JButton();
        nuevo_d = new javax.swing.JButton();
        cerrar_d = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre_d.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_dActionPerformed(evt);
            }
        });

        label_na.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na.setText("Nombre:");

        telefono_d.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telefono_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_dActionPerformed(evt);
            }
        });

        label_na1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na1.setText("Teléfono:");

        label_na2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_na2.setText("Dirección:");

        direccion_d.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        direccion_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_dActionPerformed(evt);
            }
        });

        link.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        link.setText("Registro de dueños");
        link.setToolTipText("");

        subir_dueño.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        subir_dueño.setText("Guardar");
        subir_dueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subir_dueñoActionPerformed(evt);
            }
        });

        nuevo_d.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nuevo_d.setText("Limpiar");
        nuevo_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_dActionPerformed(evt);
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
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo_d)
                        .addGap(43, 43, 43)
                        .addComponent(subir_dueño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar_d))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_na2)
                        .addGap(46, 46, 46)
                        .addComponent(direccion_d))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_na)
                            .addComponent(label_na1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(link)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono_d)
                                    .addComponent(nombre_d))))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(link)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_d, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_na))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono_d, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_na1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion_d, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_na2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subir_dueño)
                    .addComponent(nuevo_d)
                    .addComponent(cerrar_d))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JTextField id_dueño;
    public javax.swing.JTextField nombre_dueño;
    public javax.swing.JTextField telefono;
    public javax.swing.JTextField direccion;
    
    private void nombre_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_dActionPerformed

    private void telefono_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_dActionPerformed

    private void direccion_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_dActionPerformed

    private void cerrar_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_dActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_dActionPerformed

    private void subir_dueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_dueñoActionPerformed
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        String sql = "insert into dueño(nombre_dueño,telefono,direccion) values "
        + "('"+nombre_d.getText()+"','"+telefono_d.getText()+"','"+direccion_d.getText()+"')";
        System.out.println(sql);
        try{
            st = conexion.createStatement();
            st.executeUpdate(sql);
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        JOptionPane.showMessageDialog(null, "Dueño creado correctamente");
        principal os = new principal();
        os.mostrar("dueños");
    }//GEN-LAST:event_subir_dueñoActionPerformed

    private void nuevo_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_dActionPerformed
        // Limpiar campos de texto
        nombre_d.setText("");
        telefono_d.setText("");
        direccion_d.setText("");
    }//GEN-LAST:event_nuevo_dActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dueños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrar_d;
    public javax.swing.JTextField direccion_d;
    private javax.swing.JLabel label_na;
    private javax.swing.JLabel label_na1;
    private javax.swing.JLabel label_na2;
    private javax.swing.JLabel link;
    public javax.swing.JTextField nombre_d;
    public javax.swing.JButton nuevo_d;
    public javax.swing.JButton subir_dueño;
    public javax.swing.JTextField telefono_d;
    // End of variables declaration//GEN-END:variables
}
