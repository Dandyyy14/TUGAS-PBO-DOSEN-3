public class Prisma extends Segitiga {
    // Volume Prisma Segitiga
    public double volume(double alas, double tinggiAlas, double tinggiPrisma) {
        double luasAlas = luas(alas, tinggiAlas); // panggil luas dari Segitiga
        return luasAlas * tinggiPrisma;
    }

    // Luas Permukaan Prisma Segitiga
    public double luasPermukaan(double a, double b, double c, double alas, double tinggiAlas, double tinggiPrisma) {
        double luasAlas = luas(alas, tinggiAlas);
        double kelilingAlas = keliling(a, b, c);
        return (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
    }
}
