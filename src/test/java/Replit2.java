public class Replit2 {

    public static void main(String[] args) {


        int[] x = {1,2,3};
        int [] y = {1,3};

        System.out.println(countOne(x,y));

        int[] a = {7,2,3};
        int [] b = {1};

        System.out.println(countOne(a,b));

        int[] c = {6,1,3};
        int [] d = {4,2};

        System.out.println(countOne(c,d));


    }
    public static int countOne(int[] x , int[] y) {


        int dummy = 0 ;


        if(x[0] == 1 && y[0] == 1) {

            dummy = 2;


        }else if(x[0] == 1 || y[0] == 1) {

            dummy = 1;

        }else {
            dummy = 0;
        }



        return dummy;


    }

}
