
import java.util.*;

public class Test09 {

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
            new NovTip2(new int[]{979, 702, 667, 656, 728, 825}),
            new NovTip2(new int[]{537, 261}),
            new NovTip1(new int[]{427, 141, 268}),
            new NovTip3(new int[]{661, 195, 626}),
            new Tretja.Pravokotnik(788, 170),
            new NovTip3(new int[]{165, 352, 240, 688, 77}),
            new NovTip3(new int[]{397, 275, 497, 220, 205, 803, 526}),
            new Tretja.Pravokotnik(268, 875),
            new NovTip3(new int[]{976, 646}),
            new NovTip4(new int[]{276, 567, 115}),
            new NovTip3(new int[]{531, 118, 394}),
            new Tretja.Pravokotnik(851, 649),
            new NovTip3(new int[]{960, 53, 201, 395, 858, 932, 889, 350}),
            new NovTip4(new int[]{884, 777, 995, 980, 354, 409, 822, 430, 603, 564}),
            new NovTip3(new int[]{100, 355, 282, 814, 784, 211}),
            new NovTip3(new int[]{561, 873, 471, 802, 206}),
            new NovTip2(new int[]{17, 291, 617, 724}),
            new NovTip1(new int[]{654, 694, 430, 965, 180, 124}),
            new Tretja.Kvader(786, 299, 429),
            new Tretja.Kvader(591, 768, 508),
            new Tretja.Pravokotnik(298, 508),
            new NovTip1(new int[]{213, 572, 649, 549, 814, 347}),
            new Tretja.Pravokotnik(510, 240),
            new NovTip3(new int[]{600, 102, 17, 218, 79, 370, 607, 232, 442}),
            new NovTip4(new int[]{2, 514}),
            new NovTip3(new int[]{191, 169, 255, 225, 133, 41, 592}),
            new Tretja.Kvader(192, 544, 886),
            new NovTip2(new int[]{126, 571, 467}),
            new NovTip1(new int[]{30, 892}),
            new NovTip2(new int[]{923, 832, 929, 581, 883, 789, 290, 788}),
            new NovTip1(new int[]{779, 557, 52}),
            new Tretja.Kvader(744, 7, 650),
            new Tretja.Pravokotnik(216, 698),
            new NovTip2(new int[]{116, 684, 157, 691, 730, 193, 20, 187}),
            new Tretja.Pravokotnik(160, 927),
            new NovTip3(new int[]{316, 381, 662, 219}),
            new Tretja.Kvader(431, 935, 429),
            new NovTip1(new int[]{785, 328, 923, 815, 412, 547, 221, 881, 139, 708}),
            new Tretja.Pravokotnik(532, 409),
            new NovTip3(new int[]{454, 555, 664}),
            new NovTip3(new int[]{746, 661, 568, 962, 223, 171, 766, 859, 30, 866}),
            new Tretja.Kvader(123, 45, 275),
            new NovTip2(new int[]{466, 548, 925, 778, 178, 926}),
            new NovTip2(new int[]{467, 153, 323, 698, 528, 141, 599}),
            new Tretja.Pravokotnik(782, 242),
            new NovTip4(new int[]{360, 755, 728, 571, 497}),
            new Tretja.Pravokotnik(424, 528),
            new NovTip1(new int[]{132, 747, 511, 632, 6, 270, 692, 593, 499, 308}),
            new NovTip3(new int[]{754, 979}),
            new NovTip4(new int[]{254, 334, 651, 610, 795, 800, 347, 970, 13, 729}),
            new NovTip4(new int[]{708, 590, 640, 598, 579, 946, 656, 395}),
            new Tretja.Pravokotnik(587, 733),
            new NovTip2(new int[]{488, 606}),
            new NovTip3(new int[]{24, 140, 926, 641, 891}),
            new NovTip4(new int[]{389, 208, 392, 551, 588, 593, 367, 83, 668, 284}),
            new Tretja.Kvader(261, 720, 685),
            new Tretja.Pravokotnik(482, 23),
            new NovTip1(new int[]{844, 900, 805, 538, 701, 794, 969}),
            new NovTip1(new int[]{974, 421, 485, 248, 47}),
            new NovTip3(new int[]{917, 21, 552, 574, 27, 93, 266, 512, 915, 214}),
            new NovTip3(new int[]{832, 749, 471, 475, 760, 336, 559, 170, 92, 110}),
            new Tretja.Kvader(972, 963, 416),
            new Tretja.Kvader(188, 209, 113),
            new Tretja.Kvader(366, 176, 547),
            new NovTip4(new int[]{190, 564, 817, 866, 230}),
            new Tretja.Pravokotnik(956, 991),
            new NovTip4(new int[]{960, 434, 845, 301}),
            new NovTip1(new int[]{71, 69, 677, 912, 819, 511}),
            new Tretja.Pravokotnik(695, 556),
            new Tretja.Pravokotnik(521, 607),
            new NovTip4(new int[]{662, 458, 986, 852, 733, 45}),
            new Tretja.Pravokotnik(516, 420),
            new NovTip1(new int[]{511, 559, 530, 640, 897, 175, 437}),
            new NovTip4(new int[]{892, 579, 571, 437, 41, 37, 620, 329, 770, 115}),
            new NovTip1(new int[]{590, 966, 531, 981, 333, 602, 663, 261, 160}),
            new NovTip2(new int[]{748, 228, 673, 239}),
            new NovTip1(new int[]{653, 600, 213}),
            new Tretja.Kvader(884, 26, 406),
            new NovTip1(new int[]{949, 550, 128, 136, 959}),
            new Tretja.Pravokotnik(805, 791),
            new NovTip3(new int[]{975, 907, 491, 175}),
            new NovTip3(new int[]{890, 25, 654, 926, 4, 24}),
            new Tretja.Kvader(683, 342, 150),
            new NovTip2(new int[]{175, 186, 888, 26}),
            new NovTip4(new int[]{186, 481, 931, 616, 504, 311, 461, 910, 268, 450}),
            new Tretja.Kvader(798, 114, 551),
            new NovTip4(new int[]{826, 613, 605, 875, 425, 205}),
            new Tretja.Pravokotnik(886, 266),
            new NovTip2(new int[]{913, 924, 687, 607, 191, 168, 197, 683}),
            new NovTip3(new int[]{811, 763}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
