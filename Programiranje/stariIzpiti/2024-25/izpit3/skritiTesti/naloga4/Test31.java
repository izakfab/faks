
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(48328, 5, 777, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(73, 2, 223223, 6);
        izpisi(raca1, 61);
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
