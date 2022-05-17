package problems.leetCode.problem5;

import static problems.leetCode.problem5.Problem5.Solution.rotate;

public class Problem5 {
    // Rotate array

    /*Given an array, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

    public static void main(String[] args) {

        int nums [] = {1,2,3,4,5,6,7};

        rotate(nums, 3);

    }
    class Solution {
        public  static void rotate(int[] nums, int k) {

            k = k % nums.length;

            if(k < 0){
                k = k + nums.length;
            }

            reverse(nums , 0, nums.length - k - 1);

            reverse(nums , nums.length - k , nums.length -1 );
            reverse(nums , 0, nums.length - 1);

            for(int i : nums){
                System.out.print(i+ " ");
            }

        }

        public static void reverse(int[]arr, int i, int j ){
            int li = i;
            int ri = j;

            while(li < ri){
                int temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;

                li++;
                ri--;
            }
        }
    }
}
