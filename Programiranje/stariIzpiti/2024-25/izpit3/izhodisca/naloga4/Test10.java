
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(90702, 5, 70731, 5);
        Cetrta.Raca raca2 = new Cetrta.Raca(98571, 5, 27, 2);
        izpisi(raca1, 30);
        izpisi(raca2, 79);
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
