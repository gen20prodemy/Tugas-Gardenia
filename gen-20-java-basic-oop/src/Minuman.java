public class Minuman extends Produk {
    public Minuman(String minuman, double harga) {
        super(minuman, harga, new Kategori("Minuman"));
    }

    public double getHarga() {
        if (getProduk().equals("Air Putih")) {
            return 5000;
        }
        return super.getHarga();
    }

}
