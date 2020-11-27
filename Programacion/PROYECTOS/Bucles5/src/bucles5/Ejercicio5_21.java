package bucles5;

import java.util.Scanner;

public class Ejercicio5_21 {
    
    public static void main(String args[]){
        
        Scanner bucle =new Scanner(System.in);
        
        int a;
        int can=1;
        int impar=0;
        int num=0;
        do{
        a=bucle.nextInt();
        can++;
        if(a%2!=0){
        impar++;
        num+=a;
        }
        
        } while (a>0);
        System.out.println("numeros introducidos"+(can-1));
        System.out.println("media "+(num+1)/(impar-1));
         
        }
       
        }
        
        

