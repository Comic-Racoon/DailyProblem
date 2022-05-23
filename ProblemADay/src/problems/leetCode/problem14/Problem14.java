package problems.leetCode.problem14;

import java.util.Arrays;

public class Problem14 {

    /* Permutation in String

    Example 1:
    Input: s1 = "ab", s2 = "eidbaooo"
    Output: true
    Explanation: s2 contains one permutation of s1 ("ba").

    */

    // ref:- https://leetcode.com/problems/permutation-in-string/

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        Solution s = new Solution();

        System.out.println(s.checkInclusion(s1, s2));


    }

    static class Solution {
        public boolean checkInclusion(String s1, String s2) {

            if( s1.length() > s2.length() ) return false;

            if (s1.length() == 0) return true;

            int[] ar1 = new int[26];

            for(int i =0 ; i < s1.length(); i++){
                ar1[s1.charAt(i) - 'a']++;
            }
            for(int i =0 ; i <= (s2.length() - s1.length()); i++){
                int[] ar2 = new int[26];
                for(int j = i  ; j < i + s1.length() ; j++){
                    ar2[s2.charAt( j) - 'a']++;
                }
                if(matches(ar1, ar2)){
                    return true;
                }
            }
            return false;
        }

        public boolean matches(int[] s1map, int[] s2map) {
            for (int i = 0; i < 26; i++) {
                if (s1map[i] != s2map[i])
                    return false;
            }
            return true;
        }
    }

}
