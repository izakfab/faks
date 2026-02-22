
import java.util.*;

public class Test13 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
    }

    private static class NovTip2 extends Tretja.Okrogel implements Tretja.TriD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
    }

    public static void main(String[] args) {
        int[] tabela = Tretja.klasificiraj(new Object[]{
            new Tretja.Kvader(59, 73, 21),
            new NovTip2(new int[]{34, 76, 35, 71, 94, 96}),
            new Tretja.Krog(76),
            new Tretja.Krog(69),
            new Tretja.Krog(36),
            new Tretja.Pravokotnik(48, 71),
            new Tretja.Krogla(93),
            new Tretja.Pravokotnik(74, 79),
            new NovTip2(new int[]{27, 14, 55, 75}),
            new NovTip2(new int[]{53, 31, 32, 39, 35, 59, 57, 72, 14, 7}),
            new Tretja.Pravokotnik(69, 78),
            new NovTip2(new int[]{59, 16, 86, 53, 31, 50, 11, 24, 98, 1}),
            new NovTip2(new int[]{95, 79, 99, 35, 100, 9, 99, 30, 50}),
            new Tretja.Krogla(70),
            new Tretja.Pravokotnik(12, 65),
            new Tretja.Kvader(55, 93, 60),
            new Tretja.Krogla(15),
            new NovTip2(new int[]{36, 48, 2, 42, 62, 22, 43, 17, 40}),
            new NovTip1(new int[]{69, 5, 10, 21, 41}),
            new Tretja.Krog(92),
            new NovTip1(new int[]{27, 90, 96, 57, 85, 15, 95, 83, 43, 53}),
            new NovTip1(new int[]{54, 89, 2, 56, 48, 5, 26, 82, 9}),
            new Tretja.Kvader(67, 27, 4),
            new NovTip1(new int[]{69, 51, 48}),
            new NovTip2(new int[]{72, 41, 65, 1, 56, 24, 99, 53, 90, 53}),
            new Tretja.Krogla(61),
            new Tretja.Krog(4),
            new NovTip1(new int[]{34, 11, 3, 12, 48, 30, 41, 50, 77, 7}),
            new Tretja.Kvader(11, 88, 69),
            new NovTip2(new int[]{37, 44, 85, 12, 13, 91, 1, 2, 11, 64}),
            new NovTip2(new int[]{83, 62, 82, 11}),
            new Tretja.Krogla(69),
            new NovTip1(new int[]{76, 38, 87}),
            new Tretja.Krog(93),
            new NovTip1(new int[]{50, 26, 18, 48, 3, 96, 25}),
            new NovTip2(new int[]{63, 49, 33, 98, 43, 89}),
            new Tretja.Pravokotnik(38, 42),
            new NovTip1(new int[]{44, 83, 78, 60, 89, 70, 75}),
            new Tretja.Krog(93),
            new Tretja.Kvader(67, 38, 66),
            new Tretja.Kvader(41, 5, 49),
            new NovTip2(new int[]{28, 16, 6, 95, 31, 80, 97, 51}),
            new NovTip1(new int[]{75, 55, 51, 72, 24, 28, 71, 65, 66, 42}),
            new Tretja.Kvader(49, 2, 49),
            new Tretja.Kvader(49, 74, 18),
            new Tretja.Kvader(100, 55, 6),
            new Tretja.Kvader(27, 40, 4),
            new NovTip1(new int[]{22, 90, 86, 66, 44, 83, 67, 88}),
            new Tretja.Kvader(91, 35, 42),
            new NovTip2(new int[]{42, 26, 26, 64}),
            new Tretja.Krog(75),
            new Tretja.Pravokotnik(55, 16),
            new NovTip1(new int[]{60, 16, 9, 77, 34, 99, 8}),
            new Tretja.Kvader(64, 49, 53),
            new Tretja.Krog(29),
            new Tretja.Pravokotnik(58, 54),
            new NovTip1(new int[]{69, 86}),
        });
        System.out.println(Arrays.toString(tabela));
    }
}
