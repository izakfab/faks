
import java.util.*;

public class Test34 {

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

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new NovTip1(new int[]{295, 802, 954, 186, 794, 347, 450, 847, 655, 639}),
            new Tretja.Pravokotnik(713, 6),
            new Tretja.Pravokotnik(709, 522),
            new Tretja.Kvader(307, 255, 383),
            new NovTip2(new int[]{578, 45, 377, 828}),
            new NovTip1(new int[]{54, 213, 821, 954, 644, 732, 620, 635, 423}),
            new NovTip2(new int[]{282, 741, 130, 69, 840, 474, 13, 408, 771}),
            new Tretja.Pravokotnik(520, 723),
            new NovTip2(new int[]{76, 365, 798, 929, 885, 246, 791, 739}),
            new Tretja.Kvader(526, 920, 700),
            new Tretja.Kvader(388, 729, 669),
            new Tretja.Kvader(929, 724, 237),
            new NovTip1(new int[]{198, 938}),
            new Tretja.Pravokotnik(914, 575),
            new NovTip3(new int[]{637, 486, 120}),
            new Tretja.Kvader(870, 827, 666),
            new NovTip1(new int[]{242, 747, 338, 199, 830, 850, 86, 216, 774}),
            new NovTip4(new int[]{341, 797, 590, 126}),
            new NovTip4(new int[]{380, 317, 316, 436}),
            new Tretja.Pravokotnik(217, 548),
            new NovTip2(new int[]{217, 874, 82, 564}),
            new NovTip2(new int[]{823, 448}),
            new NovTip1(new int[]{508, 757, 877, 288, 503, 396, 488, 265}),
            new Tretja.Pravokotnik(166, 13),
            new NovTip4(new int[]{76, 531, 615, 13, 896, 804, 613, 113}),
            new NovTip3(new int[]{755, 262, 345, 450, 189, 102}),
            new Tretja.Pravokotnik(360, 150),
            new NovTip3(new int[]{165, 4, 705, 779, 98, 786, 123, 176}),
            new NovTip3(new int[]{12, 745, 14}),
            new NovTip3(new int[]{394, 108, 726, 72, 109, 876, 259}),
            new Tretja.Kvader(742, 515, 405),
            new NovTip4(new int[]{284, 595, 844, 293, 166, 900}),
            new Tretja.Kvader(844, 492, 842),
            new Tretja.Kvader(710, 650, 297),
            new Tretja.Kvader(48, 56, 7),
            new NovTip2(new int[]{781, 864, 257, 893, 521}),
            new NovTip1(new int[]{534, 451, 918}),
            new NovTip4(new int[]{741, 997, 224, 172, 847, 762, 812, 710}),
            new NovTip2(new int[]{507, 778, 412, 47, 940, 270, 489}),
            new NovTip1(new int[]{885, 734, 60}),
            new Tretja.Pravokotnik(284, 549),
            new NovTip2(new int[]{847, 25, 269, 8, 299}),
            new NovTip3(new int[]{861, 904, 110, 765, 668, 658, 496}),
            new Tretja.Kvader(192, 60, 528),
            new NovTip1(new int[]{784, 668, 94}),
            new NovTip3(new int[]{603, 560, 456, 994, 410}),
            new NovTip4(new int[]{607, 641}),
            new NovTip1(new int[]{499, 828, 436, 129, 191, 858, 962, 228, 499}),
            new NovTip3(new int[]{868, 138, 668, 15, 915, 360, 108, 334, 618, 519}),
            new NovTip3(new int[]{162, 718, 804, 241, 339, 135}),
            new Tretja.Pravokotnik(989, 884),
            new NovTip2(new int[]{932, 926, 136, 194, 109, 932, 238}),
            new Tretja.Kvader(909, 428, 287),
            new NovTip1(new int[]{678, 194}),
            new NovTip4(new int[]{692, 42, 452, 242, 795, 660, 539, 268, 252, 938}),
            new NovTip3(new int[]{729, 279, 245, 582, 126}),
            new NovTip2(new int[]{321, 783, 797, 305, 983, 468}),
            new NovTip4(new int[]{937, 481}),
            new NovTip4(new int[]{718, 817}),
            new NovTip4(new int[]{993, 986, 36, 82, 34, 885, 561}),
            new NovTip3(new int[]{656, 510, 206, 652, 559}),
            new Tretja.Pravokotnik(247, 60),
            new Tretja.Kvader(893, 601, 858),
            new NovTip4(new int[]{287, 810, 371, 841, 851, 634, 841, 287, 985, 71}),
            new Tretja.Pravokotnik(5, 46),
            new NovTip4(new int[]{721, 473, 405, 70, 986, 209, 192, 38, 237, 928}),
            new NovTip2(new int[]{359, 979, 834, 524, 709, 561, 202, 913, 558}),
            new Tretja.Kvader(567, 760, 707),
            new Tretja.Kvader(681, 176, 377),
            new NovTip3(new int[]{103, 230, 948}),
            new Tretja.Kvader(853, 754, 576),
            new Tretja.Pravokotnik(637, 611),
            new Tretja.Kvader(828, 806, 81),
            new NovTip4(new int[]{212, 356, 281}),
            new NovTip4(new int[]{196, 442, 426, 543}),
            new NovTip3(new int[]{267, 429, 811, 906, 74}),
            new NovTip1(new int[]{844, 751, 162, 167}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
