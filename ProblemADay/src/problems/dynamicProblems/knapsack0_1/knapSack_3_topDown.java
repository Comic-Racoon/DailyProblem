package problems.dynamicProblems.knapsack0_1;

public class knapSack_3_topDown {

    /*
    Top - Down approach

    step 1 :- initialization

    step 2 :- recursive call ko iterative approach mai convert kr do

     */
    public static void main(String[] args) {


        // find the maxmimum profit from given weight and value array

        int [] W8 = {2, 5, 2, 3, 4};
        int [] price =  {2, 7, 1, 5, 3};
        int maxCapacityOfSack = 8;
        int sizeOfArray = 5;


        // for base condition think -- of the smallest valid input


        int [][] dp = new int[sizeOfArray + 1][maxCapacityOfSack + 1];

        for(int i =0; i< dp.length; i++){
            for(int j =0; j< dp[0].length; j++){
                if(i==0 || j ==0){
                    dp[i][j] = 0;
                }

                else if( j < W8[i - 1]){
                    dp[i][j] = dp[i-1][j];
                }

                else{
                    dp[i][j] = Math.max(
                         dp[i-1][j],
                            price[i-1]+ dp[i-1][j-W8[i-1]]
                    );
                }
            }
        }


        System.out.println(dp[sizeOfArray][maxCapacityOfSack]);

        System.out.println(knapsackRecesive(W8, price, maxCapacityOfSack, sizeOfArray));

    }

    private static int knapsackRecesive(int[] weight, int[] value, int w, int n) {

        // for base condition think -- of the smallest valid input

        if(n == 0 || w == 0){
            return 0;
        }

        if(weight[n-1] <= w ){

            return
                    Math.max((value[n-1]
                                    + knapsackRecesive(weight, value, w - weight[n-1], n-1 )),
                            knapsackRecesive(weight, value, w , n-1 ));
        }

        else {
            return knapsackRecesive(weight, value, w , n-1 );
        }

    }
}
