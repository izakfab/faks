
import java.util.*;

public class Test42 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip3(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip3(%s)", Arrays.toString(this.stranice));
        }
    }

    private static class NovTip4 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip4(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip4(%s)", Arrays.toString(this.stranice));
        }
    }

    private static class NovTip5 extends Tretja.Oglat implements Tretja.TriD {
        public NovTip5(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip5(%s)", Arrays.toString(this.stranice));
        }
    }

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new NovTip5(new int[]{941, 905, 842, 659, 768, 144, 289, 981, 147, 318}),
            new NovTip1(new int[]{538, 140, 138, 662, 939, 22, 106, 875, 582, 33}),
            new NovTip3(new int[]{141, 904, 396, 345}),
            new NovTip2(new int[]{511, 844, 618, 678, 396, 477}),
            new NovTip2(new int[]{45, 265, 380, 137, 459, 170, 442, 651, 864, 672}),
            new Tretja.Pravokotnik(968, 981),
            new NovTip3(new int[]{318, 618, 331, 127, 94}),
            new Tretja.Pravokotnik(715, 104),
            new NovTip3(new int[]{327, 491, 972}),
            new NovTip5(new int[]{131, 882, 68, 73, 316, 545, 404, 633}),
            new Tretja.Kvader(817, 609, 500),
            new NovTip1(new int[]{825, 365, 206, 355, 163, 385, 622, 707}),
            new NovTip2(new int[]{877, 698, 268, 590, 223, 94, 908, 793, 346}),
            new Tretja.Kvader(654, 996, 657),
            new Tretja.Pravokotnik(663, 243),
            new NovTip4(new int[]{716, 373, 70, 128, 884, 198, 919, 651}),
            new NovTip4(new int[]{947, 68, 859, 79}),
            new NovTip5(new int[]{206, 288, 512}),
            new NovTip4(new int[]{564, 208, 646, 245}),
            new NovTip2(new int[]{546, 95, 552, 198, 892, 858, 397}),
            new NovTip4(new int[]{234, 903, 485, 959, 435}),
            new NovTip1(new int[]{491, 325, 840, 130, 909}),
            new NovTip1(new int[]{489, 59, 133, 823, 104}),
            new NovTip3(new int[]{609, 330, 398, 243, 579}),
            new NovTip2(new int[]{155, 509, 820, 934, 565, 745}),
            new Tretja.Kvader(872, 255, 608),
            new Tretja.Kvader(363, 393, 405),
            new NovTip4(new int[]{702, 757, 475, 679}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
