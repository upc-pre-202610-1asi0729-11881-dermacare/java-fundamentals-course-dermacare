import java.util.Scanner;
public class Lesson10_FinalProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante[] lista = new Estudiante[50];
        int cantidad = 0, opcion;
        do {
            System.out.println("\n=== REGISTRO DE ESTUDIANTES ===");
            System.out.println("1. Agregar  2. Listar  3. Promedio  4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: "); String n = sc.nextLine();
                    System.out.print("Nota (0-20): "); int nota = sc.nextInt(); sc.nextLine();
                    lista[cantidad++] = new Estudiante(n, nota);
                    System.out.println("Registrado."); break;
                case 2:
                    for (int i = 0; i < cantidad; i++) lista[i].imprimir(); break;
                case 3:
                    if (cantidad == 0) { System.out.println("Sin datos."); break; }
                    int suma = 0;
                    for (int i = 0; i < cantidad; i++) suma += lista[i].getNota();
                    System.out.println("Promedio: " + (double) suma / cantidad); break;
            }
        } while (opcion != 4);
        sc.close();
    }
}
class Estudiante {
    private String nombre; private int nota;
    public Estudiante(String nombre, int nota) { this.nombre = nombre; this.nota = nota; }
    public String getNombre() { return nombre; }
    public int getNota() { return nota; }
    public void imprimir() { System.out.println(nombre + " | Nota: " + nota); }
}
