package tpuml.ejercicio2;
public class Posnet {
    public Ticket efectuarPago(Tarjeta tarjeta, double monto) {
        if (tarjeta.tieneSaldo(monto)) {
            tarjeta.descontar(monto);
            return new Ticket(monto);
        }
        return null;
    }
}