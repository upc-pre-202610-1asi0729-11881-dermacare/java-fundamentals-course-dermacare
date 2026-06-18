# Guión — Lección 7: Proyecto final — Registro de estudiantes


**Duración estimada**: 10 minutos


# Proyecto Final: Registro de Estudiantes en Java

Hola, qué tal. En esta ocasión vamos a hablar de una de las lecciones, o por no decir la lección más importante del curso, ya que en esta lección vas a poder crear tu propio proyecto final.

Como por ejemplo, tu registro de estudiantes o demás. En este caso, este es el objetivo de nuestro proyecto.

Si bien, ya en las lecciones anteriores aprendiste lo que son las variables, los operadores, las estructuras de control, los métodos, clases, encapsulación y arrays. Bueno, ahora lo que vas a hacer es juntar todos estos conceptos para poder construir un programa real, que en este caso, nosotros vamos a hacer un registro de estudiantes.

## Analizando los requisitos

Antes de escribir código, es importante pensar primero. Un programador siempre, antes de crear un nuevo proyecto o de empezar a construir código, lo que tiene que hacer es pensar en qué necesita hacer su programa; es decir, buscar los requisitos.

Nuestro programa, en este caso:

* Debe guardar información de varios estudiantes, como nombre, edad y promedio.
* Debe mostrar la lista completa de estudiantes.
* Debe calcular el promedio general de los estudiantes.
* Debe identificar al estudiante con el promedio más alto.

## Clases necesarias

Para empezar, vamos a necesitar dos clases:

* `Estudiante`
* `Main`

La clase `Estudiante` contendrá la información de cada estudiante, mientras que la clase `Main` será donde construiremos toda la lógica del programa.

## Clase Estudiante

Como ya hemos trabajado con esta clase en lecciones anteriores, la vamos a implementar de la misma manera:

* Atributos privados.
* Constructor.
* Getters.
* Setter con validación.
* Método para mostrar información.

### Atributos

Vamos a tener los siguientes atributos:

* `nombre` → tipo `String`
* `edad` → tipo `int`
* `promedio` → tipo `double`

Todos ellos declarados con `private`.

### Constructor

Nuestro constructor recibirá:

* Nombre
* Edad
* Promedio

De esta forma podremos inicializar un estudiante al momento de crearlo.

Utilizaremos `this` para asignar los parámetros a los atributos de la clase.

### Getters

Tendremos tres getters:

* `getNombre()`
* `getEdad()`
* `getPromedio()`

Cada uno simplemente retorna el valor correspondiente.

Por ejemplo:

* `getNombre()` retorna `nombre`.
* `getEdad()` retorna `edad`.
* `getPromedio()` retorna `promedio`.

### Setter con validación

Para el promedio utilizaremos un setter con validación.

Recibiremos un parámetro:

```java
double promedio
```

Luego verificaremos:

```java
if (promedio >= 0 && promedio <= 20)
```

Si la condición se cumple, asignamos el promedio al estudiante.

Si no se cumple, mostramos el mensaje:

```java
Error: promedio inválido
```

### Método mostrar información

Crearemos un método que utilice `System.out.println()` para mostrar:

* Nombre
* Edad
* Promedio

Todo en una sola línea para visualizar fácilmente los datos del estudiante.

## Clase Main

Ahora pasamos a la implementación de la clase `Main`.

Primero creamos el método principal:

```java
public static void main(String[] args)
```

## Crear el registro de estudiantes

Vamos a crear un arreglo de estudiantes llamado `registro` con capacidad para tres estudiantes.

```java
Estudiante[] registro = new Estudiante[3];
```

Luego asignamos los estudiantes:

```java
registro[0] = new Estudiante("Carlos", 16, 15.5);
registro[1] = new Estudiante("Pepe", 17, 17);
registro[2] = new Estudiante("Antonio", 16, 13.5);
```

Observa que el constructor nos solicita:

* Nombre
* Edad
* Promedio

por lo que debemos enviar esos tres valores.

### Recordatorio sobre los arrays

Los arrays empiezan en la posición `0`.

Por ejemplo:

* Array de tamaño 3 → posiciones `0, 1, 2`
* Array de tamaño 5 → posiciones `0, 1, 2, 3, 4`

## Mostrar todos los estudiantes

Ahora cumpliremos el segundo requisito.

Primero mostramos un título:

```java
System.out.println("Registro de estudiantes");
```

Luego utilizamos un ciclo `for`:

```java
for (int i = 0; i < registro.length; i++)
```

Este ciclo recorrerá todas las posiciones del arreglo.

Si el arreglo tiene tamaño 3:

* i = 0
* i = 1
* i = 2

Después el ciclo termina.

Dentro del ciclo llamamos:

```java
registro[i].mostrarInfo();
```

Esto mostrará la información de cada estudiante en consola.

## Calcular el promedio general del salón

Creamos una variable acumuladora:

```java
double sumaPromedios = 0;
```

La inicializamos en cero para comenzar la suma.

Luego utilizamos nuevamente un ciclo `for`:

```java
for (int i = 0; i < registro.length; i++)
```

Y acumulamos los promedios:

```java
sumaPromedios += registro[i].getPromedio();
```

El operador `+=` va sumando cada promedio al valor acumulado.

Por ejemplo:

* Se suma el promedio del estudiante 0.
* Luego el del estudiante 1.
* Luego el del estudiante 2.

Al final tendremos la suma total de todos los promedios.

### Obtener el promedio general

Recordemos que:

> Promedio = suma de todos los elementos / cantidad de elementos

Entonces:

```java
double promedioGeneral = sumaPromedios / registro.length;
```

Finalmente mostramos el resultado:

```java
System.out.println("Promedio general del salón: " + promedioGeneral);
```

## Encontrar al estudiante con el promedio más alto

Ahora cumpliremos el último requisito.

Primero creamos una variable de tipo `Estudiante`:

```java
Estudiante mejorEstudiante = registro[0];
```

Asumimos inicialmente que el primer estudiante tiene el mejor promedio.

Luego utilizamos un ciclo:

```java
for (int i = 1; i < registro.length; i++)
```

### ¿Por qué empezamos en 1?

Porque ya estamos tomando como referencia a `registro[0]`.

No tendría sentido comparar el estudiante de la posición 0 consigo mismo.

Por eso comenzamos desde el siguiente elemento.

### Comparación

Utilizamos la siguiente condición:

```java
if (registro[i].getPromedio() > mejorEstudiante.getPromedio())
```

Si el promedio actual es mayor que el promedio del mejor estudiante encontrado hasta ese momento:

```java
mejorEstudiante = registro[i];
```

Entonces actualizamos la referencia.

Si no, mantenemos el estudiante que ya era el mejor.

### Mostrar el mejor estudiante

Finalmente mostramos:

```java
System.out.println(
    "Mejor promedio: " +
    mejorEstudiante.getNombre() +
    " con " +
    mejorEstudiante.getPromedio()
);
```

## Resultado del programa

Al ejecutar el programa veremos:

### Registro de estudiantes

Se mostrarán:

* Nombre
* Edad
* Promedio

de cada uno de los estudiantes registrados.

### Promedio general del salón

Se sumarán todos los promedios y se dividirán entre la cantidad de estudiantes.

En este ejemplo el resultado es:

```text
15.3
```

### Mejor promedio

El programa identificará automáticamente al estudiante con la nota más alta.

En este caso:

```text
Pepe - 17
```

Como podemos comprobar, efectivamente es el promedio más alto del grupo.

## Actividad propuesta

Una vez terminado el proyecto:

1. Abre el editor del enlace de la descripción (OnlineGDB).
2. Ingresa al repositorio de GitHub.
3. Revisa los archivos Starter Files y Complete Examples.
4. Ejecuta el proyecto completo.

Después, intenta crear tus propios proyectos utilizando la misma lógica.

Algunas ideas:

* Sistema para un campeonato de fútbol.
* Registro de corredores.
* Control de calificaciones.
* Registro de empleados.
* Gestión de productos.

Por ejemplo, podrías calcular el tiempo promedio de una carrera o encontrar al participante más rápido.

Todo queda en tu creatividad.

## Próxima lección

En la siguiente lección aprenderás:

* Cómo escribir código más limpio y profesional.
* Buenas prácticas de programación.
* Los errores más comunes en Java.
* Cómo evitar volver a cometer esos errores.

¡Nos vemos en la lección 8 y muchas gracias! 
