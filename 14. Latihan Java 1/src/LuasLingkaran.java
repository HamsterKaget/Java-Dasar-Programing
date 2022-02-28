import java.util.Scanner; // <- import library yang dibutuhkan

public class LuasLingkaran {
    
    public static void main(String[] args) {
        
        /** Luas Lingkarang
         * TODO : membuat program untuk menghitung luas dari suatu lingaran , jari jari di ambil melalui scanner
        */

        // 1. Membuat object scanner baru dengan nama `userInput`
        Scanner userInput = new Scanner(System.in);

        // 2. Menerima input jari jari ke dalam variabel `jari`
        System.out.print("jari jari : " );
        int jari = userInput.nextInt();

        // 3. Meghitung luas
        double luas = 3.14 * jari * jari;

        // 4. Tampilkan hasil
        System.out.println("luas = " + luas);


    }

}
