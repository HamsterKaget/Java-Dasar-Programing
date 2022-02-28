public class TimeConverter {

    public static void main(String[] args) {

        /** Time - Converter
         * TODO : membuat sebuah program untuk mengkonversi 1 hari ke dalam jam, menit dan detik  
        */

        // mendefinisikan variabel dan melakukan perhitungan
        int hari = 1;
        int jam = 24*hari;
        int menit = 60*jam;
        int detik = 60*menit;

        // print data ke console
        System.out.println("1 Hari = " + jam + " jam");
        System.out.println("1 Hari = " + menit + " menit");
        System.out.println("1 Hari = " + detik + " detik");




    }
}