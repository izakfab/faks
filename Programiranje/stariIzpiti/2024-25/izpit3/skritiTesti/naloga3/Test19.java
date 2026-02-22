
import java.util.*;

public class Test19 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Kvader(5, 43, 30),
            new Tretja.Kvader(28, 14, 57),
            new Tretja.Krogla(13),
            new Tretja.Kvader(60, 39, 26),
            new NovTip1(new int[]{20, 82}),
            new Tretja.Pravokotnik(78, 68),
            new Tretja.Pravokotnik(49, 30),
            new NovTip1(new int[]{33, 95, 14, 61, 83, 95}),
            new Tretja.Pravokotnik(53, 47),
            new Tretja.Pravokotnik(6, 71),
            new Tretja.Krogla(4),
            new Tretja.Pravokotnik(91, 99),
            new NovTip1(new int[]{73, 9, 5, 21, 29, 13}),
            new Tretja.Krogla(45),
            new Tretja.Pravokotnik(27, 19),
            new Tretja.Krogla(21),
            new Tretja.Krog(53),
            new Tretja.Krog(6),
            new Tretja.Krogla(71),
            new Tretja.Krog(96),
            new NovTip1(new int[]{27, 21, 55, 68, 52, 16, 34, 89, 72, 85}),
            new Tretja.Pravokotnik(59, 10),
            new Tretja.Krog(88),
            new NovTip1(new int[]{87, 88, 80, 59, 18, 69, 93, 74}),
            new Tretja.Krog(48),
            new NovTip1(new int[]{72, 19, 9, 94, 19, 88, 12, 9, 55, 33}),
            new NovTip1(new int[]{45, 69, 95, 100, 91, 22, 87, 73, 3, 58}),
            new Tretja.Pravokotnik(98, 67),
            new NovTip1(new int[]{51, 63, 28, 50, 15, 98}),
            new Tretja.Pravokotnik(89, 6),
            new Tretja.Krog(80),
            new Tretja.Krog(79),
            new Tretja.Krogla(5),
            new Tretja.Krogla(86),
            new Tretja.Krog(45),
            new NovTip1(new int[]{95, 42, 90}),
            new Tretja.Krog(62),
            new Tretja.Krogla(47),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
