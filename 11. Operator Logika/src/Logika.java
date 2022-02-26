public class Logika {

    public static void main(String[] args) {

        /** Logical Operator ( && , || , ! )
         * Operator-operator ini digunakan untuk melakukan operasi logika “AND”, “OR” dan “NOT”,
         * yaitu fungsi yang mirip dengan gerbang AND dan gerbang OR dalam elektronika digital.
         * Mereka digunakan untuk menggabungkan dua atau lebih kondisi / kendala atau untuk melengkapi evaluasi
         * kondisi asli di bawah pertimbangan tertentu. Satu hal yang perlu diingat adalah kondisi kedua tidak
         * dievaluasi jika yang pertama salah, yaitu memiliki efek hubungan arus pendek.
         * Digunakan secara luas untuk menguji beberapa kondisi untuk membuat keputusan.
         *
         *
         * Logical operator terbagi menjadi tiga : 1. AND ( && )
         *                                         2. OR ( || )
         *                                         3. NOT ( ! )
         */


        /** Operator logika AND ( && )
         * Operator ini akan mengembalikan nilai true jika kedua kondisi yang dipertimbangkan bernilai true
         * Operator ini akan mengembalikan nilai false jika salah satu kondisi yang dipertimbangkan bernilai false
         * Operator ini akan mengembalikan nilai false jika kedua kondisi yang dipertimbangkan bernilai false
         *
         * Syntax :
         * ( kondisi1 ) && ( kondisi2 )
         */

        int umur = 18;
        int jumlah = 5;

        //            (kondisi 1) ( && ) (kondisi 2)
        //             (    |   ) ( | ) (   |   )
        //             (    v   ) ( v ) (   v   )
        boolean hasil = umur >= 18 && jumlah >= 5; // <- true | kondisi 1 = true, kondisi 2 = true |
        System.out.println(hasil);

        hasil = umur >= 18 && jumlah > 5; // <- false | kondisi 1 = true, kondisi 2 = false |
        System.out.println(hasil);

        hasil = umur > 18 && jumlah > 5; // <- false | kondisi 1 = false, kondisi 2 = false |
        System.out.println(hasil);



        /** Operator logika OR ( || )
         * Operator ini akan mengembalikan nilai true jika kedua kondisi yang dipertimbangkan bernilai true
         * Operator ini akan mengembalikan nilai true jika salah satu kondisi yang dipertimbangkan bernilai true
         * Operator ini akan mengembalikan nilai false jika kedua kondisi yang dipertimbangkan bernilai false
         *
         * Syntax :
         * ( kondisi1 ) || ( kondisi2 )
         */

        umur = 18;
        jumlah = 5;

        //      (kondisi 1) ( || ) (kondisi 2)
        //      (    |   ) ( | ) (   |   )
        //      (    v   ) ( v ) (   v   )
        hasil = umur >= 18 || jumlah >= 5; // <- true | kondisi 1 = true, kondisi 2 = true |
        System.out.println(hasil);

        hasil = umur >= 18 || jumlah > 5; // <- true | kondisi 1 = true, kondisi 2 = false |
        System.out.println(hasil);

        hasil = umur > 18 || jumlah > 5; // <- false | kondisi 1 = false, kondisi 2 = false |
        System.out.println(hasil);



        /** Operator logika NOT ( ! )
         * Operator ini akan mengembalikan nilai true jika kondisi yang dipertimbangkan bernilai false
         * Operator ini akan mengembalikan nilai false jika kondisi yang dipertimbangkan bernilai true
         *
         * Syntax :
         * !( kondisi1 && kondisi2 ) atau !(kondisi)
         */

        umur = 18;
        jumlah = 5;

        //     !(kondisi 1)
        //      (    |   )
        //      (    v   )
        hasil = !(umur >= 18); // <- false | kondisi = true |
        System.out.println(hasil);

        hasil = !(jumlah > 5); // <- true | kondisi = false |
        System.out.println(hasil);

        hasil = !(umur > 18); // <- true | kondisi = false |
        System.out.println(hasil);

    }

}
