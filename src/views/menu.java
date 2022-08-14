package views;

import ModeloVO.ClienteVO;
import ModeloVO.CuentaVO;
import util.validacion;

/**
 *
 * @author DataSena
 */
public class menu extends javax.swing.JFrame {

    private CuentaVO cuentaVo = null;
    private ClienteVO clienteVo = null;

    /**
     * Creates new form index
     */
    public menu() {
        if (validacion.isSessionActive()) {
            initComponents();
        } else {
            dispose();
        }

    }

    public menu(CuentaVO cuentVo, ClienteVO clientVo) {
        this();
        jLabelNombre.setText(clientVo.getNombreCliente());
        jLabelCedula.setText(clientVo.getCedulaCliente());
        jLabelTelefono.setText(clientVo.getTelefonoCliente());
        jLabelNumCuenta.setText(cuentVo.getNumeroCuenta());
        jLabelFechaApertura.setText(cuentVo.getFechaApertura());
        jLabelEstado.setText(cuentVo.getEstado());
        cuentaVo = cuentVo;
        clienteVo = clientVo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelNumCuenta = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelFechaApertura = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Index");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setMinimumSize(new java.awt.Dimension(615, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setText("Mis datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 20, -1, 60));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setText("Cédula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 151, 210));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Retirar mi dinero");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 256, 82));

        jButtonCerrar.setBackground(new java.awt.Color(242, 242, 242));
        jButtonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrae.png"))); // NOI18N
        jButtonCerrar.setBorder(null);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 20, 42, 60));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("Num cuenta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setText("Fecha apertura:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 447, -1));

        jLabelCedula.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabelCedula.setText("Nombre:");
        jPanel1.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 441, -1));

        jLabelTelefono.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabelTelefono.setText("Nombre:");
        jPanel1.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 422, -1));

        jLabelNumCuenta.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabelNumCuenta.setText("Nombre:");
        jPanel1.add(jLabelNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 401, -1));

        jLabelEstado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabelEstado.setText("Nombre:");
        jPanel1.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 437, -1));

        jLabelFechaApertura.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabelFechaApertura.setText("Nombre:");
        jPanel1.add(jLabelFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 393, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, 610, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        retirar retirar = new retirar(cuentaVo, clienteVo);
        retirar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        index index = new index();
        index.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (validacion.isSessionActive()) {
                    new menu().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFechaApertura;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumCuenta;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
