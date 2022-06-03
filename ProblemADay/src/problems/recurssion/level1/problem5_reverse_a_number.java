package problems.recurssion.level1;

public class problem5_reverse_a_number {

    public static void main(String[] args) {

        int n = 1824;

        reverse_A_num(n);

        System.out.println(sum);

        System.out.println(reverse_A_num_method_1(12345));
    }

    static  int sum = 0;
    private static void reverse_A_num(int n) {

        if(n == 0 ){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverse_A_num(n/10);
    }

    private static int reverse_A_num_method_1(int n) {

        int digits = (int)(Math.log10(n) + 1 );

        return helper(n , digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n ){
            return n;
        }
        int rem = n%10;

        return rem * (int)(Math.pow(10, digits-1)) + helper( n/10, digits - 1 );
    }


}
