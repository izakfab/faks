import java.util.Scanner;
 
public class PostevankaI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mnozenec = s.nextInt();
        int mnozitelj = s.nextInt();
        for (int i = 1; i <= mnozitelj; i++)
            System.out.println(mnozenec * i);
    }
}    

