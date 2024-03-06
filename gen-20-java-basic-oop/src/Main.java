import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Makanan nasiGoreng = new Makanan("Nasi Goreng", 13000);
        Minuman airPutih = new Minuman("Air putih", 4000);
        Obat bodrex = new Obat("Bodrex", 500);

        System.out.println("Nama: " + nasiGoreng.getProduk() + ", Kategori: " + nasiGoreng.getKategori().getJenis() + ", Harga: " + nasiGoreng.getHarga());
        System.out.println("Nama: " + airPutih.getProduk() + ", Kategori: " + airPutih.getKategori().getJenis() + ", Harga: " + airPutih.getHarga());
        System.out.println("Nama: " + bodrex.getProduk() + ", Kategori: " + bodrex.getKategori().getJenis() + ", Harga: " + bodrex.getHarga());

    /*    Scanner input = new Scanner(System.in);

        List<Produk> daftarProduk = new ArrayList<>();

        boolean tambahLagi = true;
        while (tambahLagi) {
            System.out.println("Masukkan Kategori: ");
            String namaKategori = input.nextLine();
            Kategori kategori = new Kategori(namaKategori);

            System.out.println("Masukkan Produk: ");
            String namaProduk = input.nextLine();

            System.out.println("Masukkan Harga: ");
            double hargaProduk = input.nextDouble();
            input.nextLine();

            Produk produk = new Produk(namaProduk, hargaProduk, kategori);
            daftarProduk.add(produk);

            System.out.println("Produk berhasil ditambahkan.");
            System.out.println();
            System.out.println("Tambahkan produk lagi?");
            String jawaban = input.nextLine();
            tambahLagi = jawaban.equalsIgnoreCase("Y");
        }

        System.out.println("Daftar Produk: ");
        for (Produk produk : daftarProduk) {
            System.out.println("Nama: " + produk.getProduk());
            System.out.println("Kategori: " + produk.getKategori().getJenis());
            System.out.println("Harga: " + produk.getHarga());
            System.out.println("============================");
        }
       input.close(); */
    }
}
