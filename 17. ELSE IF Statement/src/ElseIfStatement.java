import java.util.Scanner; // <- import module yang dibutuhkan

public class ElseIfStatement {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        /** if Else-if Statement ( else if )
         * pengguna dapat memutuskan di antara beberapa opsi. Pernyataan if dieksekusi dari atas ke bawah.
         * Segera setelah salah satu kondisi yang mengendalikan if benar, pernyataan yang terkait dengan itu jika
         * dieksekusi, dan sisa tangga dilewati. Jika tidak ada kondisi yang benar, maka pernyataan else terakhir akan
         * dieksekusi.
         *
         * Syntax :
         * if ( kondisi ) {
         *
         * } else if ( kondisi ) {
         *
         * } else if ( kondisi ) {
         *
         * }
         *
         * note :
         * else if bisa digunakan sebanyak apapun yang kamu mau
         *
         */

        // todo : membuat pengkondisian umur dan nilai

        // Deklarasi Variabel
        int umurUser1;
        double nilaiUser1;

        // Mengambil user input dan memasukan nya ke dalam variabel
        System.out.print("Umur : ");
        umurUser1 = userInput.nextInt();

        System.out.print("Nilai : ");
        nilaiUser1 = userInput.nextDouble();

        // Pengkondisian
        if ( umurUser1 >= 18 && nilaiUser1 >= 75 ) {
            System.out.println("Anda Berhasil Daftar");
        } else if ( umurUser1 < 18 ) {
            System.out.println("Umur Anda Tidak Cukup !, Anda tidak dapat daftar");
        } else if ( nilaiUser1 < 75 ) {
            System.out.println("Nilai Anda Tidak Cukup !, Anda tidak dapat daftar");
        }


    }

}
