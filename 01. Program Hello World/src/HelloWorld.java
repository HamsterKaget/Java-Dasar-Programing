public class HelloWorld {

    public static void main(String[] args) {

        /**
         * Dalam java Untuk Mem-print output ke console umumnya kita menggunakan `System.out.println()`
         */
        System.out.println("Hello World !");

        /**
         * namun kita bisa menggunakan beberapa cara untuk mencetak output ke console, antara Lain :
         */
        System.out.print("Hello Java ! ");      // -> Untuk memprint sesuatu ke console tanpa enter di akhir
        System.out.println("Hello Python ! ");   // -> Untuk memprint sesuatu ke console dengan enter di akhir
        System.out.printf("Hello C++ ! \n");       // -> Untuk memprint namun bisa kita format / mix menggunakan tipe data lain
        System.err.println("Hello\sError ! ");    // -> Untuk memprint message error yang akan ditampilkan

        /**
         * kita bisa menggunakan beberapa syntax untuk membantu kita dalam memprint sesuatu ke console
         * `\n` -> untuk menambahkan Enter atau garis baru ke dalam output
         * `\s` -> untuk menambahkan Space atau 1 spasi ke dalam output
         * `\t` -> untuk menambahkan Tab atau 4 spasi ke dalam output
         * dan sebenarnya masih banyak lainnya yang bisa kita pakai , untuk lebih lengkap bisa mengunjungi dokumentasi Java itu sendiri
         */

    }

}
