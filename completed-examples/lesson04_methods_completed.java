/ Lección 4: Métodos, parámetros y salida por consola
// Ejemplo completo — así debería verse tu solución.


public class Lesson04_Methods {


    // Método void: no retorna valor, solo imprime
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }


    // Método con return: retorna la suma de dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }


    // Método con return booleano: evalúa si la edad es mayor o igual a 18
    public static boolean esMayor(int edad) {
        return edad >= 18;
    }


    public static void main(String[] args) {


        // Llamamos al método saludar
        saludar("Juan");


        // Llamamos al método sumar e imprimimos el resultado
        int resultado = sumar(7, 5);
        System.out.println("7 + 5 = " + resultado);


        // Llamamos al método esMayor e imprimimos según el resultado
        boolean mayor = esMayor(16);
        System.out.println("¿Es mayor de edad?: " + mayor);


    }
}
