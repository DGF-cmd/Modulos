package num;
public class a {
    public static void main(String[] args) {
      int sum=0, suma;
      
        for (int i = 0; i < 3; i++) {
        int dado=(int)(Math.random()*7)+1;
        sum=sum+dado;
            System.out.println(dado);
        }
        System.out.println(sum);
    }
    
}
