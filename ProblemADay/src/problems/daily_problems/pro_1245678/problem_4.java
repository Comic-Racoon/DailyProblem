package problems.daily_problems.pro_1245678;

import static java.lang.Math.abs;

public class problem_4 {
    /*Given an array of integers, find the first missing positive
    integer in linear time and constant space. In other words,
    find the lowest positive integer that does not exist in the array.
    The array can contain duplicates and negative numbers as well.

    For example, the input [3, 4, -1, 1] should give 2.
    The input [1, 2, 0] should give 3.

    You can modify the input array in-place.*/

    public static void main(String[] args) {

        // we can sort and loop iterate to find 1 st missing number
        // sorting will increase complexity to n log n

        int array[] = {3,4,-1,1};

        System.out.println(missingInteger(array));

    }

    public static int missingInteger (int[] arr){

        boolean containsOne = false;
        int len  =  arr.length;
        for(int n : arr){
            if(n == 1){
                containsOne = true;
                break;
            }
        }

        if(!containsOne){
            return 1;
        }

        if(len == 1){
            return 2;
        }

        for(int i =0; i < len; i++){
            if (arr[i] <= 0 || arr[i] > len){
                arr[i] = 1;
            }
        }

        for(int i =0; i< len; i++){
            int x = abs(arr[i]);

            if(arr[x-1] > 0) {
                arr[x-1] *= -1;
            }
        }

        for(int i =0; i< len; i++){
            if(arr[i]> 0){
                return i+1;
            }
        }

        return len+1;



    }
}
