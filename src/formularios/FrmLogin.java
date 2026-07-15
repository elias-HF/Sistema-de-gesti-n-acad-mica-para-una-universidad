package formularios;

import javax.swing.*;

public class FrmLogin extends javax.swing.JFrame {

    private JPanel jPanel1;
    private JLabel lblTitulo;
    private JLabel lblSubtitulo;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIngresar;
    private JButton btnSalir;

    public FrmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new JPanel();
        lblTitulo = new JLabel();
        lblSubtitulo = new JLabel();
        lblUsuario = new JLabel();
        lblPassword = new JLabel();
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();
        btnIngresar = new JButton();
        btnSalir = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Académico - Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblTitulo.setForeground(new java.awt.Color(33, 33, 33));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SISTEMA ACADÉMICO UNIVERSITARIO");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblSubtitulo.setForeground(new java.awt.Color(100, 100, 100));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("Ingreso al Sistema");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblUsuario.setForeground(new java.awt.Color(60, 60, 60));
        lblUsuario.setText("Usuario:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblPassword.setForeground(new java.awt.Color(60, 60, 60));
        lblPassword.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 12));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        btnIngresar.setBackground(new java.awt.Color(41, 128, 185));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setFocusPainted(false);
        btnIngresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSalir.setBackground(new java.awt.Color(189, 195, 199));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setFocusPainted(false);
        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsuario)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPassword)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblUsuario)
                .addGap(5, 5, 5)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblPassword)
                .addGap(5, 5, 5)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
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

        setSize(400, 400);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
    // </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
