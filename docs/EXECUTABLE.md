# Ejecutables y distribución

El repositorio mantiene el código fuente limpio y no versiona carpetas generadas como `build/` o `dist/`.

Los ejecutables oficiales se generan de forma reproducible con GitHub Actions y se publican en **[GitHub Releases](https://github.com/Jairo0811/SistemaBibliotecario/releases/latest)**. La versión vigente siempre está en `/releases/latest`.

## Resumen

| Forma de uso | Archivo | Incluye runtime Java | Requisito |
|---|---|:---:|---|
| Paquete Windows | `SistemaBibliotecario-Windows-x64.zip` | ✅ | Windows x64 |
| JAR ejecutable | `SistemaBibliotecario.jar` | ❌ | Java 8 o superior instalado |
| Código fuente | Repositorio | ❌ | JDK 8 o superior, NetBeans o Ant, AbsoluteLayout |

## `SistemaBibliotecario-Windows-x64.zip`

Paquete para Windows x64 generado con `jpackage` (tipo *app-image*). Contiene:

- `SistemaBibliotecario.exe`;
- `runtime/`, un runtime Java integrado;
- `app/`, con `SistemaBibliotecario.jar`.

No requiere instalar Java por separado. Uso:

1. Descargar el ZIP de la release.
2. Descomprimirlo en cualquier carpeta.
3. Abrir `SistemaBibliotecario.exe`.

El `.exe` no tiene firma digital, por lo que Windows SmartScreen puede pedir confirmación la primera vez.

## `SistemaBibliotecario.jar`

JAR ejecutable autocontenido: incluye las clases de la aplicación, las imágenes de `imagenes/` y la biblioteca `AbsoluteLayout` de NetBeans. Se compila con `--release 8`, por lo que funciona con Java 8 o cualquier versión posterior.

```bash
java -jar SistemaBibliotecario.jar
```

## Compilación desde el código fuente

La clase principal original definida por NetBeans es:

```text
ventanas.interfaz
```

El nombre de distribución histórico configurado en `interfaces/nbproject/project.properties` es `ProyectoFinal.jar`, y se conserva sin cambios.

- **NetBeans:** abrir la carpeta `interfaces` y ejecutar **Clean and Build** / **Run Project**. NetBeans aporta AbsoluteLayout desde sus bibliotecas.
- **Ant desde la terminal:** indicar la ubicación de AbsoluteLayout, que fuera de NetBeans no se resuelve sola:

  ```bash
  ant -f interfaces -Dlibs.absolutelayout.classpath=/ruta/a/AbsoluteLayout.jar clean jar
  java -cp "interfaces/dist/ProyectoFinal.jar:/ruta/a/AbsoluteLayout.jar" ventanas.interfaz
  ```

  En Windows el separador del classpath es `;`. El `ProyectoFinal.jar` generado por Ant no incluye AbsoluteLayout; por eso se indica en el classpath.

`AbsoluteLayout.jar` está incluido en Apache NetBeans y publicado en Maven Central como `org.netbeans.external:AbsoluteLayout` (el workflow usa la versión `RELEASE180`).

## Cómo se publican las versiones

El workflow [`.github/workflows/build-release.yml`](../.github/workflows/build-release.yml) funciona así:

| Evento | Resultado |
|---|---|
| Push a `master` o pull request que toca `interfaces/` o el workflow | Compila, verifica el JAR, genera el paquete Windows y los sube como *artifacts* de CI. No toca ninguna release. |
| Push de un tag `vX.Y.Z` | Ejecuta la misma compilación y crea la GitHub Release de ese tag con ambos archivos. |

Reglas de publicación:

- La versión se toma de `github.ref_name`; no hay versiones escritas a mano en el workflow.
- El tag debe tener el formato `vMAJOR.MINOR.PATCH` y apuntar a un commit que forme parte de `master`.
- Si la release ya existe, el workflow falla en lugar de sobrescribirla: los assets publicados son inmutables.
- Las notas de la release se toman de la sección correspondiente de [`CHANGELOG.md`](../CHANGELOG.md).

## Versiones publicadas

| Versión | Commit | Descripción |
|---|---|---|
| `v1.0.0` | `2dc1e6a` | Academic Restoration: primera release ejecutable (septiembre 2026). Se conserva sin cambios. |
| `v1.0.1` | Tag `v1.0.1` | Final Preservation: auditoría final y versión congelada (noviembre 2026). |

## Preservación

Los ejecutables son productos derivados del código fuente y por eso no se almacenan dentro del árbol principal del repositorio. La rama `archive/academic-restoration-2026` conserva el estado anterior a la limpieza final.
