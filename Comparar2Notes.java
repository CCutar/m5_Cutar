
/*Demanar dos numeros i monstar el maxim */
import java.util.Scanner;

public class Comparar2Notes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Declaro el scanner

        int max = 0; // declaramos max
        /*
         * Haremos que el usuario introduzaca 10 notas y que se guarden la nota maxima
         * minima
         */
        for (int i = 0; i <= 4; i++) {

            int nota = scan.nextInt(); // Declaro una variable que sera un numero introducido por el usuario

            if (nota > max) { // si el numero nota es mayor que nota actualzamos max
                max = nota;
            }
        }
        /* Imprimimos max y min */
        System.out.println(max);
    }
}