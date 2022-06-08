package problems.recurssion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int [] arr = {5,3,4,4,2,1};
        sort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;

        int mid = s + (e-s) /2 ;

        int piviot = arr[mid];

        while(s <= e){
            while (arr[s] < piviot){
                s++;
            }
            while (arr[e] > piviot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] =arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // my piviot is at corrent index sort 2 half now

        sort(arr, low, e);
        sort(arr, s, high);

    }
}
