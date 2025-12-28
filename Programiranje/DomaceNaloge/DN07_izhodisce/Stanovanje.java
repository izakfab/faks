public class Stanovanje {
	private Oseba[] stanovalci;
	public Stanovanje levi = null;
	public Stanovanje zgornji = null;
	public Stanovanje desni = null;
	public Stanovanje spodnji = null;

    public Stanovanje(Oseba[] stanovalci) {
		this.stanovalci = stanovalci;
    }

    public int steviloStanovalcev() {
        return stanovalci.length;
    }

    public int steviloStarejsihOd(Oseba os) {
		int counter = 0;

		for (Oseba stanovalec : stanovalci) {
			if (stanovalec.jeStarejsaOd(os)) {
				counter++;
			}
		}
        return counter;
    }

    public int[] mz() {
		int moskih = 0;
		int zensk = 0;

		for (Oseba stanovalec : stanovalci) {
			if (stanovalec.spol == 'M') {
				moskih++;
			} else {
				zensk++;
			}
		}

        return new int[]{moskih, zensk};
    }

    public Oseba starosta() {
		int max = -1;
		Oseba starosta = null;

		for (Oseba stanovalec : stanovalci) {
			if (stanovalec.starost > max) {
				max = stanovalec.starost;
				starosta = stanovalec;
			}
		}

        return starosta;
    }

    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
		this.levi = levi;
		this.zgornji = zgornji;
		this.desni = desni;
		this.spodnji = spodnji;
    }

    public Oseba starostaSosescine() {
		int max = -1;
		Oseba starosta = null;

		for (Oseba stanovalec : stanovalci) {
			if (stanovalec.starost > max) {
				max = stanovalec.starost;
				starosta = stanovalec;
			}
		}

		for (Oseba stanovalec : levi.stanovalci) {
			if (stanovalec.starost > max) {
				max = stanovalec.starost;
				starosta = stanovalec;
			}
		}

		for (Oseba stanovalec : zgornji.stanovalci) {
			if (stanovalec.starost > max) {
				max = stanovalec.starost;
				starosta = stanovalec;
			}
		}

		for (Oseba stanovalec : desni.stanovalci) {
			if (stanovalec.starost > max) {
				max = stanovalec.starost;
				starosta = stanovalec;
			}
		}

		for (Oseba stanovalec : spodnji.stanovalci) {
			if (stanovalec.starost > max) {
				max = stanovalec.starost;
				starosta = stanovalec;
			}
		}

        return starosta;
    }

    public Oseba[] sosedjeSosedov() {
		boolean zgornjiS[] = new boolean[3];
		boolean desniS = false;
		boolean spodnjiS[] = new boolean[3];
		boolean leviS = false;
		
		int sum = 0;

		if (zgornji != null) {
			if (zgornji.levi != null) {zgornjiS[0] = true; sum += zgornji.levi.steviloStanovalcev();}
			if (zgornji.zgornji != null) {zgornjiS[1] = true; sum += zgornji.zgornji.steviloStanovalcev();}
			if (zgornji.desni != null) {zgornjiS[2] = true; sum += zgornji.desni.steviloStanovalcev();}
		}
		if (desni != null && desni.desni != null) {desniS = true; sum += desni.desni.steviloStanovalcev();} 
		if (spodnji != null) {
			if (spodnji.levi != null) {spodnjiS[0] = true; sum += spodnji.levi.steviloStanovalcev();}
			if (spodnji.spodnji != null) {spodnjiS[1] = true; sum += spodnji.spodnji.steviloStanovalcev();}
			if (spodnji.desni != null) {spodnjiS[2] = true; sum += spodnji.desni.steviloStanovalcev();}
		}
		if (levi != null && levi.levi != null) {leviS = true; sum += levi.levi.steviloStanovalcev();}

		Oseba sosedje[] = new Oseba[sum];
		int index = 0;

		if (zgornjiS[0]) {
			for (Oseba stanovalec : zgornji.levi.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (zgornjiS[1]) {
			for (Oseba stanovalec : zgornji.zgornji.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (zgornjiS[2]) {
			for (Oseba stanovalec : zgornji.desni.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (desniS) {
			for (Oseba stanovalec : desni.desni.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (spodnjiS[0]) {
			for (Oseba stanovalec : spodnji.levi.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (spodnjiS[1]) {
			for (Oseba stanovalec : spodnji.spodnji.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (spodnjiS[2]) {
			for (Oseba stanovalec : spodnji.desni.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

		if (leviS) {
			for (Oseba stanovalec : levi.levi.stanovalci) {
				sosedje[index] = stanovalec;
				index++;
			}
		}

        return sosedje;
    }
}
