
import java.util.*;

public class Test05 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip4 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Kvader(35, 12, 79),
            new NovTip4(new int[]{91, 88, 38, 35, 23, 91, 2, 37}),
            new Tretja.Pravokotnik(50, 96),
            new Tretja.Pravokotnik(4, 80),
            new NovTip3(new int[]{15, 54, 39, 39, 26}),
            new NovTip4(new int[]{29, 9, 88, 15}),
            new Tretja.Krogla(57),
            new NovTip1(new int[]{84, 73, 21, 12, 23, 13}),
            new NovTip1(new int[]{20, 37, 52}),
            new Tretja.Krog(42),
            new NovTip2(new int[]{6, 57, 8, 77, 89}),
            new NovTip4(new int[]{1, 74, 31, 38, 35}),
            new Tretja.Krogla(13),
            new NovTip1(new int[]{39, 65}),
            new NovTip1(new int[]{92, 14, 55, 8, 6, 43, 10, 68}),
            new Tretja.Krog(10),
            new Tretja.Krog(76),
            new NovTip4(new int[]{32, 6, 11, 18, 73, 26, 21, 70, 61, 77}),
            new Tretja.Pravokotnik(25, 99),
            new NovTip1(new int[]{55, 24, 4, 38, 77, 6, 32, 100}),
            new NovTip2(new int[]{95, 21, 1, 44, 21, 96, 27, 3, 65, 41}),
            new NovTip2(new int[]{90, 10, 12, 76}),
            new NovTip4(new int[]{87, 99, 41, 64, 5, 75}),
            new NovTip4(new int[]{31, 64, 97, 71, 15, 71}),
            new Tretja.Kvader(86, 40, 14),
            new Tretja.Kvader(14, 59, 61),
            new NovTip1(new int[]{30, 79, 21, 77, 93, 43, 17, 13, 12, 23}),
            new Tretja.Krog(5),
            new Tretja.Krog(62),
            new NovTip1(new int[]{58, 68}),
            new Tretja.Kvader(36, 12, 34),
            new Tretja.Kvader(42, 99, 21),
            new Tretja.Krog(36),
            new NovTip4(new int[]{83, 65, 70, 17, 91, 78}),
            new Tretja.Kvader(66, 56, 88),
            new Tretja.Pravokotnik(70, 95),
            new NovTip2(new int[]{37, 95, 84, 42}),
            new Tretja.Kvader(39, 23, 26),
            new NovTip1(new int[]{70, 23, 65, 30, 33, 13, 58, 32}),
            new Tretja.Krogla(5),
            new Tretja.Krogla(74),
            new Tretja.Krog(30),
            new Tretja.Kvader(78, 23, 67),
            new NovTip3(new int[]{12, 21, 15, 37, 77, 21, 94, 71, 60, 85}),
            new Tretja.Krog(59),
            new Tretja.Krog(46),
            new NovTip4(new int[]{6, 90}),
            new Tretja.Kvader(86, 12, 24),
            new NovTip3(new int[]{93, 23, 7, 18, 71, 90, 41, 58}),
            new Tretja.Krog(63),
            new Tretja.Krog(38),
            new NovTip1(new int[]{54, 15, 84, 62, 36, 39, 49}),
            new NovTip2(new int[]{7, 70, 70, 26, 80, 11, 30}),
            new Tretja.Kvader(5, 45, 61),
            new NovTip2(new int[]{69, 4, 27, 10, 63, 5}),
            new Tretja.Kvader(57, 79, 62),
            new NovTip3(new int[]{24, 89, 39, 2}),
            new NovTip2(new int[]{36, 38}),
            new Tretja.Kvader(29, 62, 69),
            new NovTip1(new int[]{18, 29, 67, 72, 97, 21, 47, 16}),
            new Tretja.Krogla(88),
            new NovTip1(new int[]{83, 5, 58, 82, 35, 37, 74, 60, 67, 39}),
            new Tretja.Pravokotnik(42, 24),
            new NovTip1(new int[]{83, 45, 7, 43, 56, 93, 75, 61}),
            new NovTip2(new int[]{59, 92}),
            new Tretja.Pravokotnik(51, 45),
            new Tretja.Krog(76),
            new Tretja.Kvader(6, 78, 12),
            new NovTip2(new int[]{21, 96, 66, 84, 70, 82, 93, 70}),
            new NovTip1(new int[]{15, 38, 8}),
            new NovTip1(new int[]{35, 29, 81, 20, 45, 55, 47, 48}),
            new NovTip4(new int[]{88, 90, 95, 68, 12, 98, 14, 100, 37, 46}),
            new Tretja.Kvader(2, 96, 93),
            new NovTip3(new int[]{66, 45, 19, 55, 15, 84, 17, 30, 33, 39}),
            new Tretja.Kvader(29, 13, 14),
            new Tretja.Kvader(66, 52, 28),
            new NovTip3(new int[]{65, 96, 97, 19, 37, 52, 80, 45, 100, 41}),
            new NovTip4(new int[]{97, 66, 36, 34}),
            new NovTip4(new int[]{97, 98}),
            new Tretja.Kvader(49, 30, 2),
            new NovTip3(new int[]{85, 65, 42, 43, 100, 34, 30}),
            new Tretja.Krog(66),
            new NovTip3(new int[]{9, 2, 25, 27, 70, 38, 7, 89, 89, 12}),
            new Tretja.Pravokotnik(69, 95),
            new Tretja.Krog(87),
            new NovTip3(new int[]{99, 24, 63}),
            new NovTip1(new int[]{51, 77, 36, 16}),
            new Tretja.Kvader(63, 38, 30),
            new Tretja.Krog(13),
            new NovTip1(new int[]{40, 56, 92, 74, 24, 17, 89, 49, 72}),
            new NovTip2(new int[]{10, 64, 90, 73, 28, 8}),
            new NovTip3(new int[]{21, 9, 49, 21, 98, 21, 24, 5, 59}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
