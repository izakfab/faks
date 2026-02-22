
import java.util.*;

public class Test32 {

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
            new NovTip2(new int[]{375, 19, 961, 235, 833, 548, 26, 316, 431}),
            new NovTip1(new int[]{279, 153, 360, 965}),
            new Tretja.Kvader(785, 351, 740),
            new NovTip3(new int[]{588, 511, 354, 182, 400, 760, 122, 693, 698, 556}),
            new Tretja.Pravokotnik(781, 910),
            new Tretja.Kvader(295, 356, 392),
            new NovTip1(new int[]{393, 142, 313, 648, 385, 961, 777, 755, 680}),
            new NovTip2(new int[]{585, 354, 91, 318, 968, 224, 440, 913}),
            new Tretja.Kvader(927, 438, 415),
            new NovTip1(new int[]{77, 722, 652, 90, 394, 743, 55, 944, 712, 549}),
            new Tretja.Pravokotnik(114, 143),
            new NovTip3(new int[]{767, 148, 145, 54, 216, 773, 838}),
            new NovTip2(new int[]{780, 997, 68, 138}),
            new Tretja.Kvader(244, 710, 237),
            new Tretja.Pravokotnik(46, 48),
            new NovTip3(new int[]{854, 718, 966, 508, 774, 130, 143, 661}),
            new Tretja.Kvader(403, 51, 612),
            new Tretja.Pravokotnik(638, 749),
            new Tretja.Pravokotnik(83, 759),
            new Tretja.Pravokotnik(170, 602),
            new Tretja.Kvader(900, 73, 489),
            new NovTip2(new int[]{385, 101, 104, 62, 630, 178, 494, 447, 248, 85}),
            new NovTip1(new int[]{688, 957, 196, 398, 299, 389, 714, 819}),
            new NovTip1(new int[]{159, 392, 943, 180, 531, 658, 260, 169, 690, 143}),
            new Tretja.Kvader(611, 949, 342),
            new NovTip3(new int[]{284, 981, 286, 912, 317, 830, 718, 951, 251, 194}),
            new Tretja.Kvader(44, 333, 124),
            new Tretja.Kvader(282, 182, 590),
            new NovTip2(new int[]{912, 271, 425, 746, 524, 754, 367, 5}),
            new NovTip1(new int[]{683, 894, 511, 4, 143, 51, 708, 231, 777}),
            new Tretja.Pravokotnik(172, 750),
            new NovTip1(new int[]{951, 349, 34, 714}),
            new NovTip2(new int[]{843, 201, 724, 469, 91, 977, 809, 772, 685, 118}),
            new NovTip2(new int[]{89, 252, 572}),
            new NovTip2(new int[]{98, 706, 395, 674, 752, 847, 18, 754}),
            new NovTip1(new int[]{617, 186, 62, 806, 789}),
            new NovTip1(new int[]{230, 391, 936}),
            new NovTip1(new int[]{537, 164, 641, 356, 587, 850, 653, 771, 698}),
            new NovTip3(new int[]{140, 315, 659}),
            new NovTip2(new int[]{674, 782, 91, 502, 89, 772}),
            new NovTip1(new int[]{75, 464, 111, 486, 182, 430, 430, 182, 723, 746}),
            new Tretja.Pravokotnik(643, 994),
            new Tretja.Pravokotnik(501, 778),
            new Tretja.Pravokotnik(875, 550),
            new NovTip3(new int[]{942, 292, 373}),
            new NovTip3(new int[]{703, 604, 220, 903, 295, 974}),
            new NovTip3(new int[]{313, 78, 591, 514}),
            new NovTip2(new int[]{924, 324, 979}),
            new Tretja.Kvader(948, 223, 518),
            new NovTip1(new int[]{331, 55, 135, 804, 601, 623}),
            new NovTip1(new int[]{988, 636, 364, 82, 854, 30, 366, 943, 267, 959}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
