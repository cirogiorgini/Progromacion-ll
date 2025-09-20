/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author cirog
 */
public class Empleado {
    // Atributos privados (encapsulados)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributos estáticos
    private static int totalEmpleados = 0;
    private static int ultimoId = 0;

    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto (id automático, salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario base por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre +
               ", Puesto: " + puesto + ", Salario: $" + salario + "]";
    }
}
