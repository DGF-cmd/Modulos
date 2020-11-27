package bucles5;

import java.util.Scanner;

public class Ejercicio5_16 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int x;
        int res;
        int n;
        x=bucle.nextInt();
        
        
        for (n=2;n<x-1;n++){
        if (x % n == 0){System.out.println("no primo");
        }
       
        }
        
        if (n>=x/2){System.out.println("primo");}
}
}