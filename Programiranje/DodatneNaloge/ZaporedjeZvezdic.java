import java.util.Scanner;

public class zaporedjeZvezdic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vnos = s.nextInt();
        for (int i = 0; i < vnos; i++) System.out.print("*");
        System.out.println();
    }
}
