package problems.dynamicProblems.knapsack0_1;

public class knapSack_1_Recersive {

    public static void main(String[] args) {


        // find the maxmimum profit from given weight and value array

        int [] weight = {2, 5, 2, 3, 4};
        int [] value =  {2, 7, 1, 5, 3};
        int maxWeight = 8;
        int sizeOfArray = 5;

        // for base condition think -- of the smallest valid input

        System.out.println(knapsack(weight, value, maxWeight, sizeOfArray));

    }

    private static int knapsack(int[] weight, int[] value, int w, int n) {

        // for base condition think -- of the smallest valid input
        if(n == 0 || w == 0){
            return 0;
        }

        if(weight[n-1] <= w ){

            return
                    Math.max((value[n-1]
                                    + knapsack(weight, value, w - weight[n-1], n-1 )),
                            knapsack(weight, value, w , n-1 ));
        }

        else {
           return knapsack(weight, value, w , n-1 );
        }

    }
}
