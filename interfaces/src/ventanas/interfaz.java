/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * interfaz.java
 *
 * Created on Nov 22, 2016, 10:24:28 AM
 */

package ventanas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eddygrullon
 */
public class interfaz extends javax.swing.JFrame {

    /** Creates new form interfaz */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);

        // Permite ejecutar el botón Login al presionar ENTER.
        this.getRootPane().setDefaultButton(jButtonlogin);

        // Permite activar botones con ENTER cuando tienen el foco.
        activarEnterEnBotones(jButton1, jButtonlogin, jButton2, jButtonAcercaDe);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelicon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextuser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonAcercaDe = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        jLabelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userrrrrr.png")));
        getContentPane().add(jLabelicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 120, -1));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 110, 20));

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jTextuser.setFont(new java.awt.Font("Lucida Grande", 2, 14));
        jTextuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextuserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 30));

        jPassword.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 230, 30));

        jButtonlogin.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jButton2.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jButtonAcercaDe.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButtonAcercaDe.setText("Acerca de");
        jButtonAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 120, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondito.png")));
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 770, 420));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jTextuserActionPerformed(java.awt.event.ActionEvent evt) {
        jPassword.requestFocusInWindow();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Registro obj = new Registro();
        obj.setVisible(true);
        dispose();
    }

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {
        String usuario = jTextuser.getText().trim();
        String password = new String(jPassword.getPassword());

        if (usuario.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe ingresar usuario y contraseña.",
                    "Datos requeridos",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        Decision menu = new Decision();
        menu.setVisible(true);
        dispose();
    }

    private void jButtonAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarAcercaDe();
    }

    private void mostrarAcercaDe() {
        JPanel panel = new JPanel();
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
        panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 25, 12, 25));

        JLabel logo = new JLabel();
        logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        java.net.URL rutaLogo = getClass().getResource("/imagenes/itla.png");

        if (rutaLogo != null) {
            ImageIcon iconoOriginal = new ImageIcon(rutaLogo);

            int anchoOriginal = iconoOriginal.getIconWidth();
            int altoOriginal = iconoOriginal.getIconHeight();

            int anchoDeseado = 210;
            int altoCalculado = (anchoDeseado * altoOriginal) / anchoOriginal;

            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
                    anchoDeseado,
                    altoCalculado,
                    Image.SCALE_SMOOTH
            );

            logo.setIcon(new ImageIcon(imagenEscalada));
            panel.add(logo);
            panel.add(javax.swing.Box.createVerticalStrut(15));
        }

        JLabel texto = new JLabel(
                "<html>"
                        + "<div style='text-align:center; width:500px; font-family:Arial, sans-serif;'>"

                        + "<h1 style='font-size:20px; margin-top:8px; margin-bottom:26px;'>"
                        + "SISTEMA BIBLIOTECARIO"
                        + "</h1>"

                        + "<p style='font-size:12px; margin-top:0; margin-bottom:26px;'>"
                        + "Proyecto Final desarrollado para la materia<br>"
                        + "<b>Programación 1</b><br>"
                        + "(SOF-003)"
                        + "</p>"

                        + "<p style='font-size:12px; margin-top:0; margin-bottom:24px;'>"
                        + "<b>INSTITUCIÓN</b><br>"
                        + "Instituto Tecnológico de las Américas (ITLA)"
                        + "</p>"

                        + "<p style='font-size:12px; margin-top:0; margin-bottom:12px;'>"
                        + "<b>INTEGRANTES</b>"
                        + "</p>"

                        + "<table style='margin-left:auto; margin-right:auto; font-size:12px; line-height:1.45; margin-bottom:24px;'>"
                        + "<tr><td style='text-align:left; padding-right:18px;'>Reydi Isaac Charles Frias</td><td style='text-align:left;'>2015-2965</td></tr>"
                        + "<tr><td style='text-align:left; padding-right:18px;'>Francis Jairo Matias Rosario</td><td style='text-align:left;'>2015-2984</td></tr>"
                        + "<tr><td style='text-align:left; padding-right:18px;'>Eduandy Isabel Cruz Abreu</td><td style='text-align:left;'>2015-3017</td></tr>"
                        + "<tr><td style='text-align:left; padding-right:18px;'>Orlando Antonio Dominici Vanterpool</td><td style='text-align:left;'>2015-3029</td></tr>"
                        + "<tr><td style='text-align:left; padding-right:18px;'>Freddy Nicolas Mejia Peña</td><td style='text-align:left;'>2015-3038</td></tr>"
                        + "</table>"

                        + "<p style='font-size:12px; margin-top:0; margin-bottom:26px;'>"
                        + "<b>PROFESOR</b><br>"
                        + "Keneth John Aponte Alonzo"
                        + "</p>"

                        + "<p style='font-size:12px; margin-top:0; margin-bottom:14px;'>"
                        + "<b>VERSIÓN ORIGINAL</b><br>"
                        + "Diciembre 2016"
                        + "</p>"

                        + "<p style='font-size:12px; margin-top:0; margin-bottom:4px;'>"
                        + "<b>MANTENIMIENTO Y CORRECCIÓN DE FUNCIONALIDADES</b><br>"
                        + "Junio 2026"
                        + "</p>"

                        + "</div>"
                        + "</html>");

        texto.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(texto);

        JOptionPane.showMessageDialog(
                this,
                panel,
                "Acerca de",
                JOptionPane.PLAIN_MESSAGE);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAcercaDe;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JLabel jLabelicon;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextuser;
}