package bucles5;


import java.util.Scanner;

public class Ejercicio5_32 {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        long a=leer.nextLong();
        long b=0;
        int longitud=0;
        int contpares=0;
        long dig=0;
        
        if (a==0) {longitud=1;}
        
        while (a>0){
        b=(b*10)+(a%10);
            
        
        if ((a%10)%2==0)
            contpares++;
        a/=10;
        
        while (b>0){
        dig=b%10;
        if(dig%2==0){System.out.println("Son digitos pares"+dig);}
        }
        b=b/10;
        }
        
        
        }
        }
    

