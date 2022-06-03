package problems.recurssion.level1;

public class problem4_sun_of_digits {

    // sum of digits

    public static void main(String[] args) {
        int n = 1342;

        System.out.println(sum_of_digit(n));
        System.out.println(product_of_digit(n));
    }

    private static int sum_of_digit(int n) {

        if(n ==0 ){
            return 0;
        }

        int temp = n % 10 ;

        return temp + sum_of_digit( n / 10);

    }

//    ---------------------------------------------------------

    private static int product_of_digit(int n) {

        if(n%10 ==n ){
            return n;
        }

        int temp = n % 10 ;

        return temp * product_of_digit( n / 10);

    }
}
