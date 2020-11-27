package bucles5;

import java.util.Scanner;

public class Ejercicio5_11 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int n=bucle.nextInt();
        int x=n+5;
       
        
        for(int i=n+1;i<(n+5);i++){
        System.out.println(i+""+i+"^2="+(i*i)+""+i+"^3="+(i*i*i));
        
        }
    
    
}
}