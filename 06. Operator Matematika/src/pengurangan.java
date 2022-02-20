public class pengurangan {

    public static void main(String[] args) {

        /**
         *  Pengurangan ( - )
         */

        /*
         * hasil akan menjadi 5 karena nilai dari variabel kurang adalah 10 dikurang 5
         * ( 10 - 5 ) = 5
         */

        int kurang = 10 - 5;

        System.out.println(kurang);



        /*
         * hasil akan menjadi 5 karena nilai dari variabel kurang2 adalah 10 dikurang nilai dari variabel kurang yaitu 5
         * ( 10 - <kurang> )
         * ( 10 - 5 ) = 5
         */

        int kurang2 = 10 - kurang;

        System.out.println(kurang2);



        /*
         * hasil akan menjadi 0 karena nilai dari variabel kurang adalah 5 dikurang nilai dari variabel kurang2 yaitu 5
         * ( <kurang> - <kurang2> )
         * ( 5 - 5 ) = 0
         */

        int kurang3 = kurang - kurang2;

        System.out.println(kurang3);

    }

}
