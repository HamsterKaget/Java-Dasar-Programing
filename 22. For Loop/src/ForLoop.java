public class ForLoop {

    public static void main(String[] args) {

        /** For Loop ( for )
         * Java for loop menyediakan cara singkat untuk menulis struktur loop. Pernyataan for menggunakan inisialisasi,
         * kondisi, dan kenaikan/penurunan dalam satu baris sehingga memberikan struktur perulangan yang lebih pendek
         * dan mudah di-debug.
         *
         * Syntax :
         * for ( inisiasi variabel; kondisi; update variabel) {
         *      // Code di tulis di sini
         *
         * }
         */

        // Todo :  membuat loop menggunakan for

        for ( int a = 0; a < 10; a++ ) {
            System.out.println("Loop ke : " + a);
            // Tidak perlu mengupdate variabel di dalam loop , karena dalam for loop variabel sudah di update di atas
        }

        /* Note :
        * int  a = 0; <- merupakan inisiasi variabel
        * a < 10; <- meruapakan kondisi loop
        * a++ <- variabel di update
         */

    }

}
