import java.util.Scanner;

public class DN01_63250060 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt() - 1;
        int y = s.nextInt() - 1;
        int sum = 0;
        for (int i = 0; i <= (x < y ? x : y); i++) {
            sum += (x - i) * (y - i);
        }
        System.out.println(sum);
    }
}
