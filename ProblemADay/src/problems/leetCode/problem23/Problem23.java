package problems.leetCode.problem23;

import java.util.ArrayList;
import java.util.List;

public class Problem23 {
    /*-------Combinations---------
     Given two integers n and k, return all possible combinations
     of k numbers out of the range [1, n].

    You may return the answer in any order.

    */

    public static void main(String[] args) {
        int n = 4, k = 2;
        Solution s = new Solution();

        List<List<Integer>> combine = s.combine(n, k);
        for(List<Integer> i : combine){
            System.out.println(i);
        }

    }

    static class Solution {
        public List<List<Integer>> combine(int n, int k) {

            List<List<Integer>> ans = new ArrayList<>();
            
            if(k == 0){
                ans.add(new ArrayList<>());
                return ans;
            }
            
            backtrack(1,new ArrayList<Integer>(), n , k , ans);

            return ans;
        }

        private void backtrack(int start, List<Integer> current, int n, int k, List<List<Integer>> ans) {

            if (current.size() == k) {
                ans.add(new ArrayList<Integer>(current));
            }

            for(int i = start; i<=n && current.size() < k ; i++) {

                current.add(i);
                backtrack(i+1, current, n, k,ans);
                current.remove(current.size() -1);

            }


        }
    }

    }

