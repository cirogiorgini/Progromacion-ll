package casopractico_1;
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre +
                " | ID: " + id +
                " | Nacionalidad: " + nacionalidad);
    }

    public String getNombre() { return nombre; }
    public String getId() { return id; }
}
