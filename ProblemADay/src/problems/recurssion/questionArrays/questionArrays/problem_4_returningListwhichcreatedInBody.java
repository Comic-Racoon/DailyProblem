package problems.recurssion.questionArrays;

import java.util.ArrayList;

public class problem_4_returningListwhichcreatedInBody {


    public static void main(String[] args) {

        int arr [] = {1,2,3,4,4,5,6,8,4,6,4};
        int target = 4;

        ArrayList<Integer> ans = findIndex2(arr, target, 0);

        System.out.println(ans);
    }

    private static ArrayList<Integer> findIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this call will contain ans from below
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
