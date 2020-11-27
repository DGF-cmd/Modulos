import java.util.Scanner;

public class Ejercicio4_10 {
    public static void main(String args[]){
    Scanner paco=new Scanner(System.in);
    int dia;
    String mes;
    
    String resultado;
    
    dia=paco.nextInt();
    mes=paco.nextLine();
    resultado=paco.nextLine();
    
    
    if (mes=="marzo"){
       if (dia>=21 && dia<=30){
        System.out.println("Aries");
       }
    }
    if (mes=="abril"){
       if (dia>=1 && dia<=20){
        System.out.println("Aries");
       }
    }
    
    
}
}