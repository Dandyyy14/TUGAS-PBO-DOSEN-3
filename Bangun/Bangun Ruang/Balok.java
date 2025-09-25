// Balok (inherit dari PersegiPanjang)
public class Balok extends PersegiPanjang {
    public double volume(double p, double l, double t) {
        return p * l * t;
    }

    public double luasPermukaan(double p, double l, double t) {
        return 2 * (p*l + p*t + l*t);
    }
}
