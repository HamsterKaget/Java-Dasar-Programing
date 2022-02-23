public class Decrement {

    public static void main(String[] args) {

        /** Decrement ( -- )
         * Decrement digunakan untuk mengurangi nilai suatu integer sebesar 1 ( sering digunakan dalam looping )
         *
         * Decrement terbagi menjadi dua : 1. Post - Decrement
         *                                 2. Pre - Decrement
         *
         * Syntax :
         * (variabel)--
         * --(variabel)
         */


        /** Post - Decrement ( (variabel)-- )
         * Ketika ditempatkan setelah nama variabel, nilai operan berkurang tetapi nilai sebelumnya dipertahankan
         * sementara sampai eksekusi pernyataan ini dan diperbarui sebelum eksekusi pernyataan berikutnya.
         *
         * Syntax :
         * (variabel)--
         */

        // Deklarasi variabel
        int post = 1;

        System.out.printf("Nilai sebelum Decrement %d\n", post);

        // Melakukan Decrement
        post--; // Nilai berkurang 1

        System.out.printf("Nilai setelah post incement %d\n", post);

        /*
            Ada hal yang harus diperhatikan dalam post prefix , jika dilakukan di dalam print / statement
            maka nilai tidak akan berkurang terlebih dahulu , code yang dituliskan setelah post Decrement
            baru nilai tersebut dikurang
         */

        // Deklarasi variabel
        int post2 = 1;

        // Melakukan Decrement di dalam print , nilai variabel tidak akan tercetak sebagai 0
        System.out.printf("Nilai awal : %d\nNilai setelah post-Decrement : %d", post2, post2--);


        /** Pre - Decrement ( (variabel)-- )
         * Ketika ditempatkan sebelum nama variabel, nilai operan akan berkurang secara instan.
         *
         * Syntax :
         * --(variabel)
         */

        // Deklarasi variabel
        int pre = 1;

        System.out.printf("Nilai sebelum Decrement %d\n", pre);

        // Melakukan Decrement
        --pre; // Nilai berkurang 1

        System.out.printf("Nilai setelah post incement %d\n", pre);


        // Deklarasi variabel
        int pre2 = 1;

        // Melakukan Pre Decrement di dalam print , nilai variabel akan tercetak sebagai 0
        System.out.printf("Nilai awal : %d\nNilai setelah post-Decrement : %d", pre2, --pre2);



    }

}
