package formularios;

import javax.swing.*;

public class FrmMenuPrincipal extends JFrame {

    private JPanel jPanel1;
    private JMenuBar jMenuBar1;
    private JMenu mnuArchivo;
    private JMenu mnuMantenimiento;
    private JMenu mnuReportes;
    private JMenu mnuAyuda;
    private JMenuItem mniSalir;
    private JMenuItem mniEstudiante;
    private JMenuItem mniCurso;
    private JMenuItem mniInscripcion;
    private JMenuItem mniCalificacion;
    private JMenuItem mniGenerar;
    private JMenuItem mniAcercaDe;
    private JLabel lblBienvenida;
    private JLabel lblVersion;
    private JLabel lblDerechos;

    public FrmMenuPrincipal() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jMenuBar1 = new JMenuBar();
        mnuArchivo = new JMenu();
        mnuMantenimiento = new JMenu();
        mnuReportes = new JMenu();
        mnuAyuda = new JMenu();
        mniSalir = new JMenuItem();
        mniEstudiante = new JMenuItem();
        mniCurso = new JMenuItem();
        mniInscripcion = new JMenuItem();
        mniCalificacion = new JMenuItem();
        mniGenerar = new JMenuItem();
        mniAcercaDe = new JMenuItem();
        lblBienvenida = new JLabel();
        lblVersion = new JLabel();
        lblDerechos = new JLabel();

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
}
