# Sistema Bibliotecario

Proyecto final desarrollado originalmente en diciembre de 2016 para la materia **Programación 1 (SOF-003)** en el **Instituto Tecnológico de las Américas (ITLA)**.

Este sistema fue desarrollado en **Java Swing** utilizando **NetBeans**. Su propósito es simular operaciones básicas de un sistema bibliotecario, incluyendo registro de usuarios, inicio de sesión, compra de libros, préstamo de libros y generación de facturas o recibos.

## Información del proyecto

**Materia:** Programación 1 (SOF-003)
**Profesor:** Keneth Aponte
**Institución:** Instituto Tecnológico de las Américas (ITLA)
**Versión original:** Diciembre 2016
**Mantenimiento y corrección de funcionalidades:** Junio 2026

## Integrantes

| Nombre                              | Matrícula |
| ----------------------------------- | --------- |
| Reydi Isaac Charles Frias           | 2015-2965 |
| Francis Jairo Matias Rosario        | 2015-2984 |
| Eduandy Isabel Cruz Abreu           | 2015-3017 |
| Orlando Antonio Dominici Vanterpool | 2015-3029 |
| Freddy Nicolas Mejia Peña           | 2015-3038 |

## Funcionalidades principales

* Inicio de sesión.
* Navegación con la tecla Enter en los botones.
* Registro de usuarios con validación de campos.
* Pantalla “Acerca de” con información del proyecto e institución.
* Menú principal para seleccionar entre compra o préstamo de libros.
* Compra de libros con selección individual o selección completa.
* Cálculo del total de compra.
* Generación de factura dinámica.
* Préstamo de libros con selección individual o selección completa.
* Generación de recibo dinámico con fecha de devolución.
* Botones de navegación, salida e impresión funcionales.

## Tecnologías utilizadas

* Java
* Java Swing
* Apache NetBeans
* Ant

## Requisitos

Para ejecutar el proyecto se recomienda tener instalado:

* JDK 8 o superior.
* Apache NetBeans.
* Git, opcional para clonar el repositorio.

El proyecto fue actualizado para compilar con:

```properties
javac.source=1.8
javac.target=1.8
```

## Cómo ejecutar el proyecto

1. Clonar o descargar el repositorio.
2. Abrir Apache NetBeans.
3. Seleccionar **File > Open Project**.
4. Abrir la carpeta:

```text
interfaces
```

5. Ejecutar el proyecto desde NetBeans usando **Run Project** o la tecla **F6**.

La clase principal del proyecto es:

```text
ventanas.interfaz
```

## Estructura general

```text
SistemaBibliotecario/
├── interfaces/
│   ├── src/
│   │   ├── imagenes/
│   │   └── ventanas/
│   │       ├── interfaz.java
│   │       ├── Registro.java
│   │       ├── Decision.java
│   │       ├── Comprarlibros.java
│   │       ├── prestamos.java
│   │       └── facturas.java
│   ├── nbproject/
│   └── build.xml
└── README.md
```

## Nota sobre archivos generados

Las carpetas `build` y `dist` son generadas automáticamente por NetBeans al compilar el proyecto. No forman parte del código fuente principal y no deben subirse al repositorio.

Archivos que deben evitarse en Git:

```text
interfaces/build/
interfaces/dist/
*.class
```

## Estado del mantenimiento 2026

En junio de 2026 se realizó una revisión del proyecto original para corregir desperfectos funcionales y permitir su ejecución en un entorno moderno de NetBeans y Java.

Las correcciones incluyeron:

* Compatibilidad con Java 8.
* Conexión funcional del login con el menú principal.
* Corrección del registro de usuarios.
* Activación de botones mediante Enter.
* Corrección de navegación entre ventanas.
* Restauración de compra y préstamo de libros.
* Generación dinámica de facturas y recibos.
* Inclusión del logo del ITLA en la pantalla “Acerca de”.

## Licencia

Proyecto académico creado con fines educativos.
