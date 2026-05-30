# Guión — Lección 5: Clases, objetos y encapsulación


**Duración estimada**: 12 minutos  


---


## Introducción (0:00 – 0:40)


Hasta ahora hemos trabajado con variables sueltas: una para el nombre, otra para la edad, otra para el promedio. Pero en el mundo real, esos datos pertenecen a una misma entidad: un estudiante. La Programación Orientada a Objetos nos permite modelar esa realidad en código.


---


## ¿Qué es una clase? (0:40 – 2:30)


Una clase es una plantilla que describe cómo es un tipo de objeto. Define qué información tiene (atributos) y qué puede hacer (métodos).


Piénsalo así: una clase es como el molde de una galleta. Con ese molde puedes hacer muchas galletas, todas con la misma forma pero con decoraciones distintas.


```java
class Estudiante {
    String nombre;
    int edad;
    double promedio;
}
```


Esta clase describe cómo es un estudiante: tiene nombre, edad y promedio.


---


## ¿Qué es un objeto? (2:30 – 4:00)


Un objeto es una instancia de una clase: una galleta hecha con ese molde. Para crear un objeto usamos la palabra `new`:


```java
Estudiante estudiante1 = new Estudiante();
estudiante1.nombre = "Carlos";
estudiante1.edad = 16;
estudiante1.promedio = 15.5;
```


Podemos crear tantos objetos como necesitemos, cada uno con sus propios datos.


---


## El constructor (4:00 – 6:00)


Asignar los atributos uno por uno es tedioso. El constructor es un método especial que inicializa el objeto con datos desde el momento en que lo creamos:


```java
class Estudiante {
    String nombre;
    int edad;
    double promedio;


    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
}
```


La palabra `this` se refiere al objeto actual. Ahora podemos crear un estudiante en una sola línea:


```java
Estudiante estudiante1 = new Estudiante("Carlos", 16, 15.5);
```


---


## Encapsulación (6:00 – 9:00)


Ahora hay un problema: cualquiera podría cambiar el promedio de un estudiante a un valor inválido, como 50 o -3. La encapsulación protege los datos restringiendo el acceso directo a los atributos.


Para encapsular, marcamos los atributos como `private`:


```java
private double promedio;
```


Ahora nadie puede acceder directamente a `promedio` desde fuera de la clase. Para leerlo o modificarlo usamos métodos especiales llamados **getter** y **setter**:


```java
// Getter: permite leer el valor
public double getPromedio() {
    return promedio;
}


// Setter: permite modificarlo, con validación
public void setPromedio(double promedio) {
    if (promedio >= 0 && promedio <= 20) {
        this.promedio = promedio;
    } else {
        System.out.println("Error: el promedio debe estar entre 0 y 20.");
    }
}
```


El setter actúa como guardián: solo acepta valores válidos.


---


## Método mostrarInfo (9:00 – 10:30)


Es buena práctica agregar un método que muestre la información del objeto en consola:


```java
public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Promedio: " + promedio);
}
```


Se llama así:


```java
estudiante1.mostrarInfo();
```


---


## Actividad (10:30 – 11:30)


Abre el editor del enlace en la descripción. Encontrarás cinco `TODO`:


1. Crea la clase `Estudiante` con atributos privados, constructor, getters, setter con validación y `mostrarInfo()`
2. Crea un objeto con los datos: "Carlos", 16, 15.5
3. Llama a `mostrarInfo()` para ver los datos iniciales
4. Cambia el promedio a 18.0 con el setter y muestra la información de nuevo
5. Intenta asignar 25.0 y observa qué ocurre


---


## Cierre (11:30 – 12:00)


En la siguiente lección aprenderás a trabajar con arrays para guardar listas de datos y a manipular texto con los métodos de la clase `String`.


¡Nos vemos en la lección 6!