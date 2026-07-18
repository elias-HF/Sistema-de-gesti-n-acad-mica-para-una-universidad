
package formularios;

import javax.swing.JPanel;


public class FrmMenuPrincipal extends javax.swing.JFrame {

    
    public FrmMenuPrincipal() {
        initComponents();
    }

    
    private void mostrarPanel(JPanel panel){

        pnlContenido.removeAll();

        pnlContenido.setLayout(new java.awt.BorderLayout());

        pnlContenido.add(panel, java.awt.BorderLayout.CENTER);

        pnlContenido.revalidate();

        pnlContenido.repaint();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlContenido = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemCerrarSession = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        itemFacultad = new javax.swing.JMenuItem();
        itemCarrera = new javax.swing.JMenuItem();
        itemCurso = new javax.swing.JMenuItem();
        itemEstudiante = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        itemInscripcion = new javax.swing.JMenuItem();
        itemCalificacion = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemReporte = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(751, 563));

        jPanel1.setPreferredSize(new java.awt.Dimension(751, 563));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSuperior.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistema Académico Universitario");

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        panelInferior.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Estado:");

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(706, Short.MAX_VALUE))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.add(panelInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 750, 30));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 520));

        menuArchivo.setText("Archivo");

        itemCerrarSession.setText("Cerrar session");
        itemCerrarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSessionActionPerformed(evt);
            }
        });
        menuArchivo.add(itemCerrarSession);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemSalir);

        jMenuBar1.add(menuArchivo);

        menuMantenimiento.setText("Mantenimiento");

        itemFacultad.setText("Facultad");
        itemFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacultadActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemFacultad);

        itemCarrera.setText("Carrera");
        itemCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCarreraActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemCarrera);

        itemCurso.setText("Curso");
        itemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCursoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemCurso);

        itemEstudiante.setText("Estudiante");
        itemEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEstudianteActionPerformed(evt);
            }
        });
        menuMantenimiento.add(itemEstudiante);

        jMenuBar1.add(menuMantenimiento);

        menuProcesos.setText("Procesos");

        itemInscripcion.setText("Inscripción");
        itemInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInscripcionActionPerformed(evt);
            }
        });
        menuProcesos.add(itemInscripcion);

        itemCalificacion.setText("Calificación");
        itemCalificacion.setToolTipText("");
        itemCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCalificacionActionPerformed(evt);
            }
        });
        menuProcesos.add(itemCalificacion);

        jMenuBar1.add(menuProcesos);

        menuReportes.setText("Reportes");

        itemReporte.setText("Reporte Académico");
        itemReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporte);

        jMenuBar1.add(menuReportes);

        menuAyuda.setText("Ayuda");

        itemAcercaDe.setText("Acerca de");
        itemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(itemAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCerrarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSessionActionPerformed
        //mostrarPanel(newFrmLogin);
    }//GEN-LAST:event_itemCerrarSessionActionPerformed

    private void itemFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFacultadActionPerformed
        mostrarPanel(new PnlFacultad());
    }//GEN-LAST:event_itemFacultadActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCarreraActionPerformed
        mostrarPanel(new PnlCarrera());
    }//GEN-LAST:event_itemCarreraActionPerformed

    private void itemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCursoActionPerformed
        mostrarPanel(new PnlCurso());
    }//GEN-LAST:event_itemCursoActionPerformed

    private void itemEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEstudianteActionPerformed
        mostrarPanel(new PnlEstudiante());
    }//GEN-LAST:event_itemEstudianteActionPerformed

    private void itemInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInscripcionActionPerformed
        mostrarPanel(new PnlInscripcion());
    }//GEN-LAST:event_itemInscripcionActionPerformed

    private void itemCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCalificacionActionPerformed
        mostrarPanel(new PnlCalificacion());
    }//GEN-LAST:event_itemCalificacionActionPerformed

    private void itemReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteActionPerformed
        mostrarPanel(new PnlReporteAcademico());
    }//GEN-LAST:event_itemReporteActionPerformed

    private void itemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAcercaDeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JMenuItem itemCalificacion;
    private javax.swing.JMenuItem itemCarrera;
    private javax.swing.JMenuItem itemCerrarSession;
    private javax.swing.JMenuItem itemCurso;
    private javax.swing.JMenuItem itemEstudiante;
    private javax.swing.JMenuItem itemFacultad;
    private javax.swing.JMenuItem itemInscripcion;
    private javax.swing.JMenuItem itemReporte;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuProcesos;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables
}
