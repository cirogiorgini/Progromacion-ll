public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double antiguedad; // en años
    private double adicionalPorAnio;

    public EmpleadoPlanta(String nombre, double sueldoBase,
                          double antiguedad, double adicionalPorAnio) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
        this.adicionalPorAnio = adicionalPorAnio;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + antiguedad * adicionalPorAnio;
    }
}
