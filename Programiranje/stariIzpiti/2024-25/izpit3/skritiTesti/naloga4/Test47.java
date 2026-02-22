
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(584, 3, 307, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(7, 1, 1111, 4);
        izpisi(raca1, 62);
        izpisi(raca2, 88);
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
