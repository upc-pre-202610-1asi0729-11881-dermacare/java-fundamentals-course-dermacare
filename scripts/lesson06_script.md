# Guión — Lección 6: Arrays y cadenas


**Duración estimada**: 8 minutos  


---


## Introducción (0:00 – 0:30)


Ya sabes crear objetos para representar un estudiante. Pero ¿qué pasa si necesitas guardar una lista de 30 estudiantes? Declarar 30 variables separadas sería inmanejable. Para eso existen los arrays.


---


## ¿Qué es un array? (0:30 – 2:30)


Un array es una variable que guarda varios valores del mismo tipo en una sola estructura. Imagínalo como una fila de cajones numerados, donde cada cajón guarda un valor.


```java
String[] cursos = {"Matemática", "Comunicación", "Historia", "Ciencias"};
```


Para acceder a un elemento usamos su índice entre corchetes. El índice empieza en `0`, no en `1`:


```java
System.out.println(cursos[0]); // Matemática
System.out.println(cursos[3]); // Ciencias
```


Para saber cuántos elementos tiene el array usamos `.length`:


```java
System.out.println(cursos.length); // 4
```


---


## Recorrer un array con for (2:30 – 4:00)


La combinación más poderosa es usar un bucle `for` para recorrer todos los elementos de un array:


```java
for (int i = 0; i < cursos.length; i++) {
    System.out.println("Curso " + (i + 1) + ": " + cursos[i]);
}
```


Usamos `cursos.length` como condición para que el bucle se adapte automáticamente si el array cambia de tamaño.


---


## Métodos de String (4:00 – 6:00)


Los textos en Java no son simples variables: son objetos de la clase `String`, que tiene métodos útiles para manipular texto:


```java
String saludo = "hola mundo";


System.out.println(saludo.length());        // 10
System.out.println(saludo.toUpperCase());   // HOLA MUNDO
System.out.println(saludo.contains("mundo")); // true
```


Estos métodos son muy útiles cuando trabajas con nombres, búsquedas o validaciones en tus programas.


---


## Arrays con objetos (6:00 – 7:00)


Los arrays no solo guardan números o textos: también pueden guardar objetos. Por ejemplo, un array de estudiantes:


```java
Estudiante[] salon = new Estudiante[3];
salon[0] = new Estudiante("Carlos", 16, 15.5);
salon[1] = new Estudiante("Juan", 15, 17.0);
salon[2] = new Estudiante("Antonio", 17, 13.5);
```


Y para mostrar la información de todos:


```java
for (int i = 0; i < salon.length; i++) {
    salon[i].mostrarInfo();
}
```


Esta idea es exactamente la base del proyecto que construiremos en la siguiente lección.


---


## Actividad (7:00 – 7:40)


Abre el editor del enlace en la descripción. Encontrarás cinco `TODO`:


1. Declara un array de cuatro cursos e imprime el primero y el último
2. Recorre el array con un bucle `for`
3. Usa tres métodos de `String` sobre un texto
4. Declara un array de notas y calcula el promedio
5. Ejecuta el programa y verifica los resultados


---


## Cierre (7:40 – 8:00)


En la siguiente lección integrarás todo lo que has aprendido en un proyecto completo: un sistema de registro de estudiantes con POO.


¡Nos vemos en la lección 7!