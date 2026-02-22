
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(67430, 5, 2, 1);
        Cetrta.Raca raca2 = new Cetrta.Raca(39, 2, 125097, 6);
        izpisi(raca1, 72);
        izpisi(raca2, 68);
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
