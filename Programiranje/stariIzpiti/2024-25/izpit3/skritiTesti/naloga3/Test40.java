
import java.util.*;

public class Test40 {

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

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new NovTip1(new int[]{206, 884, 158, 57, 823, 320, 719, 630}),
            new Tretja.Pravokotnik(141, 268),
            new NovTip2(new int[]{151, 1, 861, 751, 184, 295, 463, 135, 813, 718}),
            new NovTip1(new int[]{731, 87, 216}),
            new NovTip3(new int[]{579, 784, 178}),
            new Tretja.Pravokotnik(17, 726),
            new NovTip3(new int[]{779, 536, 463, 153, 40, 959, 345}),
            new NovTip2(new int[]{670, 952, 539}),
            new Tretja.Kvader(901, 22, 828),
            new NovTip3(new int[]{966, 972, 966, 326, 917, 94, 754, 647, 336}),
            new NovTip2(new int[]{664, 682}),
            new NovTip1(new int[]{794, 135, 858, 52, 396, 739, 525, 461, 425, 43}),
            new Tretja.Pravokotnik(86, 95),
            new NovTip1(new int[]{172, 750, 69, 864, 485, 502, 541, 5, 39, 818}),
            new Tretja.Pravokotnik(90, 310),
            new NovTip1(new int[]{369, 92, 587, 639, 635}),
            new NovTip3(new int[]{677, 960, 762}),
            new NovTip3(new int[]{863, 435, 700, 195}),
            new Tretja.Pravokotnik(147, 348),
            new NovTip1(new int[]{890, 100, 251, 624, 273, 930, 425}),
            new Tretja.Kvader(489, 378, 138),
            new NovTip3(new int[]{2, 434}),
            new NovTip1(new int[]{221, 207, 543, 904, 157, 133, 11, 641, 635}),
            new Tretja.Kvader(860, 26, 926),
            new NovTip1(new int[]{377, 831, 574, 436, 461}),
            new NovTip2(new int[]{843, 20, 111, 602, 728, 520, 402, 868, 375, 223}),
            new NovTip2(new int[]{738, 26, 229}),
            new Tretja.Pravokotnik(897, 41),
            new Tretja.Pravokotnik(188, 670),
            new Tretja.Pravokotnik(858, 317),
            new NovTip1(new int[]{676, 79, 73, 598, 652, 802, 162, 72, 420, 747}),
            new NovTip2(new int[]{828, 613, 950, 116, 223, 791, 395}),
            new NovTip1(new int[]{41, 562, 660, 523, 363, 497, 182}),
            new NovTip3(new int[]{262, 29, 739, 771, 120, 581}),
            new Tretja.Kvader(324, 348, 786),
            new NovTip2(new int[]{788, 482, 763, 919, 225, 737, 334, 216, 311}),
            new NovTip3(new int[]{749, 815, 210, 544}),
            new Tretja.Pravokotnik(337, 456),
            new NovTip1(new int[]{403, 747, 29, 790, 509, 781, 356}),
            new Tretja.Kvader(584, 632, 687),
            new NovTip2(new int[]{762, 898, 285}),
            new Tretja.Pravokotnik(90, 351),
            new NovTip2(new int[]{861, 634, 708, 76, 791, 137, 137, 301, 474}),
            new NovTip2(new int[]{804, 901, 760, 292, 242, 887}),
            new NovTip1(new int[]{728, 735, 415, 277}),
            new Tretja.Pravokotnik(650, 703),
            new Tretja.Kvader(258, 416, 482),
            new Tretja.Pravokotnik(630, 593),
            new Tretja.Kvader(302, 911, 112),
            new NovTip3(new int[]{148, 357, 288, 76}),
            new Tretja.Kvader(78, 42, 613),
            new NovTip3(new int[]{371, 416, 563, 625, 431, 414, 975, 79, 466}),
            new Tretja.Kvader(849, 430, 678),
            new NovTip1(new int[]{531, 546, 711, 634, 742, 766, 259}),
            new Tretja.Pravokotnik(999, 459),
            new NovTip3(new int[]{125, 374, 44, 432, 919, 911}),
            new NovTip1(new int[]{636, 243, 815, 757, 580, 800, 547, 84, 792, 796}),
            new NovTip1(new int[]{717, 976, 521, 980, 173}),
            new NovTip1(new int[]{543, 87, 873, 331, 242, 564, 98, 109, 313}),
            new NovTip3(new int[]{836, 848, 623, 302, 654, 436, 146, 570, 692, 586}),
            new NovTip3(new int[]{130, 671, 749}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
