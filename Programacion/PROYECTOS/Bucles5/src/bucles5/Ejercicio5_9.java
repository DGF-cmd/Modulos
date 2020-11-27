package bucles5;

import java.util.Scanner;

public class Ejercicio5_9 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int a=bucle.nextInt();
        int res=1;
        int b=a/10;
        
        
        while(a>=10){
        a/=10;
        res++;
        }
        System.out.println(res);
    
}
}