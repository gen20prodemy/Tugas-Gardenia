public class Obat extends Produk{
    public Obat(String obat, double harga) {
        super(obat, harga, new Kategori("Obat"));
    }

    @Override
    public double getHarga() {
        if (getProduk().equals("Bodrex")) {
            return 1500;
        }
        return super.getHarga();
    }
}
