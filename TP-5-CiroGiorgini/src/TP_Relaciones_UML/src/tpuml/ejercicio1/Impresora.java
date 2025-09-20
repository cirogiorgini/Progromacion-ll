package tpuml.ejercicio1;
public class Impresora {
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo: " + doc.getTitulo());
        System.out.println(doc.getCuerpo());
    }
}