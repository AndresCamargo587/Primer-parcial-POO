import java.util.Scanner;

public class TextoMorse {
    public static void transformar() {
        Scanner leer = new Scanner(System.in);

        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "1","2","3","4","5","6","7","8","9","0"," "};

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--..",
                ".----","..---","...--","....-",".....","-....","--...",
                "---..","----.","-----","/"};

        System.out.print("Escribe el texto: ");
        String texto = leer.nextLine().toUpperCase();

        String resultado = "";


        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);


            for (int j = 0; j < letras.length; j++) {
                if (letra.equals(letras[j])) {
                    resultado += morse[j] + " ";
                }
            }
        }

        System.out.println("Codigo Morse: " + resultado);
    }
}