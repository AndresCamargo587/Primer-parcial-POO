import java.util.Scanner;

public class Capicua {
    public static void numero(){
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int numero = leer.nextInt();

        int original = numero;
        int invertido = 0;


        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if (original == invertido) {
            System.out.println("Es un número capicua");
        } else {
            System.out.println("No es un número capicua");
        }
    }
}





