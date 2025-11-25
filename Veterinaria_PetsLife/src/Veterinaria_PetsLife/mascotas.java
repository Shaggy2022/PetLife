package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class mascotas extends javax.swing.JFrame {

    public mascotas() {
        initComponents();
        conexion conecta=new conexion();
        conecta.llenaCombo("dueño", "id_dueño", "nombre_dueño", list_dueño);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre_m = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        subir_vet = new javax.swing.JButton();
        nuevo_vet = new javax.swing.JButton();
        cerrar_vet = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        list_dueño = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        nombre_m.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Registro Mascotas");

        subir_vet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        subir_vet.setText("Guardar");
        subir_vet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subir_vetActionPerformed(evt);
            }
        });

        nuevo_vet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nuevo_vet.setText("Limpiar");
        nuevo_vet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_vetActionPerformed(evt);
            }
        });

        cerrar_vet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cerrar_vet.setText("Cerrar");
        cerrar_vet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_vetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Dueño:");

        list_dueño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione dueño" }));
        list_dueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_dueñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_dueño, 0, 302, Short.MAX_VALUE)
                            .addComponent(nombre_m)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(nuevo_vet)
                        .addGap(80, 80, 80)
                        .addComponent(subir_vet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar_vet)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(list_dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo_vet)
                    .addComponent(subir_vet)
                    .addComponent(cerrar_vet))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JTextField id;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField Dueño;
    
    private void cerrar_vetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_vetActionPerformed

        this.dispose();
    }//GEN-LAST:event_cerrar_vetActionPerformed

    private void subir_vetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_vetActionPerformed
            Statement st;
            conexion con = new conexion();
            Connection conexion = con.conectar();
            medicinas m= new medicinas();
            String dueSel = list_dueño.getSelectedItem().toString();

            // Extraer ID antes del " - "
            String idDue = dueSel.split(" - ")[0];
            String sql = "insert into mascotas(nombre,fk_dueño) values "
                    + "('"+nombre_m.getText()+"','"+idDue+"')";
            System.out.println(sql);
            try{
                st = conexion.createStatement();
                st.executeUpdate(sql);
                
            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error " +e.toString());
            }
            JOptionPane.showMessageDialog(null, "Mascota creada correctamente");
            principal os = new principal();
            os.mostrar("mascotas");
    }//GEN-LAST:event_subir_vetActionPerformed

    private void list_dueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_dueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_dueñoActionPerformed

    private void nuevo_vetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_vetActionPerformed
        // Limpiar combos y poner el primer elemento
        list_dueño.setSelectedIndex(0);

        // Limpiar campos de texto
        nombre_m.setText("");
    }//GEN-LAST:event_nuevo_vetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrar_vet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JComboBox<String> list_dueño;
    public javax.swing.JTextField nombre_m;
    public javax.swing.JButton nuevo_vet;
    public javax.swing.JButton subir_vet;
    // End of variables declaration//GEN-END:variables
}
