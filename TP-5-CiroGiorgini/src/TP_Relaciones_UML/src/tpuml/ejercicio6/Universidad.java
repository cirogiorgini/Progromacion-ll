package tpuml.ejercicio6;
import java.util.ArrayList;
import java.util.List;
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    public List<Profesor> getProfesores() { return profesores; }
}