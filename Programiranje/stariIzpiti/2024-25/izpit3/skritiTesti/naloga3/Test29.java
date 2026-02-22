
import java.util.*;

public class Test29 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.DvaD {
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

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new Tretja.Kvader(284, 239, 15),
            new Tretja.Kvader(371, 923, 299),
            new NovTip3(new int[]{418, 271}),
            new Tretja.Kvader(559, 886, 175),
            new NovTip4(new int[]{874, 430, 573, 222, 923, 322, 806, 944, 13, 190}),
            new NovTip1(new int[]{979, 714}),
            new NovTip3(new int[]{348, 424, 609, 418, 476, 254, 900, 379, 569}),
            new Tretja.Kvader(593, 128, 825),
            new Tretja.Pravokotnik(878, 737),
            new NovTip3(new int[]{285, 590, 145, 872, 120, 520, 426, 377, 615}),
            new NovTip4(new int[]{699, 968, 200, 119, 755, 986, 833}),
            new NovTip2(new int[]{698, 711}),
            new NovTip1(new int[]{90, 361, 656, 852, 636, 911, 134, 520}),
            new NovTip3(new int[]{265, 971, 136, 744, 989, 40, 824, 999, 63, 905}),
            new Tretja.Pravokotnik(863, 36),
            new NovTip3(new int[]{272, 248, 576, 325, 788, 145}),
            new NovTip1(new int[]{188, 978, 758, 997, 222}),
            new Tretja.Kvader(596, 425, 891),
            new NovTip3(new int[]{508, 200, 849, 741, 834, 831, 614, 14}),
            new NovTip3(new int[]{12, 525, 932, 163, 839, 275}),
            new NovTip3(new int[]{334, 919, 237, 298, 751}),
            new Tretja.Kvader(933, 336, 234),
            new Tretja.Pravokotnik(901, 400),
            new NovTip4(new int[]{924, 654, 405}),
            new NovTip1(new int[]{184, 610, 579, 60, 338, 764}),
            new NovTip2(new int[]{735, 447, 735, 137}),
            new NovTip2(new int[]{159, 784, 145, 52}),
            new NovTip4(new int[]{776, 494, 809, 394, 260, 62, 115}),
            new Tretja.Pravokotnik(317, 243),
            new Tretja.Pravokotnik(316, 881),
            new NovTip2(new int[]{577, 472}),
            new Tretja.Kvader(32, 746, 121),
            new NovTip1(new int[]{245, 446, 707, 439, 367}),
            new NovTip2(new int[]{474, 11, 341, 935, 780, 103, 723}),
            new NovTip4(new int[]{800, 678, 594, 504, 276, 486, 112}),
            new NovTip2(new int[]{367, 461, 40, 299, 44, 547, 307, 531, 906, 307}),
            new NovTip2(new int[]{29, 272, 135, 678, 281, 202, 949}),
            new NovTip4(new int[]{895, 277}),
            new NovTip4(new int[]{869, 51, 959, 115, 383, 638, 574, 26, 344}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
