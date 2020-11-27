import java.util.Scanner;
public class Ejercicio4_18 {
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    int a;
    int primera; 
    Integer numero;
    
    a = paco.nextInt();
    
    if (a<10){
    System.out.println(a);}
    if (a<100){System.out.println(a%10);}
    if (a<1000){System.out.println(a%100);}
    if (a<10000){System.out.println(a%1000);}
    if (a<100000){System.out.println(a%10000);}
    }       
     }
     