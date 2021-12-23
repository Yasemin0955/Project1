public class ReplitQ1 {

    public static void main(String[] args) {

        int[] x = {2,2};
        System.out.println(has23(x));

        int[] y = {2,3};
        System.out.println(has23(y));

        int[] z = {12,30,42};
        System.out.println(has23(z));




    }
    public static boolean has23(int[] num) {
        int dummy1 = 0;
        int dummy2 = 0;

        for (int j : num) {


            if (j == 2) {
                dummy1++;

            } else if (j == 3) {
                dummy2++;

            }
        }

        return dummy1 == 2 || dummy2 == 2;







    }

}




