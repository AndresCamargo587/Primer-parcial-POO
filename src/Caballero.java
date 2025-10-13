import java.util.Scanner;

public class Caballero {

    String nombre;
    String constelacion;
    int cosmos;

    static Caballero c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;

    @Override
    public String toString() {
        return  this.nombre
                + " de " + this.constelacion
                + " caballero con cosmos de: " + this.cosmos;

    }

    public Caballero(String nombre, String constelacion, int cosmos) {
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.cosmos = cosmos;
    }

    public static void gestor() {

        c1 = new Caballero("Acuario", "Camus", 10);
        c2 = new Caballero("Piscis", "Afrodita", 20);
        c3 = new Caballero("Aries", "Mu", 30);
        c4 = new Caballero("Tauro", "Aldebaran", 40);
        c5 = new Caballero("Geminis", "Saga y Kanon", 50);
        c6 = new Caballero("Cancer", "Deathmask", 60);
        c7 = new Caballero("Leo", "Aioria", 100);
        c8 = new Caballero("Virgo", "Shaka", 70);
        c9 = new Caballero("Libra", "Dohko", 80);
        c10 = new Caballero("Escorpio", "Milo", 90);
        c11 = new Caballero("Sagitario", "Aioros", 55);
        c12 = new Caballero("Capricornio", "Shura", 49);

    }

    public static void mostrar() {
        System.out.println("Caballeros creados");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);
        System.out.println(c11);
        System.out.println(c12);
    }
}
