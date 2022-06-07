package problems.recurssion.questionArrays;

public class problem_5_RotatedBinarySearch {

    public static void main(String[] args) {
        //
        int arr [] = { 13, 18, 25, 2,8, 10};
        int target = 1;

        System.out.println(search(arr, target, 0, arr.length - 1 ));

    }

    private static int search(int[] arr, int target, int start, int end) {

        if(start > end){
            return -1;
        }

        int m = start + (end - start) / 2;

        if(arr[m] == target){
            return m;
        }

        if(arr[start] <= arr[m]){
            if(target >= arr[start] && target <= arr[m]){
                return search(arr,target,start, m -1);
            }else{
                return search(arr,target, m +1, end);
            }
        }

        if(target >= arr[m] && target <= arr[end]){
            return search(arr, target, start, m + 1 );
        }
        return search(arr,target,start, m -1);
    }

}
