/*
 * Archivo: App.java
 * Ejecuta los 3 casos prácticos del TP 6 (Colecciones)
 */
package casopractico_1;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=======================================");
            System.out.println("   TRABAJO PRÁCTICO 6 - COLECCIONES");
            System.out.println("=======================================");
            System.out.println("1. Caso Práctico 1 - Inventario");
            System.out.println("2. Caso Práctico 2 - Biblioteca");
            System.out.println("3. Caso Práctico 3 - Universidad");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> ejecutarCaso1();
                case 2 -> ejecutarCaso2();
                case 3 -> ejecutarCaso3();
                case 0 -> System.out.println("Saliendo de la aplicación...");
                default -> System.out.println("Opción inválida.");
            }

            System.out.println("\nPresione ENTER para continuar...");
            sc.nextLine();

        } while (opcion != 0);

        sc.close();
    }

    // ==========================================
    // CASO PRÁCTICO 1 - INVENTARIO (TU CÓDIGO)
    // ==========================================
    private static void ejecutarCaso1() {
        System.out.println("\n=== CASO PRÁCTICO 1: INVENTARIO ===");

        Inventario inv = new Inventario();

        // (1) Crear al menos cinco productos y agregarlos
        inv.agregarProducto(new Producto("P001", "Arroz 1Kg", 1200, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002", "TV 43\"", 350000, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003", "Remera Algodón", 8000, 35, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004", "Sillón 2 cuerpos", 290000, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005", "Yerba 1Kg", 2500, 80, CategoriaProducto.ALIMENTOS));

        // (2) Listar todos los productos
        System.out.println("\n== LISTA DE PRODUCTOS ==");
        inv.listarProductos();

        // (3) Buscar un producto por ID
        System.out.println("\n== BUSCAR POR ID (P003) ==");
        Producto encontrado = inv.buscarProductoPorId("P003");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        // (4) Filtrar por categoría
        System.out.println("\n== FILTRAR POR CATEGORÍA: ALIMENTOS ==");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(System.out::println);

        // (5) Eliminar por ID y listar
        System.out.println("\n== ELIMINAR ID P004 ==");
        boolean eliminado = inv.eliminarProducto("P004");
        System.out.println(eliminado ? "Eliminado." : "No se encontró.");
        System.out.println("\n== LISTA ACTUALIZADA ==");
        inv.listarProductos();

        // (6) Actualizar stock
        System.out.println("\n== ACTUALIZAR STOCK P002 a 20 ==");
        boolean actualizado = inv.actualizarStock("P002", 20);
        System.out.println(actualizado ? "Stock actualizado." : "No se encontró el producto.");
        inv.listarProductos();

        // (7) Total de stock
        System.out.println("\n== TOTAL DE STOCK ==");
        System.out.println(inv.obtenerTotalStock());

        // (8) Producto con mayor stock
        System.out.println("\n== PRODUCTO CON MAYOR STOCK ==");
        System.out.println(inv.obtenerProductoConMayorStock());

        // (9) Filtrar por precio entre 1000 y 3000
        System.out.println("\n== PRODUCTOS $1000 a $3000 ==");
        inv.filtrarProductosPorPrecio(1000, 3000).forEach(System.out::println);

        // (10) Mostrar categorías disponibles
        System.out.println("\n== CATEGORÍAS DISPONIBLES ==");
        inv.mostrarCategoriasDisponibles();
    }

    // ==========================================
    // CASO PRÁCTICO 2 - BIBLIOTECA Y LIBROS
    // ==========================================
    private static void ejecutarCaso2() {
        System.out.println("\n=== CASO PRÁCTICO 2: BIBLIOTECA Y LIBROS ===");

        // (1) Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // (2) Crear al menos tres autores
        Autor a1 = new Autor("A01", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A02", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A03", "Gabriel García Márquez", "Colombia");

        // (3) Agregar 5 libros asociados a alguno de los autores
        biblio.agregarLibro("ISBN001", "Ficciones", 1944, a1);
        biblio.agregarLibro("ISBN002", "El Aleph", 1949, a1);
        biblio.agregarLibro("ISBN003", "La casa de los espíritus", 1982, a2);
        biblio.agregarLibro("ISBN004", "Cien años de soledad", 1967, a3);
        biblio.agregarLibro("ISBN005", "El amor en los tiempos del cólera", 1985, a3);

        // (4) Listar todos los libros con su info y autor
        biblio.listarLibros();

        // (5) Buscar un libro por su ISBN y mostrar su información
        System.out.println("\n--- Búsqueda por ISBN: ISBN003 ---");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }

        // (6) Filtrar y mostrar libros publicados en un año específico
        biblio.filtrarLibrosPorAnio(1982);

        // (7) Eliminar un libro por su ISBN y listar los restantes
        System.out.println("\n--- Eliminando libro ISBN002 ---");
        biblio.eliminarLibro("ISBN002");
        biblio.listarLibros();

        // (8) Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\nCantidad total de libros en la biblioteca: " +
                biblio.obtenerCantidadLibros());

        // (9) Listar todos los autores de los libros disponibles
        biblio.mostrarAutoresDisponibles();
    }

    // ==========================================
    // CASO PRÁCTICO 3 - UNIVERSIDAD, PROFESOR Y CURSO
    // ==========================================
    private static void ejecutarCaso3() {
        System.out.println("\n=== CASO PRÁCTICO 3: UNIVERSIDAD, PROFESOR Y CURSO ===");

        // (1) Crear al menos 3 profesores y 5 cursos
        Universidad uni = new Universidad("Universidad Nacional");

        Profesor p1 = new Profesor("P01", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P02", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P03", "María Gómez", "Bases de Datos");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C01", "Álgebra I");
        Curso c2 = new Curso("C02", "Programación II");
        Curso c3 = new Curso("C03", "Bases de Datos I");
        Curso c4 = new Curso("C04", "Sistemas Operativos");
        Curso c5 = new Curso("C05", "Estructuras de Datos");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // (3) Asignar profesores a cursos
        uni.asignarProfesorACurso("C01", "P01");
        uni.asignarProfesorACurso("C02", "P02");
        uni.asignarProfesorACurso("C03", "P03");
        uni.asignarProfesorACurso("C04", "P02");
        uni.asignarProfesorACurso("C05", "P03");

        // (4) Listar cursos con su profesor y profesores con sus cursos
        uni.listarCursos();
        uni.listarProfesores();
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // (5) Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n--- Cambiando profesor de C03 a P01 ---");
        uni.asignarProfesorACurso("C03", "P01");
        uni.listarCursos();
        p1.listarCursos();
        p3.listarCursos();

        // (6) Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n--- Eliminando curso C02 ---");
        uni.eliminarCurso("C02");
        uni.listarCursos();
        p2.listarCursos();

        // (7) Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n--- Eliminando profesor P03 ---");
        uni.eliminarProfesor("P03");
        uni.listarProfesores();
        uni.listarCursos();   // los cursos de P03 ahora deben tener profesor = null

        // (8) Reporte: cantidad de cursos por profesor
        System.out.println("\n=== REPORTE: Cantidad de cursos por profesor ===");
        for (Profesor p : uni.getProfesores()) {  // necesitás getProfesores() en Universidad
            p.mostrarInfo();  // ya incluye la cantidad de cursos
        }
    }
}
