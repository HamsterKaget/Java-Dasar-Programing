public class NestedIF {

    public static void main(String[] args) {

        /** Nested If ( Percabangan Bersarang )
         * Sebuah if bersarang adalah pernyataan if yang merupakan target dari if atau else lainnya. Pernyataan if
         * bersarang berarti pernyataan if di dalam pernyataan if. Ya, java memungkinkan kita untuk membuat pernyataan
         * if di dalam pernyataan if. yaitu, kita dapat menempatkan pernyataan if di dalam pernyataan if yang lain.
         *
         * Syntax :
         * if ( kondisi ) {
         *
         *      if ( kondisi ) {
         *
         *      } else if ( kondisi ) {
         *
         *      }
         *
         * }
         *
         */

        // Todo : membuat kondisi di dalam kondisi untuk menentukan grade nilai

        int nilai = 96;

        if ( nilai >= 90 ) {

            if ( nilai >= 90 && nilai <= 94) {
                System.out.println("Nilai = " + nilai + " | Grade = A");
            } else if ( nilai >= 95 ) {
                System.out.println("Nilai = " + nilai + " | Grade = A+");
            }

        }






    }

}
