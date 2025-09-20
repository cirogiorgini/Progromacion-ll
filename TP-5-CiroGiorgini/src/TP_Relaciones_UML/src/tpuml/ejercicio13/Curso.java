package tpuml.ejercicio13;
import java.util.ArrayList;
import java.util.List;
public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;
    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public void inscribir(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}