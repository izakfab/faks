
import java.util.*;

public class Test45 {

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
            new NovTip1(new int[]{378, 652, 501, 194}),
            new NovTip1(new int[]{141, 166, 557, 180, 63, 949, 443, 610}),
            new Tretja.Kvader(728, 234, 933),
            new Tretja.Pravokotnik(229, 962),
            new NovTip1(new int[]{873, 421, 394, 878, 915, 89, 368}),
            new Tretja.Kvader(422, 646, 671),
            new Tretja.Kvader(582, 439, 717),
            new Tretja.Pravokotnik(626, 560),
            new Tretja.Kvader(930, 958, 972),
            new NovTip1(new int[]{475, 951, 806, 537, 426}),
            new Tretja.Kvader(920, 673, 902),
            new NovTip1(new int[]{427, 546, 984, 778, 578, 159, 850, 283}),
            new Tretja.Kvader(470, 765, 61),
            new Tretja.Kvader(492, 377, 27),
            new NovTip1(new int[]{996, 329, 153, 429, 882, 559, 237, 195, 779, 446}),
            new NovTip1(new int[]{79, 286, 947, 381, 707, 96, 479, 978}),
            new Tretja.Pravokotnik(293, 455),
            new NovTip1(new int[]{951, 249, 221, 747, 226, 592, 869, 360, 449, 603}),
            new Tretja.Kvader(92, 443, 65),
            new NovTip1(new int[]{758, 144, 319, 70, 67, 399}),
            new Tretja.Pravokotnik(910, 449),
            new Tretja.Kvader(243, 985, 43),
            new Tretja.Kvader(909, 444, 116),
            new NovTip1(new int[]{457, 522, 204, 339, 441, 154, 103}),
            new Tretja.Pravokotnik(811, 387),
            new Tretja.Kvader(478, 317, 34),
            new Tretja.Kvader(361, 114, 988),
            new Tretja.Kvader(228, 827, 874),
            new NovTip1(new int[]{830, 484, 90, 488, 721, 108}),
            new Tretja.Pravokotnik(233, 66),
            new Tretja.Kvader(566, 36, 781),
            new Tretja.Kvader(458, 525, 231),
            new NovTip1(new int[]{902, 407, 570, 438, 259}),
            new Tretja.Kvader(428, 422, 755),
            new Tretja.Pravokotnik(91, 953),
            new Tretja.Kvader(655, 997, 893),
            new Tretja.Kvader(71, 447, 213),
            new Tretja.Pravokotnik(496, 939),
            new Tretja.Pravokotnik(741, 737),
            new NovTip1(new int[]{299, 785, 528, 479, 100}),
            new NovTip1(new int[]{624, 920, 675, 662}),
            new NovTip1(new int[]{518, 422, 596, 652, 206, 582}),
            new Tretja.Pravokotnik(762, 978),
            new NovTip1(new int[]{731, 971, 773, 216}),
            new NovTip1(new int[]{866, 614, 559, 515, 196, 184, 854}),
            new NovTip1(new int[]{583, 841, 130, 18, 283}),
            new NovTip1(new int[]{689, 89, 572, 194}),
            new Tretja.Kvader(923, 57, 260),
            new Tretja.Pravokotnik(516, 878),
            new NovTip1(new int[]{140, 69, 440}),
            new Tretja.Pravokotnik(270, 195),
            new Tretja.Kvader(703, 526, 544),
            new NovTip1(new int[]{67, 96, 975, 806}),
            new Tretja.Pravokotnik(405, 301),
            new Tretja.Kvader(123, 135, 153),
            new NovTip1(new int[]{503, 826}),
            new Tretja.Kvader(463, 392, 251),
            new Tretja.Pravokotnik(511, 802),
            new Tretja.Kvader(340, 488, 398),
            new Tretja.Kvader(732, 869, 417),
            new Tretja.Pravokotnik(825, 963),
            new Tretja.Pravokotnik(970, 544),
            new Tretja.Kvader(942, 23, 693),
            new NovTip1(new int[]{810, 698, 694, 663, 468, 586}),
            new NovTip1(new int[]{733, 184}),
            new Tretja.Kvader(106, 420, 747),
            new Tretja.Kvader(106, 947, 575),
            new NovTip1(new int[]{188, 943, 121, 772, 455, 473}),
            new Tretja.Pravokotnik(369, 354),
            new Tretja.Kvader(674, 111, 26),
            new NovTip1(new int[]{857, 313}),
            new Tretja.Kvader(815, 555, 322),
            new Tretja.Kvader(12, 383, 136),
            new Tretja.Kvader(905, 834, 833),
            new Tretja.Kvader(932, 672, 396),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
