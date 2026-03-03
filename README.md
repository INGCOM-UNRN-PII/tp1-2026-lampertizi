# TP 1 - Verificación y primeros pasos

Este Trabajo Práctico tiene como objetivo validar la correcta instalación del entorno de desarrollo
y ayudarlos a adquirir familiaridad básica con el flujo de trabajo (Git -> Gradle -> Java -> IDE).

## Puesta en marcha

Git instalado y configurado con su nombre y email (`user.name` y `user.email`.) IntelliJ lo trae integrado,
pero tenerlo en la consola es (a mi gusto) más comodo. Les dejé los apuntes en el repositorio de
la [cursada](https://dub.sh/p2/cursada)

### Organización de trabajo recomendada

Vamos a trabajar con un conjunto de prácticas a lo largo del cuatrimestre, por lo que les recomiendo que
dejen una carpeta la raíz del perfil de usuario de su computadora para tener acceso centralizado a los
repositorios entregables, material y extras que vendrán.

Por ejemplo, para el usuario 'martin'

```
# Windows
C:\Users\martin\dev\p2\...
# Linux
/home/martin/dev/p2/...
```

Esto es solo una sugerencia de todas formas.

### Descargas

- IDE - [IntelliJ Idea](https://www.jetbrains.com/idea/download/?section=windows)
- Entorno de ejecución - [Java 25](https://www.oracle.com/java/technologies/downloads/#jdk25-windows)

### Guías de instalación y configuración

- [Instalación y configuración inicial - IntelliJ Idea](https://ingcom-unrn-pii.github.io/instalacion-intellij/)
- [Instalación del entorno de ejecución - Java 25](https://ingcom-unrn-pii.github.io/instalacion-jdk/)

### La practica en sí

Este repositorio clonado.

## La estructura de directorios

Es muy importante que la estructura que contiene el repositorio no cambie.
Veremos las razones en clases, y está relacionado con el funcionamiento de Gradle.

La ubicación para agregar nuevos archivos de código Java, es
`/src/main/java/ar/unrn/`. Cualquier otra ubicación no funcionará correctamente

Asimismo, los archivos que contengan un `main` deben terminar en `App` para
distinguirlos de futuros archivos.

Y parecido a esto, se encuentra la ubicación `/src/test/java/ar/unrn/`, en
donde se deben de alojar los archivos de pruebas.

Asimismo, todos los archivos `.md`, deben estar alojados en la carpeta `informes`
que se encuentra en la raíz.

## Ejercicio 1

Agregar un archivo markdown llamado [`informes/java.md`](informes/java.md) a la
raíz del repositorio conteniendo la salida de `java --version` que obtengan en
la terminal.

Una forma simple es emplear una redirección.
`java --version > java.md`

> Sé que es probable que no estén muy familiarizados con la terminal, por lo
> que espero que abran hilo si se encuentran con dificultades en este paso cosa
> explicarlo, en el repositorio de la cursada hay material al respecto.

Si ven "Command not found", esta faltando configurarlo dentro del "Path".

## Ejercicio 2 - `HolaApp`

1. Ejecuten `HolaApp` (`src/main/java/ar/unrn/HolaApp.java` ya provisto)
2. En un archivo llamado [`informes/HolaApp.md`](informes/HolaApp.md), guarden la del programa cuando
    1. Pasan palabras.
    2. Pasan números.
    3. Pasan emojis.

Utilicen encabezados para indicar que le indicaron al programa, por ejemplo:

```markdown
# HolaApp

Que pasa cuando le pasamos...

### Texto

Esta es la salida cuando le pasamos texto al programa

### Números

Esta es la salida cuando le pasamos números al programa

### Emojis

Esta es la salida cuando le pasamos emojis al programa
```

Tengan presente que forma parte del programa en sí, y que del gradle (que se encarga
de ejecutar el programa)

## Ejercicio 3

1. Ejecuten el archivo
2. Utilicen el auto-formato con el archivo `Desordenado.java`.
3. Vuelvan a ejecutar el archivo

Vean como antes y después, el código que contiene, es entendido tanto por el entorno
como por Java.

**Observación:** Analiza los cambios. Aunque Java ignora los espacios en blanco adicionales (al igual que C), pero las
convenciones de estilo son mandatorias en entornos profesionales y en la cátedra.

## Ejercicio 4

Ejecuten las herramientas de verificación y guarden solo el informe de Dredd en el repositorio (
`build/reports/dredd.md`) dentro de la carpeta `informes`

Esto no es necesario en futuras prácticas, ya que las herramientas de verificación son ejecutadas en la
computadora del profe al ser corregidos. Este paso es para que sepan donde buscar los reportes que deben de tener en
cuenta.

Para ejecutarlo manualmente en la consola, pueden usar:

```bash
./gradlew analyzeAll
```

En IntelliJ, usen la tarea `analyzeAll`

*Importante:* La carpeta `build/` está en el `.gitignore`. **No intentes forzar la subida de la carpeta
build**. Solo mové el reporte final a la carpeta de informes para que sea visible en el repositorio.

## Ejercicio 5

Redacten un informe simple indicando que similitudes ven con respecto a C
sobre el archivo `Desordenado.java` y `HolaApp`, experimenten que cosas de C funcionan en Java y cuáles no.

Este archivo se debe llamar [`informes/similitudes.md`](informes/similitudes.md) y
estar ubicado el directorio indicado del repositorio.

### Aspectos a tener en cuenta

#### Sintaxis general

Comparen la estructura de declaraciones, expresiones, operadores y tipos de datos básicos
en ambos lenguajes. ¿Qué elementos son prácticamente idénticos?

¿Funciona el preprocesador? ¿Hay punteros?

#### Estructuras de control

Analicen cómo se implementan bucles (`for`, `while`, `do-while`), condicionales (`if`, `else`, `switch`)
y otras estructuras de control en Java. ¿Hay diferencias significativas en su uso?

#### Funciones

Investiguen cómo se definen y llaman funciones en C y métodos en Java. ¿Cuál es la sintaxis y
cómo se manejan los parámetros y valores de retorno?

#### Bibliotecas estándar

Exploren las bibliotecas estándar de ambos lenguajes. ¿Qué funciones comunes encuentran
(por ejemplo, para entrada/salida, manipulación de cadenas, matemáticas)?
¿Hay diferencias en sus nombres o formas de uso?

- [Librería C](https://cplusplus.com/reference/clibrary/)
- [Librería Java](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)
