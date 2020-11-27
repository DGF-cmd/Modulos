import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String args[]){
    Scanner paco=new Scanner(System.in);
    String a;
    
    a = paco.nextLine();
   
    if ("Lunes".equals(a)) {
    System.out.println("Prog");
    }
    else if ("Martes".equals(a)){
    System.out.println("Bases");    
    }
    else if ("Miercoles".equals(a)){
    System.out.println("LIMA");    
    }
    else if ("Jueves".equals(a)){
    System.out.println("FOL");    
    }
    else if ("Viernes".equals(a)){
    System.out.println("Bases de datos");    
    }
    
    
    }
}
