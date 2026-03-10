# Similitudes entre C 💾 y Java ☕
---

Al programar en ambos lenguajes ya se nota la familiaridad, los grises y las diferencias. En qué aspectos?:

### Compilación

De base, ambos necesitan ser compilados (C a código ASM, Java a bytecode) para ser ejecutados a posteriori. La diferencia radica en que en Java pasa por la JVM, la cual se puede compilar en cualquier dispositivo con JVM.

### La sintáxis
La estructura de los lazos, las librerías, y el main suelen ser prácticamente iguales. Tienen los mismos símbolos reservados para operadores lógicos.

### Las funciones

Acá empiezan los grises. Mientras que en ambos se define el output de la función, en Java también se define el scope y si pertenece a un objeto o una clase. De hecho, en este último **siempre** se define la clase en todos los archivos. 
En la sintaxis son prácticamente iguales, y ambos cuentan con un `main`.

### Bibliotecas

Para manejo de STDIN y STDOUT, las funciones utilizadas son prácticamente las mismas. En C, se usa `printf()`, mientras que en Java se usa `System.out.println()` (más explícito el origen de la función). La diferencia radica en que en C sí o sí hay que incluir la librería, en Java ya está implícita.

Para funciones avanzadas en matemática, lo mismo. En C se usa `<math.h>` y en Java ya está incorporado. Lo que si, hay sutilezas entre las funciones (`Math.pow` en java, `exp` en C)

En cuanto a la manipulación de arrays, Java tiene la clase `String` ya incorporada. En C, se utiliza `<string.h>` pero cuenta con un conjunto de funciones standard. Acá es donde la sintaxis difiere más, ya que en C es más abreviada
Por ejemplo , `strchr()` es el equivalente a `indexOf()` pero mucho más primitivo.
¿Por qué?
> 💡 **En C hay que "calcular" el indice, ya que retorna _el puntero_ y hay que restarlo del punto inicial.**


