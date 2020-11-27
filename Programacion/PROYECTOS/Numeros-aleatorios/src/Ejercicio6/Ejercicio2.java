package Ejercicio6;
public class Ejercicio2 {
    public static void main(String[] args) {
        String palo1 = "",carta1 = "";
        
        int palo=(int)(Math.random()*4)+1;
        switch(palo){
            case 1:
                palo1="picas";
            case 2:
                palo1="corazones";
            case 3:
                palo1="diamantes";
            case 4:
                palo1="tréboles";
              default:
                
        }
        int carta=(int)(Math.random()*13)+1;
        switch(carta){
            case 10:
                carta1="J";
            case 11:
                carta1="Q";
            case 12:
                carta1="K";
            case 13:
                carta1="As";
            
        }
        System.out.println(carta1);
        System.out.println(palo1);
}
}
