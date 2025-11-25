package veterinaria_petslife;

import javax.swing.*;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Citas extends javax.swing.JFrame {

    // Variables para cálculos
    ArrayList<Object[]> detalles = new ArrayList<>();
    double totalGeneral = 0;

    public Citas() {
        initComponents();

        cant_medicina = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        agregar_medicina = new javax.swing.JButton("Agregar");
        tabla_detalle = new javax.swing.JTable();
        tabla_detalle.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Medicina/Servicio", "Cantidad", "Precio", "Subtotal"}
        ));

        JScrollPane scroll = new JScrollPane(tabla_detalle);

        totalLabel = new JLabel("Total: $0.00");

        conexion con = new conexion();
        con.llenaCombo("mascotas", "id", "nombre", list_mascotas);
        con.llenaCombo("dueño", "id_dueño", "nombre_dueño", list_dueño);
        con.llenaCombo("veterinario", "id_v", "nombre_vet", list_veterinario);
        con.llenaCombo("medicinas", "id_medicina", "nombre_medicina", list_medicina);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        link = new javax.swing.JLabel();
        nuevo_d = new javax.swing.JButton();
        subir_dueño = new javax.swing.JButton();
        cerrar_d = new javax.swing.JButton();
        link1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        list_veterinario = new javax.swing.JComboBox<>();
        list_dueño = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextArea();
        list_mascotas = new javax.swing.JComboBox<>();
        fecha = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        list_medicina = new javax.swing.JComboBox<>();

        link.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        link.setText("Registro de tipos de medicamentos");
        link.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        link1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        link1.setText("Registro de Citas");
        link1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Veterinario:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Dueño:");

        list_veterinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione veterinario" }));
        list_veterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_veterinarioActionPerformed(evt);
            }
        });

        list_dueño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione dueño" }));
        list_dueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_dueñoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Mascota:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Fecha (AAAA-MM-DD):");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Hora (HH:MM:SS):");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Descripción:");

        descrip.setColumns(20);
        descrip.setRows(5);
        jScrollPane1.setViewportView(descrip);

        list_mascotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione mascota" }));
        list_mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_mascotasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Servicio o Medicina:");

        list_medicina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Medicina o Servicio" }));
        list_medicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_medicinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(link1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(nuevo_d)
                    .addComponent(jLabel10))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(subir_dueño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar_d)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(list_veterinario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_dueño, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list_mascotas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hora)
                            .addComponent(list_medicina, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(link1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(list_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(list_dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(list_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(list_medicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo_d)
                    .addComponent(subir_dueño)
                    .addComponent(cerrar_d))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subir_dueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subir_dueñoActionPerformed
        //VALIDAR HORARIO ABIERTO
        if (!validarHorario()) {
            return;
        }

        conexion con = new conexion();
        Connection conexion = con.conectar();

        String masSel = list_mascotas.getSelectedItem().toString();
        String dueSel = list_dueño.getSelectedItem().toString();
        String vetSel = list_veterinario.getSelectedItem().toString();
        String seleccion = list_medicina.getSelectedItem().toString();

        // Extraer ID antes del " - "
        String idMascota = masSel.split(" - ")[0];
        String idDueño = dueSel.split(" - ")[0];
        String idVet = vetSel.split(" - ")[0];
        String idMedic = seleccion.split(" - ")[0];
        String nombreMedicina = seleccion.split(" - ")[1];

        int cantidad = (int) cant_medicina.getValue();

        try {

            //Obtener fk_tipo desde la tabla medicinas
            String sqlTipo = "SELECT fk_tipo, nombre_medicina FROM medicinas WHERE id_medicina=?";
            PreparedStatement psTipo = conexion.prepareStatement(sqlTipo);
            psTipo.setString(1, idMedic);
            ResultSet rsTipo = psTipo.executeQuery();

            double precio = 0;
            if (rsTipo.next()) {

                String idTipo = rsTipo.getString("fk_tipo");

                //Obtener precio desde tipo
                String sqlPrecio = "SELECT precio FROM tipo WHERE id_tipo=?";
                PreparedStatement psPrecio = conexion.prepareStatement(sqlPrecio);
                psPrecio.setString(1, idTipo);
                ResultSet rsPrecio = psPrecio.executeQuery();

                if (rsPrecio.next()) {
                    precio = rsPrecio.getDouble("precio");
                }
            }
            double subtotal = precio * cantidad;
            totalGeneral += subtotal;

            detalles.add(new Object[]{idMedic, nombreMedicina, cantidad, precio, subtotal});
            totalLabel.setText("Total: $" + totalGeneral);

            //VALIDAR QUE NO HAYA OTRA CITA EN ESE HORARIO
            String sqlCheck = "SELECT * FROM citas WHERE fecha=? AND hora=? AND fk_veterinario=? AND fk_mascota<>?";
            PreparedStatement pstCheck = conexion.prepareStatement(sqlCheck);
            pstCheck.setString(1, fecha.getText());
            pstCheck.setString(2, hora.getText());
            pstCheck.setString(3, idVet);
            pstCheck.setString(4, idMascota);

            ResultSet rs = pstCheck.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null,
                        "El veterinario YA TIENE una cita en ese horario.");
                return;
            }

            // Actualiza la tabla y total
            DefaultTableModel model = (DefaultTableModel) tabla_detalle.getModel();
            model.setRowCount(0);
            for (Object[] det : detalles) {
                model.addRow(new Object[]{det[1], det[2], det[3], det[4]});
            }

            // Mostrar total acumulado
            totalLabel.setText("Total: $" + totalGeneral);

            // GUARDAR LA CITA
            //Ver si ya existe una cita para esta mascota, fecha, hora y veterinario
            String sqlCheckMascot = "SELECT id_cita, Total FROM citas WHERE fk_mascota=? AND fecha=? AND hora=? AND fk_veterinario=?";
            PreparedStatement pstCheckMascot = conexion.prepareStatement(sqlCheckMascot);
            pstCheckMascot.setString(1, idMascota);
            pstCheckMascot.setString(2, fecha.getText());
            pstCheckMascot.setString(3, hora.getText());
            pstCheckMascot.setString(4, idVet);

            ResultSet rsCheck = pstCheck.executeQuery();

            int idCita;
            double totalExistente = 0;

            if (rsCheck.next()) {
                // La cita ya existe: usamos el ID y sumamos al total
                idCita = rsCheck.getInt("id_cita");
                totalExistente = rsCheck.getDouble("Total");
            } else {
                // La cita no existe: insertamos nueva
                String sql = "INSERT INTO citas(fk_mascota,fk_dueño,fecha,hora,fk_veterinario,fk_medicinas,descripcion,Total)"
                        + " VALUES (?,?,?,?,?,?,?,?)";

                PreparedStatement pst = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setString(1, idMascota);
                pst.setString(2, idDueño);
                pst.setString(3, fecha.getText());
                pst.setString(4, hora.getText());
                pst.setString(5, idVet);
                pst.setString(6, idMedic);
                pst.setString(7, descrip.getText());
                pst.setDouble(8, 0);
                pst.executeUpdate();

                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idCita = generatedKeys.getInt(1);
                } else {
                    throw new SQLException("No se pudo obtener el ID de la cita.");
                }
            }

            // --- Guardar detalles ---
            for (Object[] det : detalles) {
                String idMedicDet = (String) det[0];
                int cantDet = (int) det[2];
                double precioDet = (double) det[3];
                double subDet = (double) det[4];

                // Validar que no exista ya este servicio para la misma cita
                String sqlDetCheck = "SELECT * FROM detalle_cita WHERE fk_cita=? AND fk_medicina=?";
                PreparedStatement pstDetCheck = conexion.prepareStatement(sqlDetCheck);
                pstDetCheck.setInt(1, idCita);
                pstDetCheck.setString(2, idMedicDet);
                ResultSet rsDetCheck = pstDetCheck.executeQuery();

                if (!rsDetCheck.next()) { // si no existe, insertar
                    String sqlDetalle = "INSERT INTO detalle_cita(fk_cita,fk_medicina,cantidad,precio,subtotal) VALUES (?,?,?,?,?)";
                    PreparedStatement pstDetalle = conexion.prepareStatement(sqlDetalle);
                    pstDetalle.setInt(1, idCita);
                    pstDetalle.setString(2, idMedicDet);
                    pstDetalle.setInt(3, cantDet);
                    pstDetalle.setDouble(4, precioDet);
                    pstDetalle.setDouble(5, subDet);
                    pstDetalle.executeUpdate();

                    totalExistente += subDet; //Sumar al total
                }
            }

            // **Actualizar el total en la base de datos**
            String sqlUpdateTotal = "UPDATE citas SET Total=? WHERE id=?";
            PreparedStatement pstUpdateTotal = conexion.prepareStatement(sqlUpdateTotal);
            pstUpdateTotal.setDouble(1, totalExistente);
            pstUpdateTotal.setInt(2, idCita);
            pstUpdateTotal.executeUpdate();

            // **Actualizar el total en pantalla**
            totalLabel.setText("Total: $" + totalExistente);

            JOptionPane.showMessageDialog(null, "Cita agendada correctamente!");
            detalles.clear();
            totalGeneral = 0;
            totalLabel.setText("Total: $0.00");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_subir_dueñoActionPerformed

    private void cerrar_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_dActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_dActionPerformed

    private void list_veterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_veterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_veterinarioActionPerformed

    private void list_dueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_dueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_dueñoActionPerformed

    private void list_mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_mascotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_mascotasActionPerformed

    private void list_medicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_medicinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_medicinaActionPerformed

    private void nuevo_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_dActionPerformed
        // Limpiar combos y poner el primer elemento
        list_mascotas.setSelectedIndex(0);
        list_dueño.setSelectedIndex(0);
        list_veterinario.setSelectedIndex(0);
        list_medicina.setSelectedIndex(0);

        // Limpiar campos de texto
        fecha.setText("");
        hora.setText("");
        descrip.setText("");

        // Limpiar detalles acumulados
        detalles.clear();
        totalGeneral = 0;

        // Limpiar tabla
        DefaultTableModel model = (DefaultTableModel) tabla_detalle.getModel();
        model.setRowCount(0);

        // Reiniciar total
        totalLabel.setText("Total: $0.00");
    }//GEN-LAST:event_nuevo_dActionPerformed

    private boolean validarHorario() {
        try {
            String horaIngresada = hora.getText();

            // Formato HH:MM:SS
            java.time.LocalTime h = java.time.LocalTime.parse(horaIngresada);

            java.time.LocalTime apertura = java.time.LocalTime.parse("08:00:00");
            java.time.LocalTime cierre = java.time.LocalTime.parse("17:00:00");

            if (h.isBefore(apertura)) {
                JOptionPane.showMessageDialog(null,
                        "La veterinaria abre a las 8:00 AM.");
                return false;
            }

            if (h.isAfter(cierre)) {
                JOptionPane.showMessageDialog(null,
                        "La veterinaria cierra a las 5:00 PM.");
                return false;
            }

            return true; // horario válido

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Formato de hora inválido. Ejemplo: 09:30:00");
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrar_d;
    private javax.swing.JTextArea descrip;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel link;
    private javax.swing.JLabel link1;
    public javax.swing.JComboBox<String> list_dueño;
    public javax.swing.JComboBox<String> list_mascotas;
    public javax.swing.JComboBox<String> list_medicina;
    public javax.swing.JComboBox<String> list_veterinario;
    public javax.swing.JButton nuevo_d;
    public javax.swing.JButton subir_dueño;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JSpinner cant_medicina;
    private javax.swing.JButton agregar_medicina;
    private javax.swing.JTable tabla_detalle;
    private javax.swing.JLabel totalLabel;
}
