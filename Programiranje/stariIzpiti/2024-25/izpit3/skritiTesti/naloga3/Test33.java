
import java.util.*;

public class Test33 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip1(%s)", Arrays.toString(this.stranice));
        }
    }

    private static class NovTip2 extends Tretja.Oglat implements Tretja.TriD {
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
            new NovTip2(new int[]{362, 662, 540, 862, 394, 71, 22, 390, 761}),
            new Tretja.Kvader(970, 464, 404),
            new NovTip1(new int[]{819, 510, 457}),
            new Tretja.Kvader(624, 377, 74),
            new Tretja.Pravokotnik(549, 431),
            new Tretja.Kvader(50, 164, 234),
            new NovTip1(new int[]{586, 696, 783, 984, 763, 13, 151}),
            new NovTip2(new int[]{937, 232, 199, 415}),
            new NovTip2(new int[]{878, 888, 318, 937, 460, 491, 962, 927, 962, 796}),
            new Tretja.Kvader(941, 681, 728),
            new Tretja.Kvader(927, 451, 892),
            new Tretja.Pravokotnik(23, 810),
            new NovTip1(new int[]{763, 235, 62, 647, 686, 858}),
            new Tretja.Pravokotnik(67, 302),
            new Tretja.Kvader(639, 180, 185),
            new NovTip1(new int[]{803, 932, 605}),
            new Tretja.Pravokotnik(290, 221),
            new Tretja.Pravokotnik(3, 870),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
