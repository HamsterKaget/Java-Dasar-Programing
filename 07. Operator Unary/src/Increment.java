public class Increment {

    public static void main(String[] args) {

        /** Increment ( ++ )
         * Increment digunakan untuk menambah nilai suatu integer sebesar 1 ( sering digunakan dalam looping )
         *
         * Increment terbagi menjadi dua : 1. Post - Increment
         *                                 2. Pre - Increment
         *
         * Syntax :
         * (variabel)++
         * ++(variabel)
         */


        /** Post - Increment ( (variabel)++ )
         * Ketika ditempatkan setelah nama variabel, nilai operan bertambah tetapi nilai sebelumnya dipertahankan
         * sementara sampai eksekusi pernyataan ini dan diperbarui sebelum eksekusi pernyataan berikutnya.
         *
         * Syntax :
         * (variabel)++
         */

        // Deklarasi variabel
        int post = 1;

        System.out.printf("Nilai sebelum increment %d\n", post);

        // Melakukan increment
        post++; // Nilai bertambah 1

        System.out.printf("Nilai setelah post incement %d\n", post);

        /*
            Ada hal yang harus diperhatikan dalam post prefix , jika dilakukan di dalam print / statement
            maka nilai tidak akan bertambah terlebih dahulu , code yang dituliskan setelah post increment
            baru nilai tersebut ditambah
         */

        // Deklarasi variabel
        int post2 = 1;

        // Melakukan increment di dalam print , nilai variabel tidak akan tercetak sebagai 2
        System.out.printf("Nilai awal : %d\nNilai setelah post-increment : %d", post2, post2++);


        /** Pre - Increment ( (variabel)++ )
         * Ketika ditempatkan sebelum nama variabel, nilai operan akan bertambah secara instan.
         *
         * Syntax :
         * ++(variabel)
         */

        // Deklarasi variabel
        int pre = 1;

        System.out.printf("Nilai sebelum increment %d\n", pre);

        // Melakukan increment
        ++pre; // Nilai bertambah 1

        System.out.printf("Nilai setelah post incement %d\n", pre);


        // Deklarasi variabel
        int pre2 = 1;

        // Melakukan Pre - Increment di dalam print , nilai variabel akan tercetak sebagai 2
        System.out.printf("Nilai awal : %d\nNilai setelah post-increment : %d", pre2, ++pre2);













    }

}
