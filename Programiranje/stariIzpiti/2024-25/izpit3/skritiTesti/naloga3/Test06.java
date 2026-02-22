
import java.util.*;

public class Test06 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.DvaD {
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
            new Tretja.Krog(59),
            new Tretja.Pravokotnik(89, 43),
            new Tretja.Pravokotnik(80, 76),
            new Tretja.Krogla(7),
            new Tretja.Krogla(76),
            new Tretja.Krogla(78),
            new Tretja.Krog(89),
            new Tretja.Krogla(13),
            new Tretja.Kvader(67, 96, 58),
            new NovTip2(new int[]{69, 40, 33, 89, 35, 90, 1, 93, 13, 90}),
            new NovTip1(new int[]{98, 77, 19, 46, 95, 56, 28, 37, 50}),
            new NovTip1(new int[]{84, 4}),
            new Tretja.Pravokotnik(78, 12),
            new Tretja.Kvader(72, 20, 17),
            new NovTip1(new int[]{72, 1, 22, 10, 78, 100, 32}),
            new NovTip1(new int[]{55, 48, 51, 1, 62}),
            new Tretja.Krogla(99),
            new NovTip1(new int[]{84, 16, 90, 98, 81, 96, 74, 93, 64}),
            new NovTip2(new int[]{35, 61, 85, 52, 49}),
            new Tretja.Krog(14),
            new Tretja.Krog(57),
            new Tretja.Pravokotnik(50, 70),
            new NovTip2(new int[]{98, 81}),
            new NovTip1(new int[]{74, 28, 34}),
            new Tretja.Pravokotnik(32, 59),
            new NovTip2(new int[]{98, 43, 51, 44, 37, 12, 78, 89}),
            new Tretja.Kvader(1, 81, 63),
            new Tretja.Krog(75),
            new Tretja.Krog(25),
            new NovTip1(new int[]{20, 68, 100, 53, 90, 96, 54}),
            new Tretja.Kvader(9, 29, 64),
            new NovTip2(new int[]{92, 59}),
            new Tretja.Kvader(89, 37, 79),
            new Tretja.Pravokotnik(64, 91),
            new Tretja.Krogla(84),
            new Tretja.Kvader(94, 49, 64),
            new NovTip2(new int[]{49, 78}),
            new Tretja.Pravokotnik(3, 97),
            new Tretja.Kvader(59, 82, 69),
            new Tretja.Krogla(67),
            new NovTip2(new int[]{89, 5, 80, 77, 64, 11, 77}),
            new Tretja.Krogla(5),
            new Tretja.Krogla(20),
            new NovTip2(new int[]{25, 39}),
            new Tretja.Krog(70),
            new NovTip1(new int[]{36, 92, 79}),
            new Tretja.Kvader(79, 82, 30),
            new NovTip2(new int[]{90, 19, 53, 64, 28, 12, 60, 65, 36}),
            new Tretja.Krogla(55),
            new Tretja.Krogla(28),
            new NovTip1(new int[]{20, 60, 33, 89, 16}),
            new NovTip1(new int[]{40, 59, 54, 33, 72, 24, 62, 13, 7}),
            new NovTip1(new int[]{87, 95, 57, 78}),
            new Tretja.Krogla(65),
            new NovTip2(new int[]{79, 17, 55, 54, 43, 42, 52, 2, 65}),
            new Tretja.Kvader(21, 5, 43),
            new NovTip2(new int[]{22, 8, 82, 93, 15, 97, 83}),
            new NovTip2(new int[]{46, 1, 95, 81, 70, 39, 51}),
            new NovTip2(new int[]{25, 40, 1, 15, 63, 28, 20, 6, 95, 7}),
            new Tretja.Krogla(85),
            new Tretja.Krog(56),
            new Tretja.Krogla(63),
            new Tretja.Kvader(19, 92, 100),
            new Tretja.Kvader(5, 79, 15),
            new Tretja.Pravokotnik(62, 91),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
