/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apk_penyewaan_alat_outdoor;

/**
 *
 * @author ASUS
 */
public class halaman_utama_admin extends javax.swing.JFrame {

    /**
     * Creates new form halaman_utama_admin
     */
    public halaman_utama_admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo_apk_halaman_utama_admin = new javax.swing.JLabel();
        panel_kiri_halaman_utama_admin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        penel_menu_halaman_utama_admin = new javax.swing.JPanel();
        panel_kanan_halaman_utama_admin = new javax.swing.JPanel();
        background_halaman_utama_admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_apk_halaman_utama_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo_apk.png"))); // NOI18N
        getContentPane().add(logo_apk_halaman_utama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 100, -1, 160));

        panel_kiri_halaman_utama_admin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DATA");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panel_kiri_halaman_utama_adminLayout = new javax.swing.GroupLayout(panel_kiri_halaman_utama_admin);
        panel_kiri_halaman_utama_admin.setLayout(panel_kiri_halaman_utama_adminLayout);
        panel_kiri_halaman_utama_adminLayout.setHorizontalGroup(
            panel_kiri_halaman_utama_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kiri_halaman_utama_adminLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(panel_kiri_halaman_utama_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_kiri_halaman_utama_adminLayout.setVerticalGroup(
            panel_kiri_halaman_utama_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kiri_halaman_utama_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(713, Short.MAX_VALUE))
        );

        getContentPane().add(panel_kiri_halaman_utama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 440, 830));
        getContentPane().add(penel_menu_halaman_utama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 1290, 90));

        panel_kanan_halaman_utama_admin.setBackground(new java.awt.Color(255, 255, 255));
        panel_kanan_halaman_utama_admin.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panel_kanan_halaman_utama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 1290, 590));

        background_halaman_utama_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3.png"))); // NOI18N
        background_halaman_utama_admin.setText(" ");
        getContentPane().add(background_halaman_utama_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman_utama_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_halaman_utama_admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo_apk_halaman_utama_admin;
    private javax.swing.JPanel panel_kanan_halaman_utama_admin;
    private javax.swing.JPanel panel_kiri_halaman_utama_admin;
    private javax.swing.JPanel penel_menu_halaman_utama_admin;
    // End of variables declaration//GEN-END:variables
}
