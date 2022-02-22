public class pertambahan {

    public static void main(String[] args) {

        /**
         *  Pertambahan ( + )
         */

        /*
         * hasil akan menjadi 5 karena nilai dari variabel tambah adalah 3 ditambah 2
         * ( 2 + 3 ) = 5
         */

        int tambah = 3 + 2;

        System.out.println(tambah);



        /*
        * hasil akan menjadi 10 karena nilai dari variabel tambah2 adalah 5 ditambah nilai dari variabel tambah yaitu 5
        * ( 5 + <tambah> )
        * ( 5 + 5 ) = 10
        */

        int tambah2 = 5 + tambah;

        System.out.println(tambah2);


        /*
         * hasil akan menjadi 15 karena nilai dari variabel tambah adalah 5 ditambah nilai dari variabel tambah2 yaitu 10
         * ( <tambah> + <tambah2> )
         * ( 5 + 10 ) = 15
         */

        int tambah3 = tambah + tambah2;

        System.out.println(tambah3);



    }

}
