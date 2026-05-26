public class Lesson09_Arrays {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Pera", "Plátano", "Mango", "Fresa"};
        for (int i = 0; i < frutas.length; i++) System.out.println("Fruta " + (i+1) + ": " + frutas[i]);
        String primera = frutas[0];
        System.out.println("Longitud: " + primera.length());
        System.out.println("Mayúsculas: " + primera.toUpperCase());
        System.out.println("¿Contiene 'zan'?: " + primera.contains("zan"));
    }
}
