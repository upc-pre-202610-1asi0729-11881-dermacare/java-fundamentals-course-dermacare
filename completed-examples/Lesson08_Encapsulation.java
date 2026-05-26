public class Lesson08_Encapsulation {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.setSaldo(1500.0);
        System.out.println("Saldo actualizado: " + cuenta.getSaldo());
        cuenta.setSaldo(-200.0);
        System.out.println("Tras intento negativo: " + cuenta.getSaldo());
    }
}
class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double saldo) { this.saldo = saldo; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double cantidad) {
        if (cantidad >= 0) this.saldo = cantidad;
        else System.out.println("Error: saldo no puede ser negativo.");
    }
}
