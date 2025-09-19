/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2;

import java.util.Scanner;

/**
 *
 * @author cirog
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para probar un ejercicio, descomenta la linea correspondiente:
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
    }
    
    // =========================
    // Ejercicio 1
    // =========================
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    // =========================
    // Ejercicio 2
    // =========================
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }

    // =========================
    // Ejercicio 3
    // =========================
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota (0 a 10): ");
        int nota = sc.nextInt();

        if (nota >= 6) {
            System.out.println("APROBADO");
        } else {
            System.out.println("DESAPROBADO");
        }
    }

    // =========================
    // Ejercicio 4
    // =========================
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 1 y 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Numero invalido");
        }
    }

    // =========================
    // Ejercicio 5
    // =========================
    public static void ejercicio5() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // =========================
    // Ejercicio 6
    // =========================
    public static void ejercicio6() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }
    }

    // =========================
    // Ejercicio 7
    // =========================
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("El factorial de " + n + " es: " + fact);
    }

    // =========================
    // Ejercicio 8
    // =========================
    public static void ejercicio8() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los 100 primeros numeros es: " + suma);
    }

    // =========================
    // Ejercicio 9
    // =========================
    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;
        do {
            System.out.print("Ingrese un numero (0 para salir): ");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);
        System.out.println("La suma total es: " + suma);
    }

    // =========================
    // Ejercicio 10
    // =========================
    public static void ejercicio10() {
        int[] numeros = {10, 20, 30, 40, 50};
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    // =========================
    // Ejercicio 11
    // =========================
    public static void ejercicio11() {
        int[] numeros = {5, 7, 2, 9, 4};
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    // =========================
    // Ejercicio 12
    // =========================
    public static void ejercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para sumar hasta cero: ");
        int n = sc.nextInt();
        System.out.println("La suma hasta cero es: " + sumaHastaCero(n));
    }

    public static int sumaHastaCero(int n) {
        if (n == 0) return 0;
        return n + sumaHastaCero(n - 1);
    }

    // =========================
    // Ejercicio 13
    // =========================
    public static void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular factorial recursivo: ");
        int n = sc.nextInt();
        System.out.println("El factorial es: " + factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
