package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class medicinas extends javax.swing.JFrame {

    public medicinas() {
        initComponents();
        conexion con = new conexion();
        con.llenaCombo("tipo", "id_tipo", "nombre_tipo", list_tipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre_med = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        list_tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        subir = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        cerrar_med = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        nombre_med.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_medActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        list_tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        list_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo" }));
        list_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_tipoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Registro de Medicamentos y/o Servicios");

        subir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        subir.setText("Guardar");
        subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirActionPerformed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nuevo.setText("Limpiar");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        cerrar_med.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cerrar_med.setText("Cerrar");
        cerrar_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_medActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addGap(46, 46, 46)
                        .addComponent(subir)
                        .addGap(48, 48, 48)
                        .addComponent(cerrar_med))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(list_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(subir)
                    .addComponent(cerrar_med))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_medActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrar_medActionPerformed

    private void list_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_tipoActionPerformed

    private void subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirActionPerformed
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
                mascotas m= new mascotas();
                String tipo = list_tipo.getSelectedItem().toString();
                String idTipo = tipo.split(" - ")[0];   // <-- SOLO EL ID
                String sql = "insert into medicinas(nombre_medicina,fk_tipo) values "
                        + "('"+nombre_med.getText()+"','"+idTipo+"')";
                System.out.println(sql);
        try{
            st = conexion.createStatement();
            st.executeUpdate(sql);
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        JOptionPane.showMessageDialog(null, "Medicina creada correctamente");
        principal os = new principal();
        os.mostrar("dueños");
    }//GEN-LAST:event_subirActionPerformed

    private void nombre_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_medActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // Limpiar combos y poner el primer elemento
        list_tipo.setSelectedIndex(0);

        // Limpiar campos de texto
        nombre_med.setText("");
    }//GEN-LAST:event_nuevoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrar_med;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JComboBox<String> list_tipo;
    public javax.swing.JTextField nombre_med;
    public javax.swing.JButton nuevo;
    public javax.swing.JButton subir;
    // End of variables declaration//GEN-END:variables
}
