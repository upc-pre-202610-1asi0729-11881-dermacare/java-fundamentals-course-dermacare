// Lección 5: Clases, objetos y encapsulación
// Ejemplo completo — así debería verse tu solución.


class Estudiante {


    // Atributos privados — no se pueden acceder directamente desde fuera
    private String nombre;
    private int edad;
    private double promedio;


    // Constructor: inicializa el objeto con los datos del estudiante
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }


    // Getters: permiten leer los atributos privados
    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public double getPromedio() {
        return promedio;
    }


    // Setter con validación: solo acepta promedios entre 0 y 20
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: el promedio debe estar entre 0 y 20.");
        }
    }


    // Método para mostrar la información del estudiante en consola
    public void mostrarInfo() {
        System.out.println("--- Información del estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}


public class Lesson05_Encapsulation {


    public static void main(String[] args) {


        // Creamos un objeto Estudiante usando el constructor
        Estudiante estudiante = new Estudiante("Carlos", 16, 15.5);


        // Mostramos la información inicial
        estudiante.mostrarInfo();


        // Actualizamos el promedio con un valor válido
        estudiante.setPromedio(18.0);
        estudiante.mostrarInfo();


        // Intentamos asignar un valor inválido — el setter lo rechaza
        estudiante.setPromedio(25.0);


    }
}
