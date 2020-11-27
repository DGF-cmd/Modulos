import java.util.Scanner;
public class Ejercicio4_19 {
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    int a;
    int primera; 
    Integer numero;
    
    a = paco.nextInt();
    
    if (a<10 && a>=0){
    System.out.println(1);}
    else if (a<100 && a>9){System.out.println(2);}
    else if (a<1000 && a>99){System.out.println(3);}
    else if (a<10000 && a>999){System.out.println(4);}
    else if (a<100000 && a>9999){System.out.println(5);}
    else if (a>-100 && a<0){System.out.println(2);}
    else if (a>-1000 && a<-100){System.out.println(3);}
    else if (a>-10000 && a<-1000){System.out.println(4);}
    else if (a>-100000 && a<-10000){System.out.println(5);}
    }       
    }
     