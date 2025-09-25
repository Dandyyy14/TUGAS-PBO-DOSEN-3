// Class Beraksi (main)
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget m = new MatematikaCanggihBanget("2410631170155", "Dandy");

        m.info();
        System.out.println("Tambah (23+34.5) = " + m.pertambahan(23, 34.5));
        System.out.println("Tambah (12.5+28.7+14.2) = " + m.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Kurang (20-5) = " + m.pengurangan(20, 5));
        System.out.println("Kali (6*7) = " + m.perkalian(6, 7));
        System.out.println("Bagi int (20/4) = " + m.pembagian(20, 4));       // versi int
        System.out.println("Bagi double (20.0/4.0) = " + m.pembagian(20.0, 4.0)); // versi double
        System.out.println("Modulus (10%3) = " + m.modulus(10, 3));
        System.out.println("PertambahanTiga (5+10+15) = " + m.pertambahanTiga(5, 10, 15));
    }
}
