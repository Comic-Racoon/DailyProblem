package problems.dynamicProblems.knapsack0_1;

public class knapsack_4_subset {


    // target sum sub set problem ;-
    // find the sum of subset to given target :-

    public static void main(String[] args) {

        int [] arr = {4,2,7,1,3};
        int target = 10;
        int size = arr.length;

        boolean dp [][] = new boolean[size + 1][target + 1];

        for(int i =0; i< dp.length; i++){
            for(int j =0; j< dp[0].length; j++)
            {

                if( i == 0 && j ==0 )
                {
                    dp[i][j] = true;
                }
                else if (i == 0)
                {
                    dp[i][j] = false;
                }
                else if (j == 0 ){
                    dp[i][j] = true;
                }

                else{
                    if(j < arr[i-1]){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j] || dp[i][j-arr[i-1]];
                     }
                }


            }
        }

        System.out.println(dp[size][target]);

    }

}
