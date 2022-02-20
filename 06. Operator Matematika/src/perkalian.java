public class perkalian {

    public static void main(String[] args) {

        /**
         *  Perkalian ( * )
         */

        /*
         * hasil akan menjadi 6 karena nilai dari variabel kali adalah 3 dikali 2
         * ( 2 * 3 ) = 6
         */

        int kali = 3 * 2;

        System.out.println(kali);


        /*
         * hasil akan menjadi 30 karena nilai dari variabel kali2 adalah 5 dikali nilai dari variabel kali yaitu 6
         * ( 5 * <kali> )
         * ( 5 * 6 ) = 30
         */

        int kali2 = 5 * kali;

        System.out.println(kali2);


        /*
         * hasil akan menjadi 180 karena nilai dari variabel kali adalah 6 dikali nilai dari variabel kali2 yaitu 30
         * ( <kali> * <kali2> )
         * ( 6 * 30 ) = 180
         */

        int kali3 = kali * kali2;

        System.out.println(kali3);

    }

}
