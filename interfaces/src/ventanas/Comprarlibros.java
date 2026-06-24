package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

public class Comprarlibros extends javax.swing.JFrame {

    private final String[] nombresLibros = {
            "Don Quijote de la Mancha",
            "Cien años de soledad",
            "La Odisea",
            "El Principito",
            "Programación en Java",
            "Base de Datos Básica",
            "Ingeniería de Software"
    };

    private final int[] precios = {
            500, 650, 450, 350, 900, 800, 1000
    };

    private int total = 0;
    private boolean compraRealizada = false;

    public Comprarlibros() {
        initComponents();
        this.setSize(560, 420);
        this.setLocationRelativeTo(null);
        cargarLibrosDisponibles();

        activarEnterEnBotones(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6);
    }

    private void cargarLibrosDisponibles() {
        String lista = "";
        for (int i = 0; i < nombresLibros.length; i++) {
            lista += (i + 1) + ". " + nombresLibros[i] + " - RD$" + formatearMonto(precios[i]) + "\n";
        }
        libros.setText(lista);
    }

    private String formatearMonto(int monto) {
        return String.format("%,d", monto);
    }

    private void agregarLibroSeleccionado(int indice) {
        seleccionados.append((indice + 1) + ". " + nombresLibros[indice]
                + " - RD$" + formatearMonto(precios[indice]) + "\n");
        total += precios[indice];
        compraRealizada = false;
    }

    private String obtenerFechaActual() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(new Date());
    }

    private String generarDetalleFactura() {
        return "========================================\n"
                + "SISTEMA BIBLIOTECARIO\n"
                + "========================================\n\n"
                + "FACTURA DE COMPRA\n\n"
                + "Fecha: " + obtenerFechaActual() + "\n"
                + "Cliente: Usuario del sistema\n\n"
                + "----------------------------------------\n"
                + "LIBROS COMPRADOS\n"
                + "----------------------------------------\n\n"
                + seleccionados.getText() + "\n"
                + "----------------------------------------\n"
                + "TOTAL PAGADO: RD$" + formatearMonto(total) + "\n"
                + "----------------------------------------\n\n"
                + "Gracias por utilizar nuestro\n"
                + "Sistema Bibliotecario.\n\n"
                + "Proyecto Final\n"
                + "Programación 1 (SOF-003)\n"
                + "2016";
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelCompra = new javax.swing.JPanel();
        Listadelibros = new javax.swing.JLabel();
        librosselec = new javax.swing.JLabel();
        libros = new javax.swing.JTextArea();
        seleccionados = new javax.swing.JTextArea();
        jScrollPaneLibros = new javax.swing.JScrollPane();
        jScrollPaneSeleccionados = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 102, 204));
        jButton5.setFont(new java.awt.Font("Papyrus", java.awt.Font.BOLD, 16));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 0, 80, 32));

        panelCompra.setBackground(new Color(255, 255, 255, 170));
        panelCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(170, 170, 170)));
        getContentPane().add(panelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 35, 525, 350));

        Listadelibros.setFont(new java.awt.Font("Papyrus", 1, 18));
        Listadelibros.setText("Lista de libros:");
        getContentPane().add(Listadelibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 45, 180, 25));

        libros.setColumns(20);
        libros.setRows(5);
        libros.setEditable(false);
        libros.setFont(new java.awt.Font("Monospaced", 0, 13));
        jScrollPaneLibros.setViewportView(libros);
        getContentPane().add(jScrollPaneLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 330, 115));

        librosselec.setFont(new java.awt.Font("Papyrus", 1, 18));
        librosselec.setText("Lista de libros seleccionados:");
        getContentPane().add(librosselec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 25));

        seleccionados.setColumns(20);
        seleccionados.setRows(5);
        seleccionados.setEditable(false);
        seleccionados.setFont(new java.awt.Font("Monospaced", 0, 13));
        jScrollPaneSeleccionados.setViewportView(seleccionados);
        getContentPane().add(jScrollPaneSeleccionados,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 125));

        jButton1.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 135, 34));

        jButton2.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton2.setText("Seleccionar todo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 125, 165, 34));

        jButton3.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 225, 120, 34));

        jButton4.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton4.setText("Comprar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 120, 34));

        jButton6.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton6.setText("Crear factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 315, 145, 34));

        ImageIcon fondoOriginal = new ImageIcon(getClass().getResource("/imagenes/fondito.png"));
        Image fondoEscalado = fondoOriginal.getImage().getScaledInstance(560, 420, Image.SCALE_SMOOTH);
        fondo.setIcon(new ImageIcon(fondoEscalado));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        getContentPane().setComponentZOrder(fondo, getContentPane().getComponentCount() - 1);
        getContentPane().setComponentZOrder(panelCompra, getContentPane().getComponentCount() - 2);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String opcion = javax.swing.JOptionPane.showInputDialog(this,
                "Ingrese el número del libro que desea seleccionar:",
                "Seleccionar libro",
                javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (opcion == null) {
            return;
        }

        try {
            int numeroLibro = Integer.parseInt(opcion.trim());

            if (numeroLibro < 1 || numeroLibro > nombresLibros.length) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Debe ingresar un número entre 1 y " + nombresLibros.length + ".",
                        "Número inválido",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            agregarLibroSeleccionado(numeroLibro - 1);

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Libro seleccionado correctamente.",
                    "Selección",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe ingresar un número válido.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        seleccionados.setText("");
        total = 0;
        compraRealizada = false;

        for (int i = 0; i < nombresLibros.length; i++) {
            agregarLibroSeleccionado(i);
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Todos los libros fueron seleccionados.",
                "Selección",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (total <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe seleccionar al menos un libro para calcular.",
                    "Total",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Total a pagar: RD$" + formatearMonto(total),
                "Total",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (total <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe seleccionar al menos un libro antes de comprar.",
                    "Compra",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        compraRealizada = true;

        javax.swing.JOptionPane.showMessageDialog(this,
                "Compra realizada correctamente.\nTotal pagado: RD$" + formatearMonto(total),
                "Compra exitosa",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (total <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe seleccionar al menos un libro para crear la factura.",
                    "Factura",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!compraRealizada) {
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,
                    "La compra todavía no ha sido confirmada.\n¿Desea crear la factura de todos modos?",
                    "Confirmar factura",
                    javax.swing.JOptionPane.YES_NO_OPTION);

            if (respuesta != javax.swing.JOptionPane.YES_OPTION) {
                return;
            }
        }

        facturas factura = new facturas(generarDetalleFactura());
        factura.setVisible(true);
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
                new Comprarlibros().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Listadelibros;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPaneLibros;
    private javax.swing.JScrollPane jScrollPaneSeleccionados;
    private javax.swing.JTextArea libros;
    private javax.swing.JLabel librosselec;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JTextArea seleccionados;
}