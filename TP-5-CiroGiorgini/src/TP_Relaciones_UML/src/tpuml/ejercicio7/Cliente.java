package tpuml.ejercicio7;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private List<Pedido> pedidos;
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public List<Pedido> getPedidos() { return pedidos; }
}