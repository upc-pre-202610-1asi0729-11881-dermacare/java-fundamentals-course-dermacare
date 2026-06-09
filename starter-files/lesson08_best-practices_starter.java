// Lección 8: Buenas prácticas y errores comunes
// El siguiente código funciona, pero tiene varios problemas de estilo y errores comunes.
// Tu tarea es identificarlos y corregirlos.


public class Lesson08_BestPractices {


    public static void main(String[] args) {


        // PROBLEMA 1: Nombres de variables poco descriptivos
        // Corrígelos con nombres que expliquen qué guardan
        int x = 18;
        String n = "Juan";
        double p = 16.5;


        // PROBLEMA 2: Comparación incorrecta con =  en lugar de ==
        // Corrígelo para que compile y funcione bien
        // if (x = 18) {
        //     System.out.println("Tiene 18 años");
        // }


        // PROBLEMA 3: Código repetido — refactorízalo en un método
        System.out.println("Nombre: " + n + " | Promedio: " + p);
        System.out.println("Nombre: " + "Pepe" + " | Promedio: " + 14.0);
        System.out.println("Nombre: " + "Carlos" + " | Promedio: " + 17.5);


        // PROBLEMA 4: Indentación incorrecta — corrígela
        // (Este bloque debería estar correctamente indentado)
        for(int i=1;i<=3;i++){
System.out.println("Estudiante número: "+i);
}


    }
}
