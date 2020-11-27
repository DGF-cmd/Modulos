import java.util.Scanner;
public class Ejercicio4_10 {
    public static void main(String args[]){
    Scanner paco =new Scanner(System.in);
    
    String mes;
    int dia;
    String signo ;
    mes = paco.nextLine();      
    dia = paco.nextInt();        
      
    
    if ("enero".equals(mes) && dia>=21 && dia<=31){
        signo="Aquarius";
        System.out.println(signo);
        }
    else if ("febrero".equals(mes) && dia>=1 && dia<=18){
        signo="Aquarius";
        System.out.println(signo);
    }
    
    if ("febrero".equals(mes) && dia>=19 && dia<=28){
        signo="Piscis";
        System.out.println(signo);
        }
    else if ("marzo".equals(mes) && dia>=1 && dia<=20){
        signo="Piscis";
        System.out.println(signo);
    }
    
    if ("marzo".equals(mes) && dia>=21 && dia<=31){
        signo="Aries";
        System.out.println(signo);
        }
    else if ("abril".equals(mes) && dia>=1 && dia<=20){
        signo="Aries";
        System.out.println(signo);
    }
    
    if ("abril".equals(mes) && dia>=21 && dia<=30){
        signo="Taurus";
        System.out.println(signo);
        }
    else if ("mayo".equals(mes) && dia>=1 && dia<=20){
        signo="Taurus";
        System.out.println(signo);
    }
    if ("mayo".equals(mes) && dia>=21 && dia<=31){
        signo="Gemini";
        System.out.println(signo);
        }
    else if ("junio".equals(mes) && dia>=1 && dia<=21){
        signo="Gemini";
        System.out.println(signo);
    }
    if ("junio".equals(mes) && dia>=22 && dia<=30){
        signo="Cáncer";
        System.out.println(signo);
        }
    else if ("julio".equals(mes) && dia>=1 && dia<=22){
        signo="Cáncer";
        System.out.println(signo);
    }
    if ("julio".equals(mes) && dia>=23 && dia<=31){
        signo="Leo";
        System.out.println(signo);
        }
    else if ("Agosto".equals(mes) && dia>=1 && dia<=22){
        signo="Leo";
        System.out.println(signo);
    }
    if ("agosto".equals(mes) && dia>=23 && dia<=31){
        signo="Virgo";
        System.out.println(signo);
        }
    else if ("septiembre".equals(mes) && dia>=1 && dia<=22){
        signo="Virgo";
        System.out.println(signo);
    }
    if ("septiembre".equals(mes) && dia>=23 && dia<=30){
        signo="Libra";
        System.out.println(signo);
        }
    else if ("octubre".equals(mes) && dia>=1 && dia<=22){
        signo="Libra";
        System.out.println(signo);
    }
    if ("octubre".equals(mes) && dia>=23 && dia<=31){
        signo="Escorpio";
        System.out.println(signo);
        }
    else if ("noviembre".equals(mes) && dia>=1 && dia<=22){
        signo="Escorpio";
        System.out.println(signo);
    }
    if ("noviembre".equals(mes) && dia>=23 && dia<=30){
        signo="Sagittarius";
        System.out.println(signo);
        }
    else if ("diciembre".equals(mes) && dia>=1 && dia<=21){
        signo="Sagittarius";
        System.out.println(signo);
    }
    if ("diciembre".equals(mes) && dia>=22 && dia<=31){
        signo="Capricornus";
        System.out.println(signo);
        }
    else if ("enero".equals(mes) && dia>=1 && dia<=20){
        signo="Capricornus";
        System.out.println(signo);
    }
    }
}