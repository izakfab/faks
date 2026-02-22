
import java.util.*;

public class Test10 {

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
            new Tretja.Kvader(9, 63, 76),
            new Tretja.Krogla(91),
            new Tretja.Krog(25),
            new NovTip1(new int[]{68, 10, 88, 68}),
            new Tretja.Pravokotnik(18, 13),
            new Tretja.Krog(50),
            new Tretja.Kvader(7, 94, 50),
            new Tretja.Krogla(43),
            new Tretja.Krogla(79),
            new Tretja.Pravokotnik(68, 64),
            new Tretja.Pravokotnik(3, 84),
            new NovTip1(new int[]{57, 62, 93, 59, 5, 3, 34, 7, 31, 57}),
            new NovTip1(new int[]{92, 33}),
            new Tretja.Krog(70),
            new Tretja.Pravokotnik(47, 69),
            new Tretja.Krog(25),
            new Tretja.Pravokotnik(24, 77),
            new NovTip1(new int[]{3, 12, 10, 100, 98, 27, 44, 92, 12, 96}),
            new Tretja.Kvader(91, 90, 62),
            new Tretja.Kvader(80, 4, 68),
            new Tretja.Krog(16),
            new NovTip1(new int[]{50, 30, 73, 43, 35, 26}),
            new Tretja.Kvader(31, 67, 31),
            new NovTip1(new int[]{4, 28}),
            new NovTip1(new int[]{67, 20}),
            new Tretja.Krog(22),
            new NovTip1(new int[]{52, 83, 28, 70}),
            new Tretja.Krogla(84),
            new NovTip2(new int[]{50, 60, 13, 94, 47, 46}),
            new Tretja.Pravokotnik(1, 45),
            new Tretja.Krogla(54),
            new NovTip2(new int[]{98, 25, 64, 73, 82, 61}),
            new NovTip2(new int[]{22, 7}),
            new Tretja.Pravokotnik(77, 39),
            new Tretja.Krog(8),
            new Tretja.Kvader(21, 72, 77),
            new Tretja.Krog(10),
            new Tretja.Kvader(44, 18, 36),
            new NovTip1(new int[]{23, 4, 66}),
            new NovTip2(new int[]{83, 30, 60, 5, 71}),
            new Tretja.Krogla(49),
            new Tretja.Kvader(40, 75, 69),
            new NovTip2(new int[]{73, 18, 39, 22, 12, 22, 5}),
            new Tretja.Krog(90),
            new NovTip1(new int[]{80, 41, 64, 78, 62}),
            new Tretja.Krog(39),
            new NovTip2(new int[]{77, 87, 95, 39, 97, 16, 10}),
            new NovTip2(new int[]{26, 5, 51, 70}),
            new NovTip2(new int[]{73, 27, 82, 50, 59, 47, 33, 96}),
            new Tretja.Kvader(24, 43, 38),
            new Tretja.Krogla(18),
            new NovTip2(new int[]{72, 48, 14, 93, 97}),
            new Tretja.Krog(54),
            new Tretja.Krogla(61),
            new Tretja.Krog(2),
            new NovTip2(new int[]{45, 35, 40, 3, 25, 94, 77, 48}),
            new Tretja.Krogla(92),
            new Tretja.Kvader(77, 99, 10),
            new NovTip1(new int[]{71, 82, 26}),
            new NovTip1(new int[]{48, 92, 83, 12, 47, 82, 56, 55, 72}),
            new Tretja.Pravokotnik(65, 43),
            new Tretja.Krogla(77),
            new NovTip2(new int[]{65, 96}),
            new Tretja.Krog(71),
            new Tretja.Pravokotnik(82, 26),
            new Tretja.Krog(38),
            new Tretja.Kvader(87, 9, 52),
            new Tretja.Pravokotnik(26, 70),
            new Tretja.Pravokotnik(2, 95),
            new Tretja.Krog(24),
            new NovTip1(new int[]{15, 7}),
            new NovTip1(new int[]{14, 75, 5, 22, 100, 86, 55, 69}),
            new Tretja.Krogla(44),
            new Tretja.Pravokotnik(57, 72),
            new NovTip1(new int[]{77, 21, 90}),
            new Tretja.Kvader(58, 93, 68),
            new NovTip1(new int[]{88, 25, 3}),
            new Tretja.Krogla(49),
            new Tretja.Kvader(64, 91, 29),
            new NovTip2(new int[]{68, 30, 15, 20, 62, 7, 45, 83, 92}),
            new NovTip2(new int[]{6, 44, 47, 42, 55}),
            new Tretja.Krogla(26),
            new Tretja.Krogla(68),
            new NovTip1(new int[]{84, 7}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
