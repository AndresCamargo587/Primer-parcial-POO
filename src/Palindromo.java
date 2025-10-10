import java.util.Scanner;

public class Palindromo {
    public static void palabra() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabra = leer.nextLine();

        palabra = palabra.toLowerCase().replace(" ", "");

        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida = invertida + palabra.charAt(i);
        }

        if (palabra.equals(invertida)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}

