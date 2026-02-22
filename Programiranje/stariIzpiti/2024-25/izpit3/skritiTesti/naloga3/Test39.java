
import java.util.*;

public class Test39 {

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
            new NovTip5(new int[]{294, 173}),
            new NovTip2(new int[]{732, 927, 860, 57, 567, 894, 674, 600, 468, 903}),
            new Tretja.Kvader(705, 83, 781),
            new Tretja.Pravokotnik(504, 346),
            new NovTip2(new int[]{237, 761, 632, 614, 114, 789, 91, 842, 218}),
            new NovTip4(new int[]{657, 480, 827}),
            new Tretja.Kvader(144, 221, 623),
            new NovTip3(new int[]{862, 225, 906, 100}),
            new Tretja.Kvader(231, 959, 324),
            new NovTip1(new int[]{37, 934, 162, 861, 486, 327, 647, 20, 104, 320}),
            new NovTip3(new int[]{87, 239, 147, 802, 901, 640, 420, 852}),
            new Tretja.Kvader(764, 284, 199),
            new NovTip1(new int[]{93, 360, 135, 828, 814, 29, 605, 860}),
            new Tretja.Pravokotnik(326, 769),
            new NovTip3(new int[]{3, 526, 171}),
            new NovTip1(new int[]{971, 612, 99, 458, 985, 290, 727, 724, 515}),
            new NovTip4(new int[]{140, 440, 689, 49, 827, 882}),
            new NovTip1(new int[]{422, 424, 884, 287, 587}),
            new Tretja.Kvader(28, 226, 369),
            new Tretja.Kvader(143, 846, 14),
            new Tretja.Kvader(565, 983, 232),
            new Tretja.Pravokotnik(785, 443),
            new Tretja.Pravokotnik(207, 170),
            new NovTip5(new int[]{787, 672, 430, 111, 759}),
            new NovTip1(new int[]{217, 978, 53}),
            new NovTip4(new int[]{681, 328, 779, 426, 677, 578}),
            new NovTip3(new int[]{614, 903, 683, 886, 791, 10, 648}),
            new NovTip5(new int[]{972, 68, 367}),
            new NovTip4(new int[]{492, 192, 631}),
            new Tretja.Kvader(716, 106, 257),
            new NovTip2(new int[]{150, 208, 747, 615, 121}),
            new Tretja.Pravokotnik(497, 346),
            new Tretja.Kvader(430, 429, 289),
            new NovTip1(new int[]{924, 463, 544, 781, 589, 652, 798, 156}),
            new Tretja.Kvader(548, 863, 507),
            new NovTip5(new int[]{947, 870, 458, 168, 844}),
            new NovTip2(new int[]{474, 233, 792, 645, 522, 760, 612}),
            new NovTip4(new int[]{945, 333, 859, 898, 150, 626, 94, 644, 25, 671}),
            new NovTip2(new int[]{835, 311, 383, 962, 588, 589, 175}),
            new NovTip1(new int[]{110, 576, 730, 622, 907}),
            new Tretja.Kvader(591, 761, 830),
            new NovTip4(new int[]{892, 218, 175, 248, 29, 863}),
            new NovTip4(new int[]{643, 75, 385, 19, 672, 223}),
            new NovTip4(new int[]{768, 495, 576, 984, 603, 817, 832, 654}),
            new Tretja.Pravokotnik(925, 206),
            new NovTip1(new int[]{178, 59, 654, 827}),
            new NovTip1(new int[]{605, 258, 106, 663}),
            new NovTip4(new int[]{236, 543, 576, 173, 551, 908, 833, 263}),
            new NovTip5(new int[]{594, 91, 642, 298}),
            new NovTip3(new int[]{749, 601}),
            new NovTip2(new int[]{217, 233, 106, 981, 243}),
            new NovTip1(new int[]{693, 337, 538, 776, 541, 735}),
            new NovTip4(new int[]{990, 169, 363, 154, 715, 906, 274}),
            new Tretja.Pravokotnik(534, 781),
            new NovTip3(new int[]{594, 729, 333, 283, 194, 346, 771, 358, 674}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
