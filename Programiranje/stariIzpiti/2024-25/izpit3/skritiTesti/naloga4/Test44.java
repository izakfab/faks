
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(58, 2, 44, 2);
        Cetrta.Raca raca2 = new Cetrta.Raca(8440, 4, 610467, 6);
        izpisi(raca1, 21);
        izpisi(raca2, 21);
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
