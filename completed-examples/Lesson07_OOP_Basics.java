public class Lesson07_OOP_Basics {
    public static void main(String[] args) {
        Animal perro = new Animal("Rex", "Guau");
        Animal gato = new Animal("Michi", "Miau");
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
class Animal {
    String nombre, sonido;
    Animal(String nombre, String sonido) { this.nombre = nombre; this.sonido = sonido; }
    void hacerSonido() { System.out.println(nombre + " dice: " + sonido); }
}
