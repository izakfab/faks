
import java.util.*;

public class Test08 {

    private static class NovTip1 extends Tretja.Oglat implements Tretja.DvaD {
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
            new Tretja.Pravokotnik(216, 430),
            new NovTip1(new int[]{514, 560, 945, 903, 687, 10, 949}),
            new Tretja.Pravokotnik(381, 512),
            new NovTip2(new int[]{43, 911, 925, 742, 718, 156, 475}),
            new NovTip1(new int[]{787, 846, 778, 356, 983, 376, 780, 685}),
            new Tretja.Kvader(620, 972, 410),
            new NovTip1(new int[]{46, 512, 529, 824, 375}),
            new NovTip2(new int[]{681, 546, 369, 83, 165}),
            new NovTip2(new int[]{22, 354, 862, 783}),
            new Tretja.Pravokotnik(54, 563),
            new Tretja.Kvader(565, 650, 25),
            new NovTip1(new int[]{865, 774}),
            new NovTip2(new int[]{392, 793, 850, 226, 180, 869}),
            new Tretja.Pravokotnik(708, 828),
            new Tretja.Kvader(77, 18, 326),
            new Tretja.Kvader(703, 823, 195),
            new Tretja.Kvader(804, 807, 607),
            new NovTip1(new int[]{839, 598, 994, 428, 882, 540, 954, 586, 198, 382}),
            new NovTip2(new int[]{687, 82}),
            new NovTip1(new int[]{614, 249, 85, 234, 409, 99, 562, 721}),
            new NovTip1(new int[]{23, 898}),
            new NovTip2(new int[]{866, 668, 6, 57}),
            new Tretja.Pravokotnik(267, 240),
            new Tretja.Pravokotnik(906, 525),
            new Tretja.Kvader(867, 282, 405),
            new Tretja.Pravokotnik(721, 506),
            new Tretja.Pravokotnik(441, 574),
            new NovTip1(new int[]{421, 981}),
            new NovTip1(new int[]{188, 899, 612, 1000, 609, 962, 358}),
            new NovTip2(new int[]{395, 597, 227, 541, 31, 709}),
            new Tretja.Pravokotnik(751, 632),
            new Tretja.Pravokotnik(706, 321),
            new Tretja.Kvader(89, 351, 864),
            new NovTip2(new int[]{202, 135, 285, 486, 267, 510, 831, 707}),
            new Tretja.Pravokotnik(8, 493),
            new Tretja.Kvader(975, 25, 3),
            new Tretja.Pravokotnik(156, 469),
            new Tretja.Kvader(416, 993, 64),
            new Tretja.Pravokotnik(937, 672),
            new Tretja.Pravokotnik(289, 520),
            new NovTip1(new int[]{387, 354, 705, 192, 59, 57}),
            new NovTip2(new int[]{651, 223, 221, 567, 592, 656, 236, 801}),
            new Tretja.Kvader(758, 349, 571),
            new Tretja.Pravokotnik(866, 106),
            new NovTip2(new int[]{877, 351, 319, 884}),
            new Tretja.Pravokotnik(673, 352),
            new Tretja.Pravokotnik(460, 659),
            new Tretja.Pravokotnik(208, 542),
            new NovTip1(new int[]{479, 717, 382, 443, 273, 486, 771}),
            new Tretja.Kvader(196, 824, 666),
            new Tretja.Kvader(698, 634, 520),
            new NovTip2(new int[]{126, 23, 264, 223, 626, 486, 952, 761, 132}),
            new NovTip1(new int[]{549, 735, 42, 605, 195, 948, 648, 69}),
            new Tretja.Pravokotnik(884, 594),
            new Tretja.Kvader(656, 581, 351),
            new Tretja.Kvader(473, 919, 536),
            new Tretja.Pravokotnik(922, 853),
            new NovTip1(new int[]{660, 658, 238}),
            new Tretja.Pravokotnik(346, 277),
            new NovTip2(new int[]{506, 515}),
            new NovTip2(new int[]{643, 352, 779, 451, 59, 495, 561, 842}),
            new Tretja.Pravokotnik(502, 327),
            new Tretja.Kvader(655, 62, 673),
            new Tretja.Pravokotnik(420, 240),
            new Tretja.Pravokotnik(537, 830),
            new Tretja.Pravokotnik(713, 505),
            new NovTip2(new int[]{746, 647, 654, 523, 288}),
            new Tretja.Kvader(102, 733, 858),
            new Tretja.Pravokotnik(979, 673),
            new NovTip1(new int[]{4, 190, 819, 255}),
            new Tretja.Pravokotnik(981, 642),
            new NovTip2(new int[]{534, 605, 708}),
            new NovTip1(new int[]{134, 302, 51, 155, 79, 802, 662}),
            new NovTip1(new int[]{492, 477, 139, 917, 800, 112, 181, 793, 829}),
            new Tretja.Kvader(234, 602, 368),
            new Tretja.Pravokotnik(484, 627),
            new Tretja.Kvader(173, 392, 776),
            new NovTip2(new int[]{835, 410, 362, 680, 36, 392, 26}),
            new NovTip1(new int[]{790, 860, 762, 62, 420, 313, 901, 837}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
