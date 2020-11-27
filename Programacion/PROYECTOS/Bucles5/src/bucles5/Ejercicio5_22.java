package bucles5;

public class Ejercicio5_22 {

    public static void main(String args[]) {

        int i, j;
        boolean primo;
        int Inicial = 2;
        int Final = 200;
        for (i = Inicial; i <= Final; i++) {

            primo = true;
            for (j = 2; j < i; j++) {

                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
