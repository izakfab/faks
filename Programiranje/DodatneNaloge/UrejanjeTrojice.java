import java.util.Scanner;
 
public class urejanjeTrojice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long b = s.nextInt();
        long c = s.nextInt();
        System.out.println(
                a < b ? 
                    b < c ? 
                        a + " " + b + " " + c:
                        a < c ? 
                            a + " " + c + " " + b:
                            c + " " + a + " " + b
                        : 
                    a < c ? 
                        b + " " + a + " " + c:
                        b < c ?  
                            b + " " + c + " " + a:
                            c + " " + b + " " + a
                );
    }    
}    

