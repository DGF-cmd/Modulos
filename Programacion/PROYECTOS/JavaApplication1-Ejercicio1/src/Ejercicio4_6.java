import java.util.Scanner;

public class Ejercicio4_6 {
    public static void main(String args[]){
    
    int h;
    Scanner paco=new Scanner(System.in);
    h=paco.nextInt();
    double resultado;
    
    resultado=Math.sqrt((2*h)/9.81);
    System.out.println(resultado);
    }
}