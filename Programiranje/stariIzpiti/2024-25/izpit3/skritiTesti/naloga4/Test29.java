
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(827, 3, 660231, 6);
        Cetrta.Raca raca2 = new Cetrta.Raca(243776, 6, 3, 1);
        izpisi(raca1, 20);
        izpisi(raca2, 99);
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
