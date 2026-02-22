
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode <klasificiraj>
06--10: klici metode <najRazlika>

01, 06: ro"cno izdelana
02--05, 07--10: samodejno izdelani
*/

import java.util.*;

public class Tretja {

    // po potrebi dopolnite ...

    public static int[] klasificiraj(Object[] objekti) {
        // popravite / dopolnite ...
        return null;
    }

    public static Oglat najRazlika(Oglat[] oglati) {
        // popravite / dopolnite ...
        return null;
    }

    //=========================================================================

    public static interface DvaD {
    }

    public static interface TriD {
    }

    public static abstract class Okrogel {
        protected int[] polosi;

        protected Okrogel(int[] polosi) {
            this.polosi = polosi;
        }
    }

    public static abstract class Oglat {
        protected int[] stranice;

        protected Oglat(int[] stranice) {
            this.stranice = stranice;
        }
    }

    public static class Krog extends Okrogel implements DvaD {
        public Krog(int polmer) {
            super(new int[]{polmer, polmer});
        }

        @Override
        public String toString() {
            return String.format("Krog(%d)", this.polosi[0]);
        }
    }

    public static class Krogla extends Okrogel implements TriD {
        public Krogla(int polmer) {
            super(new int[]{polmer, polmer, polmer});
        }

        @Override
        public String toString() {
            return String.format("Krogla(%d)", this.polosi[0]);
        }
    }

    public static class Pravokotnik extends Oglat implements DvaD {
        public Pravokotnik(int a, int b) {
            super(new int[]{a, b});
        }

        @Override
        public String toString() {
            String s = Arrays.toString(this.stranice);
            return String.format("Pravokotnik(%s)", s.substring(1, s.length() - 1));
        }
    }

    public static class Kvader extends Oglat implements TriD {
        public Kvader(int a, int b, int c) {
            super(new int[]{a, b, c});
        }

        @Override
        public String toString() {
            String s = Arrays.toString(this.stranice);
            return String.format("Kvader(%s)", s.substring(1, s.length() - 1));
        }
    }
}
