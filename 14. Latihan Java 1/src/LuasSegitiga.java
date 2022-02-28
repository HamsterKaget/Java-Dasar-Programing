import java.util.Scanner; // <- import libaray scanner

public class LuasSegitiga {
    
    public static void main(String[] args) {
        
        /** Luas Segitiga 
         * TODO: membuat program untuk menghitung luas , nilai alas & tinggi diinputkan menggunakan console 
        */

        // 1. Membuat object scanner baru dengan nama `userInput`
        Scanner userInput = new Scanner(System.in);

        // 2. Menerima input alas dan tinggi ke dalam variabel `alas` & `tinggi`
        System.out.print("alas : " );
        int alas = userInput.nextInt();

        System.out.println("tinggi : ");
        int tinggi = userInput.nextInt();


        // 3. Meghitung luas
        double luas = alas * tinggi / 2;

        // 4. Tampilkan hasil
        System.out.println("luas = " + luas);

    }
}
