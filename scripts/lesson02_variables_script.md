# Guión — Lección 2: Variables, tipos de datos y operadores
# GUION DE VIDEO: LECCIÓN 2

## INTRODUCCIÓN

**Duración estimada**: 10 minutos

**LOCUTOR:** ¿Qué tal? ¿Cómo están, chicos? Bienvenidos a esta lección. Es la lección dos en la cual vas a a aprender sobre variables, tipos de datos y operadores. Como ya estamos entrando en lo práctico, vas a observar que ya estamos en nuestro editor online, el cual lo vas a encontrar en el material. ¿Okay?

En esta ocasión, tengan en cuenta que en la lección anterior aprendieron a imprimir texto en la consola, pero los programas útiles no solo muestran mensajes fijos, necesitan guardar y manipular información. Para eso existen lo que son las variables.

¿Qué es una variable?, te estarás preguntando. Una variable es como una caja con nombre donde puedes guardar un valor. Ese valor puede cambiar a lo largo del programa, de ahí el nombre: variable.

---

## CONCEPTOS BÁSICOS Y TIPOS DE DATOS

**LOCUTOR:** En Java, para crear una variable necesitas tres cosas. Empezamos con lo primero: el tipo de dato. ¿Qué clase de información vas a guardar? Pasamos con lo segundo: el nombre. ¿Cómo vas a llamar a esa caja? Y por último, pero no menos importante: el valor. ¿Qué vas a guardar dentro?

Te pongo de ejemplo, ¿okay? Tenemos acá... En Java... este sería el ejemplo, ¿ah? `int edad = 15;`. Aquí, `int` sería el tipo, `edad` sería lo que es el nombre y `15` es el valor. ¿OK?

Una vez dicho eso, pasamos con los tipos de datos básicos. En Java, los tipos de datos más usados para principiantes son cuatro:

* **`int`**: Se usa para números enteros, como edades o cantidades. Por ejemplo, `int edad = 15;`, lo que acabamos de hacer hace un momento.
* **`double`**: Para números con decimales. `double promedio = 14.5;`, siempre con decimales. ¿Okay?
* **`String`**: Para textos. Se escribe con comillas dobles. Como puedes observar acá, esto es para textos: `"Juan"` y las comillas.
* **`boolean`**: Solo puede ser `true` o `false`. `boolean aprobado = true;`.

Una regla muy importante que siempre tienes que tener claro y siempre tienes que tener en cuenta cuando programes, es que toda instrucción en Java termina con un punto y coma. Si lo olvidas, el programa no va a funcionar. Y se los digo por experiencia propia, que realmente no funciona, te sale error. Algunos eh lectores, algunos algunas páginas te pueden ayudar explicándote en dónde es lo que falta colocar para que corra, pero sería una muy buena práctica si es que si es que tú mismo o misma puedes validar siempre eso.

---

## OPERADORES ARITMÉTICOS

**LOCUTOR:** ¿Okay? Ahora pasamos con los operadores aritméticos. Con los números podemos hacer operaciones matemáticas usando operadores. Por ejemplo, tenemos acá: `int a = 10;`, `int b = 3;`. En esta ocasión va a ser solamente de dos. Lo que ponemos es lo siguiente: `System.out.println` y ponemos lo que es `a + b`, y la suma es lo que se va a imprimir. Y así consecutivamente también con la resta, `a - b`; con la multiplicación, que sería `a * b`; con la división, que es `a / b`; y con lo que es eh el módulo, residuo, que sería `a % b;`.

Ya como pueden observar, voy a dar acá a *run* y ahí se va a ir imprimiendo: en la suma el resultado es 13, en la resta es 7, multiplicación es 30 y división 3. ¿Okay? Espero que haya quedado claro esa parte.

Ahora, nota que la división entre enteros da un resultado entero. Si `a` es igual a 10 y `b` es igual a 3, el resultado es 3, no 3.33. Para obtener decimales, necesitaríamos usar `double`. Ten en cuenta eso.

---

## OPERADORES RELACIONALES

**LOCUTOR:** Ahora pasamos a lo que es operadores relacionales. Los operadores relacionales nos permiten comparar dos valores. El resultado de una com- comparación siempre, pero siempre es `true` o `false`.

Tenemos el siguiente ejemplo: ¿`a` es mayor que `b`? Teniendo `a` que es 10 y `b` es 3, entonces esto es `true`, verdadero. Incluso acá lo dice abajo. Luego tenemos: ¿`a` es igual a `b`? Tenemos que es `false`, porque `a` es 10 y `b` es 3.

Ahora, presta atención a esas a ese doble igual. Se usan dos signos de igual para comparar. ¿Okay? Un solo igual es para asignar un valor, no para comparar. Confundir estos dos es uno de los errores más comunes en Java que tienes que tratar de evitar.

---

## ACTIVIDAD Y DESPEDIDA

**LOCUTOR:** Ahora, como actividad para ti, te incito a abrir el editor del enlace de la descripción. Encontrarás todo lo necesario para completar. ¿Okay? Declara variables de los cuatro tipos básicos, imprímelas con mensajes descriptivos, realiza operaciones aritméticas con dos números, compara dos valores con un operador relacional. Vamos a medir qué tanto aprendiste el día de hoy. Y una vez hecho eso, simplemente le das a *run* y te tiene que compilar acá. Nada más, así de fácil, así de sencillo es esto.

Entonces, eso es todo por la lección número dos. Espero haya sido de su agrado y que se haya podido entender muchas cosas. En la siguiente lección aprenderás a controlar el flujo de tu programa, hacer que tome decisiones con `if` y `else`, y que repita acciones con bucles. Es muy importante que tengas en cuenta estos conceptos cuando vas iniciando. Así que, bueno, sin nada más que decir, nos vemos en la siguiente lección, la lección número tres.