
public class Ulomek {
    private long stevec;
    private long imenovalec;

    public Ulomek(long a, long b) {
        if (b < 0) {
            a = -a;
            b = -b;
        }
        long gcd = gcd(Math.abs(a), Math.abs(b));
        this.stevec = a / gcd;
        this.imenovalec = b / gcd;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.stevec, this.imenovalec);
    }

    public Ulomek negacija() {
        return new Ulomek(-this.stevec, this.imenovalec);
    }

    public Ulomek obrat() {
        return new Ulomek(this.imenovalec, this.stevec);
    }

    public Ulomek vsota(Ulomek u) {
        return new Ulomek(this.stevec * u.imenovalec + this.imenovalec * u.stevec,
                this.imenovalec * u.imenovalec);
    }

    public Ulomek razlika(Ulomek u) {
        return this.vsota(u.negacija());
    }

    public Ulomek zmnozek(Ulomek u) {
        return new Ulomek(this.stevec * u.stevec, this.imenovalec * u.imenovalec);
    }

    public Ulomek kolicnik(Ulomek u) {
        return this.zmnozek(u.obrat());
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
