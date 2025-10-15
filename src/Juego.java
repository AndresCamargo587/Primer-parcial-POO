import java.util.Scanner;
import java.util.Random;

public class Juego {

    public static void libre() {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1; // número entre 1 y 5

        System.out.println("Adivina el número");
        System.out.print("Adivina el número entre 1 y 10");
        int intento = leer.nextInt();

        if (intento == numeroSecreto) {
            System.out.println("Correcto El número era " + numeroSecreto);
        } else {
            System.out.println("Fallaste El número era " + numeroSecreto);
        }
    }
}
