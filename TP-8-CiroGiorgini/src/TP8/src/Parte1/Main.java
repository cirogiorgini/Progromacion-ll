public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ciro", "ciro@gmail.com");

        Producto p1 = new Producto("Mouse Gamer", 15000);
        Producto p2 = new Producto("Teclado Mecánico", 30000);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Productos del pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println(" - " + p);
        }

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Pago con tarjeta con descuento
        PagoConDescuento pagoTarjeta =
                new TarjetaCredito("Ciro Giorgini", "1111-2222-3333-4444", 10);
        pagoTarjeta.procesarPago(total);

        // Cambiamos el estado y notificamos al cliente
        pedido.cambiarEstado(Pedido.EstadoPedido.PAGADO);
        pedido.cambiarEstado(Pedido.EstadoPedido.ENVIADO);
    }
}
