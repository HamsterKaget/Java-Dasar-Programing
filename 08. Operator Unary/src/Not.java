public class Not {

    public static void main(String[] args) {

        /** NOT ( ! )
         *  NOT digunakan untuk mengubah true menjadi false atau sebaliknya.
         *  Pada dasarnya, Operasi ini membalikkan keadaan logis operand / boolean
         *
         *  Syntax :
         *  !(variabel)
         */

        // Deklarasi variabel
        boolean lanjut = false;

        System.out.printf("Nilai Boolean %b \n", lanjut);

        // Melakukan Operasi NOT
        lanjut = !lanjut; // Nilai variabel lanjut akan menjadi true , karena kebalikan dari false adalah true

        // Print hasil NOT
        System.out.printf("Nilai Boolean %b \n", lanjut);

        // Operasi Not langsung di dalam print
        System.out.printf("Nilai boolean : %b,\nSetelah di Lakukan NOT menjadi %b ", lanjut, !lanjut);





    }

}
