
import java.util.*;

public class Test22 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new NovTip1(new int[]{25, 75, 16, 31, 58, 16, 26, 48, 75, 35}),
            new Tretja.Pravokotnik(86, 28),
            new Tretja.Kvader(100, 31, 4),
            new Tretja.Kvader(36, 26, 42),
            new Tretja.Pravokotnik(57, 48),
            new Tretja.Kvader(96, 3, 100),
            new Tretja.Krog(11),
            new Tretja.Krog(94),
            new Tretja.Kvader(97, 79, 52),
            new Tretja.Krogla(96),
            new Tretja.Pravokotnik(1, 49),
            new Tretja.Pravokotnik(50, 75),
            new Tretja.Kvader(64, 61, 17),
            new Tretja.Krog(50),
            new Tretja.Krogla(59),
            new Tretja.Krog(67),
            new Tretja.Kvader(33, 3, 50),
            new Tretja.Krog(29),
            new Tretja.Pravokotnik(24, 59),
            new Tretja.Pravokotnik(66, 89),
            new NovTip1(new int[]{29, 18, 71, 75, 39, 76, 81, 12}),
            new Tretja.Kvader(64, 17, 87),
            new Tretja.Krogla(18),
            new Tretja.Krog(77),
            new Tretja.Kvader(13, 12, 93),
            new Tretja.Pravokotnik(25, 81),
            new NovTip1(new int[]{36, 60, 41, 56, 23, 41, 64, 9}),
            new Tretja.Krog(70),
            new Tretja.Krog(91),
            new Tretja.Pravokotnik(33, 50),
            new Tretja.Kvader(29, 39, 16),
            new Tretja.Pravokotnik(44, 91),
            new NovTip1(new int[]{89, 63, 65, 97, 60, 66, 83}),
            new Tretja.Pravokotnik(80, 13),
            new Tretja.Pravokotnik(28, 14),
            new Tretja.Krogla(31),
            new Tretja.Kvader(17, 80, 92),
            new Tretja.Krogla(2),
            new NovTip1(new int[]{80, 93, 78, 38, 88, 94, 47}),
            new Tretja.Krogla(29),
            new Tretja.Pravokotnik(27, 97),
            new Tretja.Pravokotnik(82, 84),
            new Tretja.Pravokotnik(100, 17),
            new NovTip1(new int[]{7, 26, 56, 23, 61, 61, 65, 20, 49, 24}),
            new Tretja.Krog(77),
            new NovTip1(new int[]{34, 39, 15, 65, 9, 91, 57, 20}),
            new NovTip1(new int[]{32, 29, 4, 43, 55}),
            new Tretja.Pravokotnik(61, 47),
            new Tretja.Krogla(54),
            new Tretja.Krog(63),
            new Tretja.Krogla(5),
            new Tretja.Krogla(4),
            new NovTip1(new int[]{16, 52, 11}),
            new Tretja.Kvader(49, 58, 98),
            new Tretja.Krog(65),
            new Tretja.Pravokotnik(7, 42),
            new NovTip1(new int[]{97, 21, 67, 20, 48, 93, 56, 49, 95, 46}),
            new NovTip1(new int[]{7, 87}),
            new Tretja.Krog(25),
            new Tretja.Krogla(27),
            new Tretja.Kvader(41, 49, 52),
            new Tretja.Krog(16),
            new Tretja.Krogla(28),
            new Tretja.Pravokotnik(90, 35),
            new NovTip1(new int[]{44, 94, 38, 72, 72, 8, 19, 89, 82}),
            new Tretja.Krog(89),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
