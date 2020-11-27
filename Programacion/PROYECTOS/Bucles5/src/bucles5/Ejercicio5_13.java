package bucles5;

import java.util.Scanner;

public class Ejercicio5_13 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int x;
        int positivo=0;
        int negativo=0;
        
        
        
        for (int lista=1;lista<=10;lista++){
        x=bucle.nextInt();
        if (x>=0){positivo++;}
        else {negativo++;}
        }
        System.out.println(positivo+"positivos");
        System.out.println(negativo+"negativos");
}
}