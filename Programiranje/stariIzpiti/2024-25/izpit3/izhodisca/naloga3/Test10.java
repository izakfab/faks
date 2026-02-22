
import java.util.*;

public class Test10 {

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
            new NovTip3(new int[]{918, 415, 860, 350, 32, 347, 358, 681, 582}),
            new NovTip3(new int[]{329, 407, 166, 44, 384, 361}),
            new Tretja.Pravokotnik(39, 923),
            new NovTip1(new int[]{773, 757, 744, 452, 243}),
            new Tretja.Pravokotnik(290, 240),
            new Tretja.Pravokotnik(848, 356),
            new Tretja.Kvader(507, 696, 109),
            new NovTip3(new int[]{472, 383, 956, 241, 315, 323, 132, 312}),
            new NovTip3(new int[]{787, 368, 262, 689, 508, 528, 891, 524, 916}),
            new NovTip2(new int[]{303, 209, 4, 694, 182, 273, 390, 209}),
            new Tretja.Kvader(278, 434, 404),
            new NovTip3(new int[]{496, 49, 413, 820, 356}),
            new NovTip1(new int[]{111, 878, 408, 751, 975}),
            new Tretja.Pravokotnik(199, 817),
            new NovTip3(new int[]{446, 91, 903}),
            new NovTip3(new int[]{558, 401, 621, 932, 48, 302}),
            new Tretja.Pravokotnik(592, 352),
            new NovTip4(new int[]{517, 361, 462, 319, 640, 671, 810, 24, 695}),
            new NovTip4(new int[]{570, 122, 258, 983, 436, 110, 392}),
            new NovTip1(new int[]{136, 906, 166, 722, 899, 300, 236, 416}),
            new NovTip3(new int[]{130, 200, 772, 996, 543}),
            new NovTip2(new int[]{861, 138}),
            new NovTip3(new int[]{892, 49, 803, 421}),
            new NovTip2(new int[]{375, 580, 407, 175, 621, 430}),
            new NovTip3(new int[]{587, 163, 268, 289, 714, 153, 129}),
            new NovTip4(new int[]{236, 255, 8, 310, 388, 34, 871, 608}),
            new Tretja.Kvader(752, 400, 881),
            new NovTip4(new int[]{453, 831, 524, 682, 190, 459, 58, 761}),
            new Tretja.Kvader(628, 965, 21),
            new NovTip2(new int[]{568, 817, 966, 859, 244, 468, 75, 740}),
            new NovTip1(new int[]{403, 79, 664, 469, 802, 759, 569}),
            new Tretja.Pravokotnik(220, 643),
            new NovTip4(new int[]{333, 441, 718, 133, 212}),
            new NovTip4(new int[]{503, 683, 655, 147, 426, 494, 858}),
            new NovTip1(new int[]{504, 899, 783, 30}),
            new Tretja.Pravokotnik(43, 38),
            new NovTip1(new int[]{730, 826, 159, 990, 622, 768}),
            new Tretja.Pravokotnik(895, 464),
            new Tretja.Pravokotnik(610, 38),
            new Tretja.Kvader(77, 442, 241),
            new Tretja.Pravokotnik(299, 62),
            new NovTip3(new int[]{833, 396, 964, 374, 17, 635, 176, 715, 108, 669}),
            new Tretja.Kvader(381, 354, 607),
            new NovTip2(new int[]{836, 20, 386, 680, 414}),
            new NovTip1(new int[]{223, 436, 221, 250}),
            new NovTip3(new int[]{177, 933, 780, 975, 38, 840}),
            new NovTip1(new int[]{260, 1, 359, 690, 843}),
            new NovTip2(new int[]{575, 89, 156}),
            new NovTip4(new int[]{726, 564, 728, 673, 309, 729, 292, 580}),
            new NovTip3(new int[]{285, 747, 408, 374, 426, 83, 702, 7}),
            new NovTip4(new int[]{99, 618, 831, 887}),
            new NovTip1(new int[]{181, 72, 234, 678, 125, 529, 872, 281, 238, 846}),
            new Tretja.Pravokotnik(519, 245),
            new Tretja.Pravokotnik(914, 329),
            new NovTip2(new int[]{923, 539, 336}),
            new Tretja.Kvader(266, 511, 454),
            new NovTip3(new int[]{811, 174, 963, 874}),
            new NovTip4(new int[]{855, 889, 136, 863, 925}),
            new NovTip1(new int[]{916, 236}),
            new NovTip1(new int[]{642, 820, 150, 31, 963, 225, 541, 798, 515, 116}),
            new NovTip3(new int[]{605, 446}),
            new Tretja.Pravokotnik(518, 984),
            new Tretja.Pravokotnik(223, 207),
            new Tretja.Pravokotnik(432, 319),
            new NovTip3(new int[]{392, 295, 800, 341, 81, 665}),
            new NovTip4(new int[]{10, 246, 996, 251, 700, 326, 402, 728, 691}),
            new NovTip3(new int[]{173, 924, 461, 501, 758, 185, 171, 690, 870}),
            new NovTip1(new int[]{885, 465, 590}),
            new NovTip1(new int[]{483, 45, 844}),
            new NovTip2(new int[]{776, 745, 982, 843, 465, 262, 771, 469, 435, 588}),
            new Tretja.Pravokotnik(883, 276),
            new NovTip1(new int[]{703, 868, 824, 711, 659, 864, 672, 533, 981}),
            new NovTip1(new int[]{769, 754, 490, 749, 437, 492}),
            new NovTip3(new int[]{841, 579}),
            new NovTip1(new int[]{390, 617, 899, 689, 138, 224, 640, 171, 783}),
            new NovTip2(new int[]{121, 658, 98, 620, 781, 928, 61}),
            new NovTip2(new int[]{742, 765, 716, 506, 439, 904}),
            new NovTip3(new int[]{832, 544, 389, 356, 518, 380, 306, 802, 771}),
            new Tretja.Kvader(643, 546, 864),
            new NovTip4(new int[]{299, 455, 799, 85, 863, 870, 486, 572, 317}),
            new NovTip4(new int[]{46, 309, 954, 8, 998, 651, 299, 37}),
            new Tretja.Pravokotnik(390, 33),
            new NovTip1(new int[]{823, 563, 605}),
            new Tretja.Kvader(386, 525, 150),
            new Tretja.Pravokotnik(754, 886),
            new NovTip2(new int[]{135, 853, 906, 802, 900, 147, 96, 842}),
            new Tretja.Kvader(366, 222, 583),
            new NovTip2(new int[]{387, 117}),
            new NovTip3(new int[]{47, 365, 463, 958, 463, 913, 429, 31}),
            new Tretja.Pravokotnik(564, 78),
            new Tretja.Pravokotnik(166, 255),
            new NovTip1(new int[]{478, 449, 749, 22, 736}),
            new NovTip3(new int[]{586, 318, 800, 77, 526, 379}),
            new NovTip4(new int[]{184, 975, 796, 558, 549, 896, 550, 733, 151, 510}),
            new NovTip2(new int[]{453, 242, 72, 502, 802}),
            new NovTip4(new int[]{244, 183, 145, 962, 840, 442, 403, 927, 886}),
            new NovTip1(new int[]{464, 236, 864}),
            new Tretja.Pravokotnik(4, 372),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
