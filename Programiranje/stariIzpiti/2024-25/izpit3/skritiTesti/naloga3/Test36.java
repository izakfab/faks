
import java.util.*;

public class Test36 {

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

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new NovTip2(new int[]{588, 909, 639, 596}),
            new NovTip1(new int[]{442, 729, 372, 455, 441, 88, 387, 277, 888, 691}),
            new NovTip1(new int[]{977, 669, 168, 557, 405}),
            new NovTip1(new int[]{905, 33, 234, 625, 30}),
            new Tretja.Kvader(634, 876, 14),
            new NovTip2(new int[]{188, 544, 896, 949, 464}),
            new NovTip2(new int[]{6, 483, 354, 150, 899, 833, 827}),
            new NovTip1(new int[]{101, 993, 889, 4, 692, 584}),
            new NovTip1(new int[]{555, 115, 830, 928, 485, 56, 124, 714, 281, 696}),
            new Tretja.Pravokotnik(241, 468),
            new Tretja.Pravokotnik(113, 278),
            new NovTip1(new int[]{939, 533}),
            new NovTip2(new int[]{151, 362, 15, 954, 770, 186}),
            new NovTip2(new int[]{85, 835, 405, 1000, 809, 659, 644, 957, 702, 613}),
            new NovTip1(new int[]{459, 876, 165, 427, 904, 392, 940}),
            new NovTip2(new int[]{29, 766, 898, 475, 675, 118, 495}),
            new NovTip2(new int[]{631, 721, 740, 920, 374, 918, 87, 361}),
            new NovTip1(new int[]{13, 688, 215, 753, 33, 215, 489}),
            new NovTip2(new int[]{155, 116}),
            new NovTip2(new int[]{955, 629, 601, 226, 543, 533, 541, 533, 24, 239}),
            new NovTip1(new int[]{275, 754}),
            new NovTip1(new int[]{833, 572, 160, 701}),
            new Tretja.Kvader(57, 264, 363),
            new NovTip2(new int[]{134, 24, 980, 964, 95, 906, 891, 71, 877}),
            new Tretja.Kvader(536, 459, 822),
            new NovTip2(new int[]{980, 269, 309}),
            new NovTip2(new int[]{323, 611, 436, 129, 886}),
            new Tretja.Pravokotnik(240, 118),
            new Tretja.Pravokotnik(850, 816),
            new Tretja.Pravokotnik(192, 100),
            new Tretja.Kvader(930, 722, 922),
            new NovTip2(new int[]{763, 176, 910, 323, 67, 241, 939, 983, 623, 676}),
            new Tretja.Kvader(791, 111, 660),
            new NovTip1(new int[]{57, 323, 678, 389, 172, 390, 62, 877, 917, 31}),
            new NovTip2(new int[]{99, 234, 209, 344}),
            new Tretja.Kvader(985, 871, 285),
            new NovTip2(new int[]{772, 65, 208, 854, 69}),
            new Tretja.Pravokotnik(780, 341),
            new NovTip1(new int[]{860, 337, 808, 855, 446}),
            new NovTip1(new int[]{255, 611, 853, 23, 651, 956, 655, 871}),
            new Tretja.Kvader(665, 386, 968),
            new Tretja.Kvader(885, 294, 90),
            new Tretja.Kvader(113, 192, 35),
            new NovTip1(new int[]{899, 367, 593, 458, 421, 157, 664, 456}),
            new NovTip2(new int[]{907, 456, 900, 957}),
            new Tretja.Kvader(21, 89, 593),
            new NovTip2(new int[]{762, 729, 853, 886, 120}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
