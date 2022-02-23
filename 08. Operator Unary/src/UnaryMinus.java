public class UnaryMinus {

    public static void main(String[] args) {

        /** Unary Minus ( - )
         * Operator ini bisa digunakan untuk mengkonversi sebuah nilai negatif ke nilai positif ( maupun sebaliknya )
         *
         * Syntax :
         * -(operand/variabel)
         */

        // Java Program untuk mengilustrasikan Unary - Operator

        // Deklarasi sebuah variabel
        int minus = -25;

        System.out.printf("Nilai asli variabel sebelum di lakukan operasi unary %d \n", minus);

        // Melakukan unary operator
        minus = -minus;

        System.out.printf("Nilai asli variabel setelah di lakukan operasi unary %d \n", minus);


        // Unary juga bisa dilakukan langsung di dalam print

        // Deklarasi variabel
        int positif = 25;

        // Melakukan unary operator di dalam printf
        System.out.printf("Nilai asli adalah %d dan nilai setelah operasi adalah %d \n", positif, -positif);




    }

}
