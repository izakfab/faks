
import java.util.*;

public class Test25 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Krogla(25),
            new Tretja.Kvader(50, 42, 10),
            new Tretja.Krog(94),
            new NovTip1(new int[]{39, 50, 34, 98, 1, 45}),
            new NovTip2(new int[]{100, 76, 73, 35}),
            new NovTip2(new int[]{54, 32, 27, 40, 40, 84, 60, 53, 82}),
            new Tretja.Pravokotnik(46, 38),
            new NovTip1(new int[]{65, 90, 92, 64, 100, 26, 47, 34, 25, 34}),
            new NovTip1(new int[]{56, 33, 99, 55}),
            new Tretja.Kvader(99, 22, 57),
            new Tretja.Krog(89),
            new Tretja.Kvader(27, 36, 98),
            new Tretja.Kvader(69, 73, 3),
            new NovTip2(new int[]{13, 19, 97, 17, 98, 2, 54, 22}),
            new Tretja.Krogla(59),
            new NovTip1(new int[]{79, 96, 50}),
            new NovTip1(new int[]{66, 19}),
            new Tretja.Pravokotnik(83, 99),
            new Tretja.Krog(52),
            new Tretja.Kvader(88, 79, 62),
            new Tretja.Krogla(14),
            new NovTip2(new int[]{79, 68, 56, 51, 62}),
            new NovTip1(new int[]{75, 8, 15, 19}),
            new Tretja.Krogla(45),
            new Tretja.Kvader(63, 30, 68),
            new Tretja.Kvader(8, 23, 14),
            new Tretja.Pravokotnik(58, 17),
            new Tretja.Kvader(93, 13, 100),
            new NovTip3(new int[]{76, 85, 21, 87, 50, 86}),
            new Tretja.Kvader(27, 97, 94),
            new NovTip2(new int[]{90, 74, 61, 62, 83, 18, 89, 72, 92}),
            new Tretja.Pravokotnik(77, 26),
            new Tretja.Pravokotnik(45, 84),
            new NovTip1(new int[]{11, 53, 92}),
            new NovTip1(new int[]{13, 24, 83, 68, 43, 47, 92, 42, 35, 26}),
            new NovTip3(new int[]{56, 3}),
            new NovTip3(new int[]{53, 54, 86, 21, 21, 74}),
            new Tretja.Kvader(38, 22, 9),
            new NovTip2(new int[]{87, 14}),
            new Tretja.Krog(14),
            new NovTip2(new int[]{54, 30, 56}),
            new NovTip1(new int[]{10, 14, 25, 24, 33, 91}),
            new Tretja.Pravokotnik(57, 80),
            new Tretja.Pravokotnik(92, 97),
            new NovTip2(new int[]{75, 80, 72}),
            new Tretja.Krogla(76),
            new NovTip1(new int[]{60, 93, 23, 9}),
            new Tretja.Krogla(91),
            new Tretja.Krog(32),
            new NovTip3(new int[]{20, 28, 21, 86, 50, 9, 57, 28, 47}),
            new Tretja.Krog(2),
            new Tretja.Krog(29),
            new Tretja.Krog(68),
            new Tretja.Krog(47),
            new Tretja.Krog(17),
            new Tretja.Pravokotnik(11, 20),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
