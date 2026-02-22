
import java.util.*;

public class Test02 {

    private static class NovTip1 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Krogla(41),
            new NovTip1(new int[]{70, 12}),
            new Tretja.Krog(45),
            new Tretja.Krogla(77),
            new Tretja.Kvader(6, 44, 26),
            new NovTip1(new int[]{74, 39, 75, 32, 64}),
            new Tretja.Krogla(34),
            new Tretja.Krog(7),
            new Tretja.Pravokotnik(87, 73),
            new Tretja.Kvader(78, 60, 34),
            new Tretja.Krogla(45),
            new NovTip1(new int[]{99, 52, 83, 91, 54, 40}),
            new NovTip1(new int[]{78, 46, 32, 70, 79, 48, 39, 69, 73, 45}),
            new Tretja.Krog(35),
            new NovTip1(new int[]{52, 70, 58, 22, 54, 66, 70, 64}),
            new Tretja.Krog(94),
            new Tretja.Kvader(88, 90, 21),
            new NovTip1(new int[]{68, 93, 30, 99}),
            new Tretja.Krog(67),
            new Tretja.Pravokotnik(48, 37),
            new Tretja.Kvader(29, 89, 99),
            new Tretja.Pravokotnik(7, 75),
            new Tretja.Krog(44),
            new Tretja.Kvader(8, 1, 27),
            new Tretja.Krog(53),
            new Tretja.Pravokotnik(30, 82),
            new Tretja.Kvader(88, 24, 77),
            new Tretja.Kvader(78, 21, 1),
            new NovTip1(new int[]{67, 52, 44}),
            new NovTip1(new int[]{23, 46, 66, 66, 25}),
            new Tretja.Krog(69),
            new Tretja.Pravokotnik(62, 24),
            new Tretja.Krog(75),
            new Tretja.Pravokotnik(63, 92),
            new Tretja.Kvader(97, 83, 49),
            new Tretja.Krogla(48),
            new NovTip1(new int[]{11, 50, 25, 75, 80, 93, 26, 47}),
            new Tretja.Kvader(51, 10, 57),
            new Tretja.Krogla(82),
            new Tretja.Krogla(13),
            new Tretja.Kvader(34, 37, 86),
            new Tretja.Kvader(16, 66, 65),
            new NovTip1(new int[]{16, 59, 75, 73, 58}),
            new NovTip1(new int[]{43, 89, 28, 67, 55, 68, 48}),
            new NovTip1(new int[]{88, 52, 77, 43, 99, 22, 36}),
            new Tretja.Pravokotnik(22, 61),
            new Tretja.Kvader(12, 65, 9),
            new Tretja.Pravokotnik(23, 84),
            new Tretja.Pravokotnik(24, 53),
            new Tretja.Krogla(61),
            new Tretja.Pravokotnik(32, 76),
            new Tretja.Kvader(98, 37, 88),
            new Tretja.Krogla(40),
            new NovTip1(new int[]{74, 98, 10, 27, 9, 65, 26, 14, 29, 91}),
            new Tretja.Pravokotnik(27, 68),
            new NovTip1(new int[]{96, 63, 80, 3, 58, 46, 58, 34, 75, 39}),
            new Tretja.Kvader(22, 69, 39),
            new Tretja.Kvader(5, 24, 29),
            new Tretja.Pravokotnik(31, 14),
            new Tretja.Krog(60),
            new Tretja.Krog(83),
            new Tretja.Pravokotnik(1, 90),
            new Tretja.Krog(59),
            new Tretja.Pravokotnik(87, 62),
            new Tretja.Kvader(75, 79, 22),
            new Tretja.Krog(72),
            new Tretja.Krog(80),
            new Tretja.Pravokotnik(37, 23),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
