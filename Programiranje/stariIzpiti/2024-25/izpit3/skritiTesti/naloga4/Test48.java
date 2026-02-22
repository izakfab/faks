
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(592, 3, 75891, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(24, 2, 299, 3);
        izpisi(raca1, 75);
        izpisi(raca2, 84);
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
