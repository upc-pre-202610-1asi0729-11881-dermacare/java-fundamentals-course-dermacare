
# Guión — Lección 5: Clases, Objetos y Encapsulación

# GUION DE VIDEO: LECCIÓN 5
**Duración estimada**: 16 minutos

## INTRODUCCIÓN

**LOCUTOR:** ¡Hola a todos! Bienvenidos a la lección número cinco. Hoy entraremos al fascinante mundo de la Programación Orientada a Objetos, enfocándonos en tres pilares fundamentales: **Clases, Objetos y Encapsulación**. Además, aprenderemos sobre **Constructores** y los métodos **Getter** y **Setter**.

Hasta ahora hemos aprendido a estructurar el código mediante métodos sueltos, pero en los programas del mundo real necesitamos modelar elementos de la vida cotidiana. La Programación Orientada a Objetos nos permite agrupar datos y comportamientos en un solo lugar.

---

## ¿QUÉ ES UNA CLASE Y UN OBJETO?

**LOCUTOR:** Para entenderlo de forma sencilla, piensen en una **clase** como el plano de una casa o el molde para hacer galletas. El molde define la forma y el tamaño que tendrán, pero no es una galleta real.

Por otro lado, un **objeto** es la galleta física que creas usando ese molde. Puedes usar el mismo molde para crear muchas galletas individuales; cada una es un objeto independiente.

Vamos al editor para definir nuestra primera clase: una clase llamada `Estudiante`.

Toda clase se compone principalmente de tres elementos:

1. **Atributos:** Son los datos o características que tiene el objeto (por ejemplo: nombre, edad o promedio).
2. **Constructor:** Es el mecanismo que define cómo se crea un estudiante nuevo.
3. **Métodos:** Son las acciones o comportamientos que el objeto puede realizar (como mostrar su información).

Para empezar, definimos los atributos usando la palabra clave `private` para proteger la información.

### ESTRUCTURA DE LA CLASE

```java
class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
}
```

---

## EL CONSTRUCTOR: LA FÁBRICA DE OBJETOS

**LOCUTOR:** El constructor es como la línea de producción en una fábrica de galletas: se encarga de recibir los ingredientes (los parámetros de entrada) y entregarte una galleta terminada y lista para usar.

Un constructor tiene dos reglas obligatorias en Java:

1. Debe llamarse exactamente igual que la clase (respetando mayúsculas y minúsculas).
2. No tiene ningún tipo de retorno (ni siquiera la palabra `void`).

Escribamos el constructor para nuestra clase:

```java
public Estudiante(String nombre, int edad, double promedio) {
    this.nombre = nombre;
    this.edad = edad;
    this.promedio = promedio;
}
```

**LOCUTOR:** Presten atención a la palabra clave `this`. La usamos para decirle a Java:

> "Asigna el valor del parámetro de entrada al atributo de este objeto específico que estoy creando en este momento".

Así evitamos confusiones si los nombres son idénticos.

---

## ENCAPSULACIÓN Y ATRIBUTOS PRIVADOS

**LOCUTOR:** La encapsulación consiste en ocultar los detalles internos de un objeto y proteger sus datos de modificaciones externas descontroladas.

Piensen en un automóvil: el motor está protegido bajo el capó. Ustedes no meten las manos directamente en los pistones mientras conducen; en su lugar, interactúan de forma segura a través del volante y los pedales.

En Java, esto lo logramos marcando los atributos como `private`. Al hacerlo, nadie fuera de la clase `Estudiante` puede modificar directamente la nota o el nombre de forma malintencionada o errónea.

Si alguien intenta escribir:

```java
estudiante.promedio = 100;
```

desde otra parte del programa, Java lanzará un error de compilación.

---

## GETTERS Y SETTERS

**LOCUTOR:** Si los atributos son privados, ¿cómo hacemos para verlos o modificarlos de forma segura? Para eso creamos métodos públicos conocidos como **Getters** y **Setters**, que actúan como las compuertas reguladas del objeto.

### El Getter (Leer información)

Un Getter funciona como una ventana que te permite ver lo que hay dentro de una caja cerrada, pero sin tocarlo ni alterarlo.

Su nombre siempre empieza con la palabra `get` seguida del nombre del atributo en mayúscula, no recibe parámetros y devuelve el valor correspondiente.

```java
public String getNombre() {
    return nombre;
}

public int getEdad() {
    return edad;
}

public double getPromedio() {
    return promedio;
}
```

### El Setter con Validación (Modificar información con reglas)

Un Setter funciona como un guardia de seguridad en la puerta de entrada: revisa el valor antes de permitir que se guarde en el atributo.

Si el valor no cumple con las reglas establecidas, se rechaza y no se guarda.

Creemos un Setter para el promedio, asegurándonos de que la nota ingresada esté en el rango correcto (entre 0 y 20):

```java
public void setPromedio(double promedio) {
    if (promedio >= 0 && promedio <= 20) {
        this.promedio = promedio;
    } else {
        System.out.println("Error: El promedio debe estar entre 0 y 20.");
    }
}
```

**LOCUTOR:** De este modo, si alguien intenta asignar un promedio inválido como `25.0`, nuestro objeto detendrá la acción y protegerá la integridad de sus datos.

---

## MÉTODOS DE COMPORTAMIENTO: mostrarInfo()

**LOCUTOR:** Finalmente, añadiremos un método de comportamiento llamado `mostrarInfo()`.

A diferencia de los atributos (que son lo que el objeto es), los métodos son lo que el objeto puede hacer.

En este caso, el estudiante imprimirá de forma ordenada sus propios datos en la consola:

```java
public void mostrarInfo() {
    System.out.println("----- Información del Estudiante -----");
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Promedio: " + promedio);
}
```

---

## RETO Y DESPEDIDA

**LOCUTOR:** Como actividad para consolidar lo aprendido hoy, abran el editor online con el enlace que se encuentra en la descripción.

El desafío de esta lección consiste en:

1. Crear la clase `Estudiante` con sus tres atributos privados.
2. Definir correctamente su constructor utilizando la palabra clave `this`.
3. Implementar sus respectivos métodos Getters y Setters, asegurando que el Setter incluya la validación para el promedio.
4. Crear el método `mostrarInfo()` para visualizar los resultados en pantalla.

Tómense su tiempo para estructurar cada bloque, respetando las llaves y la ubicación de cada método dentro de la clase.

Practicar la Programación Orientada a Objetos es el paso definitivo para programar a gran escala.

Muchas gracias por acompañarme en esta quinta lección.

**¡Nos vemos en el próximo video!**
