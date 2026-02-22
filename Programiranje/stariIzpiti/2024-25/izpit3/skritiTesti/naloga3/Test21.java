
import java.util.*;

public class Test21 {

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
            new NovTip4(new int[]{46, 80, 44, 7, 61, 85}),
            new NovTip4(new int[]{49, 63}),
            new NovTip2(new int[]{42, 41, 78, 87, 15, 87, 9}),
            new Tretja.Krogla(92),
            new Tretja.Krogla(78),
            new Tretja.Krogla(83),
            new NovTip2(new int[]{45, 77, 32, 28}),
            new NovTip2(new int[]{20, 79, 46, 26, 43, 7, 16, 38}),
            new NovTip3(new int[]{84, 40, 71, 15, 57, 48, 60, 24}),
            new NovTip1(new int[]{47, 46, 80, 28, 58, 12, 86, 41, 6}),
            new NovTip3(new int[]{49, 88, 60, 93, 94}),
            new Tretja.Pravokotnik(88, 1),
            new NovTip4(new int[]{33, 59, 95, 60, 43, 35, 84}),
            new Tretja.Krog(52),
            new Tretja.Krogla(92),
            new Tretja.Krogla(10),
            new NovTip2(new int[]{90, 30, 37, 8, 28, 39, 72}),
            new Tretja.Krogla(50),
            new NovTip2(new int[]{65, 56, 4, 63, 28}),
            new NovTip3(new int[]{83, 64, 16, 49, 10, 83, 64, 83, 74, 60}),
            new NovTip1(new int[]{27, 98, 5, 9}),
            new NovTip2(new int[]{96, 30, 72, 61, 26, 87}),
            new NovTip3(new int[]{90, 33}),
            new NovTip1(new int[]{72, 39, 22, 66, 98}),
            new NovTip2(new int[]{35, 23, 85, 10, 10, 77, 91, 1, 62, 74}),
            new NovTip1(new int[]{53, 36}),
            new NovTip1(new int[]{31, 9}),
            new NovTip2(new int[]{10, 85}),
            new Tretja.Kvader(69, 27, 6),
            new Tretja.Krogla(14),
            new Tretja.Krog(39),
            new NovTip4(new int[]{18, 33, 49, 15}),
            new NovTip2(new int[]{99, 44, 86, 30, 92, 40, 10, 9}),
            new Tretja.Krogla(10),
            new NovTip2(new int[]{69, 51, 42, 1, 88, 9}),
            new NovTip1(new int[]{15, 70, 80, 15, 40, 22, 26, 65, 39}),
            new NovTip2(new int[]{89, 28, 4, 56, 92, 15, 2}),
            new NovTip1(new int[]{71, 48, 50, 72, 33, 70}),
            new Tretja.Krogla(44),
            new Tretja.Pravokotnik(16, 38),
            new Tretja.Kvader(63, 86, 42),
            new Tretja.Pravokotnik(45, 11),
            new Tretja.Krogla(4),
            new Tretja.Krog(42),
            new Tretja.Krog(94),
            new NovTip2(new int[]{51, 2, 55, 83}),
            new Tretja.Krog(36),
            new NovTip4(new int[]{25, 3}),
            new NovTip4(new int[]{16, 53, 9, 23, 31, 53, 69}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
