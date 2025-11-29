public class MainKata2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(3.0);
        figuras[1] = new Rectangulo(4.0, 5.0);
        figuras[2] = new Circulo(1.5);

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - área = " + f.calcularArea());
        }
    }
}
