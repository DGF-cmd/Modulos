package bucles5;

import java.util.Scanner;

public class Ejercicio5_26 {
    
    public static void main(String args[]){ 
       Scanner leer = new Scanner(System.in);
       int inv=0;
       
       int n=leer.nextInt();
       int d=leer.nextInt();
       int x;
       int c=0;
       while (n>0){
       inv=inv*10+n%10;
       n=n/10;
       
       }
       while (inv>0){
       c++;
       x=inv%10;
       if(x==d){System.out.println(c);}       
       inv=inv/10;
    }
}
}

