# Guión — Lección 8: Buenas prácticas y errores comunes


**Duración estimada**: 4 minutos  


---

# Buenas Prácticas de Programación y Programación Orientada a Objetos

Ya llegamos a la parte final del curso.

Aquí, con todo lo aprendido, la aplicaremos ahora a lo que sería la programación PO, programación orientada a objetos.

Te enseñaremos cómo se escribe este código de forma mucho más limpia, ordenada y profesional desde el primer día.

## Nombres de Variables Descriptivos

Uno de los problemas más comunes es usar nombres cortos o sin sentido para las variables. Por ejemplo, inicializo una variable `x` y luego pongo un `String n = "Juan"` y luego pongo una `p` para `16.5`.

Esto de aquí no tiene coherencia, no hay una relación entre ambos, por lo que es mucho más difícil asociarlos.

Una forma correcta de implementarlo sería darle el nombre de `edad` para el valor de `18`, el atributo `nombre` para `"Juan"` y para `p`, cambiarlo por `promedio` para que se entienda aún más a qué nos estamos refiriendo.

## Diferencia entre Asignación e Igualdad

El siguiente error más común es confundir el igual con el operador de igualdad.

Por ejemplo, aquí tenemos una asignación de valores:

```java
edad = 18;
```

Aquí sí usamos la asignación.

Luego, en el siguiente ejemplo, estamos utilizando una comparación. Queremos verificar si dos valores son iguales. Para ello, utilizamos un operador de igualdad:

```java
edad == 18
```

En este caso estamos comprobando si `edad` es igual a `18`.

## Importancia de la Indentación

Otro aspecto fundamental es la indentación.

La indentación es el espacio al inicio de cada línea. Ello no afecta cómo funciona el programa, pero sí afecta muchísimo su legibilidad.

Veamos un ejemplo.

Una forma mal hecha sería colocar, por ejemplo, un `for` sin generar ningún espacio, lo cual hace que todo se vea mucho más compacto y difícil de leer.

En cambio, un `for` bien estructurado tiene los espacios correspondientes y es mucho más legible y amigable a la vista.

En Online GDB podemos usar la tecla **Tab** para indentar una línea hacia adentro.

## Evita Repetir Código

Otro error clave es no dividir tu código en métodos.

Si te encuentras copiando y pegando un mismo bloque de código muchas veces, eso es una señal de que tienes que convertirlo en un método.

Por ejemplo, tenemos muchos `print` para imprimir nombres, edades y promedios de unas personas.

Ello se lograría fácilmente encapsulándolo en una función y llamándola las veces que sean necesarias.

## Actividad Práctica

Perfecto, ahora abre el editor del enlace que está en la descripción.

El archivo tiene un código con cuatro problemas intencionados:

- Nombres de variables poco descriptivos.
- Comparación incorrecta con `=`.
- Código repetido que debería estar en un método.
- Indentación desordenada.

### Tu tarea

Identifica cada problema, corrígelo y ejecuta el programa para verificar que funcione correctamente.

## ¡Felicidades!

Completaste el curso de fundamentos de Java.

Aprendiste a programar desde cero:

- Variables
- Operadores
- Estructuras de control
- Métodos
- Clases
- Encapsulación
- Arrays
- PO (Programación Orientada a Objetos)

Esto es solo el comienzo.

Si quieres seguir aprendiendo, te recomendamos explorar la documentación oficial de Java en:

https://docs.oracle.com

Muchas gracias.