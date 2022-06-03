package problems.recurssion.questionArrays;

public class Problem_1 {

    // find array sorted or not using recurssion

    //sorted
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int[] arr, int index) {

        //base case
        if(index == arr.length - 1 ){
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
