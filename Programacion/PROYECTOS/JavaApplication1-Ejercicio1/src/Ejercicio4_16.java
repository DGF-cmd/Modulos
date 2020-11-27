import java.util.Scanner;
public class Ejercicio4_16 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
    int b1=0;
    
    
    
    System.out.println("Te dá un beso a la mañana?");
    a1=paco.nextLine();
    if ("no".equals(a1)){b1=1+0;};
    System.out.println("Sale de con su amigo cuando sales de viaje?");
    a2=paco.nextLine();
    if ("no".equals(a2)){b1=1+b1;};
    System.out.println("No te quiere hablar a menudo?");
    a3=paco.nextLine();
    if ("si".equals(a3)){b1=1+b1;};
    System.out.println("Tu pareja es feliz?");
    a4=paco.nextLine();
    if ("no".equals(a4)){b1=1+b1;};
    
}
    
}