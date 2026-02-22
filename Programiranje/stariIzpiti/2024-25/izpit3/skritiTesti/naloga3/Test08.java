
import java.util.*;

public class Test08 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.TriD {
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
            new NovTip3(new int[]{42, 35, 35, 24, 76, 91, 27}),
            new Tretja.Krog(45),
            new NovTip1(new int[]{95, 6, 95, 44, 75, 22, 23, 47}),
            new NovTip2(new int[]{13, 49, 49, 93, 99, 17}),
            new Tretja.Kvader(8, 39, 16),
            new Tretja.Kvader(24, 38, 26),
            new NovTip1(new int[]{23, 25, 8, 23, 67, 83, 94, 80}),
            new Tretja.Krogla(3),
            new Tretja.Kvader(86, 18, 67),
            new NovTip4(new int[]{59, 29}),
            new Tretja.Kvader(26, 5, 29),
            new NovTip2(new int[]{91, 25, 86, 82, 30}),
            new NovTip2(new int[]{10, 76, 64, 47, 6, 13, 97, 45, 4}),
            new Tretja.Krogla(32),
            new Tretja.Pravokotnik(93, 53),
            new Tretja.Pravokotnik(65, 3),
            new NovTip4(new int[]{38, 15, 48, 97, 33, 10, 57, 100, 77, 99}),
            new Tretja.Pravokotnik(69, 9),
            new Tretja.Pravokotnik(17, 57),
            new NovTip2(new int[]{41, 54, 79, 88, 95}),
            new Tretja.Kvader(26, 52, 71),
            new Tretja.Pravokotnik(68, 41),
            new NovTip3(new int[]{92, 98, 34, 59, 28, 98, 58}),
            new NovTip1(new int[]{12, 35, 71, 73, 57, 30, 14, 20, 85, 39}),
            new Tretja.Krogla(60),
            new Tretja.Kvader(93, 77, 45),
            new NovTip2(new int[]{76, 65, 92, 83, 67, 5}),
            new NovTip1(new int[]{89, 52}),
            new Tretja.Pravokotnik(7, 15),
            new NovTip4(new int[]{64, 89, 74, 38, 58, 48, 84, 47, 71, 14}),
            new NovTip3(new int[]{41, 41}),
            new NovTip1(new int[]{90, 82, 77}),
            new Tretja.Pravokotnik(92, 45),
            new Tretja.Krog(61),
            new NovTip2(new int[]{44, 81, 9, 50}),
            new NovTip1(new int[]{82, 23, 57, 32, 77, 42, 76}),
            new Tretja.Krog(51),
            new NovTip1(new int[]{71, 66, 33, 47}),
            new Tretja.Krog(93),
            new NovTip3(new int[]{35, 56, 85, 65, 39, 9, 48}),
            new NovTip3(new int[]{37, 71, 17}),
            new NovTip1(new int[]{33, 1, 30}),
            new Tretja.Kvader(64, 100, 47),
            new Tretja.Krogla(51),
            new NovTip1(new int[]{71, 100, 46, 82, 68}),
            new NovTip2(new int[]{12, 37}),
            new Tretja.Krog(9),
            new Tretja.Pravokotnik(71, 93),
            new Tretja.Pravokotnik(64, 56),
            new Tretja.Kvader(58, 66, 33),
            new Tretja.Kvader(23, 2, 36),
            new Tretja.Krogla(25),
            new NovTip3(new int[]{64, 21, 56, 83, 42}),
            new Tretja.Krog(7),
            new Tretja.Krog(55),
            new NovTip2(new int[]{20, 82, 98, 90, 57, 73, 99, 48}),
            new NovTip3(new int[]{17, 12, 21, 12, 93, 12, 39}),
            new NovTip4(new int[]{6, 67, 51, 36}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
