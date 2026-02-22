
import java.util.*;

public class Test43 {

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
            new NovTip1(new int[]{946, 787, 862, 90, 9, 308, 773, 86, 709}),
            new NovTip3(new int[]{547, 577}),
            new NovTip5(new int[]{728, 198, 973, 330, 728, 29, 261}),
            new NovTip5(new int[]{604, 283, 56, 581, 380, 847, 788, 604, 459}),
            new Tretja.Kvader(251, 88, 260),
            new Tretja.Kvader(838, 524, 848),
            new Tretja.Kvader(568, 814, 470),
            new NovTip3(new int[]{494, 919}),
            new NovTip2(new int[]{581, 499}),
            new NovTip4(new int[]{559, 789, 466, 795}),
            new Tretja.Kvader(210, 674, 983),
            new NovTip1(new int[]{972, 451, 889, 621, 497, 434}),
            new Tretja.Pravokotnik(801, 163),
            new NovTip2(new int[]{750, 936, 17, 978, 766, 782, 343, 880}),
            new NovTip3(new int[]{868, 896, 973, 47, 480, 483, 501, 23}),
            new NovTip5(new int[]{392, 111, 506, 641, 351, 690, 245, 563, 735}),
            new Tretja.Pravokotnik(184, 515),
            new NovTip1(new int[]{503, 471}),
            new Tretja.Pravokotnik(376, 26),
            new NovTip5(new int[]{135, 35, 366, 674, 886, 899, 440}),
            new NovTip3(new int[]{946, 963, 431, 90, 204, 754}),
            new Tretja.Kvader(478, 112, 123),
            new NovTip5(new int[]{20, 482, 24, 329, 119, 202}),
            new NovTip5(new int[]{435, 216}),
            new NovTip3(new int[]{957, 608, 768, 305, 305, 217, 458, 828, 851, 206}),
            new NovTip1(new int[]{724, 173, 659, 426, 910, 706, 332, 297}),
            new Tretja.Kvader(585, 134, 66),
            new Tretja.Pravokotnik(261, 811),
            new NovTip2(new int[]{205, 766, 381, 776, 295, 489, 253, 393, 942}),
            new NovTip5(new int[]{37, 926}),
            new NovTip5(new int[]{779, 817, 695, 400, 755, 1000, 948}),
            new NovTip3(new int[]{864, 739, 215, 415, 266, 536, 262, 524, 387, 634}),
            new Tretja.Kvader(698, 418, 417),
            new NovTip4(new int[]{695, 855, 964, 388, 782, 726, 43, 251, 8}),
            new Tretja.Kvader(252, 144, 205),
            new NovTip2(new int[]{702, 224, 790, 18, 458}),
            new NovTip5(new int[]{19, 326, 143, 682, 318, 520, 596, 204}),
            new NovTip5(new int[]{203, 353, 438, 821, 134, 44}),
            new NovTip2(new int[]{827, 67, 326, 176, 455, 465, 435, 229, 359, 92}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
