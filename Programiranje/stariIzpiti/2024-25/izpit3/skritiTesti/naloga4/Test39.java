
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(6963, 4, 518, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(612, 3, 444, 3);
        izpisi(raca1, 45);
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
