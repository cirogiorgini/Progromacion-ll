/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico_1;

/**
 *
 * @author cirog
 */
// Archivo: Main.java
import java.util.List;

public class CasoPractico_1 {
    public static void main(String[] args) {
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
        System.out.println("\n== FILTRAR POR CATEGORIA: ALIMENTOS ==");
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
}
