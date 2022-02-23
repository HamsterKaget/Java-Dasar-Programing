public class modulo {

    public static void main(String[] args) {

        /**
         *  modulo / sisa bagi ( % )
         */

        /*
         * hasil akan menjadi 2 karena nilai dari variabel modulo adalah 14 dimodulo 3
         * ( 14 % 3 ) = 2
         */

        int modulo = 14 % 3;

        System.out.println(modulo);



        /*
         * hasil akan menjadi 1 karena nilai dari variabel modulo2 adalah 5 dimodulo nilai dari variabel modulo yaitu 2
         * ( 5 % <modulo> )
         * ( 5 % 2 ) = 1
         */

        int modulo2 = 5 % modulo;

        System.out.println(modulo2);


        /*
         * hasil akan menjadi 0 karena nilai dari variabel modulo adalah 2 dimodulo nilai dari variabel modulo2 yaitu 1
         * ( <modulo> % <modulo2> )
         * ( 2 % 1 ) = 0
         */

        int modulo3 = modulo % modulo2;

        System.out.println(modulo3);

    }

}
