package ventanas;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class facturas extends javax.swing.JFrame {

    private String detalleFactura;

    public facturas() {
        this.detalleFactura = generarFacturaEjemplo();
        initComponents();
        this.setLocationRelativeTo(null);
        cargarFacturaConLogo();

        activarEnterEnBotones(exit, imprimir, atras);
    }

    public facturas(String detalleFactura) {
        this.detalleFactura = centrarTituloSistema(detalleFactura);
        initComponents();
        this.setLocationRelativeTo(null);
        cargarFacturaConLogo();

        activarEnterEnBotones(exit, imprimir, atras);
    }

    private String obtenerFechaActual() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(new Date());
    }

    private String centrarTituloSistema(String texto) {
        return texto.replace("        SISTEMA BIBLIOTECARIO", "           SISTEMA BIBLIOTECARIO");
    }

    private String generarFacturaEjemplo() {
        return "========================================\n"
                + "           SISTEMA BIBLIOTECARIO\n"
                + "========================================\n\n"
                + "FACTURA DE COMPRA / PRESTAMO\n\n"
                + "Fecha: " + obtenerFechaActual() + "\n"
                + "Cliente: Usuario del sistema\n\n"
                + "----------------------------------------\n"
                + "DETALLE\n"
                + "----------------------------------------\n\n"
                + "1. Don Quijote de la Mancha\n"
                + "2. Cien años de soledad\n"
                + "3. La Odisea\n"
                + "4. El Principito\n"
                + "5. Programación en Java\n"
                + "6. Base de Datos Básica\n"
                + "7. Ingeniería de Software\n\n"
                + "----------------------------------------\n"
                + "TOTAL: RD$4,650\n"
                + "----------------------------------------\n\n"
                + "Gracias por utilizar nuestro\n"
                + "Sistema Bibliotecario.\n\n"
                + "Proyecto Final\n"
                + "Programación 1 (SOF-003)\n"
                + "2016";
    }

    private void cargarFacturaConLogo() {
        factura.setText("");

        StyledDocument documento = factura.getStyledDocument();

        try {
            Style estiloCentrado = factura.addStyle("centrado", null);
            StyleConstants.setAlignment(estiloCentrado, StyleConstants.ALIGN_CENTER);

            Style estiloTexto = factura.addStyle("texto", null);
            StyleConstants.setFontFamily(estiloTexto, "Monospaced");
            StyleConstants.setFontSize(estiloTexto, 13);

            java.net.URL rutaLogo = getClass().getResource("/imagenes/itla.png");

            if (rutaLogo != null) {
                ImageIcon logoOriginal = new ImageIcon(rutaLogo);

                int anchoOriginal = logoOriginal.getIconWidth();
                int altoOriginal = logoOriginal.getIconHeight();

                int anchoDeseado = 120;
                int altoCalculado = (anchoDeseado * altoOriginal) / anchoOriginal;

                Image logoEscalado = logoOriginal.getImage().getScaledInstance(
                        anchoDeseado,
                        altoCalculado,
                        Image.SCALE_SMOOTH);

                Style estiloLogo = factura.addStyle("logo", null);
                StyleConstants.setIcon(estiloLogo, new ImageIcon(logoEscalado));

                documento.insertString(documento.getLength(), "\n", estiloCentrado);
                documento.insertString(documento.getLength(), " ", estiloLogo);
                documento.insertString(documento.getLength(), "\n\n", estiloCentrado);
            }

            documento.insertString(documento.getLength(), detalleFactura, estiloTexto);

            documento.setParagraphAttributes(0, documento.getLength(), estiloCentrado, false);

            factura.setCaretPosition(0);

        } catch (BadLocationException e) {
            factura.setText(detalleFactura);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTextPane();
        exit = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        factura.setEditable(false);
        factura.setFont(new java.awt.Font("Monospaced", 0, 13));
        jScrollPane1.setViewportView(factura);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 350, 300));

        exit.setBackground(new java.awt.Color(0, 102, 204));
        exit.setFont(new java.awt.Font("Papyrus", java.awt.Font.BOLD, 16));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 0, 80, 32));

        imprimir.setFont(new java.awt.Font("Papyrus", 1, 16));
        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        atras.setFont(new java.awt.Font("Papyrus", 1, 16));
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondito.png")));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        pack();
        setSize(560, 430);
    }

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {
        Decision menu = new Decision();
        menu.setVisible(true);
        dispose();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Factura enviada a impresión correctamente.",
                "Imprimir factura",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
                new facturas().setVisible(true);
            }
        });
    }

    private javax.swing.JButton atras;
    private javax.swing.JButton exit;
    private javax.swing.JTextPane factura;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton imprimir;
    private javax.swing.JScrollPane jScrollPane1;
}