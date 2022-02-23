public class BukanPrimitif {

    public static void main(String[] args) {

        /** Tipe data bukan primitif
         * Tipe Data Referensi akan berisi alamat memori dari nilai variabel karena tipe referensi tidak akan menyimpan
         * nilai variabel secara langsung di memori. Contohnya adalah string, objek, array, dll.
         */

        /** Tipe Data String
         * String didefinisikan sebagai array karakter. Perbedaan antara array char dan string di Java adalah,
         * string dirancang untuk menampung urutan karakter dalam satu variabel sedangkan,
         * array karakter adalah kumpulan entitas tipe char yang terpisah.
         *
         * Syntax :
         * <String> <variable> = “<value>”;
         */

        // Deklarasi String tanpa menggunakan new operator
        String firstName = "Ucup";

        // Deklarasi String mengguanakn new operator
        String lastName = new String("Surucup");

        System.out.println(firstName + lastName); // Output akan menjadi UcupSurucup


        /** Tipe data bukan primitif pada tipe data sebelumnya
         * Kita sudah belajar mengenai tipe data primitf di 3 chapter sebelumnya,
         * Di Java tipe data primitif tersebut juga mempunyai tipe data Bukan primitfnya tersendiri
         *
         * Jika sebelumnya masing masing tipe data memiliki default value, untuk tipe data bukan primitif tidak memiliki
         * default value , namun variabel bisa menjadi kosong atau disebut dengan `null`
         *
         * Tipe Data Number ( primitif -> bukan primitif ) :
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * long -> Long
         * float -> Float
         * double -> Double
         *
         * Tipe data char ( primitif -> bukan primitif ) :
         * char -> Character
         *
         * Tipe data boolean ( primitf -> bukan primitif ) :
         * boolean -> Boolean
         *
         * untuk format penulisan Syntax sama saja
         * (tipe data) (variabel) = (value);
         */




    }

}
