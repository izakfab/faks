
import java.util.*;

public class Test38 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip3(%s)", Arrays.toString(this.stranice));
        }
    }

    private static class NovTip4 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip4(%s)", Arrays.toString(this.stranice));
        }
    }

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new Tretja.Kvader(961, 897, 654),
            new Tretja.Pravokotnik(164, 411),
            new NovTip3(new int[]{548, 479}),
            new NovTip4(new int[]{782, 51, 345, 920, 55, 325, 982, 70, 26, 605}),
            new Tretja.Kvader(648, 865, 554),
            new NovTip1(new int[]{183, 150, 315}),
            new Tretja.Pravokotnik(648, 638),
            new NovTip2(new int[]{483, 434, 945, 257, 726, 518, 346, 544, 692}),
            new Tretja.Kvader(275, 510, 365),
            new Tretja.Kvader(233, 153, 342),
            new NovTip3(new int[]{57, 132, 794, 958, 315, 597, 115, 188, 524}),
            new NovTip4(new int[]{940, 723, 403, 154}),
            new Tretja.Kvader(657, 836, 787),
            new NovTip2(new int[]{186, 980, 19, 529, 144}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
