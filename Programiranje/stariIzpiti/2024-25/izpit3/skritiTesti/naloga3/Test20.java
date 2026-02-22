
import java.util.*;

public class Test20 {

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

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Kvader(32, 24, 39),
            new Tretja.Pravokotnik(63, 71),
            new NovTip1(new int[]{24, 7, 9}),
            new Tretja.Krog(79),
            new Tretja.Krogla(72),
            new Tretja.Krog(44),
            new Tretja.Krogla(88),
            new NovTip1(new int[]{57, 32, 7, 26, 24, 25, 64}),
            new NovTip1(new int[]{43, 14, 14, 64}),
            new Tretja.Pravokotnik(38, 55),
            new Tretja.Krog(37),
            new NovTip2(new int[]{62, 89, 74, 70, 59, 88, 98, 54, 19, 84}),
            new Tretja.Krog(44),
            new Tretja.Pravokotnik(59, 16),
            new Tretja.Kvader(91, 85, 46),
            new NovTip2(new int[]{60, 85, 87, 20, 48, 42}),
            new Tretja.Pravokotnik(42, 1),
            new Tretja.Krogla(65),
            new Tretja.Pravokotnik(69, 1),
            new NovTip2(new int[]{49, 97, 70, 1}),
            new NovTip2(new int[]{38, 68, 5, 24}),
            new Tretja.Krogla(83),
            new Tretja.Pravokotnik(18, 54),
            new NovTip2(new int[]{11, 43, 25, 31, 45, 41, 56, 76}),
            new Tretja.Pravokotnik(22, 13),
            new Tretja.Pravokotnik(63, 25),
            new Tretja.Kvader(85, 50, 57),
            new NovTip2(new int[]{88, 93, 47}),
            new NovTip1(new int[]{64, 54, 45, 30, 82, 11, 63}),
            new Tretja.Krogla(67),
            new Tretja.Krog(25),
            new Tretja.Pravokotnik(97, 71),
            new Tretja.Krogla(54),
            new Tretja.Krog(6),
            new Tretja.Krogla(9),
            new NovTip1(new int[]{44, 32, 52, 72, 35}),
            new Tretja.Krog(4),
            new Tretja.Krog(31),
            new NovTip1(new int[]{92, 8, 5, 89, 87, 91}),
            new Tretja.Krog(95),
            new NovTip2(new int[]{85, 69, 80}),
            new Tretja.Kvader(37, 48, 62),
            new Tretja.Krog(53),
            new Tretja.Pravokotnik(95, 75),
            new NovTip1(new int[]{44, 38, 3, 4, 95, 89, 31, 99, 23, 95}),
            new Tretja.Krog(26),
            new Tretja.Krogla(96),
            new Tretja.Krog(65),
            new Tretja.Krogla(57),
            new Tretja.Kvader(19, 7, 50),
            new Tretja.Pravokotnik(67, 87),
            new Tretja.Kvader(32, 36, 58),
            new Tretja.Krogla(68),
            new Tretja.Pravokotnik(18, 42),
            new Tretja.Kvader(38, 92, 4),
            new Tretja.Krog(74),
            new NovTip2(new int[]{78, 95, 37}),
            new Tretja.Krogla(14),
            new Tretja.Krogla(77),
            new Tretja.Pravokotnik(42, 97),
            new Tretja.Krogla(27),
            new NovTip2(new int[]{4, 84, 9}),
            new Tretja.Pravokotnik(96, 37),
            new Tretja.Pravokotnik(85, 32),
            new Tretja.Pravokotnik(97, 96),
            new Tretja.Krog(16),
            new NovTip2(new int[]{10, 70, 96, 51, 54, 51, 41, 34, 7}),
            new Tretja.Krog(79),
            new Tretja.Kvader(65, 78, 70),
            new NovTip2(new int[]{50, 74, 89}),
            new Tretja.Krog(58),
            new Tretja.Krogla(91),
            new Tretja.Pravokotnik(6, 63),
            new Tretja.Krogla(5),
            new NovTip2(new int[]{39, 32, 61, 65, 97, 59, 35}),
            new Tretja.Kvader(81, 78, 4),
            new Tretja.Krogla(56),
            new Tretja.Pravokotnik(52, 15),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
