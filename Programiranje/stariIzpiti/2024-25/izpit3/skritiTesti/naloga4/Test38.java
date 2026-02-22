
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(61, 2, 43902, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(2, 1, 630, 3);
        izpisi(raca1, 52);
        izpisi(raca2, 59);
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
