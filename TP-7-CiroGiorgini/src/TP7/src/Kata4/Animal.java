public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre + ".");
    }
}
