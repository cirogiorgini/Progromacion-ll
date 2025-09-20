package tpuml.ejercicio2;
public class Tarjeta {
    private String numero;
    private Persona titular;
    private double saldo;
    public Tarjeta(String numero, Persona titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public boolean tieneSaldo(double monto) { return saldo >= monto; }
    public void descontar(double monto) { saldo -= monto; }
    public Persona getTitular() { return titular; }
}