package tpuml.ejercicio10;
public class EditorVideo {
    private Proyecto proyecto;
    public EditorVideo(String nombreProyecto) {
        this.proyecto = new Proyecto(nombreProyecto);
    }
    public void exportar() {
        Render render = new Render();
        render.procesar(proyecto);
    }
}