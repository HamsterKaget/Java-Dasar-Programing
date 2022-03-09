public class ElseStatement {

    public static void main(String[] args) {

        /** Else Statement ( else )
         * Pernyataan if sendiri memberi tahu kita bahwa jika suatu kondisi benar, itu akan mengeksekusi blok pernyataan
         * dan jika kondisinya salah, itu tidak akan dilakukan. Tetapi bagaimana jika kita ingin melakukan sesuatu yang
         * lain jika kondisinya salah. Di sinilah pernyataan lain. Kita dapat menggunakan pernyataan else dengan
         * pernyataan if untuk mengeksekusi blok kode ketika kondisinya salah.
         *
         * Singkatnya , Code di dalam Else Statement akan dieksekusi jika kondisi di pertanyaan if dan else if tidak ada
         * yang terpenuhi / false
         *
         * Syntax :
         *
         * if ( kondisi ) {
         *
         *
         * }
         * else {
         *      // Code di tulis di sini
         *
         *
         * }
         *
         */

        // Todo : Membuat Pengkondisian umur

        int userUmur1 = 24;

        // Kondisi if bernilai true , maka code di dalam if statement akan di eksekusi
        if ( userUmur1 >= 18 ) {
            System.out.println("Anda berhasil Login !"); // <- ini di print
        } else {
            System.out.println("Umur Anda Tidak Cukup !");
        }

        int userUmur2 = 15;

        // Kondisi if bernilai false , maka code di dalam if akan dilewat dan code di dalam else akan di eksekusi
        if ( userUmur2 >= 18 ) {
            System.out.println("Anda berhasil Login !");
        } else {
            System.out.println("Umur Anda Tidak Cukup !"); // <- ini di print
        }


    }

}
