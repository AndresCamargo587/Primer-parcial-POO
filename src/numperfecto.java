import java.util.Scanner;

public class numperfecto {
public static void calcular(){
    Scanner leer = new Scanner(System.in);

    System.out.print("Ingresa un número para verificar si es perfecto: ");
    int numero = leer.nextInt();
    int suma = 0;

    for (int i = 1; i < numero; i++)
    {
        if (numero % i == 0) {
            suma = suma+i;
        }
    }

    if (suma == numero) {
        System.out.println(numero+ " Es un número perfecto");
    } else {
        System.out.println(numero + " No es un número perfecto");
    }
}
}