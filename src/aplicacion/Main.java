package aplicacion;

import formularios.FrmMenuPrincipal;





public class Main {

    public static void main(String[] args) {
    
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> {
            FrmMenuPrincipal frm = new FrmMenuPrincipal();
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
        });
        
    }
    
}
