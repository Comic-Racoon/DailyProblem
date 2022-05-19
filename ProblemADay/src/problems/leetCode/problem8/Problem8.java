package problems.leetCode.problem8;

public class Problem8 {
    /*Write a function that reverses a string. The input string
    is given as an array of characters s.

    You must do this by modifying the input array in-place with
    O(1) extra memory.

    Example 1:

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]*/

    //ref :- https://leetcode.com/problems/reverse-string/submissions/
    public static void main(String[] args) {
        char S [] = {'h','e','l','l','o'};

        Solution s = new Solution();
        s.reverseString(S);

        for(char c : S) {
            System.out.print( c + " ");
        }
    }

    static class Solution {
        public void reverseString(char[] s) {

            int low =0;
            int high = s.length-1;

            while(low < high){
                swap(s, low++, high--);
            }

        }

        public void swap(char[]s, int l, int h)
        {
            char temp = s[l];
            s[l] = s[h];
            s[h] = temp;
        }
    }
}
