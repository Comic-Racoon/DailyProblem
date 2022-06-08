package problems.recurssion.subset_subsequence;

public class Problem_1_skipCharacter {

    public static void main(String[] args) {
        String str = "somethiaaaajsno";
        char skipChar = 'a';

        System.out.println(skipCharfromStr(str, skipChar));

    }

    private static String skipCharfromStr(String str, char chaar) {

        String ans = "";

        if(str.length() == 0){
            return ans;
        }

        if(str.charAt(0) == chaar){
            return ans = skipCharfromStr(str.substring(1), chaar);
        }
        else {
            return ans = str.charAt(0) + skipCharfromStr(str.substring(1), chaar);
        }
    }
}
