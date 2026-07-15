package formularios;

import javax.swing.table.DefaultTableModel;

public class FrmCalificacion extends javax.swing.JFrame {

    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> cmbEstudiante;
    private javax.swing.JComboBox<String> cmbCalificacion;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JTable tblCalificaciones;
    private javax.swing.JScrollPane jScrollPane1;

    public FrmCalificacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblEstudiante = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblObservacion = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cmbEstudiante = new javax.swing.JComboBox<>();
        cmbCalificacion = new javax.swing.JComboBox<>();
        txtNota = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        tblCalificaciones = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Académico - Gestión de Calificaciones");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setForeground(new java.awt.Color(33, 33, 33));
        lblTitulo.setText("Gestión de Calificaciones");

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblId.setForeground(new java.awt.Color(60, 60, 60));
        lblId.setText("ID Calificación:");

        lblEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblEstudiante.setForeground(new java.awt.Color(60, 60, 60));
        lblEstudiante.setText("Estudiante:");

        lblCurso.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblCurso.setForeground(new java.awt.Color(60, 60, 60));
        lblCurso.setText("Curso:");

        lblNota.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblNota.setForeground(new java.awt.Color(60, 60, 60));
        lblNota.setText("Nota:");

        lblObservacion.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblObservacion.setForeground(new java.awt.Color(60, 60, 60));
        lblObservacion.setText("Observación:");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 12));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        cmbEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 12));
        cmbEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        cmbCalificacion.setFont(new java.awt.Font("Segoe UI", 0, 12));
        cmbCalificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbCalificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        txtNota.setFont(new java.awt.Font("Segoe UI", 0, 12));
        txtNota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        txtObservacion.setFont(new java.awt.Font("Segoe UI", 0, 12));
        txtObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        btnRegistrar.setBackground(new java.awt.Color(41, 128, 185));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 11));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnActualizar.setBackground(new java.awt.Color(46, 204, 113));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 11));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusPainted(false);
        btnActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnEliminar.setBackground(new java.awt.Color(231, 76, 60));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 11));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnLimpiar.setBackground(new java.awt.Color(189, 195, 199));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 11));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblBuscar.setForeground(new java.awt.Color(60, 60, 60));
        lblBuscar.setText("Buscar por ID:");

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12));
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        btnBuscar.setBackground(new java.awt.Color(52, 152, 219));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 11));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusPainted(false);
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblCalificaciones.setFont(new java.awt.Font("Segoe UI", 0, 11));
        tblCalificaciones.setModel(new DefaultTableModel(
            new Object [][] {},
            new String [] { "ID", "Estudiante", "Curso", "Nota", "Observación" }
        ));
        tblCalificaciones.setRowHeight(25);
        jScrollPane1.setViewportView(tblCalificaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitulo)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblId)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstudiante)
                                .addComponent(cmbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCurso)
                                .addComponent(cmbCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNota)
                                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblObservacion)
                        .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblBuscar)
                            .addGap(10, 10, 10)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addGap(5, 5, 5)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblEstudiante)
                        .addGap(5, 5, 5)
                        .addComponent(cmbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCurso)
                        .addGap(5, 5, 5)
                        .addComponent(cmbCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblNota)
                        .addGap(5, 5, 5)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(lblObservacion)
                .addGap(5, 5, 5)
                .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(850, 750);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }
    // </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> cmbEstudiante;
    private javax.swing.JComboBox<String> cmbCalificacion;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JTable tblCalificaciones;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
