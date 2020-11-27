import java.util.Scanner;
public class Ejercicio4_11 {
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    int hora;
    int minutos;
    int resh;
    int resm;
    
    hora = paco.nextInt();
    minutos = paco.nextInt();
    resh=24-hora;
    resm=60-minutos;
  
    
    
    System.out.println(resm + resh);
    System.out.println("pero por que");
    
}
    
}
