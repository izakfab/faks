public class Premica {
	private double k, n;

    public Premica(double k, double n) {
		this.k = k;
		this.n = n;
    }

    public double vrniK() {
        return k;
    }

    public double vrniN() {
        return n;
    }

    public String toString() {
        return String.format(java.util.Locale.US, "y = %.2f x + %.2f", k, n);
    }

    public Tocka tockaPriX(double x) {
        return new Tocka(x, this.k * x + this.n);
    }

    public static Premica skoziTocko(double k, Tocka t) {
        return new Premica(k, t.vrniY() - k * t.vrniX());
    }

    public Premica vzporednica(Tocka t) {
        return skoziTocko(this.k, t);
    }

    public Premica pravokotnica(Tocka t) {
        return skoziTocko(-1/this.k, t);
    }

    public Tocka presecisce(Premica p, double epsilon) {
		if (Math.abs(this.k - p.vrniK()) >= epsilon) {
			double x = (this.n - p.vrniN()) / (p.vrniK() - this.k);
			return this.tockaPriX(x);
		}
        return null;
    }

    public Tocka projekcija(Tocka t) {
        return this.presecisce(this.pravokotnica(t), 0.0);
    }

    public double razdalja(Tocka t) {
        return t.razdalja(this.projekcija(t));
    }

    public double razdaljaOdIzhodisca() {
        return this.razdalja(Tocka.izhodisce());
    }

    public double razdalja(double n) {
        return this.razdalja(new Tocka(0.0, n));
    }
}
