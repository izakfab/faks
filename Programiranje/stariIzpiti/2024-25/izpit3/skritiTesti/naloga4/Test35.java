
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(2, 1, 41463, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(489818, 6, 66666, 5);
        izpisi(raca1, 43);
        izpisi(raca2, 41);
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
