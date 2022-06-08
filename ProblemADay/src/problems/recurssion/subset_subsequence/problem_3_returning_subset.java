package problems.recurssion.subset_subsequence;

import java.util.ArrayList;
import java.util.List;

public class problem_3_returning_subset {

    public static void main(String[] args) {
        List ans = subseq("", "abc");

        System.out.println(ans);
    }

    static ArrayList<String> subseq(String p , String up){
        if(up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);

        ArrayList<String>left = subseq(p + ch , up.substring(1));
        ArrayList<String>right = subseq(p, up.substring(1));

        left.addAll(right);

        return left;
    }

}
