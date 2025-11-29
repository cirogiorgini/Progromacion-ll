/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico_1;

/**
 *
 * @author cirog
 */
// Archivo: Inventario.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario {
    private final ArrayList<Producto> productos = new ArrayList<>();

    // 1) Agregar
    public void agregarProducto(Producto p) {
        // si querés evitar IDs duplicados:
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
        } else {
            System.out.println("Ya existe un producto con id " + p.getId());
        }
    }

    // 2) Listar
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados.");
            return;
        }
        productos.forEach(Producto::mostrarInfo);
    }

    // 3) Buscar por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    // 4) Filtrar por categoría
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    // 5) Eliminar por ID
    public boolean eliminarProducto(String id) {
        return productos.removeIf(p -> p.getId().equalsIgnoreCase(id));
    }

    // 6) Actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // 7) Total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    // 8) Producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        return productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad))
                .orElse(null);
    }

    // 9) Filtrar por precio (min, max)
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        return productos.stream()
                .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
                .collect(Collectors.toList());
    }

    // 10) Mostrar categorías disponibles con descripción
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.getDescripcion());
        }
    }
}

