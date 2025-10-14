import java.util.Scanner;

public class Caballero {

    String nombre;
    String constelacion;
    int cosmos;

    static Caballero c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;

    @Override
    public String toString() {
        return this.nombre
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

    public static void eliminar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Que caballero quieres eliminar? ");
        String nombre = leer.nextLine();

        if (c1 != null && c1.nombre.equalsIgnoreCase(nombre)) {
            c1 = null;
        } else if (c2 != null && c2.nombre.equalsIgnoreCase(nombre)) {
            c2 = null;
        } else if (c3 != null && c3.nombre.equalsIgnoreCase(nombre)) {
            c3 = null;
        } else if (c4 != null && c4.nombre.equalsIgnoreCase(nombre)) {
            c4 = null;
        } else if (c5 != null && c5.nombre.equalsIgnoreCase(nombre)) {
            c5 = null;
        } else if (c6 != null && c6.nombre.equalsIgnoreCase(nombre)) {
            c6 = null;
        } else if (c7 != null && c7.nombre.equalsIgnoreCase(nombre)) {
            c7 = null;
        } else if (c8 != null && c8.nombre.equalsIgnoreCase(nombre)) {
            c8 = null;
        } else if (c9 != null && c9.nombre.equalsIgnoreCase(nombre)) {
            c9 = null;
        } else if (c10 != null && c10.nombre.equalsIgnoreCase(nombre)) {
            c10 = null;
        } else if (c11 != null && c11.nombre.equalsIgnoreCase(nombre)) {
            c11 = null;
        } else if (c12 != null && c12.nombre.equalsIgnoreCase(nombre)) {
            c12 = null;
        }
        System.out.println("Caballero eliminado");
    }
    public static void batalla() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Batalla entre caballeros");

        System.out.print("Nombre del primer caballero: ");
        String nombre1 = leer.nextLine();

        System.out.print("Nombre del segundo caballero: ");
        String nombre2 = leer.nextLine();

        Caballero cab1 = null;
        Caballero cab2 = null;

        if (c1 != null && c1.nombre.equals(nombre1)) cab1 = c1;
        if (c2 != null && c2.nombre.equals(nombre1)) cab1 = c2;
        if (c3 != null && c3.nombre.equals(nombre1)) cab1 = c3;
        if (c4 != null && c4.nombre.equals(nombre1)) cab1 = c4;
        if (c5 != null && c5.nombre.equals(nombre1)) cab1 = c5;
        if (c6 != null && c6.nombre.equals(nombre1)) cab1 = c6;
        if (c7 != null && c7.nombre.equals(nombre1)) cab1 = c7;
        if (c8 != null && c8.nombre.equals(nombre1)) cab1 = c8;
        if (c9 != null && c9.nombre.equals(nombre1)) cab1 = c9;
        if (c10 != null && c10.nombre.equals(nombre1)) cab1 = c10;
        if (c11 != null && c11.nombre.equals(nombre1)) cab1 = c11;
        if (c12 != null && c12.nombre.equals(nombre1)) cab1 = c12;


        if (c1 != null && c1.nombre.equals(nombre2)) cab2 = c1;
        if (c2 != null && c2.nombre.equals(nombre2)) cab2 = c2;
        if (c3 != null && c3.nombre.equals(nombre2)) cab2 = c3;
        if (c4 != null && c4.nombre.equals(nombre2)) cab2 = c4;
        if (c5 != null && c5.nombre.equals(nombre2)) cab2 = c5;
        if (c6 != null && c6.nombre.equals(nombre2)) cab2 = c6;
        if (c7 != null && c7.nombre.equals(nombre2)) cab2 = c7;
        if (c8 != null && c8.nombre.equals(nombre2)) cab2 = c8;
        if (c9 != null && c9.nombre.equals(nombre2)) cab2 = c9;
        if (c10 != null && c10.nombre.equals(nombre2)) cab2 = c10;
        if (c11 != null && c11.nombre.equals(nombre2)) cab2 = c11;
        if (c12 != null && c12.nombre.equals(nombre2)) cab2 = c12;

        if (cab1.cosmos > cab2.cosmos)
            System.out.println("Gana " + cab1.nombre);
        else if (cab2.cosmos > cab1.cosmos)
            System.out.println("Gana " + cab2.nombre);
    }
}

