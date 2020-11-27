import java.util.Scanner;

public class Ejercicio4_7 {
    public static void main(String args[]){
    Scanner paco=new Scanner(System.in);
    int a;
    int b;
    int c;
    int resultado;
    
    a=paco.nextInt();
    b=paco.nextInt();
    c=paco.nextInt();
    
    
    resultado=(a+b+c)/3;
    System.out.println(resultado);
    }
}