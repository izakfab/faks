
import java.util.*;

public class Test16 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip4 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip5 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip5(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new NovTip3(new int[]{27, 98, 66, 91, 58, 39, 36, 47, 81}),
            new Tretja.Kvader(72, 72, 40),
            new Tretja.Kvader(41, 76, 24),
            new NovTip1(new int[]{53, 80, 99, 25, 54, 34, 21}),
            new NovTip5(new int[]{83, 22, 84, 64, 27}),
            new NovTip3(new int[]{62, 49, 15, 46, 80, 6, 30}),
            new Tretja.Krog(90),
            new NovTip3(new int[]{64, 55, 37, 52, 76, 25, 57, 78, 81}),
            new NovTip3(new int[]{41, 47, 56, 4, 81, 88}),
            new NovTip1(new int[]{41, 21, 53, 1, 13, 6}),
            new NovTip2(new int[]{88, 44, 82, 3, 28, 70, 30, 46, 18, 1}),
            new NovTip3(new int[]{38, 14, 35, 19, 71, 2, 71, 43, 76}),
            new NovTip4(new int[]{79, 99, 46, 36, 92, 68}),
            new NovTip1(new int[]{28, 14, 66}),
            new NovTip5(new int[]{45, 71, 39, 66}),
            new NovTip3(new int[]{48, 9, 91, 97, 34, 91, 34, 54}),
            new NovTip4(new int[]{36, 86, 56, 10, 88, 46, 22, 50, 37}),
            new NovTip1(new int[]{5, 20, 5, 58, 15, 87, 85, 80, 16}),
            new NovTip5(new int[]{97, 77, 54, 99, 16, 82, 49, 19}),
            new NovTip5(new int[]{73, 27, 8, 68, 97, 31, 6, 45, 88, 56}),
            new NovTip4(new int[]{8, 81, 19, 25, 52, 12, 97, 6}),
            new NovTip5(new int[]{19, 53, 27, 65, 5}),
            new NovTip5(new int[]{29, 31, 61, 66, 42, 78, 37, 18, 79, 79}),
            new NovTip1(new int[]{31, 79}),
            new NovTip1(new int[]{43, 93, 2, 34, 43, 83, 35, 8, 33, 5}),
            new Tretja.Pravokotnik(42, 25),
            new Tretja.Pravokotnik(63, 33),
            new NovTip3(new int[]{35, 64, 2, 8, 18, 73}),
            new NovTip4(new int[]{5, 68, 20, 83, 74}),
            new Tretja.Krog(6),
            new Tretja.Krog(2),
            new NovTip2(new int[]{76, 57}),
            new Tretja.Krog(25),
            new NovTip2(new int[]{95, 50, 25, 3, 83, 35, 48, 64, 64, 78}),
            new NovTip2(new int[]{63, 80, 40, 64, 21, 80, 73, 57}),
            new NovTip4(new int[]{32, 23, 15}),
            new Tretja.Krog(32),
            new Tretja.Krog(40),
            new NovTip1(new int[]{66, 28, 36, 90, 14, 65, 6}),
            new NovTip3(new int[]{62, 16, 84}),
            new NovTip2(new int[]{89, 73}),
            new NovTip1(new int[]{37, 92, 73}),
            new Tretja.Krogla(47),
            new NovTip4(new int[]{85, 32, 79, 84, 40, 5, 6}),
            new NovTip3(new int[]{98, 31, 96, 12, 37, 89, 17, 24, 36}),
            new NovTip1(new int[]{40, 40, 61, 91, 28, 66, 61, 24, 48}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
