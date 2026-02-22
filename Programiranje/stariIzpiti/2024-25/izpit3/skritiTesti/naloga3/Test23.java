
import java.util.*;

public class Test23 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.DvaD {
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
            new Tretja.Pravokotnik(86, 33),
            new Tretja.Kvader(39, 91, 76),
            new Tretja.Krog(67),
            new Tretja.Krog(80),
            new Tretja.Krogla(85),
            new NovTip1(new int[]{1, 56, 22, 44, 11, 46}),
            new Tretja.Krog(63),
            new Tretja.Pravokotnik(2, 13),
            new NovTip1(new int[]{20, 42, 61, 95, 8, 29, 11, 43, 86}),
            new Tretja.Krog(83),
            new Tretja.Krog(64),
            new Tretja.Krogla(45),
            new Tretja.Krogla(81),
            new Tretja.Krogla(81),
            new Tretja.Kvader(46, 35, 50),
            new Tretja.Krogla(26),
            new Tretja.Pravokotnik(25, 45),
            new Tretja.Krogla(11),
            new Tretja.Krog(81),
            new Tretja.Krog(26),
            new Tretja.Kvader(24, 13, 60),
            new NovTip2(new int[]{2, 26, 67, 85}),
            new NovTip1(new int[]{4, 94, 91, 28, 52, 21, 13, 21}),
            new Tretja.Kvader(90, 72, 85),
            new Tretja.Krogla(49),
            new Tretja.Krog(5),
            new Tretja.Kvader(30, 78, 55),
            new NovTip2(new int[]{86, 64}),
            new Tretja.Pravokotnik(65, 76),
            new Tretja.Krogla(80),
            new Tretja.Krog(17),
            new Tretja.Krog(17),
            new NovTip1(new int[]{98, 98, 7, 43, 8, 16, 92}),
            new NovTip1(new int[]{75, 36, 24, 63, 28, 62, 98, 10, 62}),
            new Tretja.Krog(80),
            new Tretja.Krog(78),
            new Tretja.Krogla(45),
            new Tretja.Krogla(61),
            new Tretja.Krogla(63),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
