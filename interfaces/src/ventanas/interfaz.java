package ventanas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();

        this.setSize(560, 420);
        this.setLocationRelativeTo(null);

        this.getRootPane().setDefaultButton(jButtonlogin);

        activarEnterEnBotones(jButton1, jButtonlogin, jButton2, jButtonAcercaDe);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Papyrus", java.awt.Font.BOLD, 16));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 0, 80, 32));

        panelLogin.setBackground(new Color(255, 255, 255, 170));
        panelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(170, 170, 170)));
        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 25, 330, 370));

        jLabelTitulo.setFont(new java.awt.Font("Papyrus", 1, 25));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Sistema Bibliotecario");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 45, 290, 35));

        jLabelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userrrrrr.png")));
        getContentPane().add(jLabelicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 88, 120, 95));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 188, 120, 25));

        jTextuser.setFont(new java.awt.Font("Lucida Grande", 2, 14));
        jTextuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextuserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 215, 230, 30));

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 18));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 250, 140, 25));

        jPassword.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 278, 230, 30));

        jButtonlogin.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 322, 95, 32));

        jButton2.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 322, 120, 32));

        jButtonAcercaDe.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButtonAcercaDe.setText("Acerca de");
        jButtonAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 360, 130, 32));

        ImageIcon fondoOriginal = new ImageIcon(getClass().getResource("/imagenes/fondito.png"));
        Image fondoEscalado = fondoOriginal.getImage().getScaledInstance(560, 420, Image.SCALE_SMOOTH);
        jLabelfondo.setIcon(new ImageIcon(fondoEscalado));
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        getContentPane().setComponentZOrder(jLabelfondo, getContentPane().getComponentCount() - 1);
        getContentPane().setComponentZOrder(panelLogin, getContentPane().getComponentCount() - 2);

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

        if (usuario.equals("admin") && password.equals("1234")) {
            Decision menu = new Decision();
            menu.setVisible(true);
            dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Usuario o contraseña incorrectos.",
                    "Acceso denegado",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButtonAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarAcercaDe();
    }

    private void mostrarAcercaDe() {
        final javax.swing.JDialog dialogo = new javax.swing.JDialog(this, "Acerca de", true);
        dialogo.setSize(720, 820);
        dialogo.setLocationRelativeTo(this);
        dialogo.setResizable(false);
        dialogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.JLabel fondoAcerca = new javax.swing.JLabel();
        ImageIcon fondoOriginal = new ImageIcon(getClass().getResource("/imagenes/fondito.png"));
        Image fondoEscalado = fondoOriginal.getImage().getScaledInstance(720, 760, Image.SCALE_SMOOTH);
        fondoAcerca.setIcon(new ImageIcon(fondoEscalado));

        javax.swing.JPanel panelContenido = new javax.swing.JPanel();
        panelContenido.setLayout(new javax.swing.BoxLayout(panelContenido, javax.swing.BoxLayout.Y_AXIS));
        panelContenido.setBackground(new java.awt.Color(255, 255, 255, 210));
        panelContenido.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170)),
                javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 25)));

        JLabel logo = new JLabel();
        logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        java.net.URL rutaLogo = getClass().getResource("/imagenes/itla.png");

        if (rutaLogo != null) {
            ImageIcon iconoOriginal = new ImageIcon(rutaLogo);
            int anchoOriginal = iconoOriginal.getIconWidth();
            int altoOriginal = iconoOriginal.getIconHeight();

            int anchoDeseado = 185;
            int altoCalculado = (anchoDeseado * altoOriginal) / anchoOriginal;

            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
                    anchoDeseado,
                    altoCalculado,
                    Image.SCALE_SMOOTH);

            logo.setIcon(new ImageIcon(imagenEscalada));
            panelContenido.add(logo);
            panelContenido.add(javax.swing.Box.createVerticalStrut(8));
        }

        JLabel texto = new JLabel(
                "<html>"
                        + "<div style='text-align:center; width:380px; margin-left:auto; margin-right:auto; font-family:Papyrus, Arial, sans-serif;'>"
                        + "<h1 style='font-size:15px; margin-top:2px; margin-bottom:10px;'>Sistema Bibliotecario</h1>"
                        + "<p style='font-size:9px; margin-top:0; margin-bottom:10px;'>Proyecto Final desarrollado para la materia<br>"
                        + "<b>Programación 1</b><br>(SOF-003)</p>"
                        + "<p style='font-size:9px; margin-top:0; margin-bottom:10px;'><b>INSTITUCIÓN</b><br>"
                        + "Instituto Tecnológico de las Américas (ITLA)</p>"
                        + "<p style='font-size:9px; margin-top:0; margin-bottom:5px;'><b>INTEGRANTES</b></p>"
                        + "<p style='font-size:9px; line-height:1.25; margin-top:0; margin-bottom:10px;'>"
                        + "Reydi Isaac Charles Frias<br>2015-2965<br>"
                        + "Francis Jairo Matias Rosario<br>2015-2984<br>"
                        + "Eduandy Isabel Cruz Abreu<br>2015-3017<br>"
                        + "Orlando Antonio Dominici Vanterpool<br>2015-3029<br>"
                        + "Freddy Nicolas Mejia Peña<br>2015-3038"
                        + "</p>"
                        + "<p style='font-size:9px; margin-top:0; margin-bottom:10px;'><b>PROFESOR</b><br>"
                        + "Keneth John Aponte Alonzo</p>"
                        + "<p style='font-size:9px; margin-top:0; margin-bottom:8px;'><b>PERIODO ACADEMICO</b><br>"
                        + "2016 - C3</p>"
                        + "<p style='font-size:9px; margin-top:0; margin-bottom:2px;'>"
                        + "<b>MANTENIMIENTO Y CORRECCIÓN<br>DE FUNCIONALIDADES</b><br>"
                        + "Junio 2026</p>"
                        + "</div>"
                        + "</html>");

        texto.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panelContenido.add(texto);

        javax.swing.JButton aceptar = new javax.swing.JButton("Aceptar");
        aceptar.setFont(new java.awt.Font("Papyrus", java.awt.Font.BOLD, 14));
        aceptar.setAlignmentX(javax.swing.JButton.CENTER_ALIGNMENT);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogo.dispose();
            }
        });

        panelContenido.add(javax.swing.Box.createVerticalStrut(8));
        panelContenido.add(aceptar);

        aceptar.getInputMap(javax.swing.JComponent.WHEN_FOCUSED).put(
                javax.swing.KeyStroke.getKeyStroke("ENTER"),
                "pressEnter");

        aceptar.getActionMap().put("pressEnter", new javax.swing.AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                aceptar.doClick();
            }
        });

        dialogo.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 560, 720));
        dialogo.add(fondoAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 820));

        dialogo.getRootPane().setDefaultButton(aceptar);
        dialogo.setVisible(true);
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
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelicon;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextuser;
    private javax.swing.JPanel panelLogin;
}