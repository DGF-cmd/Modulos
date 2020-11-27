import java.util.Scanner;
public class Ejercicio4_12 {
    
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
    int b1=0;
    
    
    
    System.out.println("Te gusta Base de datos?");
    a1=paco.nextLine();
    if ("no".equals(a1)){b1=1+0;};
    System.out.println("Te gusta LIMA?");
    a2=paco.nextLine();
    if ("no".equals(a2)){b1=1+b1;};
    System.out.println("Te gusta Programación?");
    a3=paco.nextLine();
    if ("si".equals(a3)){b1=1+b1;};
    System.out.println("Te gusta CODE?");
    a4=paco.nextLine();
    if ("no".equals(a4)){b1=1+b1;};
    System.out.println("Desayunas piedras a la mañana?");
    a5=paco.nextLine();
    if ("no".equals(a5)){b1=1+b1;};
    System.out.println("Hoy es LUNES?");
    a6=paco.nextLine();
    if ("no".equals(a6)){b1=1+b1;};
    System.out.println("Te duele el estomago?");
    a7=paco.nextLine();
    if ("si".equals(a7)){b1=1+b1;};
    System.out.println("Tu mesa tiene emociones?");
    a8=paco.nextLine();
    if ("depende".equals(a8)){b1=1+b1;};
    System.out.println("Hotel Trivago?");
    a9=paco.nextLine();
    if ("si".equals(a9)){b1=1+b1;};
    System.out.println("Tengo que dormir?");
    a10=paco.nextLine();
    if ("no".equals(a10)){b1=1+b1;};
    System.out.println("tu puntuacion es " + b1);
}
    
}