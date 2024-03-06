//deklarasi class, class ini bertanggung jawab untuk melakukan validasi terhadap padameter yang diberikan
public class InputValidation { //Method yang  menangani validasi input paramter
    public static void validateParameter(int parameter) throws IllegalArgumentException { //Deklarasi method 'validateParameter' yang menerima satu parameter bertipe integer

        if (parameter <= 0) { //Ini adalah kondisi yang melakukan pemeriksaan terhadap paramter. Jika nilai parameter kurang dari atau sama dengan 0, kondisi ini akan dievaluasi sebagai 'true'.
            throw new IllegalArgumentException("Parameter harus lebih besar dari 0."); //Ini adalah bagian yang menangani ketika validasi gagal. Jika kondisi sebelumnya dievaluasi sebagai 'true' artinya pramater tidak valid, maka statement 'throw new IllegalArgumentException' akan membuat sebuah pengecualian baru ('IllegalArgumenException') dengan pesan yang seuai.
        }
    }
}
/* Kelas ini menyediakan sebuah method 'validateParameter' yang dapat digunakan untuk memeriksa apakah sebuah parameter
memiliki nilai yang valid atau tidak. Jika tida valid, maka method ini akan melemparkan pengecualian
'IllegalArgumentException' dengan pesan yang sesuai.*/