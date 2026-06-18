# Guión — Lección 6: Arrays y cadenas


He convertido tu texto a un formato de guion Markdown más limpio y profesional para la lección:

# Guión — Lección 6: Arreglos (Arrays) y Métodos String
**Duración estimada**: 7 minutos

## INTRODUCCIÓN

**LOCUTOR:** Ahora ya sabemos crear objetos para representar a un estudiante. Pero, ¿qué pasa si necesitas guardar una lista de 30 estudiantes? Declarar 30 variables diferentes sería impensable, e incluso inimaginable. Y no hablemos ya de 100 estudiantes.

Para resolver este problema existen los **arreglos**, también conocidos como **arrays**.

---

## ¿QUÉ ES UN ARREGLO?

**LOCUTOR:** Pero para empezar, ¿qué es exactamente un arreglo?

Un arreglo es una variable que puede almacenar múltiples valores del mismo tipo dentro de una sola estructura.

Imagínenlo como una fila de cajones numerados, donde cada cajón guarda un valor específico.

Por ejemplo, podríamos tener un arreglo que almacene nombres de cursos, números o incluso objetos completos.

---

## CREANDO NUESTRO PRIMER ARREGLO

**LOCUTOR:** Ahora que ya conocemos la definición, veámoslo en código.

Aquí tenemos un arreglo llamado `cursos`:

```java
String[] cursos = {
    "Matemática",
    "Comunicación",
    "Historia",
    "Ciencias"
};
```

Para crearlo, debemos indicar el tipo de dato que almacenará el arreglo. En este caso utilizamos `String`, que representa cadenas de texto.

Los elementos del arreglo son:

* Matemática
* Comunicación
* Historia
* Ciencias

---

## ACCEDIENDO A LOS ELEMENTOS

**LOCUTOR:** Para acceder a un elemento específico utilizamos su índice entre corchetes.

Es muy importante recordar que los arreglos en Java comienzan en el índice **0**, no en el índice **1**.

Cuando hablamos de índice nos referimos a la posición que ocupa cada elemento dentro del arreglo.

Por ejemplo:

```java
System.out.println(cursos[0]);
```

Este código imprimirá:

```text
Matemática
```

Porque el índice 0 corresponde al primer elemento.

Si queremos acceder al siguiente curso:

```java
System.out.println(cursos[1]);
```

Obtendremos:

```text
Comunicación
```

---

## RECORRIENDO UN ARREGLO CON FOR

**LOCUTOR:** Ahora que sabemos acceder a una posición específica, aprenderemos a recorrer todas las posiciones automáticamente utilizando un bucle `for`.

El bucle `for` nos permite ingresar repetidamente a cada posición del arreglo sin tener que escribir una instrucción para cada elemento.

Veamos el ejemplo:

```java
for (int i = 0; i < cursos.length; i++) {
    System.out.println("Curso " + (i + 1) + ": " + cursos[i]);
}
```

---

## ENTENDIENDO EL FOR

**LOCUTOR:** Analicemos cada parte de esta estructura.

### Inicio

```java
int i = 0;
```

Comenzamos en la posición 0 porque los arreglos siempre empiezan desde ese índice.

### Condición

```java
i < cursos.length;
```

La propiedad `.length` indica cuántos elementos tiene el arreglo.

En este caso, el ciclo continuará ejecutándose mientras existan posiciones válidas por recorrer.

### Incremento

```java
i++;
```

Después de cada repetición, el valor de `i` aumenta en 1.

Esto permite avanzar de una posición a la siguiente.

### Acceso al elemento

```java
cursos[i]
```

En cada repetición se accede automáticamente al elemento correspondiente según el valor actual de `i`.

Al ejecutar el programa obtendremos:

```text
Curso 1: Matemática
Curso 2: Comunicación
Curso 3: Historia
Curso 4: Ciencias
```

De esta forma podemos recorrer arreglos de cualquier tamaño con muy poco código.

---

## INTRODUCCIÓN A LOS MÉTODOS STRING

**LOCUTOR:** Ahora veamos algo más sobre los textos en Java.

Aunque muchas veces los usamos como simples variables, los textos son en realidad objetos de la clase `String`.

Eso significa que poseen métodos incorporados que nos ayudan a manipular texto de forma sencilla.

Supongamos que tenemos:

```java
String saludo = "hola";
```

---

## MÉTODO length()

**LOCUTOR:** El método `length()` devuelve la cantidad de caracteres que contiene un texto.

```java
System.out.println(saludo.length());
```

Resultado:

```text
4
```

Porque la palabra "hola" tiene cuatro caracteres.

---

## MÉTODO toUpperCase()

**LOCUTOR:** El método `toUpperCase()` convierte todas las letras del texto a mayúsculas.

```java
System.out.println(saludo.toUpperCase());
```

Resultado:

```text
HOLA
```

No importa si el texto original está en minúsculas; el método devolverá una nueva versión completamente en mayúsculas.

---

## MÉTODO contains()

**LOCUTOR:** El método `contains()` nos permite verificar si una determinada cadena de texto está contenida dentro de otra.

Por ejemplo:

```java
System.out.println(saludo.contains("adios"));
```

Resultado:

```text
false
```

Esto ocurre porque la palabra "adios" no se encuentra dentro del texto "hola".

Este método siempre devuelve un valor booleano:

* `true` si el texto existe.
* `false` si el texto no existe.

---

## RETO Y DESPEDIDA

**LOCUTOR:** Muy bien, chicos. Ahora les toca a ustedes.

Deben abrir el editor del enlace que se encuentra en la descripción y completar los ejercicios de la actividad **5-TODO**.

### Desafíos

1. Declarar un arreglo de cuatro cursos e imprimir el primero y el último.
2. Recorrer el arreglo utilizando un bucle `for`.
3. Utilizar tres métodos de `String` sobre un texto.
4. Declarar un arreglo de notas y calcular el promedio.
5. Ejecutar el programa y verificar los resultados obtenidos.

Practiquen cada ejercicio y experimenten modificando los valores para comprender mejor cómo funcionan los arreglos y los métodos de texto.

En la siguiente lección integraremos todo lo aprendido hasta ahora en un proyecto completo: un sistema de registro de estudiantes utilizando Programación Orientada a Objetos.


