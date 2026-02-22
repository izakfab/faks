
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(473, 3, 1212, 4);
        Cetrta.Raca raca2 = new Cetrta.Raca(48516, 5, 48, 2);
        izpisi(raca1, 42);
        izpisi(raca2, 69);
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
