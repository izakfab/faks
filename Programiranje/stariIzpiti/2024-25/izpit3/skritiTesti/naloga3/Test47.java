
import java.util.*;

public class Test47 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.TriD {
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

    public static void main(String[] args) {
        Tretja.Oglat[] oglati = new Tretja.Oglat[]{
            new NovTip3(new int[]{98, 930, 17, 947, 200, 947, 794, 242, 104}),
            new Tretja.Kvader(928, 835, 224),
            new NovTip4(new int[]{171, 653, 353, 122, 305, 256, 221, 814, 746}),
            new NovTip2(new int[]{628, 925, 483, 219, 122, 3, 58, 326}),
            new NovTip2(new int[]{979, 474, 240, 607, 386, 186, 436}),
            new NovTip3(new int[]{338, 516, 832, 131, 287}),
            new NovTip3(new int[]{870, 991, 945, 490, 714, 512, 394, 458}),
            new NovTip4(new int[]{341, 119, 827, 214, 397, 906, 374, 925, 142, 510}),
            new NovTip2(new int[]{513, 246, 325, 147, 363, 996, 429, 669, 761}),
            new NovTip3(new int[]{779, 158, 820}),
            new NovTip2(new int[]{834, 879}),
            new NovTip1(new int[]{729, 855, 245}),
            new NovTip4(new int[]{42, 653, 375, 888, 525, 187, 32}),
            new Tretja.Kvader(432, 558, 730),
            new Tretja.Kvader(832, 875, 615),
            new NovTip1(new int[]{670, 195, 168, 113}),
            new NovTip2(new int[]{467, 509, 37, 4, 123, 872, 583, 846, 214, 137}),
            new NovTip4(new int[]{623, 503, 554, 657, 62}),
            new NovTip4(new int[]{913, 707, 938, 497, 86, 611, 906}),
            new Tretja.Pravokotnik(784, 498),
            new Tretja.Kvader(657, 784, 780),
            new NovTip1(new int[]{151, 600, 357, 10}),
            new NovTip1(new int[]{780, 877, 67}),
            new NovTip2(new int[]{303, 723, 16, 605, 296, 128, 92}),
            new Tretja.Pravokotnik(13, 200),
            new NovTip4(new int[]{163, 154}),
            new Tretja.Pravokotnik(891, 183),
            new NovTip3(new int[]{962, 370, 906, 870}),
            new Tretja.Pravokotnik(957, 188),
            new NovTip1(new int[]{89, 392, 605, 915, 917, 924, 30, 684}),
            new NovTip3(new int[]{212, 654, 389, 849, 603, 580, 384, 426, 751, 987}),
            new NovTip4(new int[]{349, 472, 397, 155, 946, 893, 908, 113}),
            new NovTip1(new int[]{36, 751, 539, 375}),
            new Tretja.Pravokotnik(730, 995),
            new NovTip1(new int[]{894, 646}),
            new Tretja.Kvader(588, 629, 59),
            new NovTip3(new int[]{405, 79, 560, 657}),
            new NovTip1(new int[]{809, 87, 754, 954, 836, 657, 583, 851, 127, 568}),
            new NovTip4(new int[]{152, 404, 453, 72, 671, 711, 224}),
            new NovTip4(new int[]{996, 974, 89, 766, 259}),
            new Tretja.Pravokotnik(59, 437),
            new NovTip2(new int[]{399, 294, 932, 437}),
            new Tretja.Kvader(192, 558, 500),
            new Tretja.Kvader(318, 433, 284),
            new NovTip3(new int[]{309, 944, 323, 984, 997, 665, 996, 607}),
            new Tretja.Pravokotnik(903, 744),
            new Tretja.Pravokotnik(456, 80),
            new Tretja.Kvader(880, 586, 774),
            new NovTip3(new int[]{618, 212, 565}),
            new Tretja.Pravokotnik(684, 778),
            new Tretja.Pravokotnik(177, 998),
            new Tretja.Pravokotnik(585, 331),
            new Tretja.Kvader(16, 865, 523),
            new Tretja.Pravokotnik(165, 365),
            new NovTip3(new int[]{401, 133, 110, 180, 907, 411, 123, 351}),
            new NovTip4(new int[]{372, 479}),
            new Tretja.Pravokotnik(511, 39),
            new NovTip3(new int[]{662, 599, 483, 371, 104}),
            new Tretja.Pravokotnik(270, 698),
            new NovTip1(new int[]{357, 56, 611}),
            new NovTip1(new int[]{123, 679, 198, 486, 757, 459, 250, 7, 256, 356}),
            new Tretja.Kvader(942, 745, 184),
            new NovTip2(new int[]{924, 338, 224, 430, 188}),
            new Tretja.Pravokotnik(269, 93),
            new NovTip4(new int[]{441, 795, 755, 931}),
            new NovTip2(new int[]{307, 957, 408}),
            new NovTip2(new int[]{117, 378, 522, 842, 380}),
            new NovTip3(new int[]{143, 952, 171, 340, 743, 274, 480, 975, 388, 414}),
            new NovTip4(new int[]{61, 569, 608, 802, 150}),
            new NovTip3(new int[]{741, 719, 365}),
            new NovTip2(new int[]{232, 366, 895, 677, 60, 710, 78, 814}),
            new Tretja.Kvader(415, 561, 22),
            new NovTip3(new int[]{371, 610, 488}),
            new NovTip2(new int[]{907, 429, 151, 288, 340, 312, 321, 948, 575, 340}),
            new NovTip3(new int[]{319, 167, 607, 622, 36, 512, 14, 324}),
            new NovTip1(new int[]{680, 614, 17, 957, 957, 713, 385}),
            new NovTip3(new int[]{267, 124}),
            new NovTip1(new int[]{369, 576, 446, 658, 58, 66, 407, 878, 598, 498}),
            new Tretja.Kvader(964, 503, 10),
            new Tretja.Pravokotnik(239, 539),
            new NovTip1(new int[]{752, 299}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
