# Preservación del proyecto

Este repositorio conserva **Sistema Bibliotecario**, proyecto final de **Programación 1 (SOF-003)** desarrollado en el ITLA durante el período **2016-C3** y restaurado técnicamente en 2026.

## Principio de conservación

La versión actual no pretende convertir el proyecto en un producto moderno ni reescribir su arquitectura. El objetivo es preservar una pieza académica funcional, comprensible y ejecutable, manteniendo su identidad Java Swing/NetBeans y documentando con claridad qué pertenece al código fuente y qué corresponde a artefactos históricos.

## Respaldo histórico

Antes de la limpieza final de 2026 se creó la rama:

`archive/academic-restoration-2026`

Esa rama apunta al estado completo previo a la depuración del repositorio, incluyendo archivos generados por NetBeans, metadatos de macOS, configuración privada local y los archivos de base de datos que originalmente estaban en la raíz.

## Qué se conserva en `master`

- Código fuente Java y formularios Swing.
- Recursos visuales utilizados por la aplicación.
- Archivos reproducibles del proyecto NetBeans/Ant.
- Documentación técnica y académica.
- Artefactos históricos de SQL Server reubicados en `legacy/database/`.
- Recursos gráficos originales no usados por el runtime actual, reubicados en `legacy/assets-original/`.

## Qué se eliminó del árbol principal

- `interfaces/build/` y clases compiladas.
- `interfaces/nbproject/private/`.
- `.DS_Store`, `._*` y `__MACOSX/`.

Estos elementos no forman parte del código fuente ni son necesarios para compilar el proyecto. Permanecen recuperables en la rama histórica y en el historial de Git.

## Auditoría final y congelación (v1.0.1, noviembre 2026)

La auditoría final corrigió únicamente inconsistencias funcionales y documentales; no hubo rediseño ni nuevas dependencias. El detalle está en [`CHANGELOG.md`](../CHANGELOG.md) y la verificación en [`QA-CHECKLIST.md`](QA-CHECKLIST.md).

Decisiones tomadas para preservar el material histórico:

- **Release `v1.0.0`:** se mantiene con su tag y sus binarios originales. Las correcciones se publican como `v1.0.1`.
- **Nombres de clase** (`interfaz`, `prestamos`, `facturas`, etc.): se conservan aunque no sigan las convenciones modernas de Java, porque están ligados a los archivos `.form` de NetBeans.
- **Comentarios y autoría:** se conservan los comentarios de cabecera generados por NetBeans y las etiquetas `@author` de `Registro.java` y `Decision.java`, incluidas las fechas de creación de noviembre de 2016, porque pueden aportar información de procedencia. Las cabeceras equivalentes de las otras ventanas se retiraron en la restauración de junio de 2026 y siguen disponibles en el historial Git desde el primer commit (`c21babc`).
- **Archivos `.form`:** se conservan como evidencia del diseño de 2016. La restauración de junio de 2026 reescribió a mano `initComponents()` y retiró los bloques protegidos `//GEN-BEGIN`/`//GEN-END`, por lo que el diseño vigente está en el código Java y los `.form` ya no lo reflejan. El proyecto sigue abriéndose, compilando y ejecutándose en NetBeans/Ant; el código debe editarse desde la vista **Source** y no conviene regenerarlo con el GUI Builder (vista **Design**), porque eso podría reemplazar los ajustes de la restauración.
- **Imágenes:** `docs/logo.png` (banner del README) y `docs/logo.jpeg` (variante cuadrada) son versiones distintas del logo y se conservan ambas. `interfaces/src/imagenes/logo.png` no se carga en tiempo de ejecución, pero forma parte de los recursos originales del proyecto NetBeans y se mantiene.
- **Base de datos histórica:** `legacy/database/` queda intacta y fuera del runtime. El registro restaurado no usa base de datos ni archivos.

## Regla para futuras modificaciones

Este proyecto se considera **finalizado, preservado y congelado en `v1.0.1`**. Las modificaciones futuras deberían limitarse a correcciones de documentación, compatibilidad o preservación. Una evolución comercial o una reescritura moderna debe realizarse en un repositorio independiente.
