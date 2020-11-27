
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int azar = (int) (Math.random() * 100) + 1;
        int suerte;
        int oportunidades = 0;

        do {
            suerte = leer.nextInt();
            oportunidades++;
            if (suerte > azar) {
                System.out.println("es mayor");

            } else {
                System.out.println("es menor");
            }
        } while (suerte != azar && oportunidades < 5);
        if (oportunidades == 5) {
            System.out.println("al carre");
        }
        if (suerte == azar) {
            System.out.println("correcto");
        }

    }
}
