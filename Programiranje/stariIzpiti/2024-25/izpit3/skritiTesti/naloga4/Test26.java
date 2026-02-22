
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(45, 2, 594, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(3482, 4, 81, 2);
        izpisi(raca1, 50);
        izpisi(raca2, 25);
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
