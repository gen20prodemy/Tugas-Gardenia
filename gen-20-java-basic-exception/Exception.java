public class Exception {

    public static void main(String[] args) {
        try {
            //Panggil method yang  menangani validasi input paramter
            InputValidation.validateParameter(-11);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: "  + e.getMessage());
        }

        try {
            //Panggil method yang menggunakan throw untuk validasi input parameter
            InputProsesor.prosesParameter(-11);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        //try {
            //Panggil method yang memanggil custom exception
            int x = Integer.parseInt("b");

            throwCustomException();
        //} catch (CustomException e) {
         //   System.out.println("Terjadi kesalahan: " + e.getMessage());
      //  }
    }

    public static void throwCustomException() throws CustomException {
        throw new CustomException("Ini adalah custom exception");
    }
}