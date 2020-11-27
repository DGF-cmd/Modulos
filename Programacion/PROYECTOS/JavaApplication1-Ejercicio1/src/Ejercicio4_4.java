import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String args[]){
    Scanner paco=new Scanner(System.in);
    int a;
    int b;
    int salario;
    a = paco.nextInt();
    b = paco.nextInt();
    
    if (b == 40){
        salario=12*b;
        System.out.println(salario);
    } 
    else {
        if (b>40){
            salario=16*b;
            System.out.println(salario);
        }
    }
    
    switch (a){
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miercoles");
        break;
     case 4:
        System.out.println("Jueves");
        break;
    case 5:
        System.out.println("Viernes");
        break;
    case 6:
        System.out.println ("sabado");
        break;
    case 7:
         System.out.println("Domingo");
         break;
    default:
    
    }
    
   
    }


}