
import java.util.*;

public class Test02 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Pravokotnik(18, 1),
            new Tretja.Krog(22),
            new NovTip1(new int[]{76, 85, 75, 62, 21}),
            new NovTip2(new int[]{46, 79, 12, 71}),
            new Tretja.Pravokotnik(66, 9),
            new Tretja.Pravokotnik(98, 43),
            new Tretja.Krogla(91),
            new Tretja.Kvader(43, 27, 12),
            new Tretja.Kvader(27, 26, 7),
            new Tretja.Pravokotnik(66, 60),
            new Tretja.Pravokotnik(32, 25),
            new NovTip1(new int[]{51, 44, 69, 92, 14, 44, 81}),
            new NovTip1(new int[]{22, 45, 68, 30, 51, 23}),
            new Tretja.Pravokotnik(91, 97),
            new Tretja.Krogla(35),
            new Tretja.Kvader(90, 49, 29),
            new NovTip1(new int[]{87, 75, 47, 58, 92, 21}),
            new NovTip2(new int[]{44, 34, 36, 48, 22, 17, 33}),
            new NovTip1(new int[]{58, 97, 34}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
