/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author berkay
 */
public class YanUrunler extends javax.swing.JFrame {

    /**
     * Creates new form YanUrunler
     */
    public YanUrunler() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem18.setText("jMenuItem18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1500, 800));

        jLabel1.setText("jLabel1");

        jMenu3.setText("Kişisel Bakım");
        jMenu3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(250, 50));

        jMenuItem3.setText("Cilt Temizleme Ürünleri");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Güneş Kremleri");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Gıda Takviyeleri");
        jMenu8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(250, 50));

        jMenuItem5.setText("Vitaminler");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem8.setText("Sporcu Ürünleri");
        jMenu8.add(jMenuItem8);

        jMenuBar1.add(jMenu8);

        jMenu5.setText("Temizlik Ürünleri");
        jMenu5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(250, 50));

        jMenuItem9.setText("Şampuanlar ve Duş Jelleri");
        jMenu5.add(jMenuItem9);

        jMenuItem11.setText("Diş Temizliği Ürünleri");
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);
        jMenuBar1.add(jMenu10);

        jMenu9.setText("Saç Ürünleri");
        jMenu9.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(250, 50));

        jMenuItem13.setText("Saç Şekillendiriciler");
        jMenu9.add(jMenuItem13);

        jMenuItem15.setText("Saç Ekipmanları");
        jMenu9.add(jMenuItem15);

        jMenuBar1.add(jMenu9);

        jMenu12.setText("Bebek Ürünleri");
        jMenu12.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jMenu12.setPreferredSize(new java.awt.Dimension(250, 50));
        jMenu12.setSize(new java.awt.Dimension(250, 50));

        jMenuItem16.setText("Bebek Bezleri");
        jMenu12.add(jMenuItem16);

        jMenuItem17.setText("Bebek Gıdası");
        jMenu12.add(jMenuItem17);

        jMenuBar1.add(jMenu12);

        jMenu11.setText("Hesap İşlemleri");
        jMenu11.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jMenu11.setPreferredSize(new java.awt.Dimension(300, 50));
        jMenu11.setSize(new java.awt.Dimension(250, 50));

        jMenuItem20.setText("Giriş Yapın");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem20);

        jMenuItem21.setText("Hesabınız Yok İse Kayıt Olun");
        jMenu11.add(jMenuItem21);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       CiltTemizleme cilttemizleme = new CiltTemizleme();
       setVisible(false);
       cilttemizleme.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
       UserPage userpage = new UserPage();
       setVisible(false);
       userpage.setVisible(true);
            
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        Vitaminler vitaminler = new Vitaminler();
        setVisible(false);
        vitaminler.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(YanUrunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YanUrunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YanUrunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YanUrunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YanUrunler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
