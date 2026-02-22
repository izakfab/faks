
import java.util.*;

public class Test04 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip3 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip4 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip5 extends Tretja.Okrogel implements Tretja.DvaD {
        public NovTip5(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Pravokotnik(20, 1),
            new NovTip4(new int[]{65, 51}),
            new Tretja.Krogla(48),
            new NovTip1(new int[]{26, 49, 49, 64, 43, 57, 21, 3, 69, 52}),
            new NovTip3(new int[]{18, 3, 53, 17, 53, 28, 70}),
            new NovTip3(new int[]{66, 65, 7, 10, 63, 59, 64, 58}),
            new Tretja.Kvader(63, 35, 84),
            new Tretja.Krogla(5),
            new NovTip5(new int[]{37, 78, 83, 24, 99}),
            new NovTip1(new int[]{58, 25, 1, 62, 16}),
            new NovTip1(new int[]{87, 41, 86, 82, 77, 18, 42, 41}),
            new Tretja.Kvader(52, 48, 1),
            new Tretja.Krogla(71),
            new NovTip4(new int[]{13, 44, 4}),
            new Tretja.Krogla(37),
            new Tretja.Kvader(48, 10, 20),
            new Tretja.Kvader(72, 42, 35),
            new Tretja.Kvader(24, 74, 15),
            new Tretja.Pravokotnik(6, 44),
            new NovTip4(new int[]{98, 81, 68, 40, 7, 44, 7, 67}),
            new NovTip1(new int[]{17, 27}),
            new NovTip2(new int[]{11, 72, 24, 66, 51, 48, 67, 80}),
            new Tretja.Kvader(72, 41, 51),
            new NovTip1(new int[]{93, 46, 84, 59, 27, 6}),
            new NovTip1(new int[]{42, 15, 8, 38, 54, 41, 89, 22}),
            new NovTip1(new int[]{45, 38, 66}),
            new Tretja.Krog(20),
            new NovTip2(new int[]{20, 17, 45, 34, 51, 49}),
            new Tretja.Krogla(50),
            new Tretja.Krog(30),
            new NovTip3(new int[]{40, 5, 50, 88, 62, 66, 30, 58, 52}),
            new NovTip1(new int[]{67, 71}),
            new NovTip3(new int[]{69, 38, 52, 54, 54, 100, 45}),
            new Tretja.Krog(14),
            new Tretja.Krogla(91),
            new Tretja.Krog(17),
            new Tretja.Krogla(5),
            new Tretja.Krogla(93),
            new Tretja.Krog(85),
            new Tretja.Kvader(50, 16, 63),
            new NovTip4(new int[]{90, 52, 73, 13}),
            new Tretja.Kvader(19, 45, 20),
            new NovTip1(new int[]{17, 31, 88, 38, 95, 64, 8, 22, 93}),
            new NovTip3(new int[]{7, 96, 95, 79}),
            new Tretja.Krogla(31),
            new NovTip5(new int[]{8, 94, 32, 19, 61}),
            new Tretja.Kvader(87, 58, 100),
            new Tretja.Krog(97),
            new Tretja.Kvader(81, 42, 62),
            new NovTip2(new int[]{7, 6, 83, 96, 52, 42, 6, 62, 52}),
            new Tretja.Pravokotnik(19, 66),
            new NovTip2(new int[]{56, 75, 82, 34}),
            new Tretja.Krog(21),
            new Tretja.Krog(95),
            new NovTip4(new int[]{72, 8}),
            new NovTip1(new int[]{57, 50}),
            new Tretja.Kvader(36, 17, 81),
            new NovTip5(new int[]{29, 10, 81, 50, 80, 82, 41, 49, 62, 85}),
            new NovTip5(new int[]{51, 24, 52, 39, 37, 86, 34, 38}),
            new Tretja.Krog(33),
            new NovTip4(new int[]{36, 53, 16, 49, 94, 13, 56, 11, 21}),
            new NovTip5(new int[]{54, 96, 95, 90, 58, 49, 37}),
            new Tretja.Krogla(94),
            new NovTip3(new int[]{74, 98, 69, 61, 37, 47, 24}),
            new Tretja.Pravokotnik(61, 42),
            new NovTip3(new int[]{52, 86, 87}),
            new Tretja.Kvader(22, 81, 8),
            new NovTip3(new int[]{54, 77, 89, 82}),
            new NovTip2(new int[]{61, 99, 93, 100, 17}),
            new Tretja.Krogla(25),
            new NovTip5(new int[]{62, 40, 79, 77, 51, 26, 92, 8, 41, 91}),
            new Tretja.Krog(6),
            new Tretja.Krogla(69),
            new NovTip1(new int[]{7, 25, 16}),
            new Tretja.Krog(17),
            new Tretja.Krog(99),
            new NovTip4(new int[]{66, 61, 22, 29, 88}),
            new Tretja.Pravokotnik(68, 53),
            new NovTip3(new int[]{16, 28, 28, 30, 6, 70}),
            new Tretja.Pravokotnik(74, 28),
            new Tretja.Pravokotnik(51, 33),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
