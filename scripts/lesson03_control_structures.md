# Guión — Lección 3: Estructuras de control


**Duración estimada**: 10 minutos


---


## Introducción (0:00 – 0:30)


Hasta ahora tus programas ejecutan las instrucciones en orden, de arriba hacia abajo, sin detenerse. Pero los programas reales necesitan tomar decisiones y repetir acciones. Para eso existen las estructuras de control.


---


## Decisiones con if-else (0:30 – 3:30)


La estructura `if` le dice al programa: "si esta condición es verdadera, ejecuta este bloque de código". Si la condición es falsa, el bloque se salta.


```java
int nota = 13;


if (nota >= 11) {
    System.out.println("Aprobado");
}
```


Podemos agregar `else` para manejar el caso contrario:


```java
if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}
```


Y si necesitamos más de dos opciones, usamos `else if`:


```java
if (nota >= 18) {
    System.out.println("¡Excelente!");
} else if (nota >= 11) {
    System.out.println("Aprobado");
} else {
    System.out.println("Desaprobado");
}
```


Java evalúa las condiciones de arriba hacia abajo y ejecuta el primer bloque cuya condición sea verdadera. Los demás se ignoran.


---


## Bucle for (3:30 – 6:00)


Un bucle nos permite repetir un bloque de código varias veces sin escribirlo repetidamente. El bucle `for` es ideal cuando sabes exactamente cuántas veces quieres repetir algo.


```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```


Este bucle tiene tres partes separadas por punto y coma:


1. `int i = 1` — se ejecuta una sola vez al inicio: crea la variable contadora.
2. `i <= 5` — es la condición: el bucle continúa mientras sea verdadera.
3. `i++` — se ejecuta al final de cada repetición: aumenta el contador en 1.


---


## Bucle while (6:00 – 8:30)


El bucle `while` repite un bloque mientras una condición sea verdadera. Es útil cuando no sabes de antemano cuántas veces necesitas repetir.


```java
int contador = 5;


while (contador >= 1) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");
```


Importante: asegúrate de que en algún momento la condición se vuelva falsa. Si no, el bucle nunca terminará y el programa se quedará colgado.


---


## Actividad (8:30 – 9:30)


Abre el editor del enlace en la descripción. Encontrarás cuatro `TODO`:


1. Evalúa una nota con `if`, `else if` y `else`
2. Agrega el caso "Excelente" para notas mayores o iguales a 18
3. Usa un bucle `for` para imprimir del 1 al 5
4. Usa un bucle `while` para hacer una cuenta regresiva del 5 al 1


Haz clic en **Run** y verifica los resultados.


---


## Cierre (9:30 – 10:00)


En la siguiente lección aprenderás a organizar tu código en métodos reutilizables y a mostrar resultados de forma estructurada en la consola.


¡Nos vemos en la lección 4!