package formularios;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuMantenimiento;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniEstudiante;
    private javax.swing.JMenuItem mniCurso;
    private javax.swing.JMenuItem mniInscripcion;
    private javax.swing.JMenuItem mniCalificacion;
    private javax.swing.JMenuItem mniGenerar;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLabel lblDerechos;

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuMantenimiento = new javax.swing.JMenu();
        mnuReportes = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        mniEstudiante = new javax.swing.JMenuItem();
        mniCurso = new javax.swing.JMenuItem();
        mniInscripcion = new javax.swing.JMenuItem();
        mniCalificacion = new javax.swing.JMenuItem();
        mniGenerar = new javax.swing.JMenuItem();
        mniAcercaDe = new javax.swing.JMenuItem();
        lblBienvenida = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblDerechos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Académico - Menú Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblBienvenida.setForeground(new java.awt.Color(33, 33, 33));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido al Sistema Académico");

        lblVersion.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblVersion.setForeground(new java.awt.Color(100, 100, 100));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("Versión 1.0");

        lblDerechos.setFont(new java.awt.Font("Segoe UI", 0, 10));
        lblDerechos.setForeground(new java.awt.Color(150, 150, 150));
        lblDerechos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDerechos.setText("© 2024 Sistema de Gestión Académica");

        mnuArchivo.setText("Archivo");
        mniSalir.setText("Salir");
        mnuArchivo.add(mniSalir);
        jMenuBar1.add(mnuArchivo);

        mnuMantenimiento.setText("Mantenimiento");
        mniEstudiante.setText("Estudiante");
        mnuMantenimiento.add(mniEstudiante);
        mniCurso.setText("Curso");
        mnuMantenimiento.add(mniCurso);
        mniInscripcion.setText("Inscripción");
        mnuMantenimiento.add(mniInscripcion);
        mniCalificacion.setText("Calificación");
        mnuMantenimiento.add(mniCalificacion);
        jMenuBar1.add(mnuMantenimiento);

        mnuReportes.setText("Reportes");
        mniGenerar.setText("Generar Reporte");
        mnuReportes.add(mniGenerar);
        jMenuBar1.add(mnuReportes);

        mnuAyuda.setText("Ayuda");
        mniAcercaDe.setText("Acerca de");
        mnuAyuda.add(mniAcercaDe);
        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDerechos, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblDerechos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(600, 400);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
    // </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuMantenimiento;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniEstudiante;
    private javax.swing.JMenuItem mniCurso;
    private javax.swing.JMenuItem mniInscripcion;
    private javax.swing.JMenuItem mniCalificacion;
    private javax.swing.JMenuItem mniGenerar;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLabel lblDerechos;
    // End of variables declaration//GEN-END:variables
}
