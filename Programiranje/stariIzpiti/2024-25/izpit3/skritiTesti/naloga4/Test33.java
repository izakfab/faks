
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(571, 3, 6, 1);
        Cetrta.Raca raca2 = new Cetrta.Raca(1969, 4, 46, 2);
        izpisi(raca1, 43);
        izpisi(raca2, 100);
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
