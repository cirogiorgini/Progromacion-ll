package casopractico_1;
import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // ---------- Altas ----------

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // ---------- Asignar profesor a curso ----------

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);

        if (c == null) {
            System.out.println("No se encontró curso con código: " + codigoCurso);
            return;
        }
        if (p == null) {
            System.out.println("No se encontró profesor con id: " + idProfesor);
            return;
        }

        c.setProfesor(p);  // esto ya sincroniza ambos lados
        System.out.println("Profesor " + p.getNombre() +
                " asignado al curso " + c.getNombre());
    }

    // ---------- Listados ----------

    public void listarProfesores() {
        System.out.println("\n--- Profesores de la universidad ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados.");
        } else {
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    }

    public void listarCursos() {
        System.out.println("\n--- Cursos de la universidad ---");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos cargados.");
        } else {
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }

    // ---------- Búsquedas ----------

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    // ---------- Bajas ----------

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return;

        // Romper relación con su profesor, si lo tiene
        c.setProfesor(null);   // esto lo quita de la lista del profesor
        cursos.remove(c);
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return;

        // Dejar profesor = null en todos los cursos que dictaba
        // Hacemos una copia para evitar ConcurrentModification
        List<Curso> copiaCursos = new ArrayList<>(p.getCursos());
        for (Curso c : copiaCursos) {
            c.setProfesor(null);
        }

        profesores.remove(p);
    }
    
    public List<Profesor> getProfesores() { return profesores; }

}
