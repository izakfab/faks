
import java.util.*;

public class Test18 {

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

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new NovTip2(new int[]{47, 8}),
            new NovTip1(new int[]{88, 39, 40, 16, 17, 76, 87, 50, 16, 61}),
            new Tretja.Pravokotnik(17, 4),
            new NovTip2(new int[]{29, 45, 25, 24, 50, 80, 60, 8, 70, 71}),
            new NovTip2(new int[]{82, 44, 82, 23, 16}),
            new NovTip1(new int[]{50, 82, 85, 94, 37, 75, 100, 16, 78}),
            new Tretja.Kvader(81, 5, 59),
            new Tretja.Kvader(4, 98, 10),
            new Tretja.Krogla(10),
            new Tretja.Krogla(100),
            new NovTip2(new int[]{89, 15, 49, 85, 6, 14, 35, 99, 55, 35}),
            new NovTip1(new int[]{30, 40, 81, 42, 85, 1}),
            new Tretja.Pravokotnik(32, 29),
            new Tretja.Krog(96),
            new Tretja.Pravokotnik(66, 14),
            new NovTip1(new int[]{52, 1}),
            new Tretja.Krogla(52),
            new NovTip2(new int[]{62, 62, 77, 17}),
            new NovTip1(new int[]{12, 40, 18, 29, 41}),
            new NovTip1(new int[]{61, 75}),
            new NovTip1(new int[]{99, 86, 74, 59}),
            new Tretja.Kvader(43, 92, 21),
            new Tretja.Pravokotnik(7, 56),
            new Tretja.Pravokotnik(39, 4),
            new NovTip2(new int[]{85, 39, 32, 37, 51, 35, 73}),
            new NovTip1(new int[]{3, 1, 76, 68, 94, 76}),
            new Tretja.Pravokotnik(45, 36),
            new Tretja.Krog(70),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
