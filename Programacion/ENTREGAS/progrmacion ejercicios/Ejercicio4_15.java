import java.util.Scanner;
public class Ejercicio4_15 {
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    String a;
    String orientacion;
    
    a = paco.nextLine();
    orientacion = paco.nextLine();
    
    switch (orientacion){
    case "pa un lao":
    System.out.println("     " + a + a );
    System.out.println("    " + a + a + a );
    System.out.println("   " + a + a + a + a);
    System.out.println("  " + a + a + a + a + a);
    System.out.println(" " + a + a + a + a + a + a);
    System.out.println(a + a + a + a + a + a + a);
    System.out.println(" " + a + a + a + a + a + a);
    System.out.println("  " + a + a + a + a + a);
    System.out.println("   " + a + a + a + a);
    System.out.println("    " + a + a + a );
    System.out.println("     " + a + a );
    break;
    case "pa otro lao":
    System.out.println( a + a+ "     " );
    System.out.println( a + a + a + "    ");
    System.out.println( a + a + a + a+ "   ");
    System.out.println( a + a + a + a + a+ "  ");
    System.out.println( a + a + a + a + a + a+ " ");
    System.out.println(a + a + a + a + a + a + a);
    System.out.println( a + a + a + a + a + a+ " ");
    System.out.println( a + a + a + a + a+ "  ");
    System.out.println( a + a + a + a+ "   ");
    System.out.println( a + a + a + "    ");
    System.out.println( a + a + "     ");
    break;
    case "pa bajo":
    System.out.println(a + a + a + a + a + a + a+ a+ a+ a+a+a+a+a+a+a+a+a+a+a+a);
    System.out.println(" "+a + a + a + a + a + a + a+ a+ a+ a+a+a+a+a+a+a+a+a+a+" ");
    System.out.println("  "+a + a + a + a + a + a + a+ a+ a+a+a+a+a+a+a+a+a+"  ");
    System.out.println("   "+a + a + a + a + a + a + a+ a+a+a+a+a+a+a+a+"   ");
    System.out.println("    "+a + a + a + a + a + a + a+a+a+a+a+a+a+"    ");
    System.out.println("     "+a + a + a + a + a + a+a+a+a+a+a+"     ");
    System.out.println("      "+a + a + a + a + a+a+a+a+a+"      ");
    System.out.println("       "+a + a + a + a+a+a+a+"       ");
    System.out.println("        "+a + a + a+a+a+"        ");
    System.out.println("         "+a + a+a+"         ");
    System.out.println("          "+a+"          ");
    break;
    case "pa riba":
    System.out.println( "     "+a+"     " );
    System.out.println( "    "+a + a + a+"    ");
    System.out.println( "   "+a + a + a + a+a+"   ");
    System.out.println( "  "+a + a + a + a + a+a+a+"  ");
    System.out.println( " "+a + a + a + a + a + a+a+a+a+" ");
    System.out.println(a + a + a + a + a + a + a+a+a+a+a);
    
    break;
    }
    }
    }