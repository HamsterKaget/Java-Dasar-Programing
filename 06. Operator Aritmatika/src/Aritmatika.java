public class Aritmatika {

    public static void main(String[] args) {

        /** Operator Aritmatika
         * Dalam Java , Kita bisa menggunakan Operator Aritmatika untuk memanipulasi variabel
         * Operator Aritmatik Java Diantaranya  + : pertambahan
         *                                      - : pengurangan
         *                                      * : perkalian
         *                                      / : pembagian
         *                                      % : modulo ( sisa bagi )
         */

        // Pertambahan
        int pertambahan = 10 + 35 + 15;

        // Pengurangan
        int pengurangan = 20 - 25 - 10;

        // Perkalian
        int perkalian = 5 * 25 * 4;

        // Pembagian
        int pembagian = 200 / 4 ;

        // Modulo atau Sisa Bagi
        int modulo = 10 % 3;

        System.out.println(pertambahan);
        System.out.println(pengurangan);
        System.out.println(perkalian);
        System.out.println(pembagian);
        System.out.println(modulo);

        // Sesuatu yang lebih kompleks yang bisa kita kerjakan menggunakan operator aritmatika

        // Menghitung luas segitiga mengguanakan operator aritmatika
        int tinggi = 5;
        int alas = 20;

        int hasil = alas * tinggi / 2;
        System.out.println("Luas Segitiga dengan tinggi " + tinggi + " cm dan alas " + alas + " cm adalah " + hasil + " cm");


    }

}
