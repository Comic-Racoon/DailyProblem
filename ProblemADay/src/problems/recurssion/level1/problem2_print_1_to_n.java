package problems.recurssion.level1;

public class problem2_print_1_to_n {


    // print 1 to n

    public static void main(String[] args) {

        int n = 5 ;

        printton(5);
    }

    private static void printton(int i) {

        if(i == 0 ){
            return;
        }

        printton(i - 1);

        System.out.println(i);
    }
}
