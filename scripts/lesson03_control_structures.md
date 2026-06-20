# Guión — Lección 3: Estructuras de control

# GUION DE VIDEO: LECCIÓN 3
**Duración estimada**: 10 minutos
## INTRODUCCIÓN

**LOCUTOR:** Esta es la lección número tres, en la cual verás las estructuras de control.

Como puedes observar, ya tengo un código desarrollado con el que vamos a trabajar el día de hoy, para que puedas aprender un poco más sobre este mundo de la programación.

Hasta ahora, tus programas ejecutan las instrucciones en orden, de arriba hacia abajo y sin detenerse. Sin embargo, los programas reales necesitan tomar decisiones y repetir acciones; para eso existen las estructuras de control.

---

## DECISIONES CON IF-ELSE

**LOCUTOR:** Empezamos con las decisiones usando `if` y `else`. En este caso, la estructura `if` le dice al programa: "Si esta condición es verdadera, ejecuta este bloque de código". Si la condición es falsa, ese bloque simplemente se salta.

Podemos observar lo siguiente en el código: `int nota = 13;`. Abajo tenemos: `if (nota >= 11)`, entonces el estudiante está "Aprobado".

También podemos agregar el `else` para manejar el caso contrario. Si la nota es mayor o igual a 11 se muestra "Aprobado", pero si es menor que 11, la salida será "Desaprobado". Los invito a ir jugando en el editor con los signos y con los valores de mayor y menor.

---

## CONDICIONES MÚLTIPLES CON ELSE IF

**LOCUTOR:** Si necesitamos evaluar más de dos opciones, usamos la estructura `else if`.

Por ejemplo: `if (nota >= 18)` imprimimos "Excelente". Luego colocamos `else if (nota >= 11)` para mostrar "Aprobado", y finalmente un `else` para "Desaprobado".

Con estos casos prácticos vemos que Java evalúa las condiciones de arriba hacia abajo y ejecuta el primer bloque cuya condición sea verdadera; los demás bloques se ignoran por completo.

---

## EL BUCLE FOR

**LOCUTOR:** Una vez enseñado esto, pasamos al bucle `for`. Un bucle nos permite repetir un bloque de código varias veces sin tener que escribirlo repetitivamente. El bucle `for` es ideal cuando sabes exactamente cuántas veces quieres repetir una acción.

Por ejemplo, aquí queremos imprimir los números del 1 al 5. Escribimos: `for (int i = 1; i <= 5; i++)`.

Esta estructura tiene tres partes separadas por punto y coma:
1. `int i = 1;`: Se ejecuta una sola vez al inicio y crea la variable contadora.
2. `i <= 5;`: Es la condición. El bucle continuará mientras esta condición sea verdadera.
3. `i++`: Se ejecuta al final de cada repetición y aumenta el contador en uno.

---

## EL BUCLE WHILE

**LOCUTOR:** Ahora pasamos al bucle `while` para realizar una cuenta regresiva. El bucle `while` repite un bloque de código mientras una condición sea verdadera. Es muy útil cuando no sabes de antemano cuántas veces necesitas repetir la acción.

En el código declaramos `int contador = 5;` y aplicamos el `while (contador >= 1)`. Dentro del bloque imprimimos el valor y luego colocamos `contador--` para ir disminuyéndolo. Así, se realiza la cuenta regresiva desde el 5 hasta el 1 y al final se imprime el mensaje "¡Despegue!".

Es muy importante asegurarse de que en algún momento la condición del `while` se vuelva falsa. De lo contrario, el bucle nunca terminará, el programa se quedará colgado y no funcionará. Esto es un error común, similar a cuando olvidas colocar un punto y coma o no completas bien el código. Afortunadamente, los entornos de desarrollo modernos son herramientas muy intuitivas que te permiten visualizar estos errores fácilmente.

---

## ACTIVIDAD Y DESPEDIDA

**LOCUTOR:** Como actividad, te invito a abrir el editor del enlace en la descripción, donde encontrarás todo lo necesario. El reto consiste en lo siguiente:

1. Evalúa una nota usando `if`, `else if` y `else`. Agrega el caso "Excelente" para notas mayores o iguales a 18.
2. Usa un bucle `for` para imprimir los números del 1 al 5.
3. Usa un bucle `while` para hacer una cuenta regresiva del 5 al 1.

Te puedes guiar del ejemplo que acabamos de revisar. Recuerda siempre practicar para no tener problemas al momento de programar. Una vez que hayas terminado tu código, haz clic en *Run* y verifica los resultados en la consola.

Bueno, chicos, espero que esta clase haya sido beneficiosa para ustedes y que la lección haya quedado clara. Recuerden siempre practicar; si pueden imaginarlo, pueden programarlo.

En la siguiente lección aprenderás a organizar tu código en métodos reutilizables para mostrar resultados de forma estructurada y ordenada en la consola. Desde ya es importante aprender a mantener el orden y a agregar comentarios para que tu código sea intuitivo para otros programadores. Lo irás aprendiendo poco a poco.

Nos vemos en la lección 4. Muchas gracias por haber estado aquí.