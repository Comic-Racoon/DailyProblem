package problems.leetCode.problem9;

public class Problem9 {
    /*Given a string s, reverse the order of characters in each
    word within a sentence while still preserving whitespace and
    initial word order.

    Example 1:

    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"*/

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String [] str = s.split(" ");
        String res = "";
        for(String ss : str){
            res = res+ " " + reverse(ss);
        }
        System.out.println(res);
    }

    private static String reverse(String ss) {
        char ch ;
        String res = "";
        for(int i =0; i< ss.length(); i++){
            ch = ss.charAt(i);
            res = ch + res;
        }
        return res ;
    }
}
