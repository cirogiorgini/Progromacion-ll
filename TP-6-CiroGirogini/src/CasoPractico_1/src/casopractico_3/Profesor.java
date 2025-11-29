package casopractico_1;
import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // ---------- Métodos de asociación ----------

    public void agregarCurso(Curso c) {
        if (c == null) return;

        // Si el curso ya está en la lista, no lo agregamos de nuevo
        if (!cursos.contains(c)) {
            cursos.add(c);
        }

        // Sincronizar el otro lado: el curso debe apuntar a este profesor
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;

        if (cursos.contains(c)) {
            cursos.remove(c);
        }

        // Sincronizar el otro lado: si el curso tenía este profesor, lo dejamos en null
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  (sin cursos asignados)");
        } else {
            for (Curso c : cursos) {
                System.out.println("  - " + c.getCodigo() + " | " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +
                " | ID: " + id +
                " | Especialidad: " + especialidad +
                " | Cantidad de cursos: " + cursos.size());
    }

    // ---------- Getters & Setters necesarios ----------

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
