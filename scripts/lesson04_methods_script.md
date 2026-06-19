# Guión — Lección 4: Métodos en Java

# GUION DE VIDEO: LECCIÓN 4

**Duración estimada**: 10 minutos

## INTRODUCCIÓN

**LOCUTOR:** Imagina que tienes que saludar a 10 estudiantes distintos.

Podrías escribir 10 veces `System.out.println("Hola");`.

Pero eso es repetitivo y difícil de mantener.

Así que la solución son los métodos: bloques de código reutilizables que puedas llamarlos cuando los necesites.

Pero primero, ¿qué es un método?

Un método es como una receta. Tiene nombre, puede recibir ingredientes, que serían parámetros, y también puede devolver un resultado.

Una vez que lo defines, puedes usarlo tantas veces como quieras.

Para ilustrarlo un poco mejor, aquí ya podemos observar la siguiente función, la cual es un saludo.

---

## PARTES DE UN MÉTODO

**LOCUTOR:** De aquí rescatamos cuatro aspectos fundamentales.

El primero es `public static void`, el cual inicia la función. Por ahora, este siempre escríbelo así. Lo entenderás mucho mejor más adelante.

Luego tenemos el `void`. Significa que el método no devuelve como tal ningún valor; solo ejecuta instrucciones.

Luego tenemos `saludar`, el texto que está al costado del paréntesis. Este es el nombre del método.

Y por último tenemos `String nombre`, que es el parámetro. Es la información que le enviamos al método cuando lo llamamos.

---

## MÉTODOS CON RETURN

**LOCUTOR:** Ahora veamos un poco mejor lo que son los métodos con `return`.

Un método con `return` es aquel que necesita devolver un resultado.

Para ello, reemplazamos `void` por el tipo de dato que vamos a retornar y usamos la palabra `return`.

Veamos un ejemplo.

Tenemos acá la función que se llama `sumar`.

Vemos que pide de parámetros `a` y `b`, y luego hace un `return` de la suma de esas variables.

Para usar este método y ver el resultado en la consola, se hace lo siguiente: se puede inicializar una variable, la cual llamamos `resultado`, que es de tipo entero, y lo igualamos a la función con los parámetros correspondientes, para luego que esta pueda ser impresa.

Esto, ¿qué nos quiere decir?

Bueno, que el valor que devuelve `return` lo podemos guardar en una variable o también podemos imprimirlo directamente.

---

## MÉTODOS CON RETURN BOOLEANO

**LOCUTOR:** Ahora veamos métodos pero con retorno booleano.

Ya habíamos visto anteriormente que existen métodos que tienen un `return` y vimos el ejemplo con números enteros.

Pues ahora también podemos saber que pueden retornar un booleano, lo cual es útil para hacer evaluaciones.

Veamos un ejemplo.

Aquí tenemos la función que se llama `esMayor`, que es de tipo `boolean` y que recibe de parámetro un número entero llamado `edad`.

Luego tenemos el `return`, el cual devolverá un verdadero o falso dependiendo de si la condición que se encuentra adentro cumple o no cumple.

Ahora en el `main`, sería inicializar la variable `mayor`, la cual para este caso sería un booleano, y la igualamos a la función, que justamente también devuelve un valor booleano, para luego poder imprimirlo en la consola.

---

## PRINT Y PRINTLN

**LOCUTOR:** Ya conoces el `System.out.println`, el cual imprime una línea y baja al siguiente renglón.

Sin embargo, acá tenemos una variante útil: `System.out.print`.

Este imprime sin bajar de línea.

Por ejemplo, aquí tenemos el `print` "Hola" y el `print` "Mundo".

Como no hay ninguna indicación de salto de línea por el `print`, ya que no es un `println`, el resultado será la cadena de texto impresa en la misma línea.

---

## CONCATENACIÓN DE TEXTO Y VARIABLES

**LOCUTOR:** Ahora también podemos combinar textos con variables usando el operador `"+"`.

Por ejemplo, tenemos el `String nombre = "Carlos"` y el entero `nota`, que vale 16.

Entonces, cuando lo imprimamos, podemos juntarlos todos en una fila y combinar las variables con el operador `"+"`.

De esta forma podremos mostrar mensajes más dinámicos utilizando los valores almacenados en nuestras variables.

---

## DÓNDE SE COLOCAN LOS MÉTODOS

**LOCUTOR:** Ahora veamos dónde se colocan los métodos.

En Java, los métodos se definen dentro de la clase, pero fuera del método `main`.

El orden en que los defines no importa.

Puedes llamar a un método que está definido más abajo en el archivo.

En este ejemplo podemos observar cómo está definida la función `saludar` antes que el `main`, para que luego en el `main` se llame al método que ya se ha definido arriba.

---

## ACTIVIDAD Y DESPEDIDA

**LOCUTOR:** Ahora abre el editor del enlace en la descripción, donde encontrarás 6 TODO, los cuales se muestran en pantalla.

Tu misión es resolverlos.

Recuerda revisar los ejemplos vistos durante la clase y aplicar los conceptos de métodos, parámetros, valores de retorno y concatenación.

Una vez que termines, ejecuta tu código y verifica los resultados en la consola.

En la siguiente lección daremos el salto a la Programación Orientada a Objetos.

Aquí aprenderás qué son las clases y los objetos, y cómo proteger la información usando encapsulación.

¡Gracias!
