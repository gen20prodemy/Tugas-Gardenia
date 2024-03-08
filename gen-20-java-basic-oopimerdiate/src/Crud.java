import java.util.Map;

public interface Crud { // buat interface Crud terlebih dahulu
    void tambahItem(Map<Integer, String> map, int key, String value);
    void hapusItem(Map<Integer, String> map, int key);
    void tampilkanItem(Map<Integer, String> map);
    void updateItem(Map<Integer, String> map, int key, String newValue);
}

//Implementasi Crud
class CrudImpl implements Crud {
    //Buat method untuk menambahkan item pada map
    @Override //lakukan overide
    public void tambahItem(Map<Integer, String> map, int key, String value) {
        map.put(key, value);
        System.out.println("Item baru berhasil ditambahkan.");
    }
    @Override
    public void hapusItem(Map<Integer, String> map, int key) {
        if (map.containsKey(key)) { //melakukan pemeriksaan apakah map beriiskan kunci yang diberikan
            map.remove(key); //menghapus item dengan kunci yang diberikan
            System.out.println("Item berhasil dihapus");
        } else {
            System.out.println("Item " + key + " tidak ditemukan.");
        }
    }

    @Override
    public void tampilkanItem(Map<Integer, String> map){
        System.out.println("Daftar Item: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }

    @Override
    public void updateItem(Map<Integer, String> map, int key, String newValue) {
        if (map.containsKey(key)) {
            map.put(key, newValue);
            System.out.println("Item berhasil diperbarui");
        } else {
            System.out.println("Item " + key + "tidak ditemukan.");
        }
    }
}
