        /** Tipe Data Primitive
         * Tipe data primitive adalah tipe data yang mampu menyampaikan satu nilai tiap satu variabel
         * Tipe data primitive memiliki default value
         * nilai dari suatu tipe data primitive merepresentasikan secara langsung pada level terendah dari implementasi bahasa
         */

        /** Tipe Data Number ( Primitive )
         * Dalam Java , terdapat 6 tipe data yang dapat menyimpan angka dan masing masing mempunyai kegunaannya tersendiri
         * Agar mudah dipahami , kita bisa bagi menjadi 2 tipe :
         * 1. Tipe Data Angka Bilangan Bulat ( byte , short , int , long )
         * 2. Tipe Data Angka Bilangan Pecahan ( float , double )
         *
         * Masing masing tipe data mempunyai perbedaan dan Java merupakan Case Sensitive jadi berhati hati saat menuliskan tipe data
         */

public class number {

    public static void main(String[] args) {

        /** byte ( Tipe Data Angka Bilangan Bulat ) {
         *      - Ukuran Memory : 8 bit
         *      - Angka Minimal : -128
         *      - Angka Maksimal : 127
         * }
         */
        System.out.println("==== byte ====");

        byte nilaiByte = 123; // <- Tipe Data byte

        // Mengecek nilai minimal & maksimal
        System.out.println("Min byte : " + Byte.MIN_VALUE);
        System.out.println("Max byte : " + Byte.MAX_VALUE);



        /** short ( Tipe Data Angka Bilangan Bulat ) {
         *      - Ukuran Memory : 16 bit
         *      - Angka Minimal : -32768
         *      - Angka Maksimal : 32767
         * }
         */
        System.out.println("==== short ====");

        short nilaiShort = 12345; // <- Tipe Data short

        // Mengecek nilai minimal & maksimal
        System.out.println("Min short : " + Short.MIN_VALUE);
        System.out.println("Max short : " + Short.MAX_VALUE);



        /** int ( Tipe Data Angka Bilangan Bulat ) {
         *      - Ukuran Memory : 32 bit
         *      - Angka Minimal : -2147483648
         *      - Angka Maksimal : 2147483647
         * }
         */
        System.out.println("==== int ====");

        int nilaiInt = 123456789; // <- Tipe Data int

        // Mengecek nilai minimal & maksimal
        System.out.println("Min int : " + Integer.MIN_VALUE);
        System.out.println("Max int : " + Integer.MAX_VALUE);



        /** long ( Tipe Data Angka Bilangan Bulat ) {
         *      - Ukuran Memory : 64 bit
         *      - Angka Minimal : -9223372036854775808
         *      - Angka Maksimal : 9223372036854775807
         * }
         */
        System.out.println("==== long ====");

        long nilaiLong = 1234567891098764321L; // <- Tipe Data long

        // Mengecek nilai minimal & maksimal
        System.out.println("Min long : " + Long.MIN_VALUE);
        System.out.println("Max long : " + Long.MAX_VALUE);



        /** float ( Tipe Data Angka Bilangan Pecahan / koma ) {
         *      - Ukuran Memory : 32 bit
         *      - Angka Minimal : 1.4E-45
         *      - Angka Maksimal : 3.4028235E38
         * }
         */
        System.out.println("==== float ====");

        float nilaiFloat = 54321.250f; // <- Tipe Data float

        // Mengecek nilai minimal & maksimal
        System.out.println("Min float : " + Float.MIN_VALUE);
        System.out.println("Max float : " + Float.MAX_VALUE);



        /** double ( Tipe Data Angka Bilangan Pecahan / koma ) {
         *      - Ukuran Memory : 64 bit
         *      - Angka Minimal : 4.9E-324
         *      - Angka Maksimal : 1.7976931348623157E308
         * }
         */
        System.out.println("==== double ====");

        double nilaiDouble = 987654321.123456789d; // <- Tipe Data double

        // Mengecek nilai minimal & maksimal
        System.out.println("Min double : " + Double.MIN_VALUE);
        System.out.println("Max double : " + Double.MAX_VALUE);


        /** NOTE : * 8 bit   => 1 Byte
         *        * 1 byte  => 1 Byte
         *        * 1 short => 2 Byte
         *        * 1 int   => 4 Byte
         *        * 1 long  => 8 Byte
         *
         * NOTE : besaran bit dari setiap data types berbeda, oleh karena itu jika kita menjumlahkan byte dengan int
         * bisa jadi terdapat error dikarenakan perbedaan kapasitas angka dan perbedaan bit
         *
         * lalu bagaimana cara menyelesaikan operasi matematika dengan dua tipe data berbeda ?
         * akan kita bahas di topik lainnya !
         */


    }
        }
