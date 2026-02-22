
import java.util.*;

public class Test01 {

    private static class Elipsoid extends Tretja.Okrogel implements Tretja.TriD {
        public Elipsoid(int a, int b, int c) {
            super(new int[]{a, b, c});
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Krogla(4),
            new Tretja.Kvader(1, 2, 3),
            new Tretja.Pravokotnik(11, 7),
            new Tretja.Kvader(5, 6, 2),
            new Tretja.Krog(9),
            new Elipsoid(2, 3, 4)
        });
        System.out.println(Arrays.toString(tabela));
    }
}
