
import java.util.*;

public class Test12 {

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

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Krog(43),
            new Tretja.Krogla(21),
            new Tretja.Pravokotnik(47, 2),
            new NovTip2(new int[]{74, 41, 89, 1, 49, 48, 60}),
            new Tretja.Krogla(16),
            new Tretja.Kvader(11, 40, 61),
            new Tretja.Kvader(36, 31, 95),
            new NovTip1(new int[]{11, 26, 31, 75, 51, 96, 63, 87, 3}),
            new Tretja.Pravokotnik(61, 95),
            new NovTip1(new int[]{18, 20, 100, 6, 37, 13, 43, 81, 1, 33}),
            new NovTip2(new int[]{62, 20, 69, 31, 62, 94, 18}),
            new NovTip1(new int[]{17, 23, 88}),
            new Tretja.Krog(20),
            new Tretja.Krog(93),
            new Tretja.Krogla(12),
            new Tretja.Kvader(3, 24, 18),
            new Tretja.Krog(49),
            new NovTip2(new int[]{55, 81, 28, 30, 32, 81, 79, 55}),
            new NovTip1(new int[]{22, 60}),
            new Tretja.Pravokotnik(48, 58),
            new Tretja.Pravokotnik(71, 83),
            new Tretja.Krogla(94),
            new Tretja.Kvader(16, 68, 65),
            new Tretja.Pravokotnik(90, 84),
            new Tretja.Pravokotnik(72, 42),
            new NovTip2(new int[]{88, 6, 92, 29, 98, 32, 10}),
            new Tretja.Kvader(89, 43, 24),
            new Tretja.Krog(62),
            new Tretja.Pravokotnik(39, 87),
            new Tretja.Kvader(54, 57, 64),
            new Tretja.Krog(42),
            new Tretja.Krog(33),
            new Tretja.Kvader(100, 50, 60),
            new Tretja.Kvader(31, 96, 53),
            new Tretja.Pravokotnik(95, 5),
            new NovTip1(new int[]{11, 25, 15}),
            new NovTip2(new int[]{87, 15}),
            new Tretja.Kvader(99, 95, 76),
            new Tretja.Krog(18),
            new Tretja.Kvader(5, 11, 27),
            new NovTip2(new int[]{18, 25, 98}),
            new Tretja.Krogla(13),
            new Tretja.Krogla(18),
            new Tretja.Pravokotnik(29, 91),
            new Tretja.Kvader(40, 37, 4),
            new Tretja.Kvader(10, 34, 8),
            new NovTip1(new int[]{24, 98}),
            new Tretja.Krog(76),
            new Tretja.Krog(59),
            new Tretja.Krogla(72),
            new Tretja.Krogla(68),
            new Tretja.Kvader(9, 60, 79),
            new Tretja.Krogla(8),
            new Tretja.Krogla(90),
            new Tretja.Kvader(47, 62, 23),
            new NovTip1(new int[]{24, 19, 19, 64, 60, 12}),
            new NovTip2(new int[]{47, 94, 14, 34, 61, 84, 99}),
            new NovTip1(new int[]{89, 72, 68, 7, 22, 80, 29, 36, 25}),
            new Tretja.Kvader(1, 95, 48),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
