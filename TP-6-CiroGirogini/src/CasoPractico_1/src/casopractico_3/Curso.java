package casopractico_1;
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;  // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // ---------- Asociación bidireccional ----------

    public void setProfesor(Profesor p) {
        // Si el profesor no cambia, no hacemos nada
        if (this.profesor == p) {
            return;
        }

        // Si ya tenía un profesor previo, hay que quitarnos de su lista
        if (this.profesor != null) {
            Profesor profesorAnterior = this.profesor;
            this.profesor = null;          // cortamos referencia para evitar loop
            profesorAnterior.getCursos().remove(this);
        }

        // Asignamos el nuevo profesor
        this.profesor = p;

        // Si p no es null, agregar este curso a su lista (sin duplicar)
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso: " + nombre +
                " | Código: " + codigo +
                " | Profesor: " + nombreProfesor);
    }

    // ---------- Getters ----------

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
