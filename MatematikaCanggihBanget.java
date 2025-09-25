// MatematikaCanggihBanget (inherit dari MatematikaCanggih)
public class MatematikaCanggihBanget extends MatematikaCanggih {
    public MatematikaCanggihBanget(String nim, String nama) {
        super(nim, nama);
    }

    // Method tambahan
    public int pertambahanTiga(int a, int b, int c) {
        return a + b + c;
    }
}
