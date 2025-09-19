/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author cirog
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    int capacidadMaxima = 100;

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible += cantidad;
            System.out.println("Recargado " + cantidad + ". Combustible actual: " + combustible);
        } else {
            System.out.println("No se puede superar el limite de " + capacidadMaxima);
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Combustible: " + combustible);
    }
}
