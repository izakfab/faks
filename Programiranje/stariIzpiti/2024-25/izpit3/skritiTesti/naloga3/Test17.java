
import java.util.*;

public class Test17 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new NovTip3(new int[]{94, 90, 97, 14}),
            new Tretja.Kvader(63, 25, 46),
            new Tretja.Krogla(90),
            new NovTip2(new int[]{24, 57, 57, 4, 7, 88, 5}),
            new Tretja.Krog(98),
            new NovTip2(new int[]{62, 33, 25, 86, 90, 17, 61, 98, 20, 9}),
            new Tretja.Pravokotnik(49, 20),
            new Tretja.Krogla(26),
            new Tretja.Krog(35),
            new Tretja.Pravokotnik(77, 16),
            new NovTip2(new int[]{29, 92, 94, 33, 88, 59, 83, 5, 99}),
            new Tretja.Krogla(25),
            new Tretja.Pravokotnik(58, 66),
            new Tretja.Krog(22),
            new NovTip1(new int[]{59, 61, 29, 13, 74, 97, 77}),
            new NovTip2(new int[]{37, 45, 37, 2}),
            new NovTip3(new int[]{56, 22, 64, 51, 82, 41, 26, 81}),
            new Tretja.Kvader(95, 95, 8),
            new Tretja.Kvader(80, 42, 32),
            new Tretja.Krog(28),
            new Tretja.Pravokotnik(81, 91),
            new NovTip2(new int[]{39, 94, 61, 48, 36, 36, 24}),
            new NovTip3(new int[]{63, 58, 36, 7, 95, 92, 48, 19}),
            new Tretja.Krog(21),
            new NovTip2(new int[]{99, 44, 44, 47, 12, 18, 26, 26, 32, 13}),
            new NovTip3(new int[]{68, 55, 6}),
            new Tretja.Krogla(23),
            new NovTip3(new int[]{93, 61, 57, 98, 35, 87, 61, 15, 24, 69}),
            new Tretja.Krog(3),
            new NovTip3(new int[]{91, 86, 80, 24, 60, 42, 46, 84, 61}),
            new Tretja.Krogla(88),
            new NovTip2(new int[]{41, 2, 89, 34, 22, 91}),
            new Tretja.Krog(20),
            new Tretja.Krog(7),
            new Tretja.Krogla(71),
            new NovTip1(new int[]{44, 37, 49, 36, 85, 62, 99, 40}),
            new Tretja.Krog(32),
            new Tretja.Kvader(86, 97, 35),
            new NovTip3(new int[]{90, 53, 65}),
            new Tretja.Krog(18),
            new Tretja.Krogla(64),
            new NovTip1(new int[]{7, 32, 81, 90}),
            new Tretja.Kvader(37, 63, 74),
            new NovTip2(new int[]{37, 41, 73, 46, 22, 9, 96, 71, 23}),
            new NovTip2(new int[]{82, 51, 6}),
            new NovTip1(new int[]{11, 96, 95, 53, 22, 87, 60}),
            new Tretja.Pravokotnik(10, 51),
            new NovTip3(new int[]{86, 39, 80, 35}),
            new NovTip1(new int[]{12, 77, 88, 39, 32, 53, 98, 47}),
            new NovTip1(new int[]{79, 58, 15, 67, 99, 62, 64, 87}),
            new Tretja.Krogla(50),
            new Tretja.Pravokotnik(58, 24),
            new Tretja.Krogla(82),
            new Tretja.Krogla(4),
            new NovTip3(new int[]{90, 61, 88, 65, 56, 33, 72, 25, 2, 34}),
            new Tretja.Krog(10),
            new NovTip3(new int[]{41, 1, 63, 37, 84}),
            new NovTip3(new int[]{8, 16, 90, 84, 73, 1, 74, 8, 95}),
            new NovTip1(new int[]{56, 77, 96, 95, 12, 68, 33, 44, 67, 69}),
            new NovTip1(new int[]{94, 80, 91, 21, 38, 42, 39, 35, 93, 75}),
            new Tretja.Pravokotnik(93, 68),
            new NovTip3(new int[]{12, 8, 5}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
