import java.util.*;

public class Main {

    public static void tampilkanDataBarang (List<String> dataBarang) {
        System.out.println("Data Barang");
        for (String barang : dataBarang) {
            System.out.println(barang);
        }
    }

    public static void tampilkanSalahSatuData(List<String> dataBarang) {
        if (!dataBarang.isEmpty()) {
            System.out.println();
            System.out.println("Salah satu data barang: ");
            System.out.println(dataBarang.get(4));
            System.out.println();
        } else {
            System.out.println("Tidak ada barangnya ngab.");
        }
    }

    public static <T> Set <T> konversiCollection(List<T> dataBarang, Class<?> jenisCollection) {
        if (jenisCollection == List.class) {
            return new HashSet<>(dataBarang);
        } else if (jenisCollection == HashSet.class) {
            return new HashSet<>(dataBarang);
        } else {
            System.out.println("Jenis Collection Tidak Valid!");
            return null;
        }
    }

    public static void main(String[] args) {
        //Contoh data barang
        List<String> dataBarang = new ArrayList<>();
        dataBarang.addAll(Arrays.asList("Baju", "Celana", "Sepatu", "Topi", "Kemeja"));

        //Menampilkan data barang
        tampilkanDataBarang(dataBarang);

        //Menampilkan salah satu data barang
        tampilkanSalahSatuData(dataBarang);

        //Konversi barang ke jenis collection lain
        Set<String> dataBarangKonversi = konversiCollection(dataBarang,HashSet.class);

        //Mencetak data barang yang telah dikonversi
        System.out.println("Data Barang setelah di konversi: ");
        Iterator<String> iterator = dataBarangKonversi.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
