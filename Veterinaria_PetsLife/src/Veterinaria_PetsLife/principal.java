package veterinaria_petslife;

import com.mysql.jdbc.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }

    public void mostrar(String tabla) {
        String sql = "select * from " + tabla;
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
        model.addColumn("Mascota");
        visor.setModel(model);
        
        String [] datos = new String[5];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error" + e.toString());
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        dueños = new javax.swing.JButton();
        mascotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        dueños.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dueños.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Img\\adoption.png")); // NOI18N
        dueños.setText("Dueños");
        dueños.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dueños.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dueños.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dueños.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dueños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueñosActionPerformed(evt);
            }
        });

        mascotas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mascotas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Img\\perro.png")); // NOI18N
        mascotas.setText("Mascotas");
        mascotas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mascotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mascotas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mascotas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dueños)
                        .addGap(34, 34, 34)
                        .addComponent(mascotas))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dueños)
                    .addComponent(mascotas))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueñosActionPerformed
        mostrar("dueño");
    }//GEN-LAST:event_dueñosActionPerformed

    private void mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasActionPerformed
        mostrar("mascotas");
    }//GEN-LAST:event_mascotasActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton dueños;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton mascotas;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
