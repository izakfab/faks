
import java.util.*;

public class Test15 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.TriD {
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
            new Tretja.Pravokotnik(85, 60),
            new Tretja.Pravokotnik(16, 27),
            new Tretja.Krogla(33),
            new NovTip3(new int[]{53, 29, 9}),
            new Tretja.Krogla(60),
            new NovTip2(new int[]{9, 13, 28}),
            new Tretja.Krog(44),
            new NovTip1(new int[]{39, 96, 59, 80, 17}),
            new Tretja.Pravokotnik(69, 72),
            new Tretja.Krog(38),
            new Tretja.Krog(1),
            new Tretja.Pravokotnik(11, 63),
            new Tretja.Krogla(71),
            new Tretja.Krog(19),
            new Tretja.Krog(4),
            new Tretja.Pravokotnik(94, 15),
            new Tretja.Krog(13),
            new Tretja.Pravokotnik(7, 3),
            new Tretja.Kvader(59, 97, 93),
            new Tretja.Krogla(13),
            new NovTip3(new int[]{30, 54, 47, 75, 65, 32, 83, 83, 87, 64}),
            new NovTip1(new int[]{78, 30, 52, 8, 37, 9, 51, 33, 32}),
            new NovTip1(new int[]{34, 36, 83}),
            new Tretja.Krog(8),
            new NovTip2(new int[]{93, 28, 92, 33, 81, 38, 75, 20}),
            new NovTip2(new int[]{13, 71, 80, 74, 79, 93, 29}),
            new Tretja.Pravokotnik(38, 46),
            new Tretja.Krog(20),
            new NovTip1(new int[]{93, 10}),
            new NovTip3(new int[]{71, 6, 62, 76, 73, 55}),
            new NovTip1(new int[]{60, 50, 78, 93, 53, 86, 47, 34, 11, 97}),
            new Tretja.Kvader(57, 4, 35),
            new Tretja.Pravokotnik(42, 36),
            new NovTip3(new int[]{17, 66, 23, 93}),
            new NovTip2(new int[]{8, 71, 59, 77, 71, 37, 68, 84, 21, 36}),
            new NovTip3(new int[]{87, 44, 23, 65, 71}),
            new Tretja.Pravokotnik(25, 20),
            new Tretja.Krog(33),
            new Tretja.Pravokotnik(5, 73),
            new NovTip3(new int[]{19, 27, 19}),
            new Tretja.Kvader(13, 37, 64),
            new Tretja.Krog(47),
            new NovTip1(new int[]{84, 100, 84}),
            new Tretja.Krog(54),
            new Tretja.Pravokotnik(58, 98),
            new Tretja.Pravokotnik(41, 30),
            new NovTip3(new int[]{53, 29, 77, 98}),
            new Tretja.Krog(30),
            new NovTip1(new int[]{39, 7, 34, 54, 55, 3, 62, 22, 7}),
            new Tretja.Krogla(81),
            new Tretja.Pravokotnik(83, 13),
            new Tretja.Krog(4),
            new NovTip2(new int[]{30, 29, 9, 79, 98, 31, 38, 33, 88, 14}),
            new NovTip2(new int[]{46, 53, 67, 50, 54, 79, 33, 20}),
            new NovTip2(new int[]{39, 46}),
            new NovTip3(new int[]{94, 15, 73, 94, 59, 15, 11, 31}),
            new Tretja.Krog(97),
            new NovTip3(new int[]{27, 96, 36, 53}),
            new Tretja.Krog(53),
            new Tretja.Krog(74),
            new Tretja.Krog(56),
            new Tretja.Krog(68),
            new Tretja.Pravokotnik(5, 63),
            new NovTip3(new int[]{58, 59, 46, 43}),
            new Tretja.Kvader(9, 90, 14),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
