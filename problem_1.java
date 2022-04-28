import java.util.HashSet;
import java.util.Set;

public class problem_1{
    /*Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any
two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true
since 10 + 7 is 17.

Bonus: Can you do this in one pass?

*/

    public static void main(String[] args) {
        int arr [] = {10,15,3,7};

        int k = 17;

        HashSet<Integer> set = new HashSet<>();

        System.out.println(solution1(arr, k));

        System.out.println(solution2(arr, k));

    }
    private static boolean solution1(int[] arr, int k) {
        // time complex :- O(n^2)
        for (int i =0; i < arr.length - 1; i++){
            int diff = k - arr[i];
            for(int j = 1; j < arr.length; j++){
                if (arr[j] == diff){

                    System.out.println(arr[i] + " " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean solution2(int[] arr, int k) {
        // time complex :- O(n)
       Set <Integer> s = new HashSet<>();

       for(int num : arr){
           s.add(num);
       }

       for ( int num : arr){
           if ( s.contains(k - num)){
               System.out.println(num + " " + (k-num));
               return true;
           }
       }
        return false;
    }


}
