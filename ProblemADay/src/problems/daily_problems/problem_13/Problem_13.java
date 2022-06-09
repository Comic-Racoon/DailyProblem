package problems.daily_problems.problem_13;

import java.util.ArrayList;
import java.util.List;

public class Problem_13 {
    /*
    Good morning! Here's your coding interview
    problem for today.

    This problem was asked by Amazon.

    Given an integer k and a string s, find the length of the
    longest substring that contains at most k distinct characters.

    For example, given s = "abcba" and k = 2, the longest
    substring with k distinct characters is "bcb".*/

    public static void main(String[] args) {
        String s = "abcba";
        int k = 2;

       List<List<String>> ans = substringWithDistinctChar(s, k);
    }

    static List<List<String>> substringWithDistinctChar(String s, int k){

     List<List<String>> outer = new ArrayList<>();

     outer.add(new ArrayList<>());

     for(char c : s.toCharArray()){

     }



    }
}
