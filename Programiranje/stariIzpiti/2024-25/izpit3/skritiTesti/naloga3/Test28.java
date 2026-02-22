
import java.util.*;

public class Test28 {

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
            new Tretja.Pravokotnik(765, 276),
            new NovTip5(new int[]{324, 197, 294, 53, 201, 243, 621}),
            new NovTip4(new int[]{824, 85, 963, 577}),
            new NovTip5(new int[]{447, 281, 199, 747}),
            new NovTip5(new int[]{140, 392, 908, 952, 440, 871, 588}),
            new NovTip2(new int[]{153, 772, 423, 287, 667}),
            new NovTip4(new int[]{122, 452, 226, 984, 765, 636, 257}),
            new NovTip3(new int[]{966, 637, 692, 986, 855, 716, 578, 639, 22, 1}),
            new Tretja.Pravokotnik(633, 393),
            new NovTip2(new int[]{937, 543}),
            new Tretja.Kvader(415, 94, 811),
            new NovTip4(new int[]{343, 820, 214, 981, 768}),
            new NovTip1(new int[]{819, 96}),
            new NovTip4(new int[]{352, 673, 540, 651, 131, 408}),
            new NovTip1(new int[]{758, 271, 887, 906}),
            new Tretja.Pravokotnik(331, 791),
            new Tretja.Pravokotnik(638, 225),
            new Tretja.Pravokotnik(240, 613),
            new Tretja.Pravokotnik(849, 170),
            new NovTip2(new int[]{809, 159, 425, 446, 211, 995, 75}),
            new NovTip3(new int[]{61, 725, 716, 933, 149, 660, 668, 898, 797, 857}),
            new NovTip2(new int[]{835, 373}),
            new NovTip2(new int[]{458, 336, 972, 494, 337, 947, 926}),
            new Tretja.Pravokotnik(539, 442),
            new NovTip1(new int[]{397, 48, 957, 367}),
            new NovTip3(new int[]{203, 59, 344, 408, 277}),
            new NovTip1(new int[]{598, 185, 575, 621, 676, 522, 221, 970, 799}),
            new NovTip3(new int[]{773, 696, 964}),
            new Tretja.Kvader(282, 44, 762),
            new NovTip4(new int[]{262, 399, 5, 74, 208, 934, 832, 347, 996, 943}),
            new NovTip1(new int[]{759, 650, 341, 300, 811, 570, 478, 908, 493, 316}),
            new Tretja.Kvader(12, 188, 940),
            new NovTip4(new int[]{707, 831, 435, 476, 300}),
            new Tretja.Kvader(715, 911, 307),
            new Tretja.Kvader(932, 374, 189),
            new NovTip4(new int[]{617, 516}),
            new NovTip5(new int[]{719, 359, 901, 274, 669, 368}),
            new Tretja.Kvader(390, 34, 885),
            new NovTip5(new int[]{133, 717, 835, 542, 726, 427}),
            new Tretja.Kvader(184, 423, 698),
            new Tretja.Kvader(198, 377, 249),
            new Tretja.Pravokotnik(29, 673),
            new NovTip2(new int[]{516, 467}),
            new NovTip2(new int[]{824, 390, 141, 568}),
            new NovTip4(new int[]{873, 824, 509}),
            new Tretja.Kvader(342, 225, 411),
            new NovTip3(new int[]{735, 707, 783, 755, 914, 413, 756, 133, 225}),
            new NovTip1(new int[]{189, 892, 225, 501, 117, 989, 44, 338}),
            new Tretja.Kvader(786, 217, 31),
            new Tretja.Kvader(379, 277, 891),
            new NovTip3(new int[]{933, 679, 383, 544, 898, 524, 608, 2}),
            new Tretja.Pravokotnik(833, 372),
            new Tretja.Kvader(202, 659, 639),
            new NovTip5(new int[]{920, 925, 755, 837, 987}),
            new NovTip2(new int[]{955, 965}),
            new NovTip5(new int[]{937, 848, 801, 342, 251, 354, 322, 545, 939, 895}),
            new NovTip2(new int[]{803, 83, 400, 963, 14, 954}),
            new NovTip2(new int[]{115, 714, 491, 708, 964, 495, 526, 381, 198}),
            new NovTip5(new int[]{402, 818, 140, 192, 511, 111}),
            new Tretja.Pravokotnik(306, 665),
            new NovTip5(new int[]{799, 580, 175, 587, 67, 909, 743}),
            new NovTip3(new int[]{865, 848, 639, 143, 812, 729, 346, 408, 828, 337}),
            new NovTip2(new int[]{552, 834}),
            new NovTip3(new int[]{676, 582, 141, 429, 149, 398, 936, 652, 71, 231}),
            new NovTip4(new int[]{686, 935, 619}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
