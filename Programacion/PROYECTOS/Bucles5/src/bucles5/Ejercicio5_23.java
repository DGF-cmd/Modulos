package bucles5;

import java.util.Scanner;

public class Ejercicio5_23 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        
        int a;
        int can=1;
        int num=0;
        do{
        a=bucle.nextInt();
        can++;
        num+=a;
        
        } while (num<10000);
        System.out.println("numeros introducidos"+(can-1));
        System.out.println(num);
        
        
        }
       
        }
        
        
