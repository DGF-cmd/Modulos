package bucles5;

import java.util.Scanner;

public class Ejercicio5_27 {
    
    public static void main(String args[]){ 
       Scanner leer = new Scanner(System.in);
    int n=leer.nextInt();
    int c=0;
    int suma=0;
    for (int i=3;i<n;i+=3){
    c++;
    suma+=i;
    }
        System.out.println(c);
        System.out.println(suma);
    }
    
}

