package problems.leetCode.problem2;

public class problem2 {
    /*You are a product manager and currently leading a team to develop a new product.
    Unfortunately, the latest version of your product fails the quality check. Since each
    version is developed based on the previous version, all the versions after a bad version
    are also bad.

    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
    which causes all the following ones to be bad.

    You are given an API bool isBadVersion(version) which returns whether version is bad.
    Implement a function to find the first bad version. You should minimize the number of calls
    to the API.

    Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1

 */
    // ref question :-  https://leetcode.com/problems/first-bad-version/

//    public class Solution extends VersionControl {
//        public int firstBadVersion(int n) {
//
//            // for(int i = 1 ; i<= n ; i++){
//            //     if (isBadVersion(i)){
//            //         return i;
//            //     }
//            // }
//            // return n;
//
//            if(n == 1){
//                return 1 ;
//            }
//            int i = 1 ;
//            while(i <= n){
//
//                int mid = i+ (n -i)/2 ;
//
//                if(isBadVersion(mid)){
//                    // move twords good version
//
//                    n = mid -1;
//                }
//                else{
//                    i = mid + 1;
//                }
//
//            }
//            return i;
//        }
//    }


}
