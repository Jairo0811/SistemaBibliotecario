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

## Regla para futuras modificaciones

Este proyecto se considera **finalizado y preservado**. Las modificaciones futuras deberían limitarse a correcciones de documentación, compatibilidad o preservación. Una evolución comercial o una reescritura moderna debe realizarse en un repositorio independiente.
