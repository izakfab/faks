
import java.util.*;

public class Test49 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(8158, 4, 213194, 6);
        Cetrta.Raca raca2 = new Cetrta.Raca(54607, 5, 7434, 4);
        izpisi(raca1, 53);
        izpisi(raca2, 44);
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
