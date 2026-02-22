
import java.util.*;

public class Test01 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Kvader(66, 5, 64),
            new Tretja.Krog(46),
            new Tretja.Krogla(7),
            new Tretja.Pravokotnik(4, 37),
            new NovTip1(new int[]{9, 30, 45, 77, 77, 22}),
            new NovTip1(new int[]{78, 30, 57}),
            new NovTip1(new int[]{55, 13, 49, 21, 58, 4, 73}),
            new NovTip2(new int[]{7, 65, 27, 8, 77, 23, 10}),
            new NovTip1(new int[]{17, 15, 77, 16, 29, 91, 1, 13, 41, 39}),
            new Tretja.Krog(98),
            new Tretja.Krog(25),
            new NovTip1(new int[]{8, 3, 47, 26, 12}),
            new Tretja.Krog(26),
            new Tretja.Krogla(11),
            new Tretja.Pravokotnik(12, 33),
            new Tretja.Kvader(42, 99, 1),
            new Tretja.Pravokotnik(19, 58),
            new Tretja.Krog(35),
            new NovTip1(new int[]{29, 86, 93, 25, 67, 18, 43}),
            new NovTip2(new int[]{53, 39, 70, 47, 91, 20, 5, 85}),
            new Tretja.Kvader(98, 73, 55),
            new Tretja.Pravokotnik(69, 45),
            new Tretja.Krog(57),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
