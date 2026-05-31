// Lección 8: Buenas prácticas y errores comunes
// Ejemplo completo — así debería verse el código corregido.


public class lesson08_bestPractices {


    // CORRECCIÓN 3: código repetido extraído a un método reutilizable
    public static void mostrarEstudiante(String nombre, double promedio) {
        System.out.println("Nombre: " + nombre + " | Promedio: " + promedio);
    }


    public static void main(String[] args) {


        // CORRECCIÓN 1: nombres de variables descriptivos
        int edad = 18;
        String nombre = "Juan";
        double promedio = 16.5;


        // CORRECCIÓN 2: comparación correcta con ==
        if (edad == 18) {
            System.out.println(nombre + " tiene 18 años.");
        }


        // CORRECCIÓN 3: usamos el método en lugar de repetir código
        mostrarEstudiante(nombre, promedio);
        mostrarEstudiante("Pepe", 14.0);
        mostrarEstudiante("Carlos", 17.5);


        // CORRECCIÓN 4: indentación correcta y espacios legibles
        for (int i = 1; i <= 3; i++) {
            System.out.println("Estudiante número: " + i);
        }


    }
}
