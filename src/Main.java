import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Menu");
            System.out.println("1. Zodiaco por mes y año de nacimiento");
            System.out.println("2. Validador de mayoria de edad");
            System.out.println("3. Validador número perfecto");
            System.out.println("4. Validador de palindromo");
            System.out.println("5. Validador de número capicua");
            System.out.println("6. Conversor de morse a texto");
            System.out.print("Seleccione una opción: ");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Zodiaco.fecha();
                    break;
                case 2:
                    Mayoredad.validar();
                    break;
                case 3:
                    numperfecto.calcular();
                    break;
                case 4:
                    Palindromo.palabra();
                    break;
                case 5:
                    Capicua.numero();
                    break;
                case 6:
                    MorseTexto.convertir();
                    break;
                case 7:
                    TextoMorse.transformar();
                    break;
            }
        }
    }

