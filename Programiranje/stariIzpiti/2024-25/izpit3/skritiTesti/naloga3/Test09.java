
import java.util.*;

public class Test09 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.TriD {
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
            new NovTip2(new int[]{25, 31, 64, 100, 12, 10, 12, 2, 28, 83}),
            new NovTip3(new int[]{63, 64, 46, 85, 34, 9, 2, 53, 98}),
            new Tretja.Pravokotnik(93, 92),
            new NovTip2(new int[]{38, 57, 7, 58, 16, 12}),
            new NovTip2(new int[]{18, 41, 15, 97, 82, 14, 86}),
            new NovTip1(new int[]{56, 78, 67}),
            new Tretja.Kvader(81, 82, 39),
            new Tretja.Pravokotnik(42, 44),
            new NovTip3(new int[]{32, 97, 57}),
            new NovTip2(new int[]{5, 13, 94, 11, 93}),
            new Tretja.Kvader(63, 63, 11),
            new NovTip1(new int[]{37, 92, 42, 70, 60, 26, 8, 4}),
            new NovTip3(new int[]{80, 38, 17}),
            new Tretja.Pravokotnik(61, 8),
            new NovTip3(new int[]{23, 97, 28, 27, 57, 1, 44, 87}),
            new NovTip1(new int[]{4, 80, 91, 7, 74, 23, 72, 19, 29}),
            new NovTip2(new int[]{58, 58, 96, 62, 33, 29, 86, 37, 29, 29}),
            new NovTip1(new int[]{69, 94, 83, 77}),
            new Tretja.Pravokotnik(55, 61),
            new NovTip3(new int[]{76, 74, 62, 25, 64, 7, 15}),
            new NovTip3(new int[]{56, 53, 86}),
            new Tretja.Krogla(13),
            new Tretja.Kvader(27, 17, 16),
            new NovTip1(new int[]{85, 12, 99, 43, 41}),
            new Tretja.Krog(94),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
