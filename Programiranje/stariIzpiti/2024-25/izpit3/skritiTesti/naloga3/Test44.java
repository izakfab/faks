
import java.util.*;

public class Test44 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
        public NovTip1(int[] podatki) {
            super(podatki);
        }
        @Override
        public String toString() {
            return String.format("NovTip1(%s)", Arrays.toString(this.stranice));
        }
    }

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new Tretja.Kvader(38, 488, 8),
            new NovTip1(new int[]{560, 398, 831, 297, 166, 500, 600, 91}),
            new NovTip1(new int[]{34, 552, 883}),
            new NovTip1(new int[]{824, 891, 597, 182, 304}),
            new Tretja.Kvader(171, 828, 487),
            new Tretja.Kvader(148, 719, 956),
            new Tretja.Kvader(508, 213, 432),
            new Tretja.Kvader(364, 100, 186),
            new NovTip1(new int[]{792, 315, 792, 818, 941, 65}),
            new Tretja.Pravokotnik(998, 452),
            new Tretja.Pravokotnik(664, 698),
            new NovTip1(new int[]{664, 269, 991, 29, 713, 920, 790, 917, 488, 298}),
            new Tretja.Pravokotnik(27, 958),
            new NovTip1(new int[]{641, 694, 899}),
            new Tretja.Kvader(206, 515, 439),
            new Tretja.Kvader(387, 499, 990),
            new Tretja.Pravokotnik(127, 233),
            new Tretja.Pravokotnik(899, 434),
            new Tretja.Kvader(351, 889, 338),
            new Tretja.Kvader(865, 305, 222),
            new NovTip1(new int[]{692, 718}),
            new Tretja.Pravokotnik(296, 334),
            new Tretja.Pravokotnik(320, 106),
            new NovTip1(new int[]{449, 623, 548, 752, 854, 861, 961, 85, 662, 341}),
            new Tretja.Pravokotnik(837, 17),
            new Tretja.Kvader(358, 493, 959),
            new Tretja.Pravokotnik(386, 53),
            new Tretja.Kvader(192, 56, 406),
            new Tretja.Kvader(585, 148, 573),
            new Tretja.Pravokotnik(997, 708),
            new Tretja.Pravokotnik(598, 834),
            new NovTip1(new int[]{796, 759, 388, 31}),
            new Tretja.Kvader(128, 788, 657),
            new Tretja.Pravokotnik(939, 711),
            new NovTip1(new int[]{996, 741, 562, 317, 66}),
            new Tretja.Kvader(871, 882, 328),
            new Tretja.Pravokotnik(540, 866),
            new NovTip1(new int[]{545, 598, 821, 496, 229, 692}),
            new NovTip1(new int[]{582, 212, 417, 920, 804}),
            new NovTip1(new int[]{463, 985, 621}),
            new Tretja.Kvader(111, 621, 615),
            new Tretja.Pravokotnik(357, 690),
            new Tretja.Kvader(503, 896, 790),
            new Tretja.Kvader(575, 297, 913),
            new Tretja.Kvader(93, 612, 874),
            new Tretja.Pravokotnik(95, 272),
            new Tretja.Kvader(317, 837, 626),
            new NovTip1(new int[]{221, 585, 718}),
            new Tretja.Kvader(55, 155, 682),
            new Tretja.Kvader(365, 496, 892),
            new NovTip1(new int[]{636, 573, 179, 172, 111, 616, 998, 668, 976}),
            new Tretja.Kvader(985, 930, 925),
            new NovTip1(new int[]{658, 449, 394, 627, 393}),
            new Tretja.Kvader(174, 535, 589),
            new Tretja.Pravokotnik(43, 879),
            new Tretja.Kvader(520, 225, 140),
            new Tretja.Kvader(668, 965, 490),
            new Tretja.Pravokotnik(907, 39),
            new NovTip1(new int[]{582, 972, 595, 338}),
            new Tretja.Pravokotnik(983, 186),
            new Tretja.Pravokotnik(449, 329),
            new Tretja.Pravokotnik(494, 821),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
