import java.util.ArrayList;
import java.util.List;

public class MainKata4 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mish"));
        animales.add(new Vaca("Lola"));

        System.out.println("== Sonidos de animales ==");
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // polimorfismo
            System.out.println("------------------------");
        }
    }
}
