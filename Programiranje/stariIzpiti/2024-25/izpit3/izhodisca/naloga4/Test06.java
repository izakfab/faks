
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(6, 1, 972, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(67, 2, 324, 3);
        Cetrta.Raca raca3 = new Cetrta.Raca(300, 3, 1819, 4);
        Cetrta.Raca raca4 = new Cetrta.Raca(7245, 4, 2, 1);
        Cetrta.Raca raca5 = new Cetrta.Raca(3, 1, 3, 1);
        Cetrta.Raca raca6 = new Cetrta.Raca(2, 1, 46, 2);

        izpisi(raca1, 20);
        izpisi(raca2, 20);
        izpisi(raca3, 20);
        izpisi(raca4, 20);
        izpisi(raca5, 20);
        izpisi(raca6, 20);
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
