package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6_13 {

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.println("escribe un numero");
        int num1 = si.nextInt();

        for (int i = 0; i < 5; i++) {
            int num2 = (int) (Math.random() * 101) + 1;
            System.out.println(num2);
            if (num2 == num1) {
                System.out.println("acertaste, terrible");
            } else {
                System.out.println("es mayor o menor");
            } 
            
            
                String respuesta = si.nextLine();
                if (respuesta=="menor") {
                System.out.println("es menor");
            } else {
                System.out.println("es mayor");
            }
                

            }

            

        }

    }

