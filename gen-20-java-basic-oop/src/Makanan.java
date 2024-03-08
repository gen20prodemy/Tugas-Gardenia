public class Makanan extends Produk {
    public Makanan (String makanan, double harga) {
        super(makanan, harga, new Kategori("Makanan"));
    }

    public double getHarga() {
        if (getProduk().equals("Nasi Goreng")) {
            return 15000;
        }
        return super.getHarga();
    }
}
