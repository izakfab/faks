
import java.util.*;

public class Test14 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.TriD {
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
            new NovTip1(new int[]{79, 36, 81, 90, 27, 52, 49, 5}),
            new Tretja.Pravokotnik(46, 12),
            new NovTip1(new int[]{12, 58, 18, 44, 11}),
            new NovTip2(new int[]{5, 39, 19, 98, 41, 63, 85, 90, 20}),
            new NovTip2(new int[]{12, 15}),
            new Tretja.Kvader(10, 20, 42),
            new Tretja.Krog(31),
            new NovTip2(new int[]{98, 84, 60, 63, 49, 58}),
            new Tretja.Pravokotnik(74, 23),
            new Tretja.Pravokotnik(12, 58),
            new Tretja.Pravokotnik(32, 23),
            new NovTip1(new int[]{14, 21, 13}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
