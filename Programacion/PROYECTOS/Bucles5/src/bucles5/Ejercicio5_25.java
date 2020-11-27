package bucles5;

import java.util.Scanner;

public class Ejercicio5_25 {
    
    public static void main(String args[]){
        
       Scanner leer = new Scanner(System.in);
        
        int n = leer.nextInt();
        int inv=0;
        
        while(n>0){
            inv=inv*10+n%10;
            n= n/10;
            
        }
        System.out.println(inv);
    }
}


       
    
