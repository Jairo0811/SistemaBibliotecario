/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Decision.java
 *
 * Created on Nov 29, 2016, 12:29:39 AM
 */

package ventanas;

/**
 *
 * @author eddygrullon
 */
public class Decision extends javax.swing.JFrame {

    /** Creates new form Decision */
    public Decision() {
        initComponents();
        this.setLocationRelativeTo(null);

        activarEnterEnBotones(prestamos, comprar, exit);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        prestamos = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prestamos.setFont(new java.awt.Font("Papyrus", 1, 16));
        prestamos.setText("Prestar Libros");
        prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosActionPerformed(evt);
            }
        });
        getContentPane().add(prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 140, -1));

        exit.setFont(new java.awt.Font("Papyrus", 1, 16));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        comprar.setFont(new java.awt.Font("Papyrus", 1, 16));
        comprar.setText("Comprar Libros");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 160, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondito.png")));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        pack();
    }

    private void prestamosActionPerformed(java.awt.event.ActionEvent evt) {
        prestamos ventanaPrestamos = new prestamos();
        ventanaPrestamos.setVisible(true);
        dispose();
    }

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {
        Comprarlibros ventanaComprar = new Comprarlibros();
        ventanaComprar.setVisible(true);
        dispose();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void activarEnterEnBotones(javax.swing.JButton... botones) {
        for (final javax.swing.JButton boton : botones) {
            boton.getInputMap(javax.swing.JComponent.WHEN_FOCUSED).put(
                    javax.swing.KeyStroke.getKeyStroke("ENTER"),
                    "pressEnter"
            );

            boton.getActionMap().put("pressEnter", new javax.swing.AbstractAction() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    boton.doClick();
                }
            });
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Decision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Decision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Decision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Decision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decision().setVisible(true);
            }
        });
    }

    private javax.swing.JButton comprar;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton prestamos;
}