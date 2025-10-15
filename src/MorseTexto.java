import java.util.Scanner;

public class MorseTexto {
    public static void convertir() {
        Scanner leer = new Scanner(System.in);

        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "1","2","3","4","5","6","7","8","9","0"," "};

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--..",
                ".----","..---","...--","....-",".....","-....","--...",
                "---..","----.","-----","/"};

        System.out.println("Escribe el código Morse (usa espacios entre letras y / entre palabras):");
        String codigo = leer.nextLine();

        String[] partes = codigo.split(" ");
        String resultado = "";

        for (int i = 0; i < partes.length; i++) {
            String simbolo = partes[i];

            for (int j = 0; j < morse.length; j++) {
                if (simbolo.equals(morse[j])) {
                    resultado += letras[j];
                }
            }
        }

        System.out.println("Texto traducido: " + resultado);
    }
}

