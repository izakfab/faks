
import java.util.*;

public class Test06 {

    private static interface SplosenD {
    }

    private static class Hiperkvader extends Tretja.Oglat implements SplosenD {
        public Hiperkvader(int[] stranice) {
            super(stranice);
        }

        @Override
        public String toString() {
            return String.format("Hiperkvader(%s)", Arrays.toString(this.stranice));
        }
    }

    public static void main(String[] args) {
        Tretja.Oglat[] oglati1 = new Tretja.Oglat[]{
            new Tretja.Pravokotnik(2, 5),
            new Tretja.Kvader(7, 5, 3),
            new Tretja.Pravokotnik(1, 9),
            new Tretja.Kvader(6, 11, 4),
            new Tretja.Kvader(5, 5, 5),
            new Tretja.Pravokotnik(5, 3)
        };
        System.out.println(Tretja.najRazlika(oglati1));

        Tretja.Oglat[] oglati2 = new Tretja.Oglat[]{
            new Tretja.Kvader(8, 5, 6),
            new Hiperkvader(new int[]{5, 7, 5, 6, 7, 6, 5}),
            new Tretja.Pravokotnik(4, 9),
            new Hiperkvader(new int[]{4, 7, 5, 3, 8, 6}),
        };
        System.out.println(Tretja.najRazlika(oglati2));

        Tretja.Oglat[] oglati3 = new Tretja.Oglat[]{
            new Tretja.Kvader(8, 5, 6),
            new Hiperkvader(new int[]{5, 7, 5, 6, 7, 6, 5}),
            new Tretja.Pravokotnik(6, 9),
            new Hiperkvader(new int[]{4, 7, 5, 3, 8, 6}),
        };
        System.out.println(Tretja.najRazlika(oglati3));
    }
}
