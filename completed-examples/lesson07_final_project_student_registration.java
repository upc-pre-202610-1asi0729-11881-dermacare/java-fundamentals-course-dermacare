// Lección 7: Proyecto final — Registro de estudiantes
// Ejemplo completo — así debería verse tu solución.


class Estudiante {


    private String nombre;
    private int edad;
    private double promedio;


    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public double getPromedio() {
        return promedio;
    }


    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: promedio inválido.");
        }
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio);
    }
}


public class Lesson07_FinalProject {


    public static void main(String[] args) {


        // Creamos un array de 3 estudiantes
        Estudiante[] registro = new Estudiante[3];
        registro[0] = new Estudiante("Carlos", 16, 15.5);
        registro[1] = new Estudiante("Pepe", 15, 17.0);
        registro[2] = new Estudiante("Antonio", 17, 13.5);


        // Mostramos la información de todos los estudiantes
        System.out.println("=== Registro de Estudiantes ===");
        for (int i = 0; i < registro.length; i++) {
            registro[i].mostrarInfo();
        }


        // Calculamos el promedio general del salón
        double sumaPromedios = 0;
        for (int i = 0; i < registro.length; i++) {
            sumaPromedios += registro[i].getPromedio();
        }
        double promedioGeneral = sumaPromedios / registro.length;
        System.out.println("\nPromedio general del salón: " + promedioGeneral);


        // Encontramos al estudiante con el promedio más alto
        Estudiante mejorEstudiante = registro[0];
        for (int i = 1; i < registro.length; i++) {
            if (registro[i].getPromedio() > mejorEstudiante.getPromedio()) {
                mejorEstudiante = registro[i];
            }
        }
        System.out.println("Mejor promedio: " + mejorEstudiante.getNombre()
                + " con " + mejorEstudiante.getPromedio());


    }
}
