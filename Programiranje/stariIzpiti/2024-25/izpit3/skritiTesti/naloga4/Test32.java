
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(856, 3, 592, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(994, 3, 8, 1);
        izpisi(raca1, 98);
        izpisi(raca2, 33);
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
