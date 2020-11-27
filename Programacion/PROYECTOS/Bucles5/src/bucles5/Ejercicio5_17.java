package bucles5;

import java.util.Scanner;

public class Ejercicio5_17 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int suma=0;
        int a;
        
        
        do{
        a=bucle.nextInt();
        } while (a<=0);
        for (int x=1; x < 100; x++) {
        suma+=a+x; 
        }
       System.out.println(suma);
        }
        
        
}
