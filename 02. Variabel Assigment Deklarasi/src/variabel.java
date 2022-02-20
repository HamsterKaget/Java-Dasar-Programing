public class variabel {

    public static void main(String[] args) {

        /** Variabel
         * Dalam pemograman, kita menyimpan suatu nilai ke dalam suatu variabel untuk memudahkan kita dalam memanage code kita
         */

        /** Deklarasi Variabel
         *  Untuk mendeklarasikan suatu variabel , kita bisa menggunakan `<tipeData> <namaVariabel>;`
         *  Note : * Penulisan nama variabel dalam java biasanya menggunakan  huruf Kapital untuk setiap awal huruf dalam kata kecuali kata pertama
         *         * Penulisan nama variabel yang baik adalah yang bisa merepersentasikan data yang disimpan ke dalam variabel itu sendiri
         *         * Penulisan nama variabel tidak boleh diawali menggunakan angka / Symbol
         *
         *  Contoh , Kita akan menggunakan int untuk mendeklarasikan variabel age dan String untuk mendelarasikan variabel firstName
         */

        int umur;
        String firstName;

        /** Assigment Operator
         * Kita sudah mempelajari bagaimana cara mendeklarasikan suatu variabel, kali ini kita akan coba memasukan value ke dalam variabel tersebut
         * untuk menyimpan value kita bisa menggunakan Assigment Operator `=` untuk melakukannya, berikut adalah formatnya :
         * `<namaVariabel> = <value>;` atau bisa juga saat mendeklarasikan nya menjadi `<tipeData> <namaVariabel> = <value>;`
         *
         * Contoh : kita akan memasukan value 15 ke variabel umur dan Hamster ke variabel firstName +
         *          mendeklarasikan variabel lastName dan langsung memberikannya value
         */

        // Menetapkan value ke dalam variabel
        umur = 15;
        firstName = "Hamster";
        String lastName = "Kaget";

        // Mencetak variabel
        System.out.println("Nama Saya " + firstName + lastName);
        System.out.println("Umur Saya " + umur + " tahun");

        /** Memperbarui variabel
         * Kita bisa memperbarui / mengupdate value dari suatu variabel dengan cara `<namaVariabel> = <valueBaru>`
         */

        umur = 18; // value dari variabel umur di udpdate

        System.out.println("3 tahun lagi saya berusia " + umur); // variabel umur akan menjadi 18 karena value sudah di update



    }

}
