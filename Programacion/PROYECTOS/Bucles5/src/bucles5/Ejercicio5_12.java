package bucles5;

import java.util.Scanner;

public class Ejercicio5_12 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int x=0;
        int y=1;
        int n=bucle.nextInt();
        int suma=0;
        
        System.out.println(x+" "+y);
        for(int i=0;i<=n;i++){
        suma=x+y;
        System.out.println(suma);
        x=y;
        y=suma;
        }
    
    
}
}