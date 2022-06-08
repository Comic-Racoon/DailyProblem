package problems.recurssion.sorting;

import java.util.Arrays;

public class MergeSort_InplaceMerging {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        mergesort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int start , int end){
        if(end - start == 1){
            return ;
        }

        int mid = (start+end) / 2;

        mergesort(arr, start, mid);
        mergesort(arr, mid, end);

        mergeInPlace( arr, start , mid , end );
    }

    private static void mergeInPlace(int [] arr, int s , int m , int e) {

        int [] res = new int[ e - s ];

        int i =s;
        int j =m;
        int k =0;

        while ( i < m && j < e){
            if(arr[i] < arr[j]){
                res[k++] = arr[i++];
            }else{
                res[k++] = arr[j++];
            }

        }

        while(i< m){
            res[k++] = arr[i++];

        } while(j< e){
            res[k++] = arr[i++];
        }

        for (int l =0; l < res.length; l++){
            arr[s+l] = res[l];
        }
    }
}
