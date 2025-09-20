package tpuml.ejercicio9;
import java.util.ArrayList;
import java.util.List;
public class Carrito {
    private List<Producto> productos;
    public Carrito() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> getProductos() { return productos; }
}