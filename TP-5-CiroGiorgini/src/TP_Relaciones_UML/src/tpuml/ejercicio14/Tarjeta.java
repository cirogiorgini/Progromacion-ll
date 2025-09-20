package tpuml.ejercicio14;
public class Tarjeta {
    private double saldo;
    public Tarjeta(double saldo) { this.saldo = saldo; }
    public boolean tieneSaldo(double monto) { return saldo >= monto; }
    public void pagar(Compra compra, int cantCuotas) {
        if (tieneSaldo(compra.getMonto())) {
            saldo -= compra.getMonto();
            Cuotas cuotas = new Cuotas(cantCuotas, compra.getMonto());
            System.out.println("Compra realizada en " + cuotas.getCantidad() + 
                " cuotas de $" + cuotas.getMontoPorCuota());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}