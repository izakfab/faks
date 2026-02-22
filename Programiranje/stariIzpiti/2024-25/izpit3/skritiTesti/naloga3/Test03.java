
import java.util.*;

public class Test03 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
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

    private static class NovTip4 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip5 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip5(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Pravokotnik(99, 87),
            new Tretja.Krog(99),
            new NovTip4(new int[]{22, 100, 17, 25, 66, 93, 96, 33, 17, 80}),
            new NovTip1(new int[]{51, 17}),
            new Tretja.Pravokotnik(27, 11),
            new Tretja.Krogla(77),
            new Tretja.Kvader(87, 78, 50),
            new NovTip2(new int[]{8, 68, 74, 42, 27}),
            new NovTip4(new int[]{78, 2, 15, 52}),
            new Tretja.Kvader(66, 76, 30),
            new NovTip3(new int[]{92, 24, 54, 65, 88, 6, 59, 3, 46}),
            new Tretja.Krogla(85),
            new Tretja.Pravokotnik(60, 72),
            new Tretja.Krog(97),
            new NovTip2(new int[]{74, 34, 68, 55, 13, 23, 13}),
            new NovTip3(new int[]{38, 5, 56, 7, 39, 60, 17}),
            new NovTip3(new int[]{12, 76, 3, 35, 36}),
            new NovTip1(new int[]{84, 7, 72, 31, 42}),
            new Tretja.Krogla(53),
            new NovTip4(new int[]{100, 36, 25}),
            new Tretja.Krogla(29),
            new NovTip2(new int[]{43, 80, 54, 20, 8, 12, 52, 40, 35, 80}),
            new Tretja.Kvader(21, 100, 52),
            new NovTip2(new int[]{47, 1, 77, 82, 32, 33, 48, 69, 89}),
            new NovTip3(new int[]{99, 27, 72}),
            new NovTip1(new int[]{12, 35, 79, 83, 57}),
            new NovTip4(new int[]{73, 45, 79, 54, 20, 38}),
            new NovTip4(new int[]{88, 30, 16, 100, 58, 64}),
            new NovTip4(new int[]{5, 38, 51, 18, 2, 22, 45}),
            new Tretja.Krog(63),
            new NovTip1(new int[]{87, 17, 73, 79, 4, 71, 99, 52, 21, 31}),
            new NovTip4(new int[]{6, 29, 19, 50, 85, 39, 86}),
            new NovTip4(new int[]{29, 42, 91, 80}),
            new NovTip5(new int[]{13, 93, 100, 25, 59}),
            new NovTip4(new int[]{59, 74, 2, 91, 17}),
            new Tretja.Krog(15),
            new Tretja.Krog(42),
            new Tretja.Krog(13),
            new NovTip4(new int[]{36, 7, 28}),
            new NovTip4(new int[]{44, 8, 44, 27, 64, 6, 27, 27, 21, 22}),
            new Tretja.Pravokotnik(56, 28),
            new Tretja.Kvader(3, 80, 14),
            new NovTip2(new int[]{40, 61}),
            new NovTip2(new int[]{61, 99, 53, 41, 69, 70, 63, 28, 100, 84}),
            new NovTip4(new int[]{18, 25, 80, 21, 61, 73, 93, 40}),
            new Tretja.Kvader(52, 97, 100),
            new NovTip2(new int[]{70, 13, 19, 70, 71, 1, 87, 35, 18}),
            new NovTip3(new int[]{97, 25}),
            new Tretja.Pravokotnik(56, 89),
            new Tretja.Kvader(73, 48, 38),
            new Tretja.Krogla(96),
            new NovTip4(new int[]{27, 25, 35, 27, 17, 67, 6}),
            new Tretja.Krogla(94),
            new NovTip3(new int[]{9, 52, 99, 24, 70, 12, 75, 35, 83, 40}),
            new NovTip4(new int[]{13, 37, 25, 82}),
            new NovTip5(new int[]{3, 17, 84, 64, 81, 54, 39, 54, 36, 18}),
            new Tretja.Kvader(19, 79, 81),
            new NovTip2(new int[]{48, 87, 23, 21}),
            new NovTip1(new int[]{32, 91, 74}),
            new Tretja.Krog(27),
            new Tretja.Krogla(19),
            new Tretja.Krogla(8),
            new Tretja.Krogla(15),
            new Tretja.Pravokotnik(12, 37),
            new Tretja.Pravokotnik(77, 93),
            new Tretja.Krogla(31),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
