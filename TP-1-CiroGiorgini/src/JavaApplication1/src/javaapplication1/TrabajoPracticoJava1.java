import java.util.Scanner;

public class TrabajoPracticoJava1 {

    public static void main(String[] args) {
        // Ejercicios que solicitan ejecucion
        //en caso de querer testear alguna en especifico, hay que agregarla
        ejercicio2();
        ejercicio3();
        ejercicio5();
        ejercicio6();
    }

    // Ejercicio 2 
    public static void ejercicio2() {
        System.out.println("Hola, Java!");
    }

    // Ejercicio 3 
    public static void ejercicio3() {
        String nombre = "Ana";
        int edad = 25;
        double altura = 1.70;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante?: " + estudiante);
    }

    // Ejercicio 4 
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " anios.");
    }

    // Ejercicio 5 
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // Ejercicio 6 
    public static void ejercicio6() {
        System.out.println("Nombre: Juan Perez\nEdad: 30 anios\nDireccion: \"Calle Falsa 123\"");
    }

    // Ejercicio 8 
    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int b = sc.nextInt();

        int divisionEntera = a / b;
        double divisionDouble = (double) a / b;

        System.out.println("Division con int: " + divisionEntera);
        System.out.println("Division con double: " + divisionDouble);
    }

    // Ejercicio 9 
    public static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
    }

    // Ejercicio 10 
    public static void ejercicio10() {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
}
