public class pembagian {

    public static void main(String[] args) {

        /**
         *  Perbagian ( / )
         */

        /*
         * hasil akan menjadi 2 karena nilai dari variabel bagi adalah 4 dibagi 2
         * ( 4 / 2 ) = 2
         */

        int bagi = 4 / 2;

        System.out.println(bagi);


        /*
         * hasil akan menjadi 5 karena nilai dari variabel bagi2 adalah 10 dibagi nilai dari variabel bagi yaitu 2
         * ( 10 / <bagi> )
         * ( 10 / 2 ) = 5
         */

        int bagi2 = 10 / bagi;

        System.out.println(bagi2);


        /*
         * hasil akan menjadi 2 karena nilai dari variabel bagi2 adalah 5 dibagi nilai dari variabel bagi yaitu 2
         * ( <bagi2> / <bagi> )
         * ( 5 / 2 ) = 2
         *
         * note : jika tipe data selain float dan double melakukan pembagian , maka hasilnya tidak akan koma dan
         * tidak akan di bulatkan
         */

        int bagi3 = bagi2 / bagi;

        System.out.println(bagi3);
        
    }
    
}
