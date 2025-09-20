package tpuml.ejercicio11;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Libro> libros;
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public List<Libro> getLibros() { return libros; }
}