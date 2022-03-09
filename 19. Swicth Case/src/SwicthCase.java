import java.util.Scanner; // <- import modul yang dibutuhkan

public class SwicthCase {

    public static void main(String[] args) {

        /** Swicth Case ( Swicth )
         * Pernyataan switch adalah pernyataan cabang multiway. Ini menyediakan cara mudah untuk mengirimkan eksekusi ke
         * berbagai bagian kode berdasarkan nilai ekspresi.
         *
         * Syntax :
         *
         * swicth ( ekspresi / kondisi ) {
         *      case <value1>:
         *          // code di tulis disini
         *
         *      break; // <- ini harus ditambahkan di ahir setiap case
         *
         *      case <value2>:
         *          // code di tulis disini
         *
         *      break;
         *
         *      case <value3>:
         *          // code di tulis disini
         *
         *      break;
         *
         *      default:
         *          // Code di tulis disini
         *
         *      break;
         * }
         *
         * note :
         * - case bisa ditambahkan sebanyak yang kamu mau
         * - default keyword digunakan untuk kondisi default jika semua case yang ada bernilai false
         * - break keyword harus digunakan di akhir setiap case termasuk default
         *
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("=== Daftar Menu ===");
        System.out.println("1. Nasi Uduk : Rp.5000 ");
        System.out.println("2. Kurilit : Rp.1000 ");
        System.out.println("3. Bakwan : Rp.1000 ");


        System.out.print("\nMasukan Angka Menu : ");
        int menu = userInput.nextInt();

        switch ( menu ) {
            case 1:
                // Kondisi Pertama
                System.out.println("Anda Memilih Nasi Uduk");
            break; // <- break harus ditambahkan di akhir case

            case 2:
                // Kondisi Kedua
                System.out.println("Anda Memilih Kurilit");
            break;

            case 3:
                // Kondisi ketiga
                System.out.println("Anda Memilih Bakwan");
            break;

            default: // <- default akan dieksekusi jika ketiga case diatas bernilai false
                // Simpelnya ini sama dengan else jika di if statement
                System.out.println("Angka tidak ada di menu kami ! ( 1 - 3 )");
            break;

        }

    }

}
