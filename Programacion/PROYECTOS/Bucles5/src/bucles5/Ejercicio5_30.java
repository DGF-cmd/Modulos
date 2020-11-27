package bucles5;


import java.util.Scanner;

public class Ejercicio5_30 {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int dia2;
        
        System.out.println("Introduce primer dia");
        int dia=leer.nextInt();
        System.out.println("Introduce primera hora");
        int hora=leer.nextInt();
        
        System.out.println("Introduce segundo dia");
        do{
        dia2=leer.nextInt();
        }while(dia2<dia);
        System.out.println("Introduce segunda hora");
        int hora2=leer.nextInt();
        System.out.println(((dia2*24)+hora2)-((dia*24)+hora));
        }
    }

