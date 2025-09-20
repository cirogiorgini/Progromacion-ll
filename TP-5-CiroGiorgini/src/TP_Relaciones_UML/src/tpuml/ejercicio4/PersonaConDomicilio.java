package tpuml.ejercicio4;
public class PersonaConDomicilio {
    private String nombre;
    private Domicilio domicilio;
    public PersonaConDomicilio(String nombre, Domicilio domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public String getNombre() { return nombre; }
    public Domicilio getDomicilio() { return domicilio; }
}