# Guión — Lección 5: Programación Orientada a Objetos y Encapsulación

# GUION DE VIDEO: LECCIÓN 5

**Duración estimada**: 10 minutos

## INTRODUCCIÓN

**LOCUTOR:** Muy bien. Hasta ahora hemos trabajado con variables sueltas: una para el nombre, otra para la edad y otra para el promedio.

Pero en el mundo real, esos datos pertenecen a una misma entidad: un estudiante.

La Programación Orientada a Objetos nos permite modelar esa realidad en código.

---

## ¿QUÉ ES UNA CLASE?

**LOCUTOR:** ¿Qué es una clase?

Una clase es una plantilla que describe cómo es un tipo de objeto.

Define qué información tiene, que serían los atributos, y qué puede hacer, que serían los métodos.

Piénsalo de esta forma: una clase es como el molde de una galleta.

Con ese molde puedes hacer muchas galletas, todas con la misma forma, pero con decoraciones distintas.

Veamos un ejemplo.

Tenemos la clase `Estudiante`.

Tiene atributos, los cuales son: `nombre` de tipo `String`, `edad` de tipo entero y `promedio` de tipo `double`.

Esta clase describe a un estudiante, ya que tiene nombre, edad y promedio.

---

## ¿QUÉ ES UN OBJETO?

**LOCUTOR:** Ahora, en programación, ¿qué es un objeto?

Un objeto es una instancia de una clase.

Una galleta hecha con ese molde, por ejemplo.

Para crear un objeto usamos la palabra `new`.

Veámoslo.

Muy bien. Aquí tenemos ya la clase creada arriba, como se puede observar.

La clase es `Estudiante`.

Dentro ya del `main`, es donde hacemos la instancia con el `new` que hemos mencionado anteriormente para crear este nuevo objeto.

Luego le modificamos las variables accediendo mediante un punto.

A esos atributos podemos acceder escribiendo el nombre del objeto, seguido de un punto y luego el nombre del atributo, tal como fue definido anteriormente.

Y así lo hicimos con `nombre`, con `edad` y con `promedio`.

---

## EL CONSTRUCTOR

**LOCUTOR:** Ahora pasemos a hablar del constructor.

Sabemos que asignar valores a los atributos puede ser un poco tedioso.

Aquí en nuestro ejemplo lo hicimos con tres atributos, pero imaginen cuando ampliemos la cantidad de atributos o queramos hacerlo muchas veces.

Para eso se creó la lógica del constructor.

El constructor es básicamente un método especial que inicializa el objeto con datos desde el momento en que este es creado.

Aquí, como podemos observar en el código, tenemos `Estudiante` y este mismo constructor recibe todos los atributos definidos previamente dentro de la clase.

Luego, dentro del constructor, se realiza la asignación de valores.

Aquí la palabra `this` se refiere al objeto actual, específicamente a los atributos del objeto actual.

Ahora que sabemos esto, podemos crear un objeto en una sola línea, como se puede observar aquí mismo.

Muy bien.

Vemos aquí que tenemos `"Carlos"`, `16` y `15.5`.

Si se dan cuenta, el orden en el cual se han establecido estos valores en el constructor inicia primero por `"Carlos"`.

La razón es porque en la clase `Estudiante` hemos colocado primero el atributo `nombre`.

Si seguimos esta lógica, podremos crear cualquier otro estudiante utilizando el mismo constructor.

Como ya hemos dicho, el constructor es el mismo para toda instancia de la clase.

Por lo tanto, puedo hacerlo muchas veces.

Así como tengo aquí `estudiante2`, puedo hacerlo nuevamente con `estudiante3`.

La estructura `new Estudiante(...)` seguirá siendo la misma cada vez que intentemos crear un objeto de la clase `Estudiante`.

También puede ocurrir que los valores sean exactamente los mismos.

Aquí tengo `"Juan"`, `16` y `15.5`.

Es un caso posible.

Sin embargo, siguen siendo objetos distintos, ya que se almacenan en variables diferentes, como `estudiante2` y `estudiante3`.

Le damos a **Run** para corroborar que todo esté en orden y efectivamente funciona correctamente.

---

## ENCAPSULACIÓN

**LOCUTOR:** Vale, pero ahora hay un problema.

Cualquiera podría cambiar el promedio de un estudiante a un valor inválido como `50` o `-3`.

Aquí es donde entra la encapsulación.

La encapsulación protege los datos restringiendo el acceso directo a los atributos.

Para encapsular, marcamos los atributos como `private`.

Listo.

Viendo el ejemplo un poco más a detalle, observamos que ahora el atributo `promedio` tiene delante la palabra `private`.

Ahora ya nadie puede acceder directamente a `promedio` desde fuera de la clase.

Para ello debemos definir métodos que nos permitan acceder a la información de manera controlada.

Estos métodos se llaman **getter** y **setter**.

---

## GETTERS Y SETTERS

**LOCUTOR:** Aquí tenemos un getter.

Los getters tienen la característica de iniciar con la palabra `get`, seguida del nombre del atributo que queremos obtener.

En este caso tenemos `getPromedio()`.

Al ser un getter, necesitamos una función con `return`, ya que queremos devolver el valor almacenado en el atributo `promedio`.

Luego tenemos el setter.

Explicándolo un poco más, este recibe un parámetro.

Esto se debe a que justamente buscamos modificar el valor de nuestros atributos.

Pero antes de hacerlo, podemos pasar por ciertas validaciones.

Como puede ser este `if`.

Es una validación bastante sencilla que verifica que el promedio sea mayor que cero y menor o igual que veinte.

De no cumplir esta condición, se genera un mensaje de error.

Perfecto.

Entonces, como pudieron notar, el setter actúa como un guardián.

Solo acepta valores válidos.

Si el dato no cumple con el rango establecido, simplemente no asignará el nuevo valor.

Esto es muy importante dentro del concepto de encapsulación.

---

## UTILIZANDO EL SETTER

**LOCUTOR:** Ahora, pasando a la consola, tenemos propuesto el método `setPromedio()`.

Lo que hará este método será cambiar el valor de `promedio`.

Inicialmente era `15.5`, pero ahora lo cambiaremos a `15`.

Le damos a **Run** y efectivamente el programa se ejecuta correctamente.

---

## MÉTODOS DE BUENA PRÁCTICA

**LOCUTOR:** Ahora veamos un método muy utilizado por buena práctica: `mostrarInfo()`.

Este método tiene como objetivo mostrar la información del objeto en consola.

Aquí tenemos el ejemplo.

Tenemos la función `mostrarInfo()` que pertenece a la clase `Estudiante`.

Dentro de esta función definimos un `System.out.println()` y mostramos los atributos que queremos visualizar.

Muy bien.

Para utilizar este método desde el `main`, lo llamamos de la siguiente manera:

`estudiante.mostrarInfo();`

En este caso no enviamos ningún parámetro, ya que el método no lo requiere.

Esto es posible porque el método está definido dentro de la clase y puede acceder directamente a las variables que pertenecen al propio objeto.

Como esos atributos ya fueron inicializados mediante el constructor, podemos utilizarlos sin ningún problema dentro de este contexto.

---

## ACTIVIDAD Y DESPEDIDA

**LOCUTOR:** Ahora abre el editor del enlace en la descripción.

Ahí encontrarás cinco TODO.

Tu misión será resolverlos.

1. Crea la clase `Estudiante` con atributos privados, constructor, getters, setter con validación y el método `mostrarInfo()`.
2. Crea un objeto con los datos `"Carlos"`, `16` y `15.5`.
3. Llama a `mostrarInfo()` para ver los datos iniciales.
4. Cambia el promedio a `18` usando el setter y muestra la información nuevamente.
5. Intenta asignar `25.0` y observa qué ocurre.

No se olviden de resolver los ejercicios propuestos, ya que son importantísimos para poder afrontar los ejercicios de las siguientes clases.

Tengan en cuenta que estos conceptos también forman parte de las bases fundamentales de la programación y les ayudarán a seguir desarrollando su camino profesional.

Perfecto, chicos. Felicitaciones por haber llegado hasta aquí.

En la siguiente lección aprenderás a trabajar con arrays para guardar listas de datos y a manipular textos utilizando los métodos de la clase `String`.

Nos vemos en la clase seis.
