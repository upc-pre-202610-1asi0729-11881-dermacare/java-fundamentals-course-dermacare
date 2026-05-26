public class Lesson05_Methods {
    public static void main(String[] args) {
        saludar("María");
        System.out.println("Suma: " + sumar(10, 5));
    }
    public static void saludar(String nombre) { System.out.println("Hola, " + nombre + "!"); }
    public static int sumar(int a, int b) { return a + b; }
}
