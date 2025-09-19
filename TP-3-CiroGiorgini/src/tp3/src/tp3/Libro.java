/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author cirog
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Anio invalido");
        }
    }

    public void mostrarInfo() {
        System.out.println(titulo + " de " + autor + " (" + anioPublicacion + ")");
    }
}
