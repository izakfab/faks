
import java.util.*;

public class Test11 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Kvader(42, 43, 38),
            new Tretja.Krogla(23),
            new Tretja.Krogla(37),
            new Tretja.Kvader(90, 49, 18),
            new Tretja.Kvader(92, 1, 77),
            new Tretja.Krog(37),
            new Tretja.Krog(53),
            new Tretja.Krogla(60),
            new NovTip1(new int[]{38, 38}),
            new NovTip2(new int[]{14, 76, 18}),
            new NovTip3(new int[]{43, 61, 75, 31, 78, 43, 72, 36, 27}),
            new NovTip3(new int[]{82, 15, 53, 71, 51, 81, 8, 51, 15}),
            new NovTip2(new int[]{50, 21, 54, 4, 74, 64, 25}),
            new Tretja.Krog(96),
            new NovTip1(new int[]{68, 77, 19, 84, 82, 8, 34, 29}),
            new NovTip2(new int[]{81, 89, 100, 63, 63, 47, 88, 49, 73}),
            new NovTip2(new int[]{55, 57, 10, 7, 55}),
            new NovTip1(new int[]{54, 71}),
            new NovTip2(new int[]{81, 74}),
            new NovTip2(new int[]{19, 97}),
            new NovTip3(new int[]{75, 18, 85, 38, 88, 71, 50}),
            new NovTip2(new int[]{87, 48, 62}),
            new NovTip1(new int[]{85, 35, 50, 85, 94, 6, 99, 88, 9}),
            new Tretja.Krog(61),
            new Tretja.Krogla(4),
            new NovTip2(new int[]{64, 82, 79, 22}),
            new Tretja.Krog(94),
            new NovTip1(new int[]{85, 32, 20, 14, 54, 38, 86, 52}),
            new NovTip1(new int[]{67, 36, 9, 78, 54, 49, 70, 63, 40, 17}),
            new NovTip2(new int[]{19, 3, 49, 96, 85, 23, 75, 52}),
            new Tretja.Pravokotnik(13, 80),
            new NovTip3(new int[]{55, 25, 76, 11, 35, 57, 80}),
            new NovTip2(new int[]{75, 43, 58, 82, 27, 11}),
            new Tretja.Pravokotnik(21, 59),
            new Tretja.Krog(88),
            new Tretja.Kvader(72, 41, 14),
            new Tretja.Krogla(91),
            new NovTip1(new int[]{70, 21}),
            new Tretja.Kvader(23, 92, 92),
            new NovTip3(new int[]{68, 9, 40, 81, 76, 63, 80, 87, 61}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
