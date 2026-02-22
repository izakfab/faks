
import java.util.*;

public class Test04 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.TriD {
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

    private static class NovTip4 extends Tretja.Oglat implements Tretja.TriD {
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
            new NovTip5(new int[]{82, 77}),
            new Tretja.Pravokotnik(55, 18),
            new Tretja.Pravokotnik(33, 17),
            new NovTip5(new int[]{54, 59, 35, 82, 76, 81, 53, 24, 64}),
            new NovTip2(new int[]{21, 27, 5, 10, 66, 23, 6}),
            new NovTip3(new int[]{70, 41, 54, 95, 55, 76}),
            new NovTip5(new int[]{39, 62, 37}),
            new NovTip3(new int[]{80, 46, 23, 26, 83, 75, 88}),
            new Tretja.Kvader(43, 58, 92),
            new NovTip2(new int[]{78, 44, 21, 64, 32, 28, 53}),
            new Tretja.Krog(47),
            new NovTip3(new int[]{25, 16, 11, 88, 65, 47, 80, 7, 87, 45}),
            new Tretja.Kvader(38, 71, 8),
            new Tretja.Krogla(29),
            new NovTip2(new int[]{21, 15, 40, 37, 76, 71}),
            new NovTip2(new int[]{25, 59, 44}),
            new Tretja.Krog(54),
            new Tretja.Krog(57),
            new Tretja.Krogla(45),
            new Tretja.Krog(82),
            new NovTip1(new int[]{37, 81, 94, 57, 100, 72, 10, 20, 54}),
            new NovTip2(new int[]{57, 62, 38, 52, 39, 74, 33, 75}),
            new Tretja.Kvader(4, 57, 64),
            new NovTip5(new int[]{86, 85, 70}),
            new NovTip2(new int[]{93, 100, 52, 58, 38}),
            new Tretja.Pravokotnik(48, 82),
            new NovTip3(new int[]{21, 50, 80, 15, 81, 99, 97, 49, 1, 5}),
            new Tretja.Krog(49),
            new NovTip5(new int[]{74, 61, 90, 95, 7, 12, 77, 57, 42}),
            new Tretja.Kvader(17, 91, 72),
            new NovTip5(new int[]{60, 89, 58, 47, 62}),
            new NovTip1(new int[]{54, 86, 89, 33, 26, 66, 22, 44, 87, 59}),
            new NovTip3(new int[]{83, 96, 64, 76, 94, 40, 71}),
            new Tretja.Krog(20),
            new NovTip3(new int[]{32, 52, 65, 72}),
            new Tretja.Krogla(45),
            new NovTip3(new int[]{70, 74, 65, 20, 19, 86}),
            new Tretja.Pravokotnik(33, 39),
            new NovTip3(new int[]{76, 33, 3}),
            new Tretja.Krogla(28),
            new NovTip5(new int[]{56, 60, 12, 80, 28, 53, 50, 15}),
            new Tretja.Krog(17),
            new Tretja.Krogla(89),
            new Tretja.Kvader(73, 39, 20),
            new Tretja.Pravokotnik(45, 61),
            new Tretja.Krogla(36),
            new NovTip2(new int[]{56, 52, 96, 33, 46, 22, 57, 35}),
            new NovTip3(new int[]{83, 76, 37}),
            new Tretja.Krog(67),
            new NovTip1(new int[]{75, 91}),
            new NovTip5(new int[]{31, 62, 88, 62, 23, 64, 52, 94, 2}),
            new Tretja.Krog(51),
            new Tretja.Krogla(88),
            new NovTip3(new int[]{84, 60, 78, 47, 20, 27, 94}),
            new Tretja.Krogla(48),
            new Tretja.Kvader(34, 59, 78),
            new Tretja.Kvader(70, 21, 30),
            new Tretja.Pravokotnik(5, 60),
            new NovTip1(new int[]{36, 15, 15, 18, 64}),
            new NovTip2(new int[]{88, 56, 75}),
            new NovTip2(new int[]{69, 57, 87, 85, 97, 51, 8}),
            new Tretja.Pravokotnik(14, 81),
            new NovTip5(new int[]{19, 69, 1, 82, 58, 33, 62, 24, 34}),
            new Tretja.Pravokotnik(26, 52),
            new NovTip3(new int[]{87, 89, 48}),
            new NovTip1(new int[]{3, 14}),
            new Tretja.Krog(72),
            new NovTip5(new int[]{48, 31, 81, 14}),
            new Tretja.Krogla(28),
            new NovTip4(new int[]{79, 70, 27}),
            new Tretja.Kvader(70, 41, 34),
            new Tretja.Pravokotnik(49, 40),
            new NovTip2(new int[]{78, 32, 98, 32, 34, 22, 59}),
            new Tretja.Pravokotnik(49, 46),
            new Tretja.Krog(17),
            new NovTip1(new int[]{28, 15, 68, 72, 53}),
            new NovTip4(new int[]{32, 3, 35, 13, 47, 45, 77, 12, 13, 83}),
            new NovTip5(new int[]{11, 69, 14, 39, 26}),
            new NovTip3(new int[]{24, 93}),
            new Tretja.Krogla(84),
            new NovTip2(new int[]{98, 17, 12, 13, 63, 55, 86, 40}),
            new NovTip3(new int[]{68, 86, 2, 16}),
            new Tretja.Krogla(40),
            new NovTip2(new int[]{55, 55, 55, 35, 49}),
            new NovTip2(new int[]{28, 76, 96}),
            new Tretja.Pravokotnik(70, 25),
            new NovTip1(new int[]{42, 89, 6, 30}),
            new NovTip1(new int[]{59, 19, 58, 96, 44, 23, 40, 81, 23}),
            new Tretja.Krog(96),
            new NovTip2(new int[]{64, 32, 83}),
            new NovTip2(new int[]{67, 13, 42, 24, 41, 39, 31}),
            new NovTip5(new int[]{58, 7, 88, 10, 96, 35, 58, 40, 72}),
            new NovTip5(new int[]{19, 26, 80, 71, 100, 86, 2, 17}),
            new NovTip2(new int[]{30, 79, 89}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
