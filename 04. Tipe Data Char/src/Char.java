/** Tipe Data Char
 * Dalam Java , Char digunakan untuk menampung singgle character baik itu menggunakan huruf , angka , maupun symbol
 * Variabel yang didefinisikan menampung tipe data ini membutuhkan 2 byte memory karena secara bawaan java,
 * sudah mendukung karakter Unicode ( yang lebih luas daripada 256 karakter ASCII )
 */

public class Char {

    public static void main(String[] args) {

        /** Penulisan Char
         * Untuk menuliskan Char di Java yaitu `Char <namaVariabel> = '<value>' ` <- diapit singgle quote (` `)
         */

        /** Char ( Tipe Data Singgle Character ) {
         *      - default value : 	'\u0000'
         *      - Ukuran Memory : 16 bit / 2 byte
         *      - Hanya dapat menyimpan 1 character tiap variabel
         *      - Penulisan value char ada berbagai macam , akan dibahas di iterasi tipe data
         * }
         */
        char grade = 'A';

        System.out.println(grade);


    }

}
