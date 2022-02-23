public class AssigmentOperator {

    public static void main(String[] args) {

        /** Assigment operator
         * Operator ini digunakan untuk menetapkan value ke sebuah variabel
         *
         * Syntax :
         * (variabel) (operator) (value)
         *
         * Assigment operator terbagi menjadi dua : 1. Simple Assigment Operator ( = )
         *                                          2. Compound Assigment Operator ( +=,-=,*=,/=,%= )
         */


        /** 1. Simple Assigment Operator (=)
         * Ini adalah operator yang paling umum, yang digunakan untuk menetapkan nilai di sebelah kanan
         * ke variabel di sebelah kiri.
         *
         *
         * Syntax :
         * (variabel) = (value)
         */

        int a = 20; // terdapat = , itu yang disebut (=) operator

        int b = a; // terdapat =, itu yang disebut (=) operator , nilai int b = nilai int a

        System.out.println("a : " + a + "\nb :" + b);


        /** 2. Compound Assigment Operator ( +=,-=,*=,/=,%= )
         * Operator ini digunakan di mana +,-,*,/ dan % digunakan bersama dengan operator =.
         *
         * Operator ini sangat berguna untuk memanipulasi value dari sebuah variabel menjadi lebih ringkas
         *
         * Syntax :
         * (variabel) (opeartor) (value)
         */


        int nilai = 70; // Nilai = 70, namun kita ingin menambahkan 10 ke dalam nilai

        // Memanipulasi variabel tanpa menggunakan Compound Assigment Operator
        nilai = nilai + 10; // code akan menjadi sedikit panjang

        System.out.println("Nilai : " + nilai);

        int nilai2 = 70; // Nilai2 = 70, namun kita ingin menambahkan 10 ke dalam nilai

        // memanipulasi variabel menggunakan Compound Assigment Operator
        nilai2 += 10; // Code akan menjadi jauh lebih ringkas

        System.out.println("Nilai2 : " + nilai2);

        /** Code diatas berlaku juga dengan menggunakan Compound Assigment Operator lainnya ( +=, -=, *=, /=, %= )
         *
         * Agar mudah dipahami mari menggunakan konsep ini :
            += -> Variabel ditambah dan sama dengan
            -= -> Variabel dkurang dan sama dengan
            *= -> Variabel dikali dan sama dengan
            /= -> Variabel di bagi dan sama dengan
            %= -> variabel di modulo dan sama dengan
         */







    }

}
