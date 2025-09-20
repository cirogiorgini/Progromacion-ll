package tpuml.ejercicio12;
import java.util.ArrayList;
import java.util.List;
public class Factura {
    private List<Detalle> detalles;
    public Factura() {
        this.detalles = new ArrayList<>();
    }
    public void agregarDetalle(Detalle detalle) {
        detalles.add(detalle);
    }
    public List<Detalle> getDetalles() { return detalles; }
}