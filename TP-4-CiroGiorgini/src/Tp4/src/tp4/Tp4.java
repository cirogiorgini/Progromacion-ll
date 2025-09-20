/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author cirog
 */
public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(1, "Ana López", "Gerente", 120000);
        Empleado e2 = new Empleado("Luis Pérez", "Analista");
        Empleado e3 = new Empleado("María Gómez", "Desarrolladora");

        // Aplicar aumentos
        e2.actualizarSalario(10);     // aumento 10%
        e3.actualizarSalario(5000);   // aumento fijo

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Total de empleados creados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
