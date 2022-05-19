package problems.dynamicProblems.knapsack0_1;

public class knapsack_6_countOfSubsetWithGivenSum {

    // find the count of subset with given sum
    public static void main(String[] args) {

        int [] a = {2,3,5,6,8,10};
        int target = 10; // sum = 10 ;

        int size = a.length;

        int [][] dp = new int[size+1][target+1];

        for(int i =0; i< dp.length; i++){
            for(int j =0; j < dp[0].length; j++){

                if(i==0 && j==0){
                    dp[i][j] = 1;
                }
                else if( i == 0){
                    dp[i][j] = 0;
                }
                else if( j == 0){
                    dp[i][j] = 1;
                }

                else{
                    // j (sum) < array index element
                    if(j < a[i-1]){
                        // dp this index value is previous index value
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j] + dp[i-1][j-a[i-1]];
                    }
                }
            }
        }
        System.out.println(dp[size][target]);

    }
}
