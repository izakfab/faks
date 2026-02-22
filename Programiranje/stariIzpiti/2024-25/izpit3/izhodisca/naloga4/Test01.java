
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Cetrta.Raca raca1 = new Cetrta.Raca(6, 1, 972, 3);
        Cetrta.Raca raca2 = new Cetrta.Raca(67, 2, 324, 3);
        Cetrta.Raca raca3 = new Cetrta.Raca(300, 3, 1819, 4);
        Cetrta.Raca raca4 = new Cetrta.Raca(7245, 4, 2, 1);
        Cetrta.Raca raca5 = new Cetrta.Raca(3, 1, 3, 1);
        Cetrta.Raca raca6 = new Cetrta.Raca(2, 1, 46, 2);

        System.out.println(raca1.ulomek());
        System.out.println(raca2.ulomek());
        System.out.println(raca3.ulomek());
        System.out.println(raca4.ulomek());
        System.out.println(raca5.ulomek());
        System.out.println(raca6.ulomek());
    }
}
