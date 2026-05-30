# Guión — Lección 4: Métodos, parámetros y salida por consola


**Duración estimada**: 12 minutos  


---


## Introducción (0:00 – 0:40)


Imagina que tienes que saludar a diez estudiantes distintos. Podrías escribir diez veces `System.out.println("¡Hola, ...")`, pero eso es repetitivo y difícil de mantener. La solución son los métodos: bloques de código reutilizables que puedes llamar cuando los necesites.


---


## ¿Qué es un método? (0:40 – 2:30)


Un método es como una receta: tiene un nombre, puede recibir ingredientes (parámetros) y puede devolver un resultado. Una vez que lo defines, puedes usarlo tantas veces como quieras.


La estructura básica de un método en Java es:


```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
}
```


- `public static` — por ahora escríbelo siempre así, lo entenderás mejor más adelante.
- `void` — significa que el método no devuelve ningún valor, solo ejecuta instrucciones.
- `saludar` — el nombre del método.
- `String nombre` — el parámetro: información que le enviamos al método cuando lo llamamos.


---


## Métodos con return (2:30 – 5:00)


Cuando un método necesita devolver un resultado, reemplazamos `void` por el tipo de dato que va a retornar y usamos la palabra `return`:


```java
public static int sumar(int a, int b) {
    return a + b;
}
```


Para usar este método y ver su resultado en la consola:


```java
int resultado = sumar(7, 5);
System.out.println("7 + 5 = " + resultado);
```


El valor que devuelve `return` lo podemos guardar en una variable, o imprimirlo directamente.


---


## Métodos con return booleano (5:00 – 7:00)


Los métodos también pueden retornar un `boolean`, útil para hacer evaluaciones:


```java
public static boolean esMayor(int edad) {
    return edad >= 18;
}
```


Y en el `main`:


```java
boolean mayor = esMayor(16);
System.out.println("¿Es mayor de edad?: " + mayor);
```


---


## Salida por consola (7:00 – 9:00)


Ya conoces `System.out.println()`, que imprime una línea y baja al siguiente renglón. Hay una variante útil: `System.out.print()`, que imprime sin bajar de línea:


```java
System.out.print("Hola ");
System.out.print("mundo");
// Resultado: Hola mundo  (en la misma línea)
```


También puedes combinar texto con variables usando el operador `+`:


```java
String nombre = "Carlos";
int nota = 16;
System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
```


---


## Dónde colocar los métodos (9:00 – 10:30)


En Java los métodos se definen dentro de la clase pero fuera del método `main`. El orden en que los defines no importa: puedes llamar a un método que está definido más abajo en el archivo.


```java
public class MiPrograma {


    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }


    public static void main(String[] args) {
        saludar("Juan");  // llama al método definido arriba
    }
}
```


---


## Actividad (10:30 – 11:30)


Abre el editor del enlace en la descripción. Encontrarás seis `TODO`:


1. Crea el método `saludar` que recibe un nombre e imprime un saludo
2. Crea el método `sumar` que retorna la suma de dos enteros
3. Crea el método `esMayor` que retorna `true` si la edad es mayor o igual a 18
4. Llama a `saludar` con tu nombre
5. Llama a `sumar` e imprime el resultado
6. Llama a `esMayor` e imprime si es mayor de edad o no


---


## Cierre (11:30 – 12:00)


En la siguiente lección daremos el salto a la Programación Orientada a Objetos. Aprenderás qué son las clases y los objetos, y cómo proteger la información usando encapsulación.


¡Nos vemos en la lección 5!