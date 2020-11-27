package bucles5;


import java.util.Scanner;

public class Ejercicio5_29 {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextInt();
        int b = leer.nextInt();

        for (int i = a - 1; i > 0; i--) {
            if (i % b != 0) {
                System.out.println(i);
            }
        }
    }
}
