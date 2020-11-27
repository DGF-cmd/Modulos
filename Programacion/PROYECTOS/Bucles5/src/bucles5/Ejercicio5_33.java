package bucles5;


import java.util.Scanner;

public class Ejercicio5_33 {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int x=leer.nextInt();
        
        
        for (int i=0;i<x-1;i++){
        for (int y=1;y<=x;y++){
        if ((y==1)||(y==x)){
            System.out.println("*");
            
        }else{
         System.out.println(" ");
        }
       }
        System.out.println();
        }
    
    
    for (int i=1;i<x;i++){
        if ((i==1)|| (i==x)){
        System.out.println(" ");
        }else{
        System.out.println("*");
    }
}
}
}

