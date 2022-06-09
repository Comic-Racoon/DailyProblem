package problems.daily_problems.problem_12;

public class Problem_12 {

    /*

    There exists a staircase with N steps, and you can
    climb up either 1 or 2 steps at a time. Given N, write
    a function that returns the number of unique ways you
    can climb the staircase. The order of the steps matters.

    For example, if N is 4, then there are 5 unique ways:

    1, 1, 1, 1
    2, 1, 1
    1, 2, 1
    1, 1, 2
    2, 2

    */

    public static void main(String[] args) {
        int noOfStairs = 4;

        System.out.println(unique_ways(noOfStairs));
    }

    private static int unique_ways(int noOfStairs) {

        if(noOfStairs < 0){
            return 0;
        }

        if(noOfStairs == 0){
            return 1;
        }

        int left = unique_ways(noOfStairs - 1);
        int right  = unique_ways(noOfStairs - 2);

        return (left+right);

    }
}
