package problems.recurssion.level1;

public class problem6_palindrome {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3,3, 2,1};

        System.out.println(checkPalindrome(arr, 0, arr.length -1));

    }

    private static boolean checkPalindrome(int[] arr, int start , int end) {

        if(start > end){
            return true;
        }
        if(arr[start] != arr [end]) return false;

        return checkPalindrome(arr , start+1, end -1);

    }
}
