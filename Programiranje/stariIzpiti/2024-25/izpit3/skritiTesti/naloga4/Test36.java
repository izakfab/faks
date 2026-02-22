
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(22504, 5, 183, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(526, 3, 633906, 6);
        izpisi(raca1, 86);
        izpisi(raca2, 24);
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
