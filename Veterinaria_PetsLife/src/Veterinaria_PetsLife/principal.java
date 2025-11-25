package veterinaria_petslife;

import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class principal extends javax.swing.JFrame {

    //Variable para controlar los forms //Es global
    public int presionado = 0;
    private JComboBox<String> list_tablas = new JComboBox<>();
    private int idCita;

    public class PanelConFondo extends JPanel {

        private Image imagen;

        // Constructor recibe la ruta de la imagen
        public PanelConFondo(String rutaImagen) {
            this.imagen = new ImageIcon(rutaImagen).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Dibuja la imagen en todo el panel
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public principal() {
        // Crea el panel con la imagen
        PanelConFondo panelFondo = new PanelConFondo("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Img\\Fondo.png");

        // Configura el panel como content pane
        this.setContentPane(panelFondo);

        initComponents();
        conexion os = new conexion();
        os.llenarTablas(list_tablas);
        visor.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        visor.setRowSelectionAllowed(true);
        visor.setColumnSelectionAllowed(false); // selecciona solo filas

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        dueños = new javax.swing.JButton();
        mascotas = new javax.swing.JButton();
        medicinas = new javax.swing.JButton();
        veterinario = new javax.swing.JButton();
        tipo = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        recibo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cerrar_principal = new javax.swing.JButton();
        Citas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        visor.setBackground(new java.awt.Color(255, 255, 255));
        visor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        visor.setColumnSelectionAllowed(true);
        visor.setGridColor(new java.awt.Color(0, 0, 0));
        visor.setSelectionForeground(new java.awt.Color(255, 255, 255));
        visor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        visor.setShowGrid(true);
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

        medicinas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        medicinas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Img\\medicina.png")); // NOI18N
        medicinas.setText("Medicinas y Servicios");
        medicinas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        medicinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        medicinas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        medicinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        medicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinasActionPerformed(evt);
            }
        });

        veterinario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        veterinario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Img\\veterinario.png")); // NOI18N
        veterinario.setText("Veterinarios");
        veterinario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        veterinario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        veterinario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        veterinario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        veterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veterinarioActionPerformed(evt);
            }
        });

        tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Img\\donacion-de-sangre.png")); // NOI18N
        tipo.setText("Tipos de Medicamento y Productos");
        tipo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tipo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        tipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        insertar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\StockMaster\\src\\Img\\nuevo.png")); // NOI18N
        insertar.setText("Agregar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\StockMaster\\src\\Img\\eliminar.png")); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        recibo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valerin\\Documents\\NetBeansProjects\\StockMaster\\src\\Img\\pdf.png")); // NOI18N
        recibo.setText("Ticket");
        recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Registros");

        cerrar_principal.setText("Cerrar Sesión");
        cerrar_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_principalActionPerformed(evt);
            }
        });

        Citas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Citas.png"))); // NOI18N
        Citas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dueños)
                        .addGap(27, 27, 27)
                        .addComponent(mascotas)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(medicinas)
                                .addGap(28, 28, 28)
                                .addComponent(veterinario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85)))
                        .addGap(33, 33, 33)
                        .addComponent(tipo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Citas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar_principal)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(175, Short.MAX_VALUE)
                        .addComponent(Citas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dueños, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(veterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(cerrar_principal)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar(String tabla) {
        String sql = "SELECT * FROM " + tabla;
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();

        DefaultTableModel model = new DefaultTableModel();
        switch (tabla) {
            case "dueño":
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Telefono");
                model.addColumn("Dirección");
                visor.setModel(model);

                String[] datos = new String[4];
                try {
                    st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        datos[0] = rs.getString(1);
                        datos[1] = rs.getString(2);
                        datos[2] = rs.getString(3);
                        datos[3] = rs.getString(4);
                        model.addRow(datos);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            case "mascotas":
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Dueño");

                visor.setModel(model);

                String sqlmascotas = "SELECT "
                        + "mascotas.id AS ID, "
                        + "mascotas.nombre AS Mascota, "
                        + "dueño.nombre_dueño AS Dueno "
                        + "FROM mascotas "
                        + "JOIN dueño ON mascotas.fk_dueño = dueño.id_dueño";

                String[] dato = new String[3];
                try {
                    st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sqlmascotas);
                    while (rs.next()) {
                        dato[0] = rs.getString(1);
                        dato[1] = rs.getString(2);
                        dato[2] = rs.getString(3);
                        model.addRow(dato);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            case "medicinas":
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Tipo");
                visor.setModel(model);

                String sqlMedicinas
                        = "SELECT "
                        + "medicinas.id_medicina AS ID, "
                        + "medicinas.nombre_medicina AS Medicina, "
                        + "tipo.nombre_tipo AS Tipo "
                        + "FROM medicinas "
                        + "JOIN tipo ON medicinas.fk_tipo = tipo.id_tipo";

                String[] med = new String[3];
                try {
                    st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sqlMedicinas);
                    while (rs.next()) {
                        med[0] = rs.getString(1);
                        med[1] = rs.getString(2);
                        med[2] = rs.getString(3);
                        model.addRow(med);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            case "tipo":
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Precio");
                visor.setModel(model);

                String[] tipo = new String[3];
                try {
                    st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        tipo[0] = rs.getString(1);
                        tipo[1] = rs.getString(2);
                        tipo[2] = rs.getString(3);
                        model.addRow(tipo);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            case "veterinario":
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Teléfono");
                visor.setModel(model);

                String[] vet = new String[3];
                try {
                    st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        vet[0] = rs.getString(1);
                        vet[1] = rs.getString(2);
                        vet[2] = rs.getString(3);
                        model.addRow(vet);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            case "Citas":
                model.addColumn("ID");
                model.addColumn("Mascota");
                model.addColumn("Dueño");
                model.addColumn("Fecha");
                model.addColumn("Hora");
                model.addColumn("Veterinario");
                model.addColumn("Motivo");
                model.addColumn("Descripción");
                model.addColumn("Total");
                visor.setModel(model);

                String sqlCitas
                        = "SELECT "
                        + "citas.id AS ID, "
                        + "mascotas.nombre AS Mascota, "
                        + "dueño.nombre_dueño AS Dueno, "
                        + "citas.fecha AS Fecha, "
                        + "citas.hora AS Hora, "
                        + "veterinario.nombre_vet AS Veterinario, "
                        + "medicinas.nombre_medicina AS Motivo, "
                        + "citas.descripcion AS Descripcion, "
                        + "citas.Total AS Total "
                        + "FROM citas "
                        + "JOIN mascotas ON citas.fk_mascota = mascotas.id "
                        + "JOIN dueño ON citas.fk_dueño = dueño.id_dueño "
                        + "JOIN veterinario ON citas.fk_veterinario = veterinario.id_v "
                        + "JOIN medicinas ON citas.fk_medicinas = medicinas.id_medicina";

                String[] citas = new String[9];
                try {
                    st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sqlCitas);
                    while (rs.next()) {
                        citas[0] = rs.getString(1);
                        citas[1] = rs.getString(2);
                        citas[2] = rs.getString(3);
                        citas[3] = rs.getString(4);
                        citas[4] = rs.getString(5);
                        citas[5] = rs.getString(6);
                        citas[6] = rs.getString(7);
                        citas[7] = rs.getString(8);
                        citas[8] = rs.getString(9);
                        model.addRow(citas);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    private void dueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueñosActionPerformed
        mostrar("dueño");
        presionado = 1;
    }//GEN-LAST:event_dueñosActionPerformed

    private void mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasActionPerformed
        mostrar("mascotas");
        presionado = 2;
    }//GEN-LAST:event_mascotasActionPerformed

    private void medicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinasActionPerformed
        mostrar("medicinas");
        presionado = 3;
    }//GEN-LAST:event_medicinasActionPerformed

    private void veterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veterinarioActionPerformed
        mostrar("veterinario");
        presionado = 4;
    }//GEN-LAST:event_veterinarioActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        mostrar("tipo");
        presionado = 5;
    }//GEN-LAST:event_tipoActionPerformed

    //Método para eliminar datos
    public void eliminar(String tabla, String columna, String valor) {
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        //select * from tipo where nombre_tipo = 'pupi'
        String sql = "delete from " + tabla + " where " + columna + " = '" + valor + "'";
        System.out.println(sql);
        try {
            st = conexion.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
        JOptionPane.showMessageDialog(null, "Borrado con éxito");
        mostrar(tabla);
    }

    //Método para actualizar
    public void actualizarDato(String tabla, String columna, String valor) {
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        //select * from tipo where nombre_tipo = 'pupi'
        String sql = "update from " + tabla + " where " + columna + " = '" + valor + "'";
        System.out.println(sql);
        try {
            st = conexion.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
        JOptionPane.showMessageDialog(null, "Datos Actualizados");
        mostrar(tabla);
    }

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        // TODO add your handling code here:
        switch (presionado) {
            case 1:
                //Objeto del formulario dueños
                dueños ob = new dueños();
                ob.setVisible(true);
                break;
            case 2:
                mascotas mascota = new mascotas();
                mascota.setVisible(true);
                break;
            case 3:
                medicinas medicina = new medicinas();
                medicina.setVisible(true);
                break;
            case 4:
                veterinarios veterinario = new veterinarios();
                veterinario.setVisible(true);
                break;
            case 5:
                Tipo_Med tipomedicamento = new Tipo_Med();
                tipomedicamento.setVisible(true);
                break;
            case 6:
                Citas citas = new Citas();
                citas.setVisible(true);
                break;
        }
    }//GEN-LAST:event_insertarActionPerformed

    public void ticket(int tabla) {
        int[] filas = visor.getSelectedRows();
        if (filas.length == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona al menos una cita para generar el ticket.");
            return;
        }

        String ruta = "C:\\Users\\Valerin\\Documents\\NetBeansProjects\\Veterinaria_PetsLife\\src\\Ticket\\recibo.txt"; // Ajusta tu ruta

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write("====== VETERINARIA PETS LIFE ======");
            bw.newLine();
            bw.newLine();

            conexion con = new conexion();
            Connection conexion = con.conectar();

            double totalGeneral = 0;

            // Map para sumar por mascota
            Map<String, Double> totalesPorMascota = new HashMap<>();

            for (int fila : filas) {
                int idCita = Integer.parseInt(visor.getValueAt(fila, 0).toString());

                String consulta = "SELECT d.nombre_dueño AS dueño, "
                        + "v.nombre_vet AS veterinario, "
                        + "m.nombre AS mascota, "
                        + "med.nombre_medicina AS medicina, "
                        + "t.nombre_tipo AS tipo_medicina, "
                        + "dc.cantidad, "
                        + "t.precio, "
                        + "(dc.cantidad * t.precio) AS subtotal "
                        + "FROM citas c "
                        + "INNER JOIN dueño d ON c.fk_dueño = d.id_dueño "
                        + "INNER JOIN veterinario v ON c.fk_veterinario = v.id_v "
                        + "INNER JOIN mascotas m ON c.fk_mascota = m.id "
                        + "INNER JOIN detalle_cita dc ON c.id = dc.fk_cita "
                        + "INNER JOIN medicinas med ON dc.fk_medicina = med.id_medicina "
                        + "INNER JOIN tipo t ON med.fk_tipo = t.id_tipo "
                        + "WHERE c.id = ?";

                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.setInt(1, idCita);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String mascota = rs.getString("mascota");
                    double subtotal = rs.getDouble("subtotal");
                    
                    bw.write("Cliente: " + rs.getString("dueño"));
                    bw.newLine();
                    bw.write("Veterinario: " + rs.getString("veterinario"));
                    bw.newLine();
                    bw.write("Mascota: " + mascota);
                    bw.newLine();
                    bw.write("Medicamento/Servicio: " + rs.getString("medicina"));
                    bw.newLine();
                    bw.write("Tipo: " + rs.getString("tipo_medicina"));
                    bw.newLine();
                    bw.write("Cantidad: " + rs.getInt("cantidad"));
                    bw.newLine();
                    bw.write("Precio unitario: $" + rs.getDouble("precio"));
                    bw.newLine();
                    bw.write("Total: $" + subtotal);
                    bw.newLine();
                    bw.write("----------------------------");
                    bw.newLine();

                    totalGeneral += subtotal;

                    // Sumar por mascota
                    totalesPorMascota.put(mascota, totalesPorMascota.getOrDefault(mascota, 0.0) + subtotal);
                }
            }

            bw.newLine();
            bw.write("TOTAL GENERAL: $" + totalGeneral);
            bw.newLine();
            bw.write("----- Total por Mascota -----");
            bw.newLine();
            for (String mascota : totalesPorMascota.keySet()) {
                bw.write(mascota + ": $" + totalesPorMascota.get(mascota));
                bw.newLine();
            }

            bw.write("Fecha y hora: " + java.time.LocalDateTime.now());
            bw.newLine();
            bw.write("Gracias por su preferencia!");
            bw.newLine();

            bw.close();
            JOptionPane.showMessageDialog(null, "Recibo creado correctamente en: " + ruta);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.toString());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.toString());
            e.printStackTrace();
        }
    }

    private void reciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciboActionPerformed
        int[] filas = visor.getSelectedRows();
        if (filas.length == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona al menos una cita para generar el ticket.");
            return;
        }

        // Llamamos al método ticket con esa cita
        ticket(idCita);
    }//GEN-LAST:event_reciboActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String valor = JOptionPane.showInputDialog(null, "Ingrese el nombre a eliminar");
        switch (presionado) {
            case 1:
                eliminar("dueño", "nombre_dueño", valor);
                break;
            case 2:
                eliminar("mascotas", "nombre", valor);
                break;
            case 3:
                eliminar("medicinas", "nombre_medicina", valor);
                break;
            case 4:
                eliminar("veterinario", "nombre_vet", valor);
                break;
            case 5:
                eliminar("tipo", "nombre_tipo", valor);
                break;
            case 6:
                eliminar("citas", "id", valor);
                break;
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cerrar_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_principalActionPerformed
        Login login = new Login();   // Crear instancia del login
        login.setVisible(true);      // Mostrar login
        login.setLocationRelativeTo(null); // Centrar ventana

        this.dispose(); // Cerrar ventana principal
    }//GEN-LAST:event_cerrar_principalActionPerformed

    private void CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasActionPerformed
        mostrar("Citas");
        presionado = 6;
    }//GEN-LAST:event_CitasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Citas;
    private javax.swing.JButton cerrar_principal;
    public javax.swing.JButton dueños;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton mascotas;
    public javax.swing.JButton medicinas;
    private javax.swing.JButton recibo;
    public javax.swing.JButton tipo;
    public javax.swing.JButton veterinario;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
