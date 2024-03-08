import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CrudImpl crud = new CrudImpl();
        Map<Integer, String> dataMap = new HashMap<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi yang diinginkan");
            System.out.println("1. Tambahkan Item");
            System.out.println("2. Hapus Item");
            System.out.println("3. Tampilkan Item");
            System.out.println("4. Update Item");
            System.out.println("0. Keluar");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Kunci: ");
                    int tambahKey = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Nilai");
                    String tambahValue = input.nextLine();
                    crud.tambahItem(dataMap, tambahKey, tambahValue);
                    break;
                case 2:
                    System.out.println("Masukkan Kunci Untuk Dihapus: ");
                    int hapusKey = input.nextInt();
                    crud.hapusItem(dataMap, hapusKey);
                    break;
                case 3:
                    System.out.println("Daftar Item: ");
                    crud.tampilkanItem(dataMap);
                    break;
                case 4:
                    System.out.println("Masukkan Kunci Untuk Diperbarui: ");
                    int updateKey = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Nilai Baru");
                    String updateValue = input.nextLine();
                    crud.updateItem(dataMap, updateKey, updateValue);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    System.out.println();

            }
        }
    }
}