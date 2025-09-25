// Tabung (inherit dari Lingkaran)
public class Tabung extends Lingkaran {
    public double volume(double r, double t) {
        return Math.PI * r * r * t;
    }

    public double luasPermukaan(double r, double t) {
        return 2 * Math.PI * r * (r + t);
    }
}
