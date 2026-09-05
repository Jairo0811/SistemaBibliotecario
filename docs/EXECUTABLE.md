# Ejecutables y distribución

El repositorio mantiene el código fuente limpio y no versiona carpetas generadas como `build/` o `dist/`.

Los ejecutables oficiales se generan de forma reproducible mediante GitHub Actions y se publican en **GitHub Releases**.

## Artefactos

### `SistemaBibliotecario.jar`

JAR ejecutable autocontenido con la dependencia `AbsoluteLayout` incluida.

Ejecución:

```bash
java -jar SistemaBibliotecario.jar
```

### `SistemaBibliotecario-Windows-x64.zip`

Paquete para Windows x64 generado con `jpackage`. Incluye:

- `SistemaBibliotecario.exe`;
- runtime Java integrado;
- dependencias necesarias para ejecutar la aplicación.

No requiere instalar Java por separado.

## Origen

La clase principal original definida por NetBeans es:

```text
ventanas.interfaz
```

El nombre de distribución histórico configurado por el proyecto era:

```text
ProyectoFinal.jar
```

La restauración de 2026 publica el artefacto con el nombre descriptivo `SistemaBibliotecario.jar` sin modificar el código fuente académico.

## Preservación

Los ejecutables son productos derivados del código fuente y por eso no se almacenan dentro del árbol principal del repositorio. La rama `archive/academic-restoration-2026` conserva el estado anterior a la limpieza final.
