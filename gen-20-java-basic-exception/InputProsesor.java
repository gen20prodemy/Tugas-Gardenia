
public class InputProsesor { //Deklarasi class

    public static void prosesParameter(int parameter) { //Delarasi method 'prosesParameter' yang menerima satu paramter bertipe integer('int parameter'). Method ini merupakan bagian penting dari kelas karena melakukan proses terhadap parameter yang diberikan.
        if (parameter <= 0) { // ini adalah kondisi yang melakukan pemeriksaan terhadap parameter. jika nilai parameter kurang dari atau sama dengan 0, kondisi ini akan dievaluasi sebagai 'true'
            throw new IllegalArgumentException("parameter harus lebih besar dari 0."); //ini adalah bagian yang menangani ketika validasi gagal. Jika kondisi sebelumnhya diecaluasi sebagai 'true', artinya parameter tidak valid, maka statement 'throw new IllegalArgumentException' akan membuat sebuah pengecualian baru dengan pesan yang sesuai.
        }
        // Lakukan proses lain jika validasi berhasil >> ini adalah bagian yang akan dieksekusi jika validasi parameter berhasil. jika parameter valid, maka proses lain yang diperlukan dapat dilakukan di dalam blok kode disini
    }
}
/*class ini menyediakan sebuah method 'prosesParameter' yang menggunakan mekanisme 'throw' untuk melakukan validasi
* terhdap sebuah parameter. jika parameter tidak valid, maka method ini akan melemparkan pengecualian
'IllegalArgumenException' dengan pesan yang sesuai
 */