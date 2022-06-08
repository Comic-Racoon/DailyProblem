package problems.recurssion.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        arr = mergesort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static int [] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int [] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right );
    }

    private static int[] merge(int[] first, int[] second) {

        int [] res = new int[ first.length + second.length];

        int i =0;
        int j =0;
        int k =0;

        while ( i < first.length && j < second.length){
            if(first[i] < second[j]){
                res[k++] = first[i++];
            }else{
                res[k++] = second[j++];
            }

        }

        while(i< first.length){
            res[k++] = first[i++];

        } while(j< second.length){
            res[k++] = second[i++];
        }

        return res;
    }
}
