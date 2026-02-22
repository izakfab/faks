
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(94, 2, 1, 1);
        Cetrta.Raca raca2 = new Cetrta.Raca(140977, 6, 1, 1);
        izpisi(raca1, 88);
        izpisi(raca2, 80);
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
