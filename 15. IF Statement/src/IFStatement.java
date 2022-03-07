public class IFStatement {

    public static void main(String[] args) {

        /** IF Statement ( if )
         * Ini digunakan untuk memutuskan apakah pernyataan atau blok pernyataan tertentu akan dieksekusi atau tidak.
         * Jika pertanyaan kondisi bernilai true (terpenuhi) maka block code yang terdapat pada if statement akan dieksekusi
         * Jika pertanyaan kondisi bernilai false (tidak - terpenuhi) maka block code yang terdapat pada if statement akan dilewat
         *
         * Syntax :
         * if ( konsdisi ) {
         *     // pernyataan yang akan dieksekusi jika kondisi bernilai true ( terpenuhi )
         *
         *
         * }
         */


        // TODO : membuat if statement jika umur lebih dari atau sama dengan 18 tahun, cetak anda berhasil login

        int age = 18;

        // Kondisi di bawah bernilai true karena variabel age sama dengan 18
        if ( age >= 18 ) {
            System.out.println("Anda berhasil  login !"); // <- code akan di eksekusi karena kondisi berniali true
        }

        // Kondisi di bawah bernilai false karena variabel age tidak lebih dari 18
        if ( age > 18 ) {
            System.out.println("Ini tidak akan di print"); // <- code ini tidak akan dieksekusi karena kondisi bernilai false
        }

        System.out.println("Akhir dari program");

    }

}
