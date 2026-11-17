# Lista de aceptación — versión congelada v1.0.1

Lista manual de aceptación de **Sistema Bibliotecario v1.0.1**. Cada verificación indica si fue **automatizada** durante la auditoría final o si **requiere prueba manual**.

Convención de resultados:

- **PASS**: verificación ejecutada realmente y superada.
- **PENDIENTE**: no se ejecutó en la auditoría; debe comprobarse a mano.
- Nunca se marca PASS una prueba que no se haya ejecutado.

## Entorno de la auditoría automatizada (2026-11-17)

- JAR construido desde cero con los mismos pasos del workflow (`javac --release 8`, AbsoluteLayout incluido, recursos de `imagenes/`).
- Ejecución de las ventanas reales del JAR en Linux con OpenJDK 21 y pantalla virtual Xvfb, mediante un arnés externo al repositorio que pulsa los botones y lee los diálogos `JOptionPane`.
- Sin impresoras instaladas y sin la fuente Papyrus (Java usa una fuente sustituta), por lo que el aspecto visual exacto no se evalúa en este entorno.
- Windows no estaba disponible: lo específico de `SistemaBibliotecario.exe` queda como prueba manual.

## Construcción y artefactos

| # | Verificación | Tipo | Resultado |
|---|---|---|---|
| B1 | Todos los `.java` compilan con `javac --release 8` | Automatizada (local y CI) | PASS |
| B2 | El JAR contiene `ventanas/interfaz.class`, AbsoluteLayout e imágenes de `imagenes/` | Automatizada (local y CI) | PASS |
| B3 | `Main-Class: ventanas.interfaz` en el manifiesto | Automatizada (local) | PASS |
| B4 | `jpackage` genera `SistemaBibliotecario.exe` y `runtime/` en Windows | Automatizada (CI, `windows-latest`) | PASS ([ejecución 44166157685](https://github.com/Jairo0811/SistemaBibliotecario/actions/runs/44166157685), PR #6) |
| B5 | `ant -f interfaces -Dlibs.absolutelayout.classpath=… clean jar` genera `ProyectoFinal.jar` | Automatizada (local) | PASS |
| B6 | `build/`, `dist/`, `.class` y `nbproject/private/` no quedan en Git | Automatizada (`git status`) | PASS |

## Aplicación

| # | Verificación | Tipo | Resultado |
|---|---|---|---|
| A1 | Abrir `SistemaBibliotecario.exe` desde el ZIP en Windows sin Java instalado | Manual | PENDIENTE |
| A2 | Abrir el JAR (`java -jar SistemaBibliotecario.jar`) muestra el Login | Automatizada (Xvfb) | PASS |
| A3 | Login `admin / 1234` → Menú principal | Automatizada | PASS |
| A4 | Login inválido muestra «Usuario o contraseña incorrectos» y permanece en Login | Automatizada | PASS |
| A5 | Login con campos vacíos solicita usuario y contraseña | Automatizada | PASS |
| A6 | Registro con campos vacíos o contraseñas distintas es rechazado | Automatizada | PASS |
| A7 | Registro temporal válido informa que dura solo la sesión y vuelve al Login | Automatizada | PASS |
| A8 | Login con el usuario recién registrado → Menú principal | Automatizada | PASS |
| A9 | Registrar un usuario existente (`admin` o uno creado en la sesión) es rechazado sin cambiar su contraseña | Automatizada | PASS |
| A10 | Al reiniciar la aplicación, el usuario registrado ya no existe | Manual | PENDIENTE |
| A11 | ENTER activa el botón enfocado (Acerca de, Sign Up) | Automatizada | PASS |
| A12 | ENTER en el campo de contraseña ejecuta Login | Automatizada | PASS |
| A13 | Préstamos: seleccionar un libro por número; número fuera de rango o texto inválido muestran aviso | Automatizada | PASS |
| A14 | Préstamos: seleccionar dos veces el mismo libro no lo duplica | Automatizada | PASS |
| A15 | Préstamos: «Seleccionar todo» (una o dos veces) deja exactamente 7 libros | Automatizada | PASS |
| A16 | Préstamos: «Crear recibo» sin libros es bloqueado; con libros genera recibo con fecha de devolución | Automatizada | PASS |
| A17 | Compras: el mismo libro dos veces no infla el total (RD$650 con el libro 2) | Automatizada | PASS |
| A18 | Compras: «Calcular» muestra el total; «Seleccionar todo» dos veces da RD$4,650 | Automatizada | PASS |
| A19 | Compras: «Comprar» confirma el total; «Crear factura» genera la factura con el total | Automatizada | PASS |
| A20 | Compras: crear factura sin comprar pide confirmación | Automatizada | PASS |
| A21 | Imprimir sin impresoras disponibles avisa y no muestra mensaje de éxito | Automatizada | PASS |
| A22 | Imprimir con impresora abre el diálogo nativo; aceptar imprime y muestra éxito | Manual | PENDIENTE |
| A23 | Imprimir y cancelar el diálogo muestra «La impresión fue cancelada» | Manual | PENDIENTE |
| A24 | Acerca de abre la ventana académica y «Aceptar» la cierra | Automatizada | PASS |
| A25 | «Atras» en préstamos y en el comprobante vuelve al Menú | Automatizada | PASS |
| A26 | Cerrar sesión vuelve al Login | Automatizada | PASS |
| A27 | Cada transición deja una sola ventana principal abierta | Automatizada | PASS |
| A28 | Exit cierra la aplicación | Automatizada (Menú) | PASS |
| A29 | Fondo, tipografía Papyrus, paneles y tamaño de ventanas se ven como en v1.0.0 en Windows | Manual | PENDIENTE |

## Cómo repetir la prueba manual

1. Descargar `SistemaBibliotecario-Windows-x64.zip` de la release `v1.0.1`, descomprimir y abrir `SistemaBibliotecario.exe`.
2. Recorrer las verificaciones marcadas como **PENDIENTE**.
3. Para A22 y A23 basta con una impresora virtual como «Microsoft Print to PDF».
