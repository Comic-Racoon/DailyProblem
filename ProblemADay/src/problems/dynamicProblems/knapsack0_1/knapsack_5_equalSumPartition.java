package problems.dynamicProblems.knapsack0_1;

public class knapsack_5_equalSumPartition {

    // equal sum partition problem

    public static void main(String[] args) {



        int[] nums = {1,5,11,5};


        boolean ans = equalSumPartition(nums)  ;
        System.out.println(ans);
    }

    private static boolean equalSumPartition(int[] nums) {
        int sum = 0;

        for(int i : nums){
            sum = sum+i;
        }

        if(sum % 2 != 0){
            return false;
        }

        else{

            subSetSum(nums , sum/2 );

        }

        return true;
    }

    private static boolean subSetSum(int[] nums, int target) {
        int size = nums.length;

        boolean [][] dp = new boolean[size + 1][ target + 1];


        for(int i =0 ; i< dp.length; i++){
            for(int j =0; j< dp[0].length; j++){

                if(i ==0 && j ==0 ){
                    dp[0][0] = true;
                } else if (i ==0 ) {
                    dp[i][j] = false;
                }
                else if (j == 0 ){
                    dp[i][j] = true;
                }

                else{
                    if(j < nums[i-1]){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j] || dp[i][j-nums[i-1]];
                    }
                }
            }
        }

        return dp[size][target];


    }
}
