import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    public enum EstadoPedido {
        CREADO,
        PAGADO,
        ENVIADO,
        ENTREGADO,
        CANCELADO
    }

    private List<Producto> productos;
    private Cliente cliente;
    private EstadoPedido estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.CREADO;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El pedido ha cambiado de estado a: " + nuevoEstado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
