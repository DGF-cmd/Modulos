import java.util.Scanner;

public class Ejercicio4_5 {
    public static void main(String args[]){
    Scanner paco=new Scanner(System.in);
    int a;
    int b;
    int resultado;
    System.out.println("Coeficiente de X:");
    a = paco.nextInt();
    System.out.println("Término independiente:");
    b = paco.nextInt();
    
    resultado=-a/b;
    System.out.println(resultado);
    }
}