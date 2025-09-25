public class BangunBeraksi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + pp.luas(5, 3));
        System.out.println("Keliling Persegi Panjang: " + pp.keliling(5, 3));

        Segitiga s = new Segitiga();
        System.out.println("Luas Segitiga: " + s.luas(6, 4));
        System.out.println("Keliling Segitiga: " + s.keliling(3, 4, 5));

        Lingkaran l = new Lingkaran();
        System.out.println("Luas Lingkaran: " + l.luas(7));
        System.out.println("Keliling Lingkaran: " + l.keliling(7));

        Kubus k = new Kubus();
        System.out.println("Volume Kubus: " + k.volume(4));
        System.out.println("Luas Permukaan Kubus: " + k.luasPermukaan(4));

        Balok b = new Balok();
        System.out.println("Volume Balok: " + b.volume(5, 3, 2));
        System.out.println("Luas Permukaan Balok: " + b.luasPermukaan(5, 3, 2));

        Tabung t = new Tabung();
        System.out.println("Volume Tabung: " + t.volume(7, 10));
        System.out.println("Luas Permukaan Tabung: " + t.luasPermukaan(7, 10));
    }
}
