
package formularios;

import Entity.Carrera;
import Entity.Facultad;
import controller.CarreraController;
import controller.FacultadController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PnlCarrera extends javax.swing.JPanel {
    private FacultadController facultadController;
    private DefaultTableModel modelo;
    private CarreraController controller;
    
    public PnlCarrera() {
        initComponents();
        
        controller = new CarreraController();
        facultadController = new FacultadController();
        
        modelo = new DefaultTableModel();
        String ids[] = {"ID", "Nombre", "Facultad"};
        modelo.setColumnIdentifiers(ids);


        tblCarreras.setModel(modelo);
        
        listarCarreras();
        cargarFacultades();
    }

    private void limpiar(){

        txtId.setText("");
        txtNombre.setText("");

        cmbFacultad.setSelectedIndex(0);

        txtBuscar.setText("");

    }
    
    private void listarCarreras(){

        modelo.setRowCount(0);

        List<Carrera> lista = controller.listar();

        for(Carrera c : lista){

            modelo.addRow(new Object[]{

                c.getId(),
                c.getNombre(),
                c.getFacultad().getNombre()

            });

        }

    }
    
    private void cargarFacultades(){

        cmbFacultad.removeAllItems();

        List<Facultad> lista = facultadController.listar();

        for(Facultad f : lista){

            cmbFacultad.addItem(f);

        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarreras = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbFacultad = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnMostrarTodo1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        btnMostrarTodo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        setMaximumSize(new java.awt.Dimension(751, 563));
        setMinimumSize(new java.awt.Dimension(751, 563));
        setPreferredSize(new java.awt.Dimension(751, 563));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Buscar por ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        tblCarreras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCarreras);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 770, 240));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLimpiar.setText("Limpiar");
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestion de Carreras");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        cmbFacultad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbFacultad.setForeground(new java.awt.Color(153, 153, 153));
        add(cmbFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 190, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));

        btnMostrarTodo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMostrarTodo1.setText("Mostrar Todo");
        btnMostrarTodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodo1ActionPerformed(evt);
            }
        });
        add(btnMostrarTodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        listarCarreras();
        limpiar();
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnMostrarTodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodo1ActionPerformed
        listarCarreras();
        limpiar();
    }//GEN-LAST:event_btnMostrarTodo1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Ingrese un ID.");
            return;
        }

        int id=Integer.parseInt(txtBuscar.getText());

        Carrera carrera = controller.buscar(id);

        if(carrera!=null){

            txtId.setText(String.valueOf(carrera.getId()));
            txtNombre.setText(carrera.getNombre());

        }else{

            JOptionPane.showMessageDialog(this,"No existe.");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnMostrarTodo1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<Entity.Facultad> cmbFacultad;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarreras;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
