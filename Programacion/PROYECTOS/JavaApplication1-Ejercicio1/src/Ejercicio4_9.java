import java.util.Scanner;

public class Ejercicio4_9 {
    public static void main(String args[]){
    Scanner paco=new Scanner(System.in);
    double a;
    double b;
    double c;
    double resultado1;
    double resultado2;
    a=paco.nextInt();
    b=paco.nextInt();
    c=paco.nextInt();
        
    
    
    resultado1=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
    resultado2=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
    System.out.println(resultado1 );
    System.out.println(resultado2 );
    }
}