/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Registro.java
 *
 * Created on Nov 24, 2016, 2:37:02 PM
 */

package ventanas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author eddygrullon
 */
public class Registro extends javax.swing.JFrame {

    /** Creates new form Registro */
    public Registro() {
        initComponents();

        this.setSize(560, 420);
        this.setLocationRelativeTo(null);

        activarEnterEnBotones(savetext, backtext, exit);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombres = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombrestext = new javax.swing.JTextField();
        Apellidotext = new javax.swing.JTextField();
        emailtext = new javax.swing.JTextField();
        usuariotext = new javax.swing.JTextField();
        contra = new javax.swing.JPasswordField();
        contraa2 = new javax.swing.JPasswordField();
        savetext = new javax.swing.JButton();
        backtext = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        panelRegistro.setBackground(new Color(255, 255, 255, 170));
        panelRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(170, 170, 170)));
        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 35, 470, 335));

        titulo.setFont(new java.awt.Font("Papyrus", 1, 26));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registro de Usuario");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 360, 35));

        nombres.setFont(new java.awt.Font("Papyrus", 1, 18));
        nombres.setText("Nombres:");
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 130, 25));

        nombrestext.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        getContentPane().add(nombrestext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 260, 28));

        Apellidos.setFont(new java.awt.Font("Papyrus", 1, 18));
        Apellidos.setText("Apellidos:");
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 138, 130, 25));

        Apellidotext.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        getContentPane().add(Apellidotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 138, 260, 28));

        Email.setFont(new java.awt.Font("Papyrus", 1, 18));
        Email.setText("E-mail:");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 176, 130, 25));

        emailtext.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        getContentPane().add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 176, 260, 28));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel1.setText("Nombre de usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 214, 190, 25));

        usuariotext.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        getContentPane().add(usuariotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 214, 200, 28));

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 252, 150, 25));

        contra.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 252, 260, 28));

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel3.setText("Confirmar contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 210, 25));

        contraa2.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        getContentPane().add(contraa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 180, 28));

        backtext.setFont(new java.awt.Font("Papyrus", 1, 16));
        backtext.setText("Back");
        backtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtextActionPerformed(evt);
            }
        });
        getContentPane().add(backtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 335, 90, 32));

        savetext.setFont(new java.awt.Font("Papyrus", 1, 16));
        savetext.setText("Save");
        savetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savetextActionPerformed(evt);
            }
        });
        getContentPane().add(savetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 335, 90, 32));

        ImageIcon fondoOriginal = new ImageIcon(getClass().getResource("/imagenes/fondito.png"));
        Image fondoEscalado = fondoOriginal.getImage().getScaledInstance(560, 420, Image.SCALE_SMOOTH);
        fondo.setIcon(new ImageIcon(fondoEscalado));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        /*
         * Orden visual:
         * fondo atrás, panel encima del fondo, controles encima del panel.
         */
        getContentPane().setComponentZOrder(fondo, getContentPane().getComponentCount() - 1);
        getContentPane().setComponentZOrder(panelRegistro, getContentPane().getComponentCount() - 2);

        pack();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void backtextActionPerformed(java.awt.event.ActionEvent evt) {
        interfaz login = new interfaz();
        login.setVisible(true);
        dispose();
    }

    private void savetextActionPerformed(java.awt.event.ActionEvent evt) {
        String nombres = nombrestext.getText().trim();
        String apellidos = Apellidotext.getText().trim();
        String email = emailtext.getText().trim();
        String usuario = usuariotext.getText().trim();
        String password = new String(contra.getPassword());
        String confirmarPassword = new String(contraa2.getPassword());

        if (nombres.isEmpty() || apellidos.isEmpty() || email.isEmpty()
                || usuario.isEmpty() || password.isEmpty() || confirmarPassword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe completar todos los campos.",
                    "Campos requeridos",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!password.equals(confirmarPassword)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Las contraseñas no coinciden.",
                    "Error de validación",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Usuario registrado correctamente.",
                "Registro exitoso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        interfaz login = new interfaz();
        login.setVisible(true);
        dispose();
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
                new Registro().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Apellidos;
    private javax.swing.JTextField Apellidotext;
    private javax.swing.JLabel Email;
    private javax.swing.JButton backtext;
    private javax.swing.JPasswordField contra;
    private javax.swing.JPasswordField contraa2;
    private javax.swing.JTextField emailtext;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nombres;
    private javax.swing.JTextField nombrestext;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JButton savetext;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField usuariotext;
}