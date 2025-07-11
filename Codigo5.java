/* con esto mostramos los numeros afortunados en base a los quie signamos asi */

import java.util.Scanner;

public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); // Guardamos el número original
        int num = c;

        int afo = 0;
        int noAfo = 0;

        while (num > 0) {
            int digito = num % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            num /= 10;
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }

        s.close();
    }
}
