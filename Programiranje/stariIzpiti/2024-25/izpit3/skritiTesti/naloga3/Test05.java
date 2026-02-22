
import java.util.*;

public class Test05 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip4 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Krogla(67),
            new NovTip2(new int[]{8, 36, 28}),
            new Tretja.Kvader(47, 27, 28),
            new Tretja.Krogla(15),
            new NovTip3(new int[]{56, 43, 52, 18, 49, 98, 21}),
            new NovTip3(new int[]{5, 17, 98, 45, 55, 76, 28}),
            new Tretja.Krog(86),
            new NovTip1(new int[]{23, 49, 6, 89}),
            new NovTip2(new int[]{32, 53, 91, 66, 77, 67, 27, 39, 66, 11}),
            new NovTip2(new int[]{89, 81, 71}),
            new NovTip4(new int[]{9, 48, 49}),
            new Tretja.Kvader(9, 13, 50),
            new NovTip2(new int[]{93, 98, 74, 28, 74, 96}),
            new NovTip1(new int[]{68, 77, 91, 25, 81, 25, 82, 84}),
            new NovTip4(new int[]{97, 99, 61, 8, 7, 19, 24, 15}),
            new Tretja.Pravokotnik(55, 74),
            new Tretja.Krog(37),
            new Tretja.Krog(13),
            new Tretja.Krog(46),
            new NovTip4(new int[]{22, 90, 15}),
            new NovTip3(new int[]{94, 78, 72}),
            new Tretja.Krog(91),
            new NovTip1(new int[]{54, 51, 45, 38}),
            new NovTip1(new int[]{62, 58, 34, 1, 39, 1, 65, 82}),
            new Tretja.Pravokotnik(16, 23),
            new NovTip2(new int[]{85, 91, 87, 43, 65, 8, 71, 41, 25, 74}),
            new NovTip3(new int[]{57, 21, 86, 1, 49}),
            new Tretja.Kvader(37, 61, 22),
            new NovTip3(new int[]{78, 97, 3}),
            new NovTip2(new int[]{28, 81, 12, 49, 12, 19, 2}),
            new Tretja.Krog(68),
            new Tretja.Krog(67),
            new Tretja.Pravokotnik(10, 68),
            new NovTip1(new int[]{68, 19, 65, 58, 49}),
            new Tretja.Kvader(13, 76, 82),
            new Tretja.Kvader(9, 4, 90),
            new NovTip2(new int[]{36, 71, 37, 12, 47, 11, 39, 23, 47, 70}),
            new NovTip2(new int[]{16, 30, 24, 63, 95, 55}),
            new NovTip4(new int[]{53, 64, 23, 6, 33, 57, 25, 34, 7}),
            new NovTip2(new int[]{28, 80, 93, 22, 76, 32, 12, 39, 23, 13}),
            new NovTip3(new int[]{28, 23, 99, 11, 69, 23}),
            new NovTip2(new int[]{56, 10, 47, 16, 6}),
            new Tretja.Krog(32),
            new NovTip2(new int[]{3, 7, 75, 86, 69, 79, 40, 21}),
            new Tretja.Krog(62),
            new NovTip3(new int[]{35, 52, 33, 35, 86, 41, 1}),
            new Tretja.Kvader(93, 36, 74),
            new Tretja.Krogla(60),
            new NovTip1(new int[]{87, 80, 1, 45, 77, 100}),
            new Tretja.Kvader(12, 24, 78),
            new Tretja.Kvader(35, 43, 34),
            new Tretja.Kvader(24, 71, 5),
            new Tretja.Krog(60),
            new Tretja.Kvader(31, 9, 79),
            new Tretja.Kvader(9, 54, 6),
            new NovTip1(new int[]{85, 12, 75, 54, 74}),
            new Tretja.Krogla(96),
            new Tretja.Krog(1),
            new Tretja.Pravokotnik(24, 75),
            new NovTip1(new int[]{29, 46, 85, 23, 66, 7, 70, 33}),
            new NovTip1(new int[]{86, 84, 24, 46, 24, 21, 43, 87}),
            new NovTip4(new int[]{43, 23, 41, 7, 53}),
            new NovTip2(new int[]{51, 10, 58}),
            new NovTip3(new int[]{65, 44, 9, 26}),
            new NovTip3(new int[]{95, 82, 80, 24, 33, 54}),
            new Tretja.Krogla(69),
            new NovTip3(new int[]{89, 81, 15, 52, 68, 15}),
            new NovTip2(new int[]{93, 99, 39, 48, 2, 73, 83, 15, 45}),
            new Tretja.Krogla(29),
            new Tretja.Krogla(83),
            new Tretja.Pravokotnik(99, 24),
            new Tretja.Pravokotnik(86, 8),
            new Tretja.Kvader(30, 28, 37),
            new Tretja.Pravokotnik(39, 23),
            new Tretja.Kvader(53, 64, 44),
            new Tretja.Krog(65),
            new Tretja.Kvader(60, 21, 4),
            new Tretja.Krog(32),
            new Tretja.Kvader(50, 72, 70),
            new Tretja.Kvader(87, 12, 5),
            new NovTip3(new int[]{91, 64, 34, 29, 74, 87, 44, 24, 29}),
            new NovTip1(new int[]{37, 34, 27, 37, 89, 74, 74, 23, 87, 12}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
