package problems.leetCode.problem4;

import static problems.leetCode.problem4.Problem4.Solution.sortedSquares;

public class Problem4 {
    /*Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.


    TIme complexity should be O(n)
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]*/

    // ref question:- https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
    public static void main(String[] args) {

        int nums [] = {-4,-1,0,3,10};

        int[] res = sortedSquares(nums);

        for(int i : res){
            System.out.print(i + " ");
        }
    }
    class Solution
    {
        public static int[] sortedSquares(int[] nums)
        {

            int result [] = new int [nums.length];
            int pointer = nums.length - 1;
            int low = 0;
            int high = nums.length - 1 ;

            while(low <= high )
            {

                if((nums[low]*nums[low]) >= (nums[high] * nums[high]))
                {
                    result[pointer] = nums[low]*nums[low];
                    pointer--;
                    low++;
                }

                else{
                    result[pointer] = nums[high]*nums[high];
                    pointer--;
                    high--;

                }
            }

            return result;


        }
    }
}
