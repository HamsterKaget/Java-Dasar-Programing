public class Ternary {

    public static void main(String[] args) {

        /** Operator Ternary
         * Operator ternary Java adalah satu-satunya operator kondisional yang membutuhkan tiga operan.
         * Ini adalah pengganti satu baris untuk pernyataan if-then-else dan banyak digunakan dalam pemrograman Java.
         * Kita dapat menggunakan operator ternary menggantikan kondisi if-else atau bahkan mengganti kondisi
         * menggunakan operator ternary bersarang. Meskipun mengikuti algoritma yang sama dengan pernyataan if-else,
         * operator kondisional membutuhkan lebih sedikit ruang dan membantu untuk menulis pernyataan if-else dengan
         * cara sesingkat mungkin.
         *
         * Syntax :
         * (variable) = (Expression1) ? (Expression2): (Expression3)
         */

        // Ilustrasi | Membuat sebuah program untuk mencari tahu mana variabel yang paling besar
        int num1 = 10, num2 = 15, num3 = 20, max, min ;

        max = (num1 > num2) ? num1 : num2;

        min = (num1 < num3) ? num1 : num3;

        System.out.println(max);
        System.out.println(min);




    }

}
