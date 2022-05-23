package problems.leetCode.problem13;

import java.util.HashMap;

public class Problem13 {
    /* Longest Substring Without Repeating Characters

    Given a string s, find the length of the
    longest substring without repeating characters.
    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.*/

    // ref :- https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static void main(String[] args) {
        String str = "abcabcbb";

        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring(str));

    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {


            int ans =0;

            int i =-1;
            int j =-1;

            HashMap<Character, Integer > map = new HashMap<>();

            while(i< s.length() - 1 )
            {
                //acquire
                while(i < s.length() - 1){

                    i++;
                    char ch = s.charAt(i);
                    map.put(ch , map.getOrDefault(ch,0)+1);

                    if(map.get(ch) == 2){
                        break;
                    }
                    else{
                        int len = i - j;
                        if(len > ans){
                            ans = len;
                        }
                    }

                }
                //release
                while(j < i){
                    j++;
                    char ch = s.charAt(j);
                    map.put(ch, map.get(ch) - 1 );

                    if(map.get(ch) == 1){
                        break;
                    }

                }
            }
            return ans;

        }
    }

}
