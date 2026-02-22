
import java.util.*;

public class Test37 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
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
            new Tretja.Kvader(328, 204, 646),
            new Tretja.Kvader(985, 971, 181),
            new NovTip1(new int[]{552, 570, 210, 346, 355, 669}),
            new Tretja.Pravokotnik(553, 443),
            new NovTip3(new int[]{160, 572, 877, 340, 367, 633, 519, 596, 467, 98}),
            new Tretja.Kvader(172, 955, 222),
            new NovTip1(new int[]{820, 5, 962, 323, 45, 819}),
            new NovTip1(new int[]{840, 874, 427, 910, 865, 345, 982, 270, 904}),
            new NovTip3(new int[]{180, 913, 171, 987, 483}),
            new Tretja.Pravokotnik(705, 583),
            new NovTip3(new int[]{823, 550, 438, 89, 253, 557, 478, 781, 313, 933}),
            new NovTip4(new int[]{991, 518, 925, 914, 512, 241, 483, 444}),
            new NovTip1(new int[]{991, 782, 489, 109, 296, 320}),
            new NovTip4(new int[]{413, 265, 567}),
            new NovTip4(new int[]{103, 211, 707, 220, 438, 2, 874, 622, 249}),
            new NovTip3(new int[]{13, 960, 439, 623, 153, 16, 879}),
            new NovTip4(new int[]{543, 660, 684, 982, 998, 336, 400, 442, 344, 604}),
            new Tretja.Kvader(75, 251, 734),
            new NovTip1(new int[]{996, 225, 590}),
            new NovTip2(new int[]{744, 768, 32, 1000, 458, 91}),
            new Tretja.Pravokotnik(329, 970),
            new NovTip1(new int[]{634, 103, 641, 523}),
            new NovTip2(new int[]{183, 361, 52}),
            new NovTip2(new int[]{876, 998, 452, 231}),
            new NovTip4(new int[]{984, 318, 430, 809, 781}),
            new NovTip1(new int[]{408, 197}),
            new NovTip2(new int[]{715, 413}),
            new NovTip4(new int[]{287, 31}),
            new NovTip1(new int[]{354, 956, 327}),
            new NovTip2(new int[]{636, 528, 939, 851, 538, 12, 396}),
            new NovTip1(new int[]{42, 926, 157, 5, 489, 442, 163, 444}),
            new Tretja.Pravokotnik(858, 79),
            new NovTip4(new int[]{769, 549, 156, 406, 986, 406, 920}),
            new NovTip3(new int[]{195, 59, 790, 169, 874, 804, 637, 506, 402}),
            new NovTip4(new int[]{749, 691, 647, 931, 908, 939, 223, 330, 198}),
            new NovTip2(new int[]{565, 859, 37, 11, 298, 267}),
            new NovTip2(new int[]{515, 899, 567, 650, 9}),
            new NovTip3(new int[]{850, 37, 125, 780, 802, 544, 118, 524}),
            new Tretja.Kvader(811, 440, 219),
            new NovTip1(new int[]{977, 637, 149, 929, 316, 69, 801, 313, 817, 30}),
            new NovTip4(new int[]{461, 917, 160}),
            new NovTip4(new int[]{722, 500, 430, 319, 640, 99, 295}),
            new NovTip3(new int[]{362, 720, 931, 566, 326}),
            new NovTip3(new int[]{808, 874, 143, 27, 688, 165}),
            new NovTip4(new int[]{565, 818, 652, 547, 559}),
            new NovTip1(new int[]{401, 906, 904, 198, 65, 714}),
            new Tretja.Kvader(335, 239, 831),
            new Tretja.Kvader(999, 757, 880),
            new NovTip2(new int[]{264, 998, 757, 553, 333, 529, 247}),
            new Tretja.Kvader(27, 359, 285),
            new NovTip2(new int[]{460, 803, 406, 401, 978, 969, 401}),
            new Tretja.Pravokotnik(153, 629),
            new Tretja.Kvader(432, 343, 906),
            new NovTip2(new int[]{664, 391, 392}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
