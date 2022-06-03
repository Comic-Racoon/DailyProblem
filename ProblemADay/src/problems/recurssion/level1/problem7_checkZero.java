package problems.recurssion.level1;

public class problem7_checkZero {

    // count number of zeros in the number

    public static void main(String[] args) {
        int n = 102003000;

        System.out.println(count_no_of_zeros(n, 0));
    }

    private static int count_no_of_zeros(int n, int count) {
        if(n == 0){
            return 0;
        }

        int last_no = n%10;

        if(last_no == 0){
            return 1 + count_no_of_zeros(n/10, count);
        }

        return count_no_of_zeros(n/10,count);

    }

    private static int count_no_of_zeros1(int n, int count) {
        if(n == 0){
            return count;
        }

        int last_no = n%10;

        if(last_no == 0){
            return count_no_of_zeros1(n/10, count+1);
        }

        return count_no_of_zeros1(n/10,count);

    }
}
