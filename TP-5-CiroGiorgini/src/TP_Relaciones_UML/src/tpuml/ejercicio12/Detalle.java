package tpuml.ejercicio12;
public class Detalle {
    private String descripcion;
    private double precio;
    public Detalle(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
}