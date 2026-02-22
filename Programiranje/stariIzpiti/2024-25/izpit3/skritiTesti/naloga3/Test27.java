
import java.util.*;

public class Test27 {

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
            new NovTip5(new int[]{559, 814, 73, 755}),
            new NovTip3(new int[]{933, 417, 254, 107, 542, 839, 378, 808}),
            new NovTip5(new int[]{150, 885, 21}),
            new NovTip4(new int[]{371, 485, 776, 156, 450, 245, 481, 576, 826, 241}),
            new NovTip2(new int[]{242, 547}),
            new NovTip4(new int[]{336, 301, 424, 245}),
            new Tretja.Pravokotnik(137, 156),
            new NovTip3(new int[]{900, 255}),
            new Tretja.Kvader(895, 311, 682),
            new NovTip4(new int[]{830, 438, 236}),
            new NovTip4(new int[]{81, 429, 735, 768, 391, 885}),
            new NovTip4(new int[]{973, 658, 675, 832}),
            new NovTip2(new int[]{568, 921, 552, 312}),
            new NovTip2(new int[]{66, 274, 484, 885}),
            new NovTip4(new int[]{434, 845, 687, 995, 4, 836, 315, 562, 837, 814}),
            new Tretja.Kvader(955, 999, 705),
            new Tretja.Pravokotnik(384, 449),
            new NovTip1(new int[]{36, 206, 218, 295, 887, 132}),
            new NovTip3(new int[]{223, 228, 824, 223, 446, 694, 488, 559}),
            new NovTip5(new int[]{236, 465, 768}),
            new NovTip4(new int[]{571, 707, 773, 943, 815, 80}),
            new NovTip3(new int[]{147, 379, 514, 860, 612, 682, 249, 118}),
            new NovTip3(new int[]{431, 258, 290, 308, 825}),
            new NovTip5(new int[]{533, 164, 847, 890, 246, 370, 533, 23, 339}),
            new NovTip4(new int[]{514, 58, 28, 417, 373, 303, 139, 868, 529}),
            new Tretja.Kvader(161, 689, 325),
            new NovTip1(new int[]{796, 407, 294, 662, 629}),
            new NovTip3(new int[]{464, 388, 93, 965, 87, 611, 237}),
            new NovTip3(new int[]{111, 703, 613, 883, 774, 981}),
            new NovTip5(new int[]{10, 306, 642, 27, 122, 834, 871, 809, 308, 310}),
            new Tretja.Pravokotnik(251, 696),
            new NovTip4(new int[]{600, 162, 845, 186, 139, 427, 17}),
            new Tretja.Kvader(335, 66, 551),
            new Tretja.Kvader(454, 698, 977),
            new NovTip4(new int[]{875, 571, 550}),
            new NovTip4(new int[]{789, 134}),
            new Tretja.Kvader(612, 852, 676),
            new NovTip4(new int[]{456, 958, 902, 318, 622, 203, 865, 301, 503}),
            new NovTip3(new int[]{420, 964, 596, 98, 289, 630}),
            new NovTip5(new int[]{183, 968, 872, 313, 890, 482, 413}),
            new NovTip4(new int[]{989, 247}),
            new NovTip3(new int[]{507, 386}),
            new Tretja.Pravokotnik(559, 393),
            new NovTip2(new int[]{304, 55, 662}),
            new NovTip1(new int[]{18, 311, 413, 249, 71, 758}),
            new NovTip1(new int[]{459, 712, 661}),
            new Tretja.Kvader(205, 617, 63),
            new NovTip4(new int[]{971, 625, 770, 133, 370, 359, 824}),
            new NovTip4(new int[]{793, 295, 185, 312}),
            new NovTip3(new int[]{752, 684, 8, 240, 875, 748, 544, 425, 471, 276}),
            new NovTip5(new int[]{880, 628, 914, 42, 694, 22, 423, 72}),
            new NovTip1(new int[]{753, 779, 551, 543, 988, 474}),
            new Tretja.Kvader(696, 336, 433),
            new NovTip1(new int[]{684, 318, 928, 171, 661, 839, 398, 427, 358, 756}),
            new NovTip1(new int[]{600, 843, 236, 98, 757}),
            new Tretja.Pravokotnik(158, 559),
            new NovTip5(new int[]{14, 501, 721, 796, 161, 514, 564}),
            new Tretja.Pravokotnik(254, 597),
            new NovTip5(new int[]{159, 626, 740}),
            new NovTip2(new int[]{770, 938, 447, 625, 981, 396, 135, 196, 219}),
            new NovTip1(new int[]{380, 329, 40, 897, 490, 672, 372}),
            new NovTip3(new int[]{709, 458}),
            new NovTip1(new int[]{51, 419, 497, 664, 319}),
            new NovTip3(new int[]{710, 713, 200, 726, 543, 555, 845, 723}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
