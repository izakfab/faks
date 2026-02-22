
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(62755, 5, 2121, 4);
        Cetrta.Raca raca2 = new Cetrta.Raca(341253, 6, 1, 1);
        izpisi(raca1, 45);
        izpisi(raca2, 89);
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
