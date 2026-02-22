
import java.util.*;

public class Test30 {

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

    private static class NovTip3 extends Tretja.Oglat implements Tretja.DvaD {
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
            new Tretja.Kvader(472, 19, 367),
            new NovTip4(new int[]{787, 763}),
            new NovTip1(new int[]{636, 733}),
            new NovTip1(new int[]{537, 738, 714, 449, 54, 116, 846, 576, 454}),
            new NovTip2(new int[]{426, 897, 977, 795, 121, 636, 541, 219}),
            new Tretja.Kvader(725, 307, 763),
            new NovTip2(new int[]{383, 421, 664, 486, 638, 912, 584, 138}),
            new NovTip2(new int[]{752, 219}),
            new Tretja.Kvader(440, 222, 358),
            new NovTip5(new int[]{380, 231, 441, 267, 1000, 145, 704}),
            new Tretja.Pravokotnik(305, 136),
            new NovTip3(new int[]{151, 35, 633, 571, 715, 204, 897, 918, 20, 457}),
            new Tretja.Kvader(199, 951, 709),
            new NovTip1(new int[]{195, 168, 703, 918, 897, 821, 717, 695, 503}),
            new NovTip5(new int[]{202, 23, 895, 986, 592}),
            new Tretja.Kvader(115, 625, 426),
            new NovTip3(new int[]{794, 316, 735, 796, 106}),
            new NovTip2(new int[]{136, 2, 158, 378, 323, 664, 552, 786, 210, 701}),
            new NovTip3(new int[]{413, 133, 686}),
            new NovTip3(new int[]{809, 304, 832, 397, 238, 327, 418, 396, 495}),
            new NovTip5(new int[]{873, 738, 796, 685, 785, 506, 803}),
            new Tretja.Pravokotnik(406, 226),
            new NovTip4(new int[]{526, 902, 615, 291, 54, 266}),
            new NovTip5(new int[]{658, 833}),
            new NovTip1(new int[]{703, 909, 679, 232, 353, 991}),
        };
        System.out.println(Tretja.najRazlika(oglati));
    }
}
