public class DoWhileLoop {

    public static void main(String[] args) {

        /** Do - While Loop ( do )
         * Loop do-while Java adalah loop kontrol Keluar. Oleh karena itu, tidak seperti perulangan for atau while,
         * do-while memeriksa kondisi setelah mengeksekusi pernyataan atau badan perulangan.
         *
         * simpel nya do while loop akan menjalankan kode nya terlebih dahulu 1x kemudian baru memeriksa kondisi
         *
         * Syntax :
         * do {
         *
         *
         * } while ( kondisi / ekspresi )
         *
         *
         */


        // Todo : Membuat perulangan menggunakan do while loop

        // deklarasi variabel
        int a = 0;

        // Do While Loop
        do {
            System.out.println("Loop ke : " + a);
            a++;
        } while ( a < 10 );


        // Loop ke 2

        // deklarasi variabel
        int b = 0;

        // Do While Loop
        do {
            System.out.println("Loop Ke : " + b);
            b++;
        } while ( b > 5 ); // kondisi akan selalu bernilai false , tapi karena menggunakan do while loop , maka program
                          // akan menjalankan loop 1x terlebih dahulu baru memeriksa kondisi



    }

}
