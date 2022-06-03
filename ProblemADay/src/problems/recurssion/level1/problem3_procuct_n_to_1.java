package problems.recurssion.level1;

public class problem3_procuct_n_to_1 {

    // factorial of a number

    public static void main(String[] args) {
        int n = 5 ;

        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1 ){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
