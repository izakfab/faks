public class Tocka {
	
	private double x;
	private double y;

    public Tocka(double x, double y) {
		this.x = x;
		this.y = y;
    }

    public double vrniX() {
        return x;
    }

    public double vrniY() {
        return y;
    }

    public String toString() {
        return String.format(java.util.Locale.US, "(%.2f, %.2f)", x, y);
    }

    public static Tocka izhodisce() {
		Tocka izhodisce = new Tocka(0.0, 0.0);
        return izhodisce;
    }

    public double razdalja(Tocka t) {
        return Math.sqrt(Math.pow(t.vrniX() - x, 2) + Math.pow(t.vrniY() - y, 2));
    }

    public double razdaljaOdIzhodisca() {
        return this.razdalja(izhodisce());
    }
}
