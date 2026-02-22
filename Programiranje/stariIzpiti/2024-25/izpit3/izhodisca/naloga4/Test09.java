
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(3788, 4, 27371, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(841830, 6, 2, 1);
        izpisi(raca1, 20);
        izpisi(raca2, 65);
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
