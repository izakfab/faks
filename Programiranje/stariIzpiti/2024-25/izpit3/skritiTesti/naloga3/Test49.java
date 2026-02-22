
import java.util.*;

public class Test49 {

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

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new Tretja.Kvader(782, 356, 270),
            new Tretja.Pravokotnik(664, 199),
            new Tretja.Kvader(934, 153, 566),
            new Tretja.Kvader(527, 514, 714),
            new Tretja.Kvader(99, 918, 143),
            new NovTip1(new int[]{522, 557, 586, 888, 268, 750, 469}),
            new NovTip1(new int[]{903, 92, 747, 586, 347, 9}),
            new NovTip1(new int[]{920, 176, 849, 481, 425, 151, 798, 452, 494}),
            new Tretja.Pravokotnik(513, 880),
            new NovTip1(new int[]{323, 590, 680, 447, 413, 775, 869, 234, 662, 362}),
            new Tretja.Kvader(252, 7, 209),
            new NovTip2(new int[]{693, 430, 648, 46, 521, 962, 407, 880}),
            new Tretja.Pravokotnik(553, 749),
            new NovTip1(new int[]{896, 896, 785, 723, 849}),
            new NovTip2(new int[]{331, 983, 169, 343, 209, 804}),
            new Tretja.Pravokotnik(804, 103),
            new Tretja.Pravokotnik(796, 348),
            new Tretja.Kvader(127, 265, 164),
            new Tretja.Pravokotnik(702, 809),
            new Tretja.Pravokotnik(914, 426),
            new Tretja.Pravokotnik(852, 992),
            new NovTip1(new int[]{559, 599}),
            new Tretja.Kvader(483, 10, 746),
            new NovTip1(new int[]{989, 963, 681, 125, 813, 226, 38, 61, 320}),
            new Tretja.Pravokotnik(351, 813),
            new NovTip2(new int[]{260, 238, 376, 715, 364, 529, 627}),
            new Tretja.Pravokotnik(643, 220),
            new Tretja.Pravokotnik(688, 982),
            new NovTip2(new int[]{503, 991, 727}),
            new NovTip2(new int[]{144, 314, 678, 927, 787, 456, 779}),
            new Tretja.Kvader(442, 777, 52),
            new Tretja.Kvader(184, 862, 942),
            new Tretja.Kvader(343, 577, 436),
            new Tretja.Kvader(329, 916, 751),
            new NovTip2(new int[]{583, 163}),
            new NovTip1(new int[]{540, 145, 553}),
            new Tretja.Kvader(496, 309, 962),
            new Tretja.Pravokotnik(121, 467),
            new NovTip2(new int[]{602, 355, 112, 395, 986, 479, 114, 636, 202, 980}),
            new NovTip2(new int[]{293, 317, 478, 722, 285, 754, 511}),
            new Tretja.Kvader(159, 572, 597),
            new Tretja.Kvader(979, 516, 960),
            new Tretja.Kvader(448, 202, 315),
            new NovTip2(new int[]{460, 142, 411, 272, 126, 796, 823, 555}),
            new Tretja.Kvader(48, 127, 169),
            new NovTip1(new int[]{469, 455, 136}),
            new Tretja.Pravokotnik(261, 48),
            new NovTip1(new int[]{372, 694, 64}),
            new Tretja.Kvader(562, 641, 984),
            new Tretja.Pravokotnik(224, 378),
            new Tretja.Pravokotnik(417, 160),
            new Tretja.Pravokotnik(291, 499),
            new NovTip2(new int[]{350, 327, 219, 580, 467, 62, 124}),
            new Tretja.Kvader(245, 859, 923),
            new NovTip1(new int[]{127, 352, 270, 347}),
            new NovTip2(new int[]{491, 153}),
            new NovTip2(new int[]{804, 111, 167, 43, 227, 250, 336}),
            new NovTip2(new int[]{28, 867, 991, 804, 162, 128, 88, 916, 733, 810}),
            new Tretja.Kvader(58, 267, 679),
            new NovTip2(new int[]{18, 155}),
            new Tretja.Kvader(57, 377, 799),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
