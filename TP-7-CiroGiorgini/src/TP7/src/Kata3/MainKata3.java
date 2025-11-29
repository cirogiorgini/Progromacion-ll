import java.util.ArrayList;
import java.util.List;

public class MainKata3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 200000, 5, 10000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 8000));
        empleados.add(new EmpleadoPlanta("Carlos", 250000, 2, 9000));
        empleados.add(new EmpleadoTemporal("Maria", 10, 7500));

        System.out.println("== Sueldos de empleados ==");
        for (Empleado e : empleados) {
            double sueldo = e.calcularSueldo(); // polimorfismo
            System.out.print(e.getNombre() + " cobra: " + sueldo);

            if (e instanceof EmpleadoPlanta) {
                System.out.println(" (Planta)");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" (Temporal)");
            } else {
                System.out.println();
            }
        }
    }
}
