public class Produk {
    private String namaProduk;
    private double harga;
    private Kategori kategori;

    public Produk(String produk, double harga, Kategori kategori) {
        this.namaProduk = produk;
        this.harga = harga;
        this.kategori=kategori;
    }

    public String getProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public Kategori getKategori() {
        return kategori;
    }
}
