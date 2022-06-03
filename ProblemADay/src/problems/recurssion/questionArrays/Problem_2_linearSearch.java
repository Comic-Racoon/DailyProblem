package problems.recurssion.questionArrays;

public class Problem_2_linearSearch {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 4;

        System.out.println(isElementInArray(arr,target,  0));
    }

    private static int isElementInArray(int[] arr,int target, int index) {

        if(index == arr.length){
            return -1;
        }

        //return arr[index] == target || isElementInArray(arr,target,index+1);
        if (arr[index] == target){
            return index;
        }
        else {
            return isElementInArray(arr,target,index+1);
        }
    }
}
