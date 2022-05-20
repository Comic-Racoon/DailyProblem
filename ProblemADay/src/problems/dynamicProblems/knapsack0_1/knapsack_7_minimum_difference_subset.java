package problems.dynamicProblems.knapsack0_1;

public class knapsack_7_minimum_difference_subset {

    // divide an array into 2 subset such that
    // the diff of the sum is minimum

    public static void main(String[] args) {

//        int [] arr = {4,2,7,1,3};
        int [] arr = {2,4,2,3};
        int target = 0;

        for(int num :arr){
            target += num;
        }

        boolean [][] dp = new boolean[arr.length+1][target+1];

        for(int i =0; i< dp.length; i++){
            for(int j=0; j< dp[0].length; j++){


                if(i==0 && j ==0){
                    dp[i][j] = true;
                }

                else if(i == 0){
                    dp[i][j] = false;
                }

                else if (j == 0){
                    dp[i][j] = true;
                }

                else{
                    if(j < arr[i-1]){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
                    }
                }

            }
        }

        int diff = target;

        for(int i =0; i<= target/2; i++){
            int first = i;
            int secont = target - i;
            if(dp[arr.length][i]==true && diff > Math.abs(first - secont)){
                diff = Math.abs(first-secont);
            }

        }

        System.out.println(diff);
    }













}
