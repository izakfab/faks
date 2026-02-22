
import java.util.*;

public class Test48 {

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
            new Tretja.Kvader(240, 518, 628),
            new Tretja.Kvader(485, 893, 852),
            new NovTip1(new int[]{500, 42, 758, 978}),
            new Tretja.Pravokotnik(837, 588),
            new Tretja.Kvader(596, 321, 844),
            new NovTip1(new int[]{548, 323, 719}),
            new Tretja.Kvader(643, 386, 804),
            new NovTip1(new int[]{223, 785, 609, 663, 889, 428, 283}),
            new Tretja.Pravokotnik(591, 907),
            new Tretja.Kvader(649, 570, 59),
            new Tretja.Pravokotnik(911, 148),
            new Tretja.Pravokotnik(965, 621),
            new Tretja.Kvader(678, 429, 855),
            new NovTip1(new int[]{50, 921, 533, 344, 233, 909, 587, 485, 700, 536}),
            new Tretja.Pravokotnik(832, 261),
            new Tretja.Pravokotnik(13, 398),
            new NovTip1(new int[]{815, 6, 930, 68, 851}),
            new Tretja.Pravokotnik(150, 737),
            new Tretja.Pravokotnik(949, 286),
            new Tretja.Kvader(811, 297, 400),
            new Tretja.Kvader(220, 236, 454),
            new Tretja.Pravokotnik(550, 748),
            new Tretja.Kvader(811, 845, 189),
            new Tretja.Pravokotnik(615, 133),
            new NovTip1(new int[]{589, 319, 281, 855, 847, 83, 56, 568}),
            new NovTip1(new int[]{727, 56, 329, 956, 792, 800, 386, 691, 617}),
            new Tretja.Kvader(333, 560, 493),
            new NovTip1(new int[]{502, 542, 72, 738, 850, 290, 73, 292, 910, 977}),
            new NovTip1(new int[]{984, 8, 598, 729, 57, 370, 969, 69, 810, 679}),
            new Tretja.Pravokotnik(563, 882),
            new Tretja.Kvader(637, 976, 156),
            new Tretja.Pravokotnik(817, 595),
            new Tretja.Kvader(111, 407, 520),
            new Tretja.Pravokotnik(552, 519),
            new Tretja.Pravokotnik(558, 493),
            new NovTip1(new int[]{937, 370}),
            new Tretja.Kvader(95, 434, 511),
            new NovTip1(new int[]{278, 831, 936, 37, 249, 13, 8}),
            new NovTip1(new int[]{747, 811, 134, 731}),
            new Tretja.Kvader(711, 546, 784),
            new NovTip1(new int[]{422, 616, 230, 745, 418, 123, 489, 477}),
            new NovTip1(new int[]{313, 122}),
            new Tretja.Kvader(851, 164, 648),
            new Tretja.Pravokotnik(588, 820),
            new Tretja.Kvader(262, 755, 876),
            new NovTip1(new int[]{760, 527, 194}),
            new Tretja.Pravokotnik(191, 809),
            new Tretja.Kvader(659, 858, 963),
            new Tretja.Pravokotnik(14, 109),
            new Tretja.Pravokotnik(142, 590),
            new Tretja.Kvader(782, 962, 43),
            new Tretja.Kvader(200, 938, 959),
            new Tretja.Kvader(441, 676, 416),
            new NovTip1(new int[]{772, 396, 335, 198, 786, 991, 751}),
            new Tretja.Kvader(617, 954, 740),
            new Tretja.Kvader(397, 565, 813),
            new Tretja.Kvader(456, 711, 892),
            new NovTip1(new int[]{689, 420, 202, 775, 339}),
            new Tretja.Pravokotnik(421, 606),
            new Tretja.Kvader(730, 619, 360),
            new Tretja.Pravokotnik(742, 399),
            new NovTip1(new int[]{640, 410, 361, 817, 990, 577, 15, 57, 953, 574}),
            new Tretja.Pravokotnik(837, 195),
            new NovTip1(new int[]{724, 555, 280, 445, 921}),
            new Tretja.Kvader(272, 27, 520),
            new Tretja.Pravokotnik(732, 112),
            new Tretja.Kvader(144, 797, 836),
            new Tretja.Pravokotnik(980, 394),
            new Tretja.Kvader(939, 372, 754),
            new NovTip1(new int[]{248, 749, 966, 153, 494, 854, 554, 51}),
            new NovTip1(new int[]{515, 90, 871, 685, 608, 917, 492, 445, 348}),
            new Tretja.Pravokotnik(140, 34),
            new Tretja.Kvader(920, 874, 750),
            new NovTip1(new int[]{454, 135, 434, 560, 926, 73, 905, 574}),
            new Tretja.Pravokotnik(28, 757),
            new Tretja.Pravokotnik(557, 61),
            new Tretja.Kvader(658, 172, 932),
            new Tretja.Kvader(408, 229, 643),
            new Tretja.Kvader(555, 70, 242),
            new NovTip1(new int[]{178, 137, 37, 592, 169, 933, 556}),
            new NovTip1(new int[]{14, 868}),
            new NovTip1(new int[]{596, 639, 972, 685, 275, 363, 705, 847, 802}),
            new Tretja.Pravokotnik(816, 990),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
