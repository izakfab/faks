
import java.util.*;

public class Test50 {

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
            new Tretja.Pravokotnik(517, 985),
            new NovTip2(new int[]{894, 502, 305}),
            new Tretja.Pravokotnik(213, 590),
            new NovTip1(new int[]{531, 806}),
            new NovTip1(new int[]{776, 343, 634, 526}),
            new Tretja.Kvader(916, 291, 440),
            new Tretja.Kvader(676, 234, 931),
            new NovTip1(new int[]{858, 430, 565, 836, 502, 902, 738}),
            new Tretja.Pravokotnik(157, 151),
            new Tretja.Kvader(373, 707, 409),
            new NovTip2(new int[]{234, 691, 610, 522, 929, 886, 175}),
            new NovTip1(new int[]{207, 395, 157, 85, 190, 965, 264, 680, 549, 895}),
            new Tretja.Kvader(660, 808, 151),
            new Tretja.Pravokotnik(288, 956),
            new Tretja.Kvader(412, 999, 758),
            new NovTip1(new int[]{482, 391, 722, 304, 84, 29, 469, 428, 825}),
            new NovTip1(new int[]{184, 974, 475, 708, 956, 761, 349}),
            new Tretja.Pravokotnik(516, 563),
            new Tretja.Kvader(820, 976, 815),
            new Tretja.Kvader(581, 454, 922),
            new Tretja.Kvader(999, 551, 116),
            new Tretja.Kvader(252, 381, 60),
            new NovTip2(new int[]{342, 820, 403, 343, 557, 42, 614}),
            new Tretja.Kvader(416, 927, 355),
            new NovTip1(new int[]{620, 654, 991, 83, 88, 99}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
