
import java.util.*;

public class Test03 {

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

    private static class NovTip4 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new NovTip4(new int[]{23, 14, 70, 47}),
            new Tretja.Krogla(94),
            new NovTip2(new int[]{2, 59, 11, 42, 6, 72, 39, 33, 85}),
            new NovTip2(new int[]{6, 68, 53, 68, 45, 59, 7, 46, 71, 77}),
            new Tretja.Krogla(32),
            new NovTip3(new int[]{4, 95, 60, 34, 16}),
            new Tretja.Krogla(33),
            new NovTip1(new int[]{55, 69, 40, 18, 69, 68, 60, 60, 100, 90}),
            new NovTip1(new int[]{72, 58}),
            new NovTip3(new int[]{97, 58}),
            new NovTip4(new int[]{31, 89, 93, 3, 72, 64, 6, 92, 82}),
            new NovTip3(new int[]{40, 8, 13, 11, 7, 95, 28, 21, 53, 63}),
            new Tretja.Krog(47),
            new NovTip2(new int[]{61, 43}),
            new NovTip3(new int[]{31, 63, 37, 50}),
            new NovTip2(new int[]{8, 36, 74, 19, 60, 6, 13, 12, 75, 86}),
            new NovTip2(new int[]{35, 23, 85, 22, 51}),
            new Tretja.Kvader(36, 33, 52),
            new NovTip4(new int[]{80, 69, 61}),
            new NovTip3(new int[]{56, 100, 1, 11, 75, 84, 47}),
            new Tretja.Krogla(3),
            new Tretja.Kvader(34, 86, 93),
            new NovTip1(new int[]{14, 5, 40, 88, 77, 50, 10, 66, 73, 88}),
            new NovTip3(new int[]{68, 12, 90, 53, 75, 71, 22, 96, 92}),
            new NovTip3(new int[]{33, 35, 75, 64, 49, 74}),
            new NovTip3(new int[]{13, 61, 37, 90, 37, 39, 35}),
            new Tretja.Krog(83),
            new Tretja.Kvader(75, 76, 18),
            new NovTip2(new int[]{3, 54, 8}),
            new NovTip2(new int[]{100, 27, 47}),
            new NovTip3(new int[]{29, 72, 12, 13, 8, 36, 90}),
            new NovTip4(new int[]{61, 61, 94, 23, 92, 5, 56, 38, 18}),
            new NovTip3(new int[]{85, 98, 41, 26, 75, 87, 11}),
            new NovTip3(new int[]{53, 56, 44}),
            new NovTip1(new int[]{55, 79, 66, 43, 33, 58, 20, 98, 97, 82}),
            new Tretja.Pravokotnik(17, 48),
            new NovTip3(new int[]{50, 20, 86, 24, 34, 16}),
            new Tretja.Kvader(39, 98, 13),
            new NovTip4(new int[]{27, 46}),
            new NovTip3(new int[]{1, 94}),
            new NovTip1(new int[]{27, 50, 49, 65, 80, 29, 71}),
            new Tretja.Pravokotnik(4, 50),
            new NovTip3(new int[]{72, 99, 48, 85, 8, 12}),
            new Tretja.Krog(86),
            new NovTip4(new int[]{97, 81, 16, 82, 94}),
            new NovTip4(new int[]{75, 67, 88, 15}),
            new NovTip2(new int[]{21, 86, 22, 79}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
