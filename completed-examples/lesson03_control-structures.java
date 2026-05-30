// Lección 3: Estructuras de control
// Ejemplo completo — así debería verse tu solución.


public class Lesson03_ControlFlow {


    public static void main(String[] args) {


        // if-else if-else: evaluamos la nota del estudiante
        int nota = 13;


        if (nota >= 18) {
            System.out.println("¡Excelente!");
        } else if (nota >= 11) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }


        // Bucle for: imprimimos los números del 1 al 5
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // Bucle while: cuenta regresiva
        System.out.println("Cuenta regresiva:");
        int contador = 5;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
        System.out.println("¡Despegue!");


    }
}

