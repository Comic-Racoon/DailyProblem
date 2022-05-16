package problems.leetCode;

public class problem1 {
    /*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.*/


    public static void main(String[] args) {

        int num [] = {1,0,3,5,9,12};
        int target = 9;

        int result = Solution.search(num, target);

        if(result == -1 ){
            System.out.println("does not exist");
        }
        else {
            System.out.println(target +" exists in num array at index "+ result );
        }
    }

    class Solution {
        static public int search(int[] nums, int target) {

            int len = nums.length;
            int low = 0 ;

            return binarySearch(nums , len - 1 , target , low);



        }

         static int binarySearch(int[] nums, int r, int target, int l){

            if ( r >= l ){

                int mid = l+( r - l )/2;

                if( nums[mid] == target){
                    return mid;
                }

                if(nums[mid] > target){
                    return binarySearch(nums , mid - 1 ,  target, l );
                }

                else {
                    return binarySearch(nums, r,target, mid + 1 );
                }

            }

            return -1 ;


        }

    }
}
