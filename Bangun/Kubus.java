// Kubus (inherit dari Persegi)
public class Kubus extends Persegi {
    public double volume(double s) {
        return Math.pow(s, 3);
    }

    public double luasPermukaan(double s) {
        return 6 * (s * s);
    }
}
