import java.util.Scanner;
public class Lesson06_IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.nextLine();
        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();
        System.out.println("¡Hola " + nombre + "! Tienes " + edad + " años.");
        sc.close();
    }
}
