package tpuml.ejercicio3;
public class Libro {
    private String titulo;
    private Portada portada;
    public Libro(String titulo, String colorPortada) {
        this.titulo = titulo;
        this.portada = new Portada(colorPortada);
    }
    public String getTitulo() { return titulo; }
    public Portada getPortada() { return portada; }
}