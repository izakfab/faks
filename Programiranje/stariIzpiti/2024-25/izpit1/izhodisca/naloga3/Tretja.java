
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode <monokultura>
06--10: klici metode <meraSosednosti>
01, 06: ro"cno izdelana
02--05, 07--10: samodejno izdelani

Primera 01 in 06 vsebujeta iste grede, razlikujeta se le po klicih metod.
*/

import java.util.*;

public class Tretja {

    // Dopolnite lahko katerikoli razred, lahko pa dodate tudi lastne notranje
    // razrede.

    private static final int[][] SOSEDNOST = {
        //                 C,  F,  G,  K,  P,  Z
        /* Cebula */    {  0, -1, -1,  1,  1,  0 },
        /* Fizol */     { -1,  0, -1,  0,  0,  1 },
        /* Grah */      { -1, -1,  0,  1,  0,  1 },
        /* Korenje */   {  1,  0,  1,  0, -1, -1 },
        /* Petersilj */ {  1,  0,  0, -1,  0, -1 },
        /* Zelena */    {  0,  1,  1, -1, -1,  0 },
    };

    private static final String[] RAZREDI = {
        "Cebula", "Fizol", "Grah", "Korenje", "Petersilj", "Zelena"
    };

    //=========================================================================

    public static class Vrt {
        private Vrtnina[][] grede;

        public Vrt(Vrtnina[][] grede) {
            this.grede = grede;
        }

        public boolean monokultura(int ixGrede) {
            // popravite / dopolnite ...
			if (grede[ixGrede].length == 0) {
				return true;
			}
			String prvaVrtnina = grede[ixGrede][0].imeRazreda();

			for (int i = 0; i < grede[ixGrede].length; i++) {
				if (!grede[ixGrede][i].imeRazreda().equals(prvaVrtnina)) {
					return false;
				}
			}
            return true;
        }

        public int meraSosednosti() {
            // popravite / dopolnite ...
			int mera = 0;
			for (int i = 0; i < grede.length; i++) {
				for (int j = 0; j < grede[i].length; j++) {
					int indexTipa = Arrays.binarySearch(RAZREDI, grede[i][j].imeRazreda());
					if (j != 0) {
						int indexSoseda = Arrays.binarySearch(RAZREDI, grede[i][j - 1].imeRazreda());
						mera += SOSEDNOST[indexTipa][indexSoseda];
					} 
					if (j != grede[i].length - 1) {
						int indexSoseda = Arrays.binarySearch(RAZREDI, grede[i][j + 1].imeRazreda());
						mera += SOSEDNOST[indexTipa][indexSoseda];
					}
				}
			}
            return mera / 2;
        }
    }

    //=========================================================================

    public static abstract class Vrtnina {

        public String imeRazreda() {
            return this.getClass().getSimpleName();
        }
    }

    //=========================================================================

    public static class Cebula extends Vrtnina {
    }

    //=========================================================================

    public static class Fizol extends Vrtnina {
    }

    //=========================================================================

    public static class Grah extends Vrtnina {
    }

    //=========================================================================

    public static class Korenje extends Vrtnina {
    }

    //=========================================================================

    public static class Petersilj extends Vrtnina {
    }

    //=========================================================================

    public static class Zelena extends Vrtnina {
    }
}
