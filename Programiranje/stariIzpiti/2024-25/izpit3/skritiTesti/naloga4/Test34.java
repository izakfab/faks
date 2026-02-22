
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(2529, 4, 29268, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(5653, 4, 692, 3);
        izpisi(raca1, 24);
        izpisi(raca2, 20);
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
