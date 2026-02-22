
import java.util.*;

public class Test26 {

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
            new NovTip1(new int[]{90, 567, 497, 524}),
            new Tretja.Kvader(534, 868, 437),
            new NovTip5(new int[]{503, 558, 544, 226, 348, 165, 212, 710, 221, 781}),
            new Tretja.Pravokotnik(375, 199),
            new NovTip2(new int[]{366, 447, 894}),
            new NovTip4(new int[]{793, 876, 335}),
            new NovTip4(new int[]{211, 336, 263, 985}),
            new Tretja.Pravokotnik(905, 479),
            new NovTip2(new int[]{365, 352, 84, 188, 2}),
            new Tretja.Kvader(568, 114, 12),
            new NovTip1(new int[]{124, 549, 826, 715, 145, 435, 153}),
            new NovTip2(new int[]{848, 429, 515}),
            new NovTip5(new int[]{903, 940, 206, 420, 186}),
            new Tretja.Pravokotnik(445, 708),
            new NovTip3(new int[]{751, 668, 300, 51, 876, 505, 90, 858, 734, 850}),
            new NovTip3(new int[]{386, 124, 606, 223, 313}),
            new NovTip3(new int[]{67, 829, 338, 793, 710, 827, 581, 908}),
            new NovTip5(new int[]{113, 697, 587}),
            new Tretja.Kvader(300, 687, 936),
            new NovTip2(new int[]{737, 230, 234, 831, 991, 660}),
            new NovTip1(new int[]{935, 847, 829, 999, 302, 978}),
            new Tretja.Kvader(444, 339, 487),
            new NovTip5(new int[]{926, 673, 172, 330, 429, 518}),
            new NovTip4(new int[]{329, 633, 527, 6, 611, 857, 328}),
            new NovTip5(new int[]{599, 803, 912, 293, 488, 202, 911, 890, 372, 19}),
            new NovTip1(new int[]{202, 409, 146, 367, 615, 896}),
            new NovTip3(new int[]{421, 440, 475, 134, 321, 398, 840, 9, 761, 347}),
            new NovTip4(new int[]{981, 309, 486, 136, 314, 598, 294, 804}),
            new NovTip1(new int[]{20, 494, 362, 448, 186, 280}),
            new NovTip2(new int[]{273, 947, 821, 356, 471}),
            new NovTip3(new int[]{128, 923, 55, 540, 490, 687, 165, 701, 828, 544}),
            new NovTip4(new int[]{164, 30, 784, 236, 302, 13, 801}),
            new Tretja.Kvader(824, 100, 515),
            new Tretja.Kvader(667, 841, 679),
            new Tretja.Pravokotnik(954, 799),
            new NovTip4(new int[]{708, 295, 804, 445, 330, 755, 996, 392}),
            new NovTip3(new int[]{776, 90, 942, 466, 290, 590}),
            new NovTip2(new int[]{319, 443, 637, 1000, 293, 657, 90, 758, 755}),
            new Tretja.Kvader(850, 301, 931),
            new NovTip2(new int[]{333, 289, 4}),
            new NovTip4(new int[]{65, 474}),
            new NovTip5(new int[]{980, 755, 521, 212, 202, 159, 547, 121, 997}),
            new NovTip1(new int[]{176, 520, 731, 751, 849, 814, 898, 187, 582, 705}),
            new NovTip5(new int[]{833, 551, 649, 173}),
            new NovTip4(new int[]{969, 897, 109}),
            new NovTip5(new int[]{25, 778, 510, 2, 790, 668}),
            new NovTip4(new int[]{454, 758, 853, 627, 747, 508, 672, 325, 467}),
            new NovTip4(new int[]{422, 484}),
            new Tretja.Kvader(473, 519, 471),
            new Tretja.Pravokotnik(816, 426),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
