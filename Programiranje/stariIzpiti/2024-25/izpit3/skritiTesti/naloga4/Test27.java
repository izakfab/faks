
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(1, 1, 857142, 6);
        Cetrta.Raca raca2 = new Cetrta.Raca(755, 3, 1212, 4);
        izpisi(raca1, 42);
        izpisi(raca2, 85);
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
