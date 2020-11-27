import java.util.Scanner;

public class Ejercicio4_8 {
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
    if (resultado<5){
    System.out.println("insuficiente");
    }
    else if (resultado==5){
     System.out.println("suficiente");}
    
    else if (resultado>=6 && resultado<7){
    System.out.println("bien");    
    }
    else if (resultado>=7 && resultado<9){
    System.out.println("notable");    
    }
    else if (resultado>=9 && resultado<=10){
    System.out.println("sobresaliente");    
    }
}
}