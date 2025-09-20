package tpuml.ejercicio8;
import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private String nombre;
    private List<Empleado> empleados;
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public List<Empleado> getEmpleados() { return empleados; }
}