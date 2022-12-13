/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class clientes extends javax.swing.JFrame {

    public clientes() throws SQLException {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        $table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        $nuevo = new javax.swing.JButton();
        $buscarBTN = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        $id = new javax.swing.JTextField();
        $nombre = new javax.swing.JTextField();
        $direccion = new javax.swing.JTextField();
        $telefono = new javax.swing.JTextField();
        $actualizarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        $correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        $listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        $table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                $tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView($table);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");

        $nuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $nuevo.setText("Nuevo");
        $nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $nuevoActionPerformed(evt);
            }
        });

        $buscarBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $buscarBTN.setText("Buscar");
        $buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $buscarBTNActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Borrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        $id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $direccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $actualizarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $actualizarBtn.setText("Actualizar");
        $actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $actualizarBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Correo Electronico");

        $correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $correoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID");

        $listar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $listar.setText("Listar");
        $listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                $listarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent($telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent($nombre)
                            .addComponent($direccion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent($nuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent($actualizarBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent($listar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel1)
                            .addComponent($correo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent($id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent($buscarBTN)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent($id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent($buscarBTN)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent($nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent($telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent($direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent($correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent($nuevo)
                            .addComponent($actualizarBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent($listar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void $buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$buscarBTNActionPerformed
       // TODO add your handling code here:
        int id = Integer.parseInt($id.getText());
        try {
            buscar(id);
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$buscarBTNActionPerformed

    private void buscar(int id) throws SQLException {
        DefaultTableModel tableModel = (DefaultTableModel) $table.getModel();
        tableModel.setRowCount(0);

        Conexion cc = new Conexion();
        Connection cn = cc.connect();

        Statement ps = cn.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM clientes WHERE id = " + id);

        ResultSetMetaData rsmd = rs.getMetaData();

        while (rs.next()) {
            Object[] row = new Object[rsmd.getColumnCount()];
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                row[i] = rs.getObject(i + 1);
            }
            if (id == Integer.parseInt($id.getText())) {
                tableModel.addRow(row);
            }
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt($id.getText());
        try {
            delete(id);
            loadTable();
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void $nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$nuevoActionPerformed
        String nombre = $nombre.getText();
        String telefono = $telefono.getText();
        String direccion = $direccion.getText();
        String correo = $correo.getText();

        try {
            create(nombre, telefono, direccion, correo);
            loadTable();
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$nuevoActionPerformed

    private void $tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_$tableMouseClicked
        try {

            updateTextsValues();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$tableMouseClicked

    private void $actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$actualizarBtnActionPerformed
        int codigo = Integer.parseInt($id.getText());
        String nombre = $nombre.getText();
        String telefono = $telefono.getText();
        String direccion = $direccion.getText();
        String correo = $correo.getText();

        try {
            update(codigo, nombre, telefono, direccion, correo);
            loadTable();
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$actualizarBtnActionPerformed

    private void $correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_$correoActionPerformed

    private void $listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_$listarMouseClicked
        try {
            // TODO add your handling code here:
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$listarMouseClicked

    private void updateTextsValues() throws SQLException {
        int row = $table.getSelectedRow();
        int id = Integer.parseInt($table.getValueAt(row, 0).toString());

        Conexion cc = new Conexion();
        Connection cn = cc.connect();

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM clientes WHERE id = ?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            $id.setText(rs.getString("id"));
            $nombre.setText(rs.getString("nombre"));
            $telefono.setText(rs.getString("telefono"));
            $direccion.setText(rs.getString("direccion"));
            $correo.setText(rs.getString("correo"));
        }
    }

    private static void update(int id, String nombre, String telefono, String direccion, String correo) throws SQLException {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
        PreparedStatement ps = cn.prepareStatement("UPDATE clientes SET nombre = ?, telefono = ?, direccion = ?, correo = ? WHERE id = ?");
        ps.setInt(5, id);
        ps.setString(1, nombre);
        ps.setString(2, telefono);
        ps.setString(3, direccion);
        ps.setString(4, correo);

        ps.executeUpdate();
    }

    private static void delete(int id) throws SQLException {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
        PreparedStatement ps = cn.prepareStatement("DELETE FROM clientes WHERE id = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    private static void create(String nombre, String correo, String direccion, String telefono) throws SQLException {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
        PreparedStatement ps = cn.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?)");
        ps.setNull(1, Types.INTEGER);
        ps.setString(2, nombre);
        ps.setString(3, correo);
        ps.setString(4, direccion);
        ps.setString(5, telefono);
        ps.executeUpdate();
    }

    private void loadTable() throws SQLException {
        DefaultTableModel tableModel = (DefaultTableModel) $table.getModel();
        tableModel.setRowCount(0);

        Conexion cc = new Conexion();
        Connection cn = cc.connect();

        Statement ps = cn.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM clientes");

        ResultSetMetaData rsmd = rs.getMetaData();

        while (rs.next()) {
            Object[] row = new Object[rsmd.getColumnCount()];
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                row[i] = rs.getObject(i + 1);
            }
            tableModel.addRow(row);
        }
    }
    
     public void limpiar() {
        $id.setText("");
        $nombre.setText("");
        $telefono.setText("");
        $direccion.setText("");
        $correo.setText("");
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new productos().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton $actualizarBtn;
    private javax.swing.JButton $buscarBTN;
    private javax.swing.JTextField $correo;
    private javax.swing.JTextField $direccion;
    private javax.swing.JTextField $id;
    private javax.swing.JButton $listar;
    private javax.swing.JTextField $nombre;
    private javax.swing.JButton $nuevo;
    private javax.swing.JTable $table;
    private javax.swing.JTextField $telefono;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
