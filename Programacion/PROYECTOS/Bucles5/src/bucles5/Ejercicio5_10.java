package bucles5;

import java.util.Scanner;

public class Ejercicio5_10 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int a=0;
        int i=0;
        int suma=0;
        
        while(a>=0){
        i++;
        suma +=a;
        System.out.println("positivos");
        a=bucle.nextInt();
        }
    System.out.println(suma/(i-1));
    
}
}