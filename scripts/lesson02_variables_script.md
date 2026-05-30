# Guión — Lección 2: Variables, tipos de datos y operadores


**Duración estimada**: 10 minutos


---


## Introducción (0:00 – 0:30)


En la lección anterior aprendiste a imprimir texto en la consola. Pero los programas útiles no solo muestran mensajes fijos: necesitan guardar y manipular información. Para eso existen las variables.


---


## ¿Qué es una variable? (0:30 – 2:00)


Una variable es como una caja con nombre donde puedes guardar un valor. Ese valor puede cambiar a lo largo del programa, de ahí el nombre "variable".


En Java, para crear una variable necesitas tres cosas:


1. El **tipo de dato**: qué clase de información vas a guardar.
2. El **nombre**: cómo vas a llamar a esa caja.
3. El **valor**: qué vas a guardar dentro.


Por ejemplo:


```java
int edad = 15;
```


Aquí `int` es el tipo, `edad` es el nombre y `15` es el valor.


---


## Tipos de datos básicos (2:00 – 4:30)


En Java los tipos de datos más usados para principiantes son cuatro:


- `int` — para números enteros, como edades o cantidades: `int nota = 14;`
- `double` — para números con decimales: `double promedio = 14.5;`
- `String` — para texto. Se escribe con comillas dobles: `String nombre = "Carlos";`
- `boolean` — solo puede ser `true` o `false`: `boolean aprobado = true;`


Una regla importante: toda instrucción en Java termina con punto y coma `;`. Si lo olvidas, el programa no va a funcionar.


---


## Operadores aritméticos (4:30 – 6:30)


Con los números podemos hacer operaciones matemáticas usando operadores:


```java
int a = 10;
int b = 3;
System.out.println(a + b);  // Suma: 13
System.out.println(a - b);  // Resta: 7
System.out.println(a * b);  // Multiplicación: 30
System.out.println(a / b);  // División entera: 3
System.out.println(a % b);  // Módulo (residuo): 1
```


Nota que la división entre enteros da un resultado entero. Si `a = 10` y `b = 3`, el resultado es `3`, no `3.33`. Para obtener decimales necesitarías usar `double`.


---


## Operadores relacionales (6:30 – 8:30)


Los operadores relacionales nos permiten comparar dos valores. El resultado de una comparación siempre es `true` o `false`:


```java
System.out.println(10 > 3);   // true
System.out.println(10 < 3);   // false
System.out.println(10 == 10); // true
System.out.println(10 != 3);  // true
```


Presta atención a `==`: se usan dos signos de igual para comparar. Un solo `=` es para asignar un valor, no para comparar. Confundir estos dos es uno de los errores más comunes en Java.


---


## Actividad (8:30 – 9:30)


Abre el editor del enlace en la descripción. Encontrarás siete `TODO` para completar:


- Declara variables de los cuatro tipos básicos
- Imprímelas con mensajes descriptivos
- Realiza operaciones aritméticas con dos números
- Compara dos valores con un operador relacional


Haz clic en **Run** y verifica que los resultados sean los esperados.


---


## Cierre (9:30 – 10:00)


En la siguiente lección aprenderás a controlar el flujo de tu programa: hacer que tome decisiones con `if-else` y que repita acciones con bucles.


¡Nos vemos en la lección 3! 