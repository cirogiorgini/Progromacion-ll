package tpuml.ejercicio14;
public class Cuotas {
    private int cantidad;
    private double montoPorCuota;
    public Cuotas(int cantidad, double total) {
        this.cantidad = cantidad;
        this.montoPorCuota = total / cantidad;
    }
    public int getCantidad() { return cantidad; }
    public double getMontoPorCuota() { return montoPorCuota; }
}