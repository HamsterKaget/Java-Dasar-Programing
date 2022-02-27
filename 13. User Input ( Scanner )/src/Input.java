// TODO: Import Library yang dibutuhkan
import java.util.Scanner; // <- wajib dipanggil ketika ingin mengambil user input menggunakan scanner

public class Input {

    public static void main(String[] args) {

        /** Input User ( Scanner )
         * Scanner adalah kelas dalam paket java.util yang digunakan untuk mendapatkan input dari tipe primitif 
         * seperti int, double, dll. dan string. Ini adalah cara termudah untuk membaca input dalam program Java, 
         * meskipun tidak terlalu efisien jika Anda menginginkan metode input untuk skenario di mana waktu merupakan 
         * kendala seperti dalam pemrograman kompetitif.
         * 
         * Syarat untuk menggunakan Scanner :
         * 1. `import java.util.scanner;` // <- wajib dipanggil sebelum public class berada ( paling atas )
         * 2. `Scanner <namaObject> =  new Scanner(System.in);` // <- wajib dipanggil, biasanya ditulis di bawah method main
         * 
         * Properti untuk Scanner : 1. <tipeData> <namaVariabel> = <namaObject>.next(); // Mengambil input String ( tanpa membuat baris baru )
         *                          2. <tipeData> <namaVariabel> = <namaObject>.nextLine(); // Mengambil input String 
         *                          3. <tipeData> <namaVariabel> = <namaObject>.nextLine().charAt(0); // Mengambil input char 
         *                          4. <tipeData> <namaVariabel> = <namaObject>.nextInt(); // Mengambil input angka
         *                          5. <tipeData> <namaVariabel> = <namaObject>.nextDouble(); // Mengambil input angka(pecahan/desimal)
         *                          6. <tipeData> <namaVariabel> = <namaObject>.nextBoolean(); // Mengambil input boolean
         * 
         * 
        */

        // TODO: Membuat Object Scanner dengan nama userInput
        Scanner userInput = new Scanner(System.in);

        System.out.print("firstName : ");
        String firstName = userInput.nextLine(); // <- Mengambil input String ke dalam variabel firstName


        System.out.print("lastName : ");
        String lastName = userInput.nextLine(); // <- Mengambil input String ke dalam variabel lastName

        System.out.print("gender (L/P) : "); 
        char gender = userInput.nextLine().charAt(0); // <- Mengambil inpur String yang dikonversi menjadi char ke variabel gender 

        System.out.print("age : ");
        int age = userInput.nextInt(); // <- Mengambil input int(angka) ke dalam variabel age

        System.out.print("grade : ");
        double grade = userInput.nextDouble(); // <- Mengambil input double(angka) ke dalam variabel grade

        System.out.print("confirm ? (true/false) : ");
        boolean confirm = userInput.nextBoolean(); // <- Mengambil input boolean ke dalam variabel confirm
         
        System.out.println("=====================================");
        System.out.println("fullName : " + firstName + ' ' + lastName );
        System.out.println("gender : " + gender );
        System.out.println("age : " + age );
        System.out.println("grade : " + grade);
        System.out.println("confirm : " + confirm );


        



    }

}
