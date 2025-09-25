// MatematikaCanggih (inherit)
public class MatematikaCanggih extends Matematika {
    private String nim;
    private String nama;

    // Constructor
    public MatematikaCanggih(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Method tambahan
    public int modulus(int a, int b) {
        return a % b;
    }

    public void info() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
}
