public class Relasi {

    public static void main(String[] args) {

        /** Operator Relasi / Perbandingan
         * Operator Relasional Java adalah sekelompok operator biner yang digunakan untuk memeriksa hubungan antara
         * dua operan, termasuk sama dengan, lebih besar dari, kurang dari, dll. Mereka mengembalikan hasil boolean
         * setelah perbandingan dan banyak digunakan dalam pernyataan perulangan serta if- bersyarat. pernyataan lain
         * dan seterusnya.
         *
         * Syntax :
         * (variabel1) (operator_relasi) (variabel2)
         *
         */



        /** Operator SamaDengan ( == )
         * Operator ini digunakan untuk memeriksa apakah dua variabel / operand yang diberikan sama atau tidak.
         * Operator mengembalikan nilai true jika variabel di ruas kiri sama dengan ruas kanan,
         * Operator mengembalikan nilai false jika variabel di ruas kiri tidak sama dengan ruas kanan
         *
         * Syntax :
         * (variabel1) == (variabel2)
         */

        // Ilustrasi
        int password = 12345;
        int inputPassword = 12354;
        int inputPassword2 = 12345;

        // Membandingkan apakah nilai dari variabel password dan variabel inputPassword sama persis atau tidak
        System.out.println("password == inputPassword : " + (password == inputPassword) ); // <- false

        // Membandingkan apakah nilai dari variabel password dan variabel inputPassword2 sama persis atau tidak
        System.out.println("password == inputPassword2 : " + (password == inputPassword2)); // <- True



        /** Operator tidak sama dengan ( != )
         * Operator ini digunakan untuk memeriksa apakah dua variabel / operand yang diberikan sama atau tidak.
         * Operator mengembalikan nilai true jika variabel di ruas kiri tidak sama dengan ruas kanan,
         * Operator mengembalikan nilai fale jika variabel di ruas kiri sama dengan ruas kanan
         *
         * Syntax :
         * (variabel1) != (variabel2)
         */

        // Membandingkan apakah nilai dari variabel password dan variabel inputPassword tidak sama dengan atau sama
        System.out.println("password == inputPassword : " + (password != inputPassword) ); // <- true

        // Membandingkan apakah nilai dari variabel password dan variabel inputPassword2 tidak sama dengan atau sama
        System.out.println("password == inputPassword2 : " + (password != inputPassword2)); // <- false



        /** Operator Lebih Kecil dari ( < )
         * Operator ini digunakan untuk memeriksa apakah dua variabel / operan nilainya lebih kecil dari atau tidak
         * Operator mengembalikan nilai true jika variabel ruas kiri lebih kecil dari variabel ruas kanan
         * Operator mengembalikan nilai false jika variabel ruas kiri lebih besar dari variabel ruas kanan
         *
         * Syntax :
         * (variabel1) < (variabel2)
         */

        int nilaiIPA = 80;
        int nilaiIPS = 65;
        int nilaiBahasa = 70;

        // mengecek apakah variabel di sebelah kiri lebih kecil dari variabel di sebelah kanan
        System.out.println("Nilai IPA < Nilai IPS ? : " + (nilaiIPA < nilaiIPS)); // <- false
        System.out.println("Nilai IPS < Nilai Bahasa ? : " + (nilaiIPS < nilaiBahasa)); // <- true



        /** Operator Lebih Besar dari ( > )
         * Operator ini digunakan untuk memeriksa apakah dua variabel / operan nilainya lebih besar dari atau tidak
         * Operator mengembalikan nilai true jika variabel ruas kiri lebih besar dari variabel ruas kanan
         * Operator mengembalikan nilai false jika variabel ruas kiri lebih kecil dari variabel ruas kanan
         *
         * Syntax :
         * (variabel1) < (variabel2)
         */

        // mengecek apakah variabel di sebelah kiri lebih besar dari variabel di sebelah kanan
        System.out.println("Nilai IPA > Nilai IPS ? : " + (nilaiIPA > nilaiIPS)); // <- true
        System.out.println("Nilai IPS > Nilai Bahasa ? : " + (nilaiIPS > nilaiBahasa)); // <- false



        /** Operator Lebih Kecil atau Sama Dengan ( <= )
         * Operator ini digunakan untuk memeriksa apakah dua variabel Lebih Kecil atau Sama Dengan atau tidak
         * Operator mengembalikan nilai true jika variabel ruas kiri lebih kecil atau sama denan variabel ruas kanan
         * Operator mengembalikan nilai false jika variabel ruas kiri lebih besar variabel ruas kanan
         *
         * Syntax :
         * (variabel1) <= (variabel2)
         */

        int umurMin = 18;
        int umurUser = 10;
        int umurUser2 = 18;
        int umurUser3 = 21;

        // Mengecek apakah variabel kiri lebih kecil atau sama dengan variabel kanan
        System.out.println("umurUser <= umurMin : " + (umurUser <= umurMin)); // <- true
        System.out.println("umurUser <= umurMin : " + (umurUser2 <= umurMin));// <- true
        System.out.println("umurUser <= umurMin : " + (umurUser3 <= umurMin));// <- false



        /** Operator Lebih besar atau Sama Dengan ( >= )
         * Operator ini digunakan untuk memeriksa apakah dua variabel Lebih besar atau Sama Dengan atau tidak
         * Operator mengembalikan nilai true jika variabel ruas kiri lebih besar atau sama denan variabel ruas kanan
         * Operator mengembalikan nilai false jika variabel ruas kiri lebih kecil variabel ruas kanan
         *
         * Syntax :
         * (variabel1) >= (variabel2)
         */

        // Mengecek apakah variabel kiri lebih besar atau sama dengan variabel kanan
        System.out.println("umurUser >= umurMin : " + (umurUser >= umurMin)); // <- false
        System.out.println("umurUser >= umurMin : " + (umurUser2 >= umurMin)); // <- true
        System.out.println("umurUser >= umurMin : " + (umurUser3 >= umurMin)); // <- true




    }

}
