public class CustomException extends RuntimeException { //deklarasi class

    public CustomException(String message) { //dekalrasi konstruktor untuk class 'CustomException' yang menerima satu parameter bertipe string ('String message')
        //konstruksi ini digunakan untuk membuat objek 'CustomExceprion' dengan pesan yang ditentukan.
        super(message); // ini adalah panggikaln konstrukstor dari superclass, yaitu class 'RuntimeException'. Dengan menggunakan 'super(message)',
        //kita meneruskan pesan yang diterima ke konstruktor superclass, yang kemudian akan ditangani dan diatur sebagai pesan pengecualian.
    }
}
/* class ini menyediakan sebuah pengecualian kustom yang dapat digunakan dalam program untuk menangani situsai tertentu.
pengecualian ini dapat dilemparkan dengan pesan yang dapat disesuaikan dengan kebutuhan.
 */