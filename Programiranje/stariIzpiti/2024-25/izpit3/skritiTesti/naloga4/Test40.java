
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(6195, 4, 470, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(13364, 5, 87, 2);
        izpisi(raca1, 60);
        izpisi(raca2, 59);
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
