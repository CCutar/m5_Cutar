
/*Demanar dos numeros i monstar el maxim */
import java.util.Scanner;

public class Comparar2Notes {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int nota = teclat.nextInt();

        int max = nota;

        if (nota > max) {
            max = nota;
        }

        System.out.println(max);
    }
}