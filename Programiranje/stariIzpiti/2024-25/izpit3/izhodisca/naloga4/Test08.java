
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(3671, 4, 16947, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(73, 2, 681318, 6);
        izpisi(raca1, 73);
        izpisi(raca2, 70);
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
