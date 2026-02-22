
import java.util.*;

public class Test41 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip3(%s)", Arrays.toString(this.stranice));
        }
    }

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new NovTip1(new int[]{990, 230, 61, 983, 527, 758}),
            new NovTip2(new int[]{774, 431}),
            new Tretja.Kvader(133, 595, 856),
            new NovTip3(new int[]{405, 886, 600, 161, 871}),
            new Tretja.Kvader(360, 7, 893),
            new Tretja.Pravokotnik(414, 427),
            new Tretja.Pravokotnik(805, 818),
            new Tretja.Kvader(202, 665, 941),
            new NovTip1(new int[]{148, 491, 947, 282, 333, 934, 305, 484, 706, 536}),
            new Tretja.Pravokotnik(520, 811),
            new Tretja.Pravokotnik(838, 410),
            new Tretja.Kvader(293, 455, 562),
            new NovTip2(new int[]{844, 767, 848, 459, 395, 395}),
            new NovTip3(new int[]{798, 349, 398, 340, 831, 382, 197}),
            new Tretja.Pravokotnik(267, 918),
            new NovTip1(new int[]{830, 283, 807}),
            new Tretja.Kvader(124, 276, 880),
            new Tretja.Pravokotnik(852, 332),
            new NovTip1(new int[]{942, 657, 327, 387, 324, 535, 485, 972, 719}),
            new Tretja.Pravokotnik(877, 75),
            new Tretja.Kvader(543, 516, 217),
            new NovTip3(new int[]{112, 143, 117, 193, 249, 575, 475, 600, 223}),
            new Tretja.Pravokotnik(870, 392),
            new NovTip1(new int[]{438, 149, 555, 276, 842, 545, 787, 638}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
