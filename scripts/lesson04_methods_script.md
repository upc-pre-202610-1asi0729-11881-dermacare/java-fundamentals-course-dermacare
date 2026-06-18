# Guión — Lección 4: Métodos, parámetros y salida por consola

# GUION DE VIDEO: LECCIÓN 4
**Duración estimada**: 10 minutos
## INTRODUCCIÓN

**LOCUTOR:** ¡Hola a todos! Bienvenidos a la lección número cuatro. Hoy vamos a aprender sobre métodos, parámetros y cómo mostrar resultados por la consola en Java.

Hasta ahora hemos escrito todo nuestro código dentro de un solo lugar, pero a medida que tus programas crecen, necesitas una forma de organizar y reutilizar tu código. Para eso sirven los métodos.

Imaginen que un método es como una **receta**. Tiene un nombre, recibe ciertos ingredientes (que en programación llamamos **parámetros**) y al final te da un resultado. Lo mejor de los métodos es que los defines una sola vez y los puedes usar miles de veces.

---

## MÉTODOS SIN RETORNO (VOID) Y PARÁMETROS

**LOCUTOR:** Vamos a ver nuestro primer ejemplo en el editor. Vamos a crear un método para saludar.

Escribimos: `public static void saludar(String nombre)`.

Vamos a descomponer esto para entenderlo por partes:
- **`public static`**: Por ahora, quédense con que es la forma en la que le damos acceso al método dentro de nuestro programa.
- **`void`**: Significa "vacío". Le dice a Java que este método va a realizar una acción (como imprimir en pantalla), pero no va a regresar ningún valor matemático o dato para guardar.
- **`saludar`**: Es el nombre que le damos a nuestra receta.
- **`String nombre`**: Este es el ingrediente o **parámetro**. Le estamos diciendo que cuando alguien use este método, tiene que entregarnos un texto con un nombre.

Dentro de las llaves del método, ponemos la acción: `System.out.println("Hola, " + nombre + "!");`.

Para usarlo, vamos a nuestro método `main` principal y simplemente llamamos a la receta escribiendo: `saludar("Valeria");`. Al darle a *Run*, el programa busca el método, reemplaza la variable con el nombre que le pasamos e imprime en la consola: `"Hola, Valeria"`.

---

## MÉTODOS CON RETORNO (RETURN)

**LOCUTOR:** ¿Qué pasa si queremos que el método calcule algo y nos devuelva ese resultado para usarlo más adelante? En ese caso, reemplazamos la palabra `void` por el tipo de dato que queremos recibir y usamos la palabra clave `return`.

Vamos a crear un método para sumar dos números enteros:

`public static int sumar(int a, int b) {`
`    return a + b;`
`}`

Aquí cambiamos `void` por `int`, lo que significa que este método se compromete a devolver un número entero. Recibe dos ingredientes: `int a` e `int b`. Y con `return a + b;`, hace el cálculo y envía el resultado de vuelta.

¿Cómo lo usamos en el `main`? Podemos guardar ese resultado en una variable:
`int resultado = sumar(4, 10);`

Y luego lo imprimimos de la forma que ya conocemos:
`System.out.println(resultado);`

Al ejecutarlo, la consola nos mostrará el número `14`.

---

## MÉTODOS CON RETORNO BOOLEANO

**LOCUTOR:** Los métodos también pueden devolver valores de tipo `boolean`, es decir, responder únicamente con un **SÍ** o un **NO** (`true` o `false`). Esto es perfecto para tomar decisiones en tus programas.

Por ejemplo, creemos un método para verificar si alguien es mayor de edad:

`public static boolean esMayor(int numero) {`
`    return numero >= 18;`
`}`

Este método devuelve un `boolean` y recibe una edad. Evalúa la condición y devuelve `true` si es mayor o igual a 18, o `false` si es menor. Si llamamos a `esMayor(20)`, nos devolverá `true`. Si llamamos a `esMayor(16)`, nos devolverá `false`.

---

## ¿DÓNDE VAN LOS MÉTODOS? Una regla muy importante

**LOCUTOR:** Presten mucha atención a esto, ya que es uno de los errores más comunes cuando se empieza a programar en Java: **Los métodos van dentro de la clase, pero fuera del método `main`.**

No puedes crear un método dentro de otro método. Tienen que estar separados, uno abajo del otro, pero todos contenidos dentro de las llaves de la clase principal (`public class Main`). No se preocupen por el orden en el que los escriban fuera del `main`, ¡Java es lo suficientemente inteligente como para encontrarlos solos!

---

## RETO Y DESPEDIDA

**LOCUTOR:** Como actividad para la clase de hoy, ingresen al editor online utilizando el enlace que está en la descripción. El reto consiste en:

1. Crear un método propio que reciba un parámetro y realice una acción.
2. Crear un método con `return` para realizar una operación matemática simple.
3. Llamar a ambos métodos desde el `main` e imprimir sus resultados para comprobar que funcionen de forma correcta.

Practiquen mucho con la estructura y no olviden los puntos y comas al final de las instrucciones dentro del `main`.

Muchas gracias por acompañarme en esta cuarta lección. Con esto ya saben cómo estructurar y modular su código como verdaderos profesionales. ¡Nos vemos en la siguiente lección!