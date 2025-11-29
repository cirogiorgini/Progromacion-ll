import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosExcepciones {

    // 1. División segura
    public static void divisionSegura() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros.");
        }
    }

    // 2. Conversión de cadena a número
    public static void conversionCadenaANumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto que represente un número entero: ");
        String texto = scanner.nextLine();

        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Número convertido: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número entero válido.");
        }
    }

    // 3. Lectura de archivo (FileNotFoundException)
    public static void lecturaArchivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a leer: ");
        String ruta = scanner.nextLine();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(ruta));
            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo " + ruta + " no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }

    // 4. Validación de edad con EdadInvalidaException
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no es válida (debe estar entre 0 y 120).");
        }
    }

    public static void pruebaEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una edad: ");
        try {
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("Edad válida.");
        } catch (EdadInvalidaException e) {
            System.out.println("Se capturó EdadInvalidaException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero para la edad.");
        }
    }

    // 5. Uso de try-with-resources con BufferedReader (IOException)
    public static void lecturaArchivoTryWithResources() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a leer (try-with-resources): ");
        String ruta = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo " + ruta + " no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Podés ir probando cada ejercicio comentando/descomentando:
         divisionSegura();
        // conversionCadenaANumero();
        // lecturaArchivo();
        // pruebaEdad();
        // lecturaArchivoTryWithResources();
    }
}
