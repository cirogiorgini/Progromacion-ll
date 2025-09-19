package tp3;

public class Tp3 {
    public static void main(String[] args) {
        // 1. Estudiante
        Estudiante e = new Estudiante();
        e.nombre = "Ciro";
        e.apellido = "Giorgini";
        e.curso = "Programacion II";
        e.calificacion = 7;
        e.mostrarInfo();
        e.subirCalificacion(2);
        e.bajarCalificacion(1);
        e.mostrarInfo();

        // 2. Mascota
        Mascota m = new Mascota();
        m.nombre = "Firulais";
        m.especie = "Perro";
        m.edad = 3;
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        // 3. Libro
        Libro l = new Libro("El Principito", "Saint-Exupery", 1943);
        l.mostrarInfo();
        l.setAnioPublicacion(-5); // invalido
        l.setAnioPublicacion(2000); // valido
        l.mostrarInfo();

        // 4. Gallina
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 1;
        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 2;
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();

        // 5. Nave Espacial
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Apollo";
        nave.combustible = 50;
        nave.avanzar(10); // no alcanza
        nave.recargarCombustible(30);
        nave.despegar();
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}
