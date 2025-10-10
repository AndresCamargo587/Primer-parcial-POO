import java.util.Scanner;

public class Mayoredad {
    public static void validar() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa tu año de nacimiento: ");
        int añoNacimiento = leer.nextInt();
        System.out.print("Ingresa el año actual: ");
        int añoActual = leer.nextInt();

        int edad = añoActual - añoNacimiento;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else if (edad<18) {
            System.out.println("No eres mayor de edad");
        }
        }
    }


