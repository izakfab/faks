
import java.util.*;

public class Test07 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip4 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Krogla(40),
            new Tretja.Pravokotnik(36, 64),
            new Tretja.Krog(58),
            new NovTip1(new int[]{85, 55, 91, 58}),
            new NovTip1(new int[]{53, 41, 97, 8, 40, 30}),
            new Tretja.Kvader(19, 74, 63),
            new NovTip1(new int[]{37, 5, 50}),
            new Tretja.Pravokotnik(56, 56),
            new NovTip1(new int[]{42, 8, 29, 95, 29, 54, 32}),
            new NovTip4(new int[]{60, 21}),
            new Tretja.Pravokotnik(53, 99),
            new NovTip3(new int[]{95, 17}),
            new NovTip2(new int[]{39, 56, 5, 2, 46, 25, 63, 59, 86}),
            new NovTip3(new int[]{30, 75, 32, 99, 50, 39, 90, 62, 40, 40}),
            new NovTip1(new int[]{23, 21}),
            new Tretja.Kvader(22, 80, 88),
            new Tretja.Kvader(22, 79, 100),
            new Tretja.Pravokotnik(50, 17),
            new NovTip3(new int[]{15, 68, 7, 86, 15, 8}),
            new Tretja.Krog(24),
            new NovTip2(new int[]{2, 39, 9, 74, 86, 50, 66}),
            new Tretja.Pravokotnik(76, 85),
            new NovTip4(new int[]{71, 19, 54, 44, 96, 57, 91, 33, 11, 63}),
            new Tretja.Krogla(4),
            new NovTip3(new int[]{30, 97, 43, 62, 10, 97}),
            new Tretja.Krogla(4),
            new NovTip1(new int[]{28, 42, 84, 17, 29, 47, 16, 46, 95, 42}),
            new Tretja.Krogla(9),
            new NovTip4(new int[]{2, 1, 27, 83, 85, 61, 11, 54, 87}),
            new NovTip2(new int[]{23, 5, 79, 29, 60, 83, 86, 56}),
            new NovTip3(new int[]{6, 97, 20, 24, 32, 36, 76, 77, 79, 24}),
            new Tretja.Kvader(100, 90, 17),
            new Tretja.Krogla(5),
            new NovTip3(new int[]{70, 30, 20}),
            new NovTip4(new int[]{59, 89, 43, 93, 29, 73}),
            new Tretja.Krog(63),
            new NovTip4(new int[]{78, 90, 10, 70, 26, 10, 75, 29}),
            new Tretja.Kvader(79, 45, 62),
            new Tretja.Krog(47),
            new Tretja.Pravokotnik(4, 27),
            new Tretja.Krog(16),
            new Tretja.Kvader(71, 32, 58),
            new NovTip2(new int[]{36, 8, 99, 12, 92, 57, 41, 78, 24, 27}),
            new Tretja.Kvader(82, 8, 99),
            new NovTip3(new int[]{69, 66, 45, 73, 45, 38}),
            new Tretja.Pravokotnik(42, 3),
            new Tretja.Krog(52),
            new NovTip3(new int[]{52, 48}),
            new NovTip3(new int[]{3, 73, 96, 12, 58, 45}),
            new Tretja.Pravokotnik(87, 27),
            new NovTip1(new int[]{53, 47, 97}),
            new NovTip1(new int[]{88, 100, 31, 79}),
            new Tretja.Pravokotnik(18, 54),
            new Tretja.Krogla(24),
            new NovTip2(new int[]{21, 19, 94}),
            new Tretja.Kvader(87, 95, 63),
            new NovTip3(new int[]{42, 94, 90, 89, 77}),
            new Tretja.Pravokotnik(30, 67),
            new Tretja.Kvader(73, 7, 99),
            new NovTip1(new int[]{19, 90, 43, 43, 18}),
            new Tretja.Pravokotnik(27, 46),
            new NovTip4(new int[]{58, 16, 8, 68, 80, 62, 87}),
            new Tretja.Krog(51),
            new Tretja.Kvader(48, 85, 4),
            new NovTip4(new int[]{36, 77}),
            new Tretja.Krog(71),
            new NovTip2(new int[]{82, 14, 33, 26, 38, 17, 73}),
            new Tretja.Krog(56),
            new NovTip3(new int[]{11, 90, 18, 62, 10, 49, 36, 7, 94, 69}),
            new Tretja.Krog(33),
            new Tretja.Krog(25),
            new NovTip4(new int[]{61, 28, 28, 39}),
            new Tretja.Kvader(55, 33, 78),
            new NovTip3(new int[]{22, 47, 40, 79, 83, 3, 89}),
            new NovTip1(new int[]{18, 85, 15, 69, 99, 6, 91, 46}),
            new Tretja.Krogla(55),
            new Tretja.Krog(22),
            new NovTip4(new int[]{27, 17, 7, 13, 39, 78}),
            new NovTip4(new int[]{39, 39, 17, 51, 91, 8, 90, 4, 16, 10}),
            new NovTip3(new int[]{1, 74}),
            new Tretja.Kvader(90, 6, 24),
            new NovTip3(new int[]{50, 20, 10, 87, 27, 57, 70}),
            new NovTip3(new int[]{20, 23, 9, 23, 19, 37, 17, 14}),
            new NovTip3(new int[]{92, 48, 58, 59, 27, 14, 21}),
            new NovTip4(new int[]{28, 11, 46, 100, 3, 43}),
            new Tretja.Krogla(46),
            new Tretja.Krog(84),
            new Tretja.Kvader(94, 58, 89),
            new Tretja.Krogla(42),
            new NovTip2(new int[]{96, 93, 42, 68, 14}),
            new Tretja.Krogla(95),
            new NovTip4(new int[]{24, 89, 33}),
            new NovTip3(new int[]{19, 100, 43, 18, 99, 68, 79}),
            new Tretja.Pravokotnik(93, 32),
            new Tretja.Krog(20),
            new NovTip1(new int[]{48, 47, 1, 59, 12, 75, 36, 71}),
            new Tretja.Krogla(87),
            new NovTip3(new int[]{23, 71, 36, 67, 76, 78, 95, 59, 63}),
            new Tretja.Kvader(4, 87, 32),
            new NovTip3(new int[]{84, 92, 53, 17}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
