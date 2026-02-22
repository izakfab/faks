
import java.util.*;

public class Test35 {

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
            new Tretja.Kvader(639, 191, 723),
            new Tretja.Kvader(575, 525, 713),
            new Tretja.Pravokotnik(240, 48),
            new Tretja.Pravokotnik(58, 442),
            new NovTip1(new int[]{171, 661, 57, 837, 205}),
            new Tretja.Pravokotnik(822, 774),
            new NovTip1(new int[]{88, 987, 495, 125, 919, 220}),
            new NovTip1(new int[]{685, 111, 834, 2, 143, 556, 580, 193, 936, 858}),
            new Tretja.Pravokotnik(110, 165),
            new Tretja.Pravokotnik(911, 397),
            new Tretja.Kvader(864, 579, 625),
            new Tretja.Kvader(309, 715, 79),
            new Tretja.Pravokotnik(986, 524),
            new Tretja.Kvader(740, 318, 678),
            new Tretja.Pravokotnik(578, 186),
            new Tretja.Kvader(273, 919, 512),
            new Tretja.Kvader(187, 940, 696),
            new NovTip1(new int[]{976, 365, 112, 970, 178, 421, 377}),
            new Tretja.Kvader(961, 319, 231),
            new Tretja.Pravokotnik(343, 844),
            new Tretja.Pravokotnik(130, 747),
            new Tretja.Pravokotnik(525, 696),
            new Tretja.Pravokotnik(493, 236),
            new Tretja.Kvader(66, 237, 988),
            new Tretja.Kvader(848, 251, 842),
            new Tretja.Pravokotnik(760, 971),
            new NovTip1(new int[]{399, 277, 322, 725, 134, 697, 867, 255, 268, 731}),
            new Tretja.Kvader(463, 114, 520),
            new Tretja.Pravokotnik(979, 343),
            new NovTip1(new int[]{472, 365, 707, 223, 439, 135}),
            new Tretja.Kvader(733, 749, 74),
            new Tretja.Pravokotnik(445, 867),
            new NovTip1(new int[]{700, 895, 88, 358, 532, 951, 152}),
            new NovTip1(new int[]{447, 230, 402, 445}),
            new NovTip1(new int[]{226, 630, 526, 836, 959, 589, 713, 953}),
            new Tretja.Kvader(981, 835, 814),
            new Tretja.Kvader(345, 744, 644),
            new Tretja.Kvader(464, 222, 463),
            new Tretja.Pravokotnik(537, 767),
            new NovTip1(new int[]{200, 610, 211, 209, 121, 714, 929, 304, 242, 660}),
            new NovTip1(new int[]{160, 568, 190, 566}),
            new NovTip1(new int[]{32, 55}),
            new NovTip1(new int[]{335, 888, 929, 221}),
            new Tretja.Kvader(479, 859, 614),
            new Tretja.Kvader(275, 845, 909),
            new Tretja.Pravokotnik(617, 699),
            new Tretja.Kvader(928, 68, 586),
            new Tretja.Pravokotnik(823, 266),
            new Tretja.Kvader(956, 220, 324),
            new NovTip1(new int[]{930, 807}),
            new NovTip1(new int[]{506, 289, 381, 767, 499, 895, 988, 298}),
            new Tretja.Pravokotnik(765, 734),
            new NovTip1(new int[]{363, 813, 2, 162, 680, 513, 405, 632, 809, 517}),
            new NovTip1(new int[]{874, 931, 286}),
            new Tretja.Pravokotnik(602, 477),
            new Tretja.Pravokotnik(356, 607),
            new NovTip1(new int[]{907, 748}),
            new Tretja.Kvader(298, 684, 674),
            new NovTip1(new int[]{785, 674, 57, 559, 70, 936, 654, 344, 543}),
            new Tretja.Kvader(268, 111, 62),
            new NovTip1(new int[]{17, 835}),
            new Tretja.Kvader(912, 882, 561),
            new NovTip1(new int[]{585, 752, 257, 333, 489, 968}),
            new Tretja.Pravokotnik(10, 388),
            new Tretja.Kvader(627, 947, 517),
            new Tretja.Kvader(159, 341, 414),
            new Tretja.Kvader(318, 207, 409),
            new NovTip1(new int[]{178, 947, 909, 794, 975, 8, 498, 597}),
            new NovTip1(new int[]{3, 38, 796, 157, 909, 335}),
            new Tretja.Pravokotnik(520, 800),
            new Tretja.Pravokotnik(81, 270),
            new Tretja.Pravokotnik(17, 590),
            new Tretja.Pravokotnik(411, 427),
            new Tretja.Pravokotnik(160, 954),
            new Tretja.Kvader(484, 67, 48),
            new Tretja.Pravokotnik(266, 248),
            new NovTip1(new int[]{964, 867, 980, 613, 620, 169}),
            new Tretja.Kvader(977, 716, 286),
            new Tretja.Kvader(748, 655, 987),
            new NovTip1(new int[]{895, 379, 751, 74, 834, 216, 794, 555}),
            new NovTip1(new int[]{84, 985, 688, 511, 459, 858, 469, 891}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
