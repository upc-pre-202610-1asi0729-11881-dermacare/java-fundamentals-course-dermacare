# Guión — Lección 8: Buenas prácticas y errores comunes


**Duración estimada**: 6 minutos  


---


## Introducción (0:00 – 0:30)


Llegamos a la última lección del curso. Ya sabes programar en Java: variables, métodos, clases, arrays y POO. Ahora te enseñaremos cómo escribir ese código de forma más limpia, ordenada y profesional desde el primer día.


---


## Usa nombres descriptivos (0:30 – 1:30)


Uno de los errores más comunes es usar nombres cortos o sin sentido para las variables:


```java
// Mal: ¿qué significa x, n, p?
int x = 18;
String n = "Juan";
double p = 16.5;


// Bien: el código se explica solo
int edad = 18;
String nombre = "Juan";
double promedio = 16.5;
```


Un buen nombre hace que tu código sea legible sin necesidad de comentarios extra. Otros programadores, y tú mismo en el futuro, lo agradecerán.


---


## No confundas = con == (1:30 – 2:30)


Este es el error más frecuente entre principiantes:


```java
// = es asignación: guarda un valor en una variable
int edad = 18;


// == es comparación: verifica si dos valores son iguales
if (edad == 18) {
    System.out.println("Tiene 18 años.");
}
```


Si usas `=` dentro de un `if`, el programa no va a compilar. Recuerda siempre: una sola `=` asigna, dos `==` comparan.


---


## Mantén una indentación consistente (2:30 – 3:30)


La indentación es el espaciado al inicio de cada línea. No afecta cómo funciona el programa, pero sí afecta muchísimo su legibilidad:


```java
// Mal: difícil de leer
for(int i=1;i<=3;i++){
System.out.println("Estudiante: "+i);
}


// Bien: estructura clara
for (int i = 1; i <= 3; i++) {
    System.out.println("Estudiante: " + i);
}
```


En OnlineGDB puedes usar la tecla `Tab` para indentar una línea hacia adentro.


---


## Divide tu código en métodos (3:30 – 4:30)


Si te encuentras copiando y pegando el mismo bloque de código, es la señal de que deberías convertirlo en un método:


```java
// Mal: código repetido
System.out.println("Nombre: Carlos | Promedio: 15.5");
System.out.println("Nombre: Pepe | Promedio: 17.0");


// Bien: método reutilizable
public static void mostrarEstudiante(String nombre, double promedio) {
    System.out.println("Nombre: " + nombre + " | Promedio: " + promedio);
}
```


Cada método debería tener una sola responsabilidad. Si un método hace demasiadas cosas, es momento de dividirlo.


---


## Actividad (4:30 – 5:30)


Abre el editor del enlace en la descripción. El archivo tiene un código con cuatro problemas intencionados:


1. Nombres de variables poco descriptivos
2. Una comparación incorrecta con `=`
3. Código repetido que debería estar en un método
4. Indentación desordenada


Tu tarea es identificar cada problema, corregirlo y ejecutar el programa para verificar que funcione.


---


## Cierre (5:30 – 6:00)


¡Felicitaciones! Completaste el curso de Fundamentos de Java. Aprendiste a programar desde cero: variables, operadores, estructuras de control, métodos, clases, encapsulación, arrays y POO.


Esto es solo el comienzo. Si quieres seguir aprendiendo, te recomendamos explorar la documentación oficial de Java en [docs.oracle.com](https://docs.oracle.com/javase/) y practicar construyendo tus propios proyectos.


¡Gracias por completar el curso!
