
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(2, 1, 756, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(876099, 6, 774891, 6);
        izpisi(raca1, 65);
        izpisi(raca2, 63);
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
