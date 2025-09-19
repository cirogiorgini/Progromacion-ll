/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author cirog
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Curso: " + curso + " - Calificacion: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
    }
}
