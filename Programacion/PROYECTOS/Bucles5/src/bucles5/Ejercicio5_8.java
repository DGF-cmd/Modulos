package bucles5;

import java.util.Scanner;

public class Ejercicio5_8 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        int a=bucle.nextInt();
        int res;
        
    for(int b=0;b<=10;b++){
    res=a*b;
    System.out.println(a+"x"+b+"="+res);
    }
    
}
}