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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class productos extends javax.swing.JFrame {

    public productos() throws SQLException {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        $table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        $nuevo = new javax.swing.JButton();
        $buscarBTN = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        $buscar = new javax.swing.JTextField();
        $nombre = new javax.swing.JTextField();
        $cantidad = new javax.swing.JTextField();
        $precio = new javax.swing.JTextField();
        $codigo = new javax.swing.JTextField();
        $actualizarBtn = new javax.swing.JButton();
        $listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        $table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                $tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView($table);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad");

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

        $buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $buscarActionPerformed(evt);
            }
        });

        $nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $cantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        $actualizarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        $actualizarBtn.setText("Actualizar");
        $actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $actualizarBtnActionPerformed(evt);
            }
        });

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
                        .addComponent($buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent($buscarBTN))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent($precio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent($nombre)
                    .addComponent($cantidad)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent($nuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent($actualizarBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent($listar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent($codigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent($buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent($buscarBTN)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent($codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent($nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent($precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent($cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent($nuevo)
                            .addComponent($actualizarBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent($listar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1)))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void $buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$buscarBTNActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt( $buscar.getText());
        try {
            buscar(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$buscarBTNActionPerformed

    private void buscar(int codigo) throws SQLException {
        DefaultTableModel tableModel = (DefaultTableModel) $table.getModel();
        tableModel.setRowCount(0);

        Conexion cc = new Conexion();
        Connection cn = cc.connect();

        Statement ps = cn.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM productos WHERE codigo = " + codigo);

        ResultSetMetaData rsmd = rs.getMetaData();

        while (rs.next()) {
            Object[] row = new Object[rsmd.getColumnCount()];
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                row[i] = rs.getObject(i + 1);
            }
            if (codigo == Integer.parseInt($buscar.getText())) {
                tableModel.addRow(row);
            }
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt($codigo.getText());
        try {
            delete(codigo);
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void $nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$nuevoActionPerformed
        int codigo = Integer.parseInt($codigo.getText());
        String nombre = $nombre.getText();
        double precio = Double.parseDouble($precio.getText());
        int cantidad = Integer.parseInt($cantidad.getText());

        try {
            create(codigo, nombre, precio, cantidad);
            loadTable();
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
        int codigo = Integer.parseInt($codigo.getText());
        String nombre = $nombre.getText();
        double precio = Double.parseDouble($precio.getText());
        int cantidad = Integer.parseInt($cantidad.getText());

        try {
            update(codigo, nombre, precio, cantidad);
            loadTable();
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_$actualizarBtnActionPerformed

    private void $buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_$buscarActionPerformed

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
        int codigo = Integer.parseInt($table.getValueAt(row, 0).toString());

        Conexion cc = new Conexion();
        Connection cn = cc.connect();

        PreparedStatement ps = cn.prepareStatement("SELECT * FROM productos WHERE codigo = ?");
        ps.setInt(1, codigo);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            $codigo.setText(rs.getString("codigo"));
            $nombre.setText(rs.getString("nombre"));
            $precio.setText(rs.getString("precio"));
            $cantidad.setText(rs.getString("cantidad"));
        }
    }

    private static void update(int codigo, String nombre, double precio, int cantidad) throws SQLException {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
        PreparedStatement ps = cn.prepareStatement("UPDATE productos SET nombre = ?, precio = ?, cantidad = ? WHERE codigo = ?");
        ps.setInt(4, codigo);
        ps.setString(1, nombre);
        ps.setDouble(2, precio);
        ps.setInt(3, cantidad);
        ps.executeUpdate();
    }

    private  void delete(int codigo) throws SQLException {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
        PreparedStatement ps = cn.prepareStatement("DELETE FROM productos WHERE codigo = ?");
        ps.setInt(1, codigo);
        limpiar();
        ps.executeUpdate();
        
    } 
    
    public void limpiar() {
           $nombre.setText("");
            $codigo.setText("");
            $precio.setText("");
            $cantidad.setText("");
    }

    private static void create(int codigo, String nombre, double precio, int cantidad) throws SQLException {
        Conexion cc = new Conexion();
        Connection cn = cc.connect();
        PreparedStatement ps = cn.prepareStatement("INSERT INTO productos VALUES (?,?,?,?)");
        ps.setInt(1, codigo);
        ps.setString(2, nombre);
        ps.setDouble(3, precio);
        ps.setInt(4, cantidad);
        ps.executeUpdate();
    }

    private void loadTable() throws SQLException {
        DefaultTableModel tableModel = (DefaultTableModel) $table.getModel();
        tableModel.setRowCount(0);

        Conexion cc = new Conexion();
        Connection cn = cc.connect();

        Statement ps = cn.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM productos");

        ResultSetMetaData rsmd = rs.getMetaData();

        while (rs.next()) {
            Object[] row = new Object[rsmd.getColumnCount()];
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                row[i] = rs.getObject(i + 1);
            }
            tableModel.addRow(row);
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
    private javax.swing.JTextField $buscar;
    private javax.swing.JButton $buscarBTN;
    private javax.swing.JTextField $cantidad;
    private javax.swing.JTextField $codigo;
    private javax.swing.JButton $listar;
    private javax.swing.JTextField $nombre;
    private javax.swing.JButton $nuevo;
    private javax.swing.JTextField $precio;
    private javax.swing.JTable $table;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
