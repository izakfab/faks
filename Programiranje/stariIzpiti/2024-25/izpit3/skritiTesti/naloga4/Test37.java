
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(8, 1, 1800, 4);
        Cetrta.Raca raca2 = new Cetrta.Raca(33, 2, 92, 2);
        izpisi(raca1, 30);
        izpisi(raca2, 61);
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
