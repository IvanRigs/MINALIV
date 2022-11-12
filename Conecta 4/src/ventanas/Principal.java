package ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import movimiento.MoverComp;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        glezzez = new javax.swing.JLabel();
        glezzez1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MINALIV");
        setPreferredSize(new java.awt.Dimension(915, 500));
        setResizable(false);

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backgroundMouseReleased(evt);
            }
        });
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        glezzez.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        glezzez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glezzez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minaliv.png"))); // NOI18N
        glezzez.setToolTipText("");
        background.add(glezzez, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 430, 160));

        glezzez1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        glezzez1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        glezzez1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/glezzez new logo white.png"))); // NOI18N
        glezzez1.setToolTipText("");
        background.add(glezzez1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, 140));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseReleased
        MoverComp.Arriba(glezzez, 8, 1, 23);
        //Play play = new Play();
       // showPanel(play);
    }//GEN-LAST:event_backgroundMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel glezzez;
    private javax.swing.JLabel glezzez1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel p){
        p.setSize(WIDTH, HEIGHT);
        p.setLocation(0,0);
        background.removeAll();
        background.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(350,210,-1,-1));
        background.revalidate();
        background.repaint();
    }
}
