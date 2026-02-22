
import java.util.*;

public class Test31 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip1(%s)", Arrays.toString(this.stranice));
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip2(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip2(%s)", Arrays.toString(this.stranice));
        }
    }

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new Tretja.Kvader(545, 710, 957),
            new Tretja.Pravokotnik(495, 123),
            new NovTip2(new int[]{421, 155, 253, 315, 125, 359, 327, 574, 17, 166}),
            new Tretja.Pravokotnik(373, 666),
            new Tretja.Kvader(871, 505, 920),
            new Tretja.Pravokotnik(648, 985),
            new NovTip1(new int[]{46, 601, 377, 766, 361, 268, 612, 575, 35}),
            new NovTip1(new int[]{576, 574, 881, 208, 98, 680}),
            new NovTip2(new int[]{518, 283, 866, 677}),
            new Tretja.Kvader(980, 831, 462),
            new Tretja.Kvader(266, 629, 881),
            new NovTip2(new int[]{182, 299, 702, 739, 876, 630, 214}),
            new Tretja.Kvader(898, 368, 740),
            new NovTip2(new int[]{854, 496, 336}),
            new NovTip1(new int[]{311, 226, 476, 699, 246, 11, 538, 214}),
            new Tretja.Kvader(824, 615, 750),
            new Tretja.Kvader(957, 833, 506),
            new NovTip1(new int[]{342, 197, 271, 366, 459, 150, 583, 94, 450, 303}),
            new NovTip1(new int[]{158, 984}),
            new Tretja.Pravokotnik(985, 107),
            new Tretja.Pravokotnik(263, 390),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
