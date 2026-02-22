
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(692, 3, 373347, 6);
        Cetrta.Raca raca2 = new Cetrta.Raca(23545, 5, 33, 2);
        izpisi(raca1, 32);
        izpisi(raca2, 47);
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
