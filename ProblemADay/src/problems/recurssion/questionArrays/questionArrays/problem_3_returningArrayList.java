package problems.recurssion.questionArrays;

import java.util.ArrayList;

public class problem_3_returningArrayList {

    // returning an arrayList


    // return the array list of the index on which target numbers exixts
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,4,5,7,4,6};
        int target = 4;
        ArrayList<Integer> ans = findIndices(arr, target, 0, new ArrayList<>());

        for(Integer i : ans){
            System.out.println(i);
        }
    }

    private static ArrayList<Integer> findIndices(int[] arr,
                                                  int target,
                                                  int index,
                                                  ArrayList<Integer> list) {

        if( index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findIndices(arr,target,index +1, list);

    }
}
