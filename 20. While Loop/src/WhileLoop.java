public class WhileLoop {

    public static void main(String[] args) {

        /** While Loop ( while )
         * Java while loop adalah pernyataan aliran kontrol yang memungkinkan kode dieksekusi berulang kali berdasarkan
         * kondisi Boolean yang diberikan. Perulangan while dapat dianggap sebagai pernyataan if yang berulang.
         * Perulangan while di Java mulai digunakan ketika kita perlu mengeksekusi blok pernyataan berulang kali.
         * Perulangan while dianggap sebagai pernyataan if yang berulang. Jika jumlah iterasi tidak tetap, disarankan
         * untuk menggunakan perulangan while.
         *
         * Syntax :
         * while ( kondisi ) {
         *      // Code di tulis di sini
         *
         * }
         *
         */

        // Deklarasi Variabel
        int a = 0;

        // While Looping
        while( a < 10 ) {
            // Code ditulis disini
            System.out.println("Loop ke : " + a);
            a++; // <- variabel diupdate
        }

        /* note : variabel harus di update di dalam loop
        ! jika variabel tidak di update maka kondisi akan selalu true , sehingga akan terjadi infinite loop
        */




    }

}
