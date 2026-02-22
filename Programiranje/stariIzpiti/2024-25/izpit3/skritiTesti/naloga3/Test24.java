
import java.util.*;

public class Test24 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip4 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip5 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip5(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new NovTip1(new int[]{34, 99, 1, 80, 1, 39}),
            new Tretja.Krog(48),
            new NovTip2(new int[]{11, 61, 95, 16, 45, 60, 11, 10, 3}),
            new NovTip3(new int[]{60, 93, 56, 100, 10, 82}),
            new Tretja.Pravokotnik(78, 75),
            new NovTip1(new int[]{32, 97, 33, 3, 27, 99, 75, 27}),
            new Tretja.Krogla(40),
            new Tretja.Krogla(35),
            new NovTip5(new int[]{48, 80, 46, 25, 52, 86, 60, 71, 35, 80}),
            new Tretja.Krogla(76),
            new Tretja.Kvader(37, 31, 25),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
