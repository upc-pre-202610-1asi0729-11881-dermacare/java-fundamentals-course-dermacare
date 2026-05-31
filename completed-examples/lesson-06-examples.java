// Lección 6: Arrays y cadenas
// Ejemplo completo — así debería verse tu solución.


public class Lesson06_Arrays {


    public static void main(String[] args) {


        // Array de String con nombres de cursos
        String[] cursos = {"Matemática", "Comunicación", "Historia", "Ciencias"};


        // Accedemos al primer y último elemento
        System.out.println("Primer curso: " + cursos[0]);
        System.out.println("Último curso: " + cursos[cursos.length - 1]);


        // Recorremos el array con un bucle for
        System.out.println("\nLista de cursos:");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Curso " + (i + 1) + ": " + cursos[i]);
        }


        // Métodos de String
        String saludo = "hola mundo";
        System.out.println("\nTexto original: " + saludo);
        System.out.println("Longitud: " + saludo.length());
        System.out.println("En mayúsculas: " + saludo.toUpperCase());
        System.out.println("¿Contiene 'mundo'?: " + saludo.contains("mundo"));


        // Array de enteros y cálculo de promedio
        int[] notas = {14, 16, 12, 18, 15};
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedio = (double) suma / notas.length;
        System.out.println("\nPromedio de notas: " + promedio);


    }
}
