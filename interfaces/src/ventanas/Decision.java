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

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author eddygrullon
 */
public class Decision extends javax.swing.JFrame {

    public Decision() {
        initComponents();
        this.setSize(560, 420);
        this.setLocationRelativeTo(null);

        activarEnterEnBotones(prestamos, comprar, cerrarSesion, exit);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        prestamos = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(0, 102, 204));
        exit.setFont(new java.awt.Font("Papyrus", java.awt.Font.BOLD, 16));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 0, 80, 32));

        panelMenu.setBackground(new Color(255, 255, 255, 170));
        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(170, 170, 170)));
        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 80, 390, 250));

        titulo.setFont(new java.awt.Font("Papyrus", 1, 28));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Sistema Bibliotecario");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 360, 40));

        subtitulo.setFont(new java.awt.Font("Papyrus", 1, 18));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Menú Principal");
        getContentPane().add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 150, 250, 30));

        prestamos.setFont(new java.awt.Font("Papyrus", 1, 16));
        prestamos.setText("Prestar Libros");
        prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosActionPerformed(evt);
            }
        });
        getContentPane().add(prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 155, 38));

        comprar.setFont(new java.awt.Font("Papyrus", 1, 16));
        comprar.setText("Comprar Libros");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 220, 165, 38));

        cerrarSesion.setFont(new java.awt.Font("Papyrus", 1, 16));
        cerrarSesion.setText("Cerrar sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 275, 160, 38));

        ImageIcon fondoOriginal = new ImageIcon(getClass().getResource("/imagenes/fondito.png"));
        Image fondoEscalado = fondoOriginal.getImage().getScaledInstance(560, 420, Image.SCALE_SMOOTH);
        fondo.setIcon(new ImageIcon(fondoEscalado));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        getContentPane().setComponentZOrder(fondo, getContentPane().getComponentCount() - 1);
        getContentPane().setComponentZOrder(panelMenu, getContentPane().getComponentCount() - 2);

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

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        interfaz login = new interfaz();
        login.setVisible(true);
        dispose();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void activarEnterEnBotones(javax.swing.JButton... botones) {
        for (final javax.swing.JButton boton : botones) {
            boton.getInputMap(javax.swing.JComponent.WHEN_FOCUSED).put(
                    javax.swing.KeyStroke.getKeyStroke("ENTER"),
                    "pressEnter");

            boton.getActionMap().put("pressEnter", new javax.swing.AbstractAction() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    boton.doClick();
                }
            });
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decision().setVisible(true);
            }
        });
    }

    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton comprar;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JButton prestamos;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
}