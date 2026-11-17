# Changelog

Registro breve de la historia de **Sistema Bibliotecario** (ITLA · Programación 1 · SOF-003 · 2016-C3), orientado a su preservación como software académico legado. Las fechas de 2026 provienen del historial Git del repositorio.

## [v1.0.1] - 2026-11-17 - Final Preservation

Auditoría final y cierre de mantenimiento. Versión congelada del proyecto.

### Corregido

- **Registro e inicio de sesión coherentes.** El formulario de registro anunciaba «Usuario registrado correctamente», pero el login solo aceptaba `admin / 1234`. Se añadió `AlmacenUsuarios`, un almacén en memoria compartido durante la ejecución: los usuarios creados pueden iniciar sesión mientras la aplicación permanece abierta y se pierden al cerrarla. Se valida usuario duplicado; los campos vacíos y la confirmación de contraseña ya se validaban. `admin / 1234` sigue siendo la cuenta de demostración.
- **Imprimir.** El botón mostraba un mensaje de éxito sin imprimir. Ahora abre el diálogo de impresión nativo de Java (`JTextPane.print()`), informa la cancelación, avisa si no hay impresoras y muestra el error de `PrinterException`. El mensaje de éxito solo aparece si la impresión se envió.
- **Selecciones duplicadas.** En préstamos y compras, «Seleccionar» permitía repetir el mismo libro, lo que duplicaba préstamos e inflaba el total. Ahora se avisa que el libro ya está en la lista; «Seleccionar todo» sigue funcionando sin duplicar.
- **Workflow de GitHub Actions.** Ya no publica una versión fija con `--clobber`. `master` y los pull requests solo generan artifacts de CI; un tag `vX.Y.Z` crea la release usando `github.ref_name`, exige que el commit pertenezca a `master` y nunca reemplaza los assets de una release existente.

### Documentación

- README revisado para coincidir con el comportamiento real: sección de descarga y ejecución, registro de sesión, compilación con Ant fuera de NetBeans, estructura completa del repositorio, línea de tiempo y limitaciones conocidas. Se eliminaron la sección «Continuidad académica» y la sección de capturas que describía archivos inexistentes.
- Nuevos `CHANGELOG.md` y `docs/QA-CHECKLIST.md`; actualizados `docs/ARCHITECTURE.md`, `docs/EXECUTABLE.md` y `docs/PRESERVATION.md`.

## [v1.0.0] - 2026-09-04 - Academic Restoration

Primera release ejecutable, publicada el 2026-09-05 (UTC) desde el commit `2dc1e6a`. Se conserva sin cambios como evidencia de la primera restauración.

- Preservación histórica: rama `archive/academic-restoration-2026` con el estado previo a la limpieza.
- Limpieza del árbol principal: se retiraron `build/`, `nbproject/private/` y metadatos de macOS.
- Archivos de SQL Server reubicados en `legacy/database/` y recursos gráficos originales en `legacy/assets-original/`.
- GitHub Actions genera `SistemaBibliotecario.jar` y `SistemaBibliotecario-Windows-x64.zip` (`SistemaBibliotecario.exe` con runtime Java integrado).

## 2026-06 a 2026-08 - Restauración funcional y documental

- Restauración del flujo funcional (2026-06-23 y 2026-06-24): validación del login, menú con cierre de sesión, préstamos y compras operativos, facturas y recibos dinámicos con el logo del ITLA, navegación con ENTER, ventana Acerca de y paneles semitransparentes sobre el fondo original.
- Compatibilidad con versiones modernas de Java.
- README, logo del proyecto y documentación de arquitectura (julio y agosto de 2026).

## 2016-C3 - Proyecto académico original

- Proyecto final grupal de Programación 1 (SOF-003) en el ITLA, profesor Keneth John Aponte Alonzo.
- Java Swing con formularios de Apache NetBeans: login, registro, menú, préstamos, compras y comprobante.
- El código se subió a GitHub por primera vez el 2020-03-24.
