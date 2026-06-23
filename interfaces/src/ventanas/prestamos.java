package ventanas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class prestamos extends javax.swing.JFrame {

    private final String[] librosDisponibles = {
        "Don Quijote de la Mancha",
        "Cien años de soledad",
        "La Odisea",
        "El Principito",
        "Programación en Java",
        "Base de Datos Básica",
        "Ingeniería de Software"
    };

    private boolean prestamoRealizado = false;

    public prestamos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarLibrosDisponibles();

        activarEnterEnBotones(jButton1, jButton2, jButton3, jButton4, jButton5);
    }

    private void cargarLibrosDisponibles() {
        String lista = "";
        for (int i = 0; i < librosDisponibles.length; i++) {
            lista += (i + 1) + ". " + librosDisponibles[i] + "\n";
        }
        librosdis.setText(lista);
    }

    private void agregarLibroSeleccionado(int indice) {
        seleccionados.append((indice + 1) + ". " + librosDisponibles[indice] + "\n");
        prestamoRealizado = false;
    }

    private String obtenerFechaActual() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(new Date());
    }

    private String obtenerFechaDevolucion() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Calendar calendario = java.util.Calendar.getInstance();
        calendario.add(java.util.Calendar.DAY_OF_MONTH, 7);
        return formato.format(calendario.getTime());
    }

    private String generarDetallePrestamo() {
        return "========================================\n"
                + "        SISTEMA BIBLIOTECARIO\n"
                + "========================================\n\n"
                + "RECIBO DE PRESTAMO\n\n"
                + "Fecha de prestamo: " + obtenerFechaActual() + "\n"
                + "Fecha de devolucion: " + obtenerFechaDevolucion() + "\n"
                + "Cliente: Usuario del sistema\n\n"
                + "----------------------------------------\n"
                + "LIBROS PRESTADOS\n"
                + "----------------------------------------\n\n"
                + seleccionados.getText() + "\n"
                + "----------------------------------------\n"
                + "COSTO: RD$0\n"
                + "----------------------------------------\n\n"
                + "Nota:\n"
                + "Los libros deben ser devueltos en la\n"
                + "fecha indicada para evitar penalidades.\n\n"
                + "Proyecto Final\n"
                + "Programacion 1 (SOF-003)\n"
                + "ITLA - Diciembre 2016";
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        listadelibros = new javax.swing.JLabel();
        librosdis = new javax.swing.JTextArea();
        seleccionados = new javax.swing.JTextArea();
        jScrollPaneLibros = new javax.swing.JScrollPane();
        jScrollPaneSeleccionados = new javax.swing.JScrollPane();
        librosseleccionados = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listadelibros.setFont(new java.awt.Font("Papyrus", 1, 18));
        listadelibros.setText("Lista de libros disponibles:");
        getContentPane().add(listadelibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        librosdis.setColumns(20);
        librosdis.setRows(5);
        librosdis.setEditable(false);
        jScrollPaneLibros.setViewportView(librosdis);
        getContentPane().add(jScrollPaneLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 340, 120));

        librosseleccionados.setFont(new java.awt.Font("Papyrus", 1, 18));
        librosseleccionados.setText("Libros seleccionados:");
        getContentPane().add(librosseleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        seleccionados.setColumns(20);
        seleccionados.setRows(5);
        seleccionados.setEditable(false);
        jScrollPaneSeleccionados.setViewportView(seleccionados);
        getContentPane().add(jScrollPaneSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 340, 90));

        jButton1.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jButton2.setFont(new java.awt.Font("Papyrus", 1, 14));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton3.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jButton4.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton4.setText("Seleccionar todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jButton5.setFont(new java.awt.Font("Papyrus", 1, 16));
        jButton5.setText("Crear recibo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondito.png")));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Decision obj1 = new Decision();
        obj1.setVisible(true);
        dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        String opcion = javax.swing.JOptionPane.showInputDialog(this,
                "Ingrese el número del libro que desea prestar:",
                "Seleccionar libro",
                javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (opcion == null) {
            return;
        }

        try {
            int numeroLibro = Integer.parseInt(opcion.trim());

            if (numeroLibro < 1 || numeroLibro > librosDisponibles.length) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Debe ingresar un número entre 1 y " + librosDisponibles.length + ".",
                        "Número inválido",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            agregarLibroSeleccionado(numeroLibro - 1);

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Libro seleccionado para préstamo correctamente.",
                    "Préstamo",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe ingresar un número válido.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        seleccionados.setText("");
        prestamoRealizado = false;

        for (int i = 0; i < librosDisponibles.length; i++) {
            agregarLibroSeleccionado(i);
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Todos los libros fueron seleccionados para préstamo.",
                "Préstamo",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (seleccionados.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe seleccionar al menos un libro para crear el recibo.",
                    "Recibo",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        prestamoRealizado = true;

        facturas recibo = new facturas(generarDetallePrestamo());
        recibo.setVisible(true);
        dispose();
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
                new prestamos().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPaneLibros;
    private javax.swing.JScrollPane jScrollPaneSeleccionados;
    private javax.swing.JTextArea librosdis;
    private javax.swing.JLabel librosseleccionados;
    private javax.swing.JLabel listadelibros;
    private javax.swing.JTextArea seleccionados;
}