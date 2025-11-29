public class TarjetaCredito implements PagoConDescuento {

    private String titular;
    private String numero;
    private double porcentajeDescuento; // por ejemplo 10 = 10%

    public TarjetaCredito(String titular, String numero, double porcentajeDescuento) {
        this.titular = titular;
        this.numero = numero;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * (porcentajeDescuento / 100.0);
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de " + titular +
                " por $" + montoConDescuento + " (descuento " + porcentajeDescuento + "% aplicado)");
    }
}
