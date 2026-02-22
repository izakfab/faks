
import java.util.*;

public class Test07 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.TriD {
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
            new NovTip1(new int[]{49, 112, 688, 260}),
            new Tretja.Kvader(128, 403, 551),
            new NovTip1(new int[]{420, 196, 794, 594, 861, 664, 196}),
            new NovTip1(new int[]{701, 542, 604, 450}),
            new Tretja.Kvader(282, 319, 985),
            new Tretja.Pravokotnik(531, 180),
            new Tretja.Pravokotnik(646, 797),
            new Tretja.Pravokotnik(935, 796),
            new Tretja.Kvader(892, 594, 679),
            new NovTip1(new int[]{915, 210, 51, 256, 680}),
            new NovTip1(new int[]{873, 940, 391, 166, 817, 576, 123}),
            new Tretja.Pravokotnik(739, 661),
            new NovTip1(new int[]{296, 330, 655, 639, 397}),
            new Tretja.Kvader(810, 712, 831),
            new NovTip1(new int[]{224, 521, 19, 716, 7, 430}),
            new NovTip1(new int[]{157, 22, 205, 838, 584, 50}),
            new Tretja.Kvader(471, 473, 963),
            new Tretja.Pravokotnik(446, 28),
            new Tretja.Pravokotnik(252, 106),
            new Tretja.Pravokotnik(39, 116),
            new NovTip1(new int[]{711, 500, 203, 294, 851, 481, 827, 370, 413, 328}),
            new Tretja.Kvader(39, 915, 681),
            new NovTip1(new int[]{542, 703, 963, 930, 466, 418, 153, 478, 473}),
            new NovTip1(new int[]{926, 693, 765, 251, 630, 49, 651, 725, 43}),
            new Tretja.Kvader(615, 921, 194),
            new Tretja.Kvader(497, 748, 897),
            new Tretja.Kvader(339, 502, 491),
            new Tretja.Pravokotnik(467, 222),
            new NovTip1(new int[]{16, 909, 530, 477, 792, 360, 465, 448, 529, 160}),
            new Tretja.Kvader(962, 582, 83),
            new Tretja.Pravokotnik(821, 559),
            new NovTip1(new int[]{791, 630, 886, 628}),
            new Tretja.Kvader(724, 421, 731),
            new Tretja.Kvader(79, 12, 366),
            new Tretja.Kvader(833, 61, 300),
            new Tretja.Kvader(728, 490, 95),
            new Tretja.Kvader(200, 462, 682),
            new Tretja.Kvader(281, 657, 232),
            new Tretja.Kvader(956, 101, 679),
            new Tretja.Pravokotnik(418, 219),
            new NovTip1(new int[]{800, 226}),
            new Tretja.Pravokotnik(789, 659),
            new Tretja.Pravokotnik(590, 481),
            new Tretja.Pravokotnik(498, 326),
            new NovTip1(new int[]{394, 607}),
            new Tretja.Kvader(558, 340, 827),
            new Tretja.Kvader(665, 849, 368),
            new Tretja.Kvader(635, 806, 484),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
