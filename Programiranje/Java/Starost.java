import java.util.Scanner;

public class Starost {

    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Vnesi svojo starost: ");
        int starost = s.nextInt();
        System.out.println(
            "Tvoje leto rojstva je " +
                (2025 - starost) +
                " ali " +
                (2025 - starost - 1)
        );
    }
}
