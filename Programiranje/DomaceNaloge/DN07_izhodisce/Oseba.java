public class Oseba {

	public String IP;
	public char spol;
	public int starost;

    public Oseba(String ip, char spol, int starost) {
		this.IP = ip;
		this.spol = spol;
		this.starost = starost;
    }

    public String toString() {
        return String.format("%s, %c, %d", IP, spol, starost);
    }

    public boolean jeStarejsaOd(Oseba os) {
        return starost > os.starost;
    }
}
