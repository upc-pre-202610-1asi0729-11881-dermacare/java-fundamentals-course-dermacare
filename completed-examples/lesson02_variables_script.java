// Lección 2: Variables, tipos de datos y operadores
// Ejemplo completo — así debería verse tu solución.


public class Lesson02_VariablesOperators {


    public static void main(String[] args) {


        // Declaración de variables con distintos tipos de datos
        int edad = 15;
        String nombre = "Juan";
        double promedio = 14.5;
        boolean aprobado = true;


        // Imprimimos cada variable con un mensaje descriptivo
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Aprobado?: " + aprobado);


        // Operaciones aritméticas
        int a = 10;
        int b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo (residuo): " + (a % b));


        // Operadores relacionales
        System.out.println("¿a es mayor que b?: " + (a > b));
        System.out.println("¿a es igual a b?: " + (a == b));


    }
}
