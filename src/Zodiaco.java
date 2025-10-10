import java.util.Scanner;

public class Zodiaco {
    public static void fecha(){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa tu día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.print("Ingresa tu mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.print("Ingresa tu año de nacimiento: ");
        int año = leer.nextInt();

        String caballero = "";

        if (mes == 1) {
            if (dia >= 20) {
                caballero = "Acuario";
            } else {
                caballero = "Capricornio";
            }
        }
        if (mes == 2) {
            if (dia >= 19) {
                caballero = "Piscis";
            } else {
                caballero = "Acuario";
            }
        }
        if (mes == 3) {
            if (dia >= 21) {
                caballero = "Aries";
            } else {
                caballero = "Piscis";
            }
        }
        if (mes == 4) {
            if (dia >= 21) {
                caballero = "Tauro";
            } else {
                caballero = "Aries";
            }
        }
        if (mes == 5) {
            if (dia >= 21) {
                caballero = "Geminis";
            } else {
                caballero = "Tauro";
            }
        }
        if (mes == 6) {
            if (dia >= 21) {
                caballero = "Cancer";
            } else {
                caballero = "Geminis";
            }
        }
        if (mes == 7) {
            if (dia >= 23) {
                caballero = "Leo";
            } else {
                caballero = "Cancer";
            }
        }
        if (mes == 8) {
            if (dia >= 23) {
                caballero = "Virgo";
            } else {
                caballero = "Leo";
            }
        }
        if (mes == 9) {
            if (dia >= 23) {
                caballero = "Libra";
            } else {
                caballero = "Virgo";
            }
        }
        if (mes == 10) {
            if (dia >= 23) {
                caballero = "Escorpio";
            } else {
                caballero = "Libra";
            }
        }
        if (mes == 11) {
            if (dia >= 22) {
                caballero = "Sagitario";
            } else {
                caballero = "Escorpio";
            }
        }
        if (mes == 12) {
            if (dia >= 22) {
                caballero = "Capricornio";
            } else {
                caballero = "Sagitario";
            }
        }
        System.out.println("Naciste el " + dia + "/" + mes + "/" + año);
        System.out.println("Tu Caballero del Zodiaco es: " + caballero);
    }
}

