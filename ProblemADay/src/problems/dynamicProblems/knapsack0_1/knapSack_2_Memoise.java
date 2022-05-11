package problems.dynamicProblems.knapsack0_1;

import java.util.Arrays;

public class knapSack_2_Memoise {

    /*
    to memoise the problem check which inputs are changing in the recursion */

    static int [][] t = new int[20][20];
    public static void main(String[] args) {


        // find the maxmimum profit from given weight and value array

        int [] weight = {2, 5, 2, 3, 4};
        int [] value =  {2, 7, 1, 5, 3};
        int maxWeight = 8;
        int sizeOfArray = 5;

        // for base condition think -- of the smallest valid input

        /*
            For memoization we take a static matrix t by seeing the given constrains of
            valur and weight

            eg. given value <= 15 and weight <= 10

         */

        // we initialize static matrix t


        Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));

        System.out.println(knapsack(weight, value, maxWeight, sizeOfArray));

    }

    private static int knapsack(int[] weight, int[] value, int w, int n) {

        // for base condition think -- of the smallest valid input
        if(n == 0 || w == 0){
            return 0;
        }

        if(t[n][w] != -1){
            return t[n][w];
        }

        if(weight[n-1] <= w ){

            return
                    t[n][w]=Math.max((value[n-1]
                                    + knapsack(weight, value, w - weight[n-1], n-1 )),
                            knapsack(weight, value, w , n-1 ));
        }

        else {
            return t[n][w]=knapsack(weight, value, w , n-1 );
        }

    }
}
