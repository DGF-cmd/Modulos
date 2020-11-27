package Ejercicio6;

import java.util.Scanner;

/*ejercicio 16- apartado 6 */
public class Ejercicio6_12 {

    public static void main(String[] args) {
    
        for (int i = 0; i <Integer.MAX_VALUE; i++) {
            int numero=(int)(Math.random()*95) +32;
            System.out.print((char)numero);
            if (i%100=0){System.out.println(" ");}        
        }
    
    
    }
}
