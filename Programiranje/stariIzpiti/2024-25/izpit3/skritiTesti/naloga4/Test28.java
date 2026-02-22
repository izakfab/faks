
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(9, 1, 457912, 6);
        Cetrta.Raca raca2 = new Cetrta.Raca(47741, 5, 7272, 4);
        izpisi(raca1, 44);
        izpisi(raca2, 87);
    }

    private static void izpisi(Cetrta.Raca raca, int stMest) {
        System.out.print("0,");
        int i = 0;
        for (int stevka: raca) {
            System.out.print(stevka);
            if (++i == stMest) {
                break;
            }
        }
        System.out.println();
    }
}
