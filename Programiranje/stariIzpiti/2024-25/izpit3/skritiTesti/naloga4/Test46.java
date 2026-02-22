
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(8800, 4, 1111, 4);
        Cetrta.Raca raca2 = new Cetrta.Raca(75, 2, 88, 2);
        izpisi(raca1, 89);
        izpisi(raca2, 88);
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
