
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(917226, 6, 6666, 4);
        Cetrta.Raca raca2 = new Cetrta.Raca(7074, 4, 24661, 5);
        izpisi(raca1, 48);
        izpisi(raca2, 74);
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
